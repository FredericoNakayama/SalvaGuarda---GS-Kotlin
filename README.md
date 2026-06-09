# SalvaGuarda - Global Solution 

---

## Nome da Solução

### SalvaGuarda

O SalvaGuarda é um aplicativo de monitoramento e prevenção de desastres naturais que utiliza dados provenientes de satélites para auxiliar a população e as autoridades na tomada de decisões durante situações de emergência.

O objetivo da solução é reduzir o tempo de resposta em eventos como:

* Enchentes
* Tempestades
* Queimadas
* Deslizamentos

Além de disponibilizar informações de forma simples e acessível para a população.

---

## Objetivo do Aplicativo

O aplicativo tem como finalidade aproximar os dados de monitoramento espacial dos cidadãos, transformando informações complexas em alertas e orientações práticas.

A solução busca:

* Informar a população sobre riscos climáticos;
* Facilitar o acesso a orientações de emergência;
* Apoiar autoridades durante situações críticas;
* Utilizar dados espaciais para prevenção de desastres.

---

# Tecnologias Utilizadas

* Kotlin
* Jetpack Compose
* Navigation Compose
* Android Studio

---

# Estrutura do Projeto

```text
screens/
├── HomeScreen
├── AlertScreen
├── ChatbotScreen
├── AuthorityScreen
└── AuthorityDashboardScreen

data/
└── MockData

model/
└── Alert
└── ChatMessage

navigation/
└── AppRoutes
└── AppNavigation
```

---

# Fluxo do Aplicativo

## 1. HomeScreen

Tela inicial do aplicativo.
<img src="https://github.com/user-attachments/assets/12f74cf6-11f6-4fcb-8809-c455914c2a6f" width="300"/>

Funcionalidades:

* Exibição da identidade visual do SalvaGuarda;
* Resumo da situação atual;
* Central de monitoramento;
* Navegação para as demais funcionalidades.

---

## 2. AlertScreen

Tela responsável pela visualização dos alertas.

Funcionalidades:

* Exibição de alertas mockados;
* Lista utilizando LazyColumn;
* Filtro de pesquisa por alerta.

Exemplos:

* Enchente
* Tempestade
* Queimada

---

## 3. ChatbotScreen

Assistente virtual de emergência.

Funcionalidades:

* Histórico de mensagens;
* Rolagem automática;
* Simulação de conversa com o usuário;
* Respostas rápidas para situações de emergência.

Opções disponíveis:

* Enchente
* Queimada
* Autoridades

---

## 4. AuthorityScreen

Tela de autenticação das autoridades.

Credenciais de demonstração:

Usuário: admin

Senha: 1234

Objetivo:

Permitir acesso ao painel administrativo do sistema.

---

## 5. AuthorityDashboardScreen

Painel administrativo para autoridades.

Funcionalidades:

* Visualização de indicadores;
* Monitoramento de regiões;
* Emissão simulada de alertas.

Informações exibidas:

* Satélites ativos;
* Regiões monitoradas;
* Alertas emitidos;
* Alertas críticos.

---

# Conclusão

O SalvaGuarda demonstra como tecnologias espaciais e dados provenientes de satélites podem ser utilizados para auxiliar a prevenção de desastres naturais e melhorar a comunicação entre população e autoridades.

A solução conecta a economia espacial a um problema real da sociedade, contribuindo para respostas mais rápidas e eficientes em situações de emergência.
