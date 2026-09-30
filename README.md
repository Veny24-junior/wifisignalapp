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
O **Wi-Fi Signal Tester** é uma aplicação nativa para Android concebida para monitorizar, analisar e testar a intensidade e qualidade das ligações Wi-Fi em tempo real. A ferramenta permite aos utilizadores avaliar a estabilidade das redes sem fios locais e tomar decisões informadas sobre a posição e cobertura do sinal.

---

## ⚡ Funcionalidades Implementadas
* **Leitura da Intensidade do Sinal (RSSI):** Medição do nível de sinal em dBm.
* **Informações da Rede Wi-Fi:** Exibição do SSID (nome da rede), BSSID (endereço MAC do Ponto de Acesso) e velocidade de ligação.
* **Atualização em Tempo Real:** Atualização contínua das métricas de sinal.
* **Análise Visual do Sinal:** Indicadores gráficos para facilidade de interpretação do estado da rede (Fraco, Médio, Forte).

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Plataforma Target:** Android SDK
* **Sistema de Build:** Gradle 8.5 (Gradle Wrapper)
* **Ambiente de Desenvolvimento:** VS Code / Android Studio

---

## 🔒 Permissões Utilizadas (`AndroidManifest.xml`)
* `android.permission.ACCESS_WIFI_STATE`: Permite aceder a informações sobre redes Wi-Fi.
* `android.permission.CHANGE_WIFI_STATE`: Permite alterar o estado da ligação Wi-Fi, se necessário.
* `android.permission.ACCESS_FINE_LOCATION`: Necessária em versões do Android 8.0+ para obter o SSID/BSSID da rede Wi-Fi conectada.
* `android.permission.ACCESS_COARSE_LOCATION`: Permissão complementar de localização aproximada para varredura de redes.

---

## 🚀 Instruções para Executar o Projeto

### Pré-requisitos
* Java Development Kit (JDK 17 ou superior) instalado.
* Dispositivo físico Android (com Depuração USB ativa) ou Emulador Android.

### Passo a Passo

1. **Clonar o Repositório:**
   ```bash
   git clone [https://github.com/TEU_UTILIZADOR/wifisignalapp.git](https://github.com/TEU_UTILIZADOR/wifisignalapp.git)
   cd wifisignalapp
