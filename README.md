# Wi-Fi Signal Tester

## 📌 Informações Gerais
* **Nome da Aplicação:** Wi-Fi Signal Tester
* **Turma:** 3L6LASIR1T
* **Tema:** Aplicação Android para Análise e Teste de Sinal Wi-Fi
  
* **Integrantes do Grupo:**
  1. Assane Alberto Domingos
  2. Lopes Gemo
  3. Alfredo António Bernardo

---

## 📝 Descrição da Aplicação
O **Wi-Fi Signal Tester** é uma aplicação nativa para Android concebida para monitorizar, analisar e mapear a cobertura de redes sem fios locais. A ferramenta realiza varreduras (scans) do ambiente para listar todas as redes disponíveis e as respetivas métricas técnicas, permitindo avaliar a estabilidade do sinal e otimizar a infraestrutura Wi-Fi.

---

## ⚡ Funcionalidades Implementadas
* **Varredura de Redes (Scan):** Deteção de múltiplas redes Wi-Fi em redor em tempo real.
* **Leitura da Intensidade do Sinal (RSSI):** Medição precisa do nível de sinal em dBm.
* **Informações Técnicas da Rede:** Exibição do SSID (incluindo redes ocultas), BSSID (MAC) e Frequência (2.4 GHz ou 5 GHz).
* **Gestão Dinâmica de Permissões:** Tratamento de permissões de localização em tempo de execução (compatível com Android 10 a 14).

---

## 🛠️️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Plataforma Target:** Android SDK (API 34)
* **Sistema de Build:** Gradle 8.5 (Wrapper)
* **Ambiente:** VS Code / Android Studio

---

## 🔒 Permissões Utilizadas (`AndroidManifest.xml`)
* `ACCESS_WIFI_STATE` e `CHANGE_WIFI_STATE`: Verificar estado e iniciar varredura de redes.
* `ACCESS_NETWORK_STATE`: Verificar a conectividade do dispositivo.
* `ACCESS_FINE_LOCATION` e `ACCESS_COARSE_LOCATION`: Obrigatórias no Android 10+ para obter dados de redes Wi-Fi por questões de privacidade.
* `NEARBY_WIFI_DEVICES`: Necessária no Android 13+ para varreduras otimizadas.

---

## 🚀 Instruções para Executar o Projeto

1. **Clonar o Repositório:**
   ```bash
   git clone [https://github.com/Veny24-junior/wifisignalapp.git](https://github.com/Veny24-junior/wifisignalapp.git)
   cd wifisignalapp
   
Compilar a Aplicação: .\gradlew assembleDebug

Instalar o APK (via ADB):  adb install app/build/outputs/apk/debug/app-debug.apk


Testar:

Ligue o Wi-Fi e o GPS (Localização) do telemóvel.

Abra a app, clique em "Iniciar Leitura" e aceite as permissões.
   
