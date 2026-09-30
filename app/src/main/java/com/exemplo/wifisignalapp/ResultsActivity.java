package com.exemplo.wifisignalapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class ResultsActivity extends AppCompatActivity {

    private WifiManager wifiManager;
    private TextView tvResults;

    private final BroadcastReceiver wifiScanReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            displayScanResults();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tvResults = findViewById(R.id.tvResults);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        if (wifiManager == null) {
            tvResults.setText("Erro: O dispositivo não suporta Wi-Fi.");
            return;
        }

        if (!wifiManager.isWifiEnabled()) {
            Toast.makeText(this, "Por favor, liga o Wi-Fi no telemóvel.", Toast.LENGTH_LONG).show();
        }

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION);
        registerReceiver(wifiScanReceiver, intentFilter);

        startWifiScan();
    }

    private void startWifiScan() {
        boolean success = wifiManager.startScan();
        if (!success) {
            // Se o scan direto falhar (limitações de frequência do Android), mostra os últimos resultados em memória
            displayScanResults();
        }
    }

    private void displayScanResults() {
        try {
            List<ScanResult> results = wifiManager.getScanResults();

            if (results == null || results.isEmpty()) {
                tvResults.setText("Nenhuma rede Wi-Fi encontrada.\n\nGaranta que:\n1. O GPS/Localização está LIGADO.\n2. O Wi-Fi está LIGADO.\n3. A permissão de Localização foi concedida.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            int count = 1;

            for (ScanResult result : results) {
                String ssid = result.SSID.isEmpty() ? "[Rede Oculta]" : result.SSID;
                int rssi = result.level; // Intensidade do sinal em dBm
                int frequency = result.frequency; // Frequência em MHz (ex: 2412 = 2.4GHz)

                sb.append(count).append(". ").append(ssid).append("\n");
                sb.append("   • Intensidade: ").append(rssi).append(" dBm\n");
                sb.append("   • Frequência: ").append(frequency).append(" MHz\n");
                sb.append("   • MAC (BSSID): ").append(result.BSSID).append("\n\n");
                count++;
            }

            tvResults.setText(sb.toString());

        } catch (SecurityException e) {
            tvResults.setText("Erro de permissão: Sem acesso à Localização para ler os dados do Wi-Fi.");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(wifiScanReceiver);
        } catch (Exception ignored) {
        }
    }
}