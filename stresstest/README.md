# Teste de Stress com JMeter

## Descrição
Este documento descreve os detalhes e procedimentos do teste de stress realizado com o Apache JMeter para avaliar a performance do endpoint https://jsonplaceholder.typicode.com/user.

## Configuração do Teste

### 1. Test Plan
O Test Plan contém a configuração do teste de stress:

- **Nome**: Stress Test Plan
- **Descrição**: Teste de stress do endpoint https://jsonplaceholder.typicode.com/users
- **Thread Group**:
  - **Number of Threads (users)**: 100
  - **Ramp-up Period (seconds)**: 15
  - **Loop Count**: 2

## Executando o Teste

### Modo Gráfico (GUI)
1. Abra o JMeter.
2. Carregue o Test Plan (`UserRequestStressTest.jmx`).
3. Clique no botão **Run** (ícone de play verde) ou use o atalho **Ctrl + R**.

### Modo Linha de Comando (Non-GUI)
1. Abra o terminal ou prompt de comando e navegue até a pasta `bin` do JMeter.
2. Execute o comando:
   ```sh
   jmeter -n -t ./UserRequestStressTest.jmx

   # Resultados dos Testes de Stress

## Detalhes dos Testes
Os testes de stress foram realizados para avaliar a performance do endpoint https://jsonplaceholder.typicode.com/users.

### Resultados

| Tipo de Requisição | Código de Resposta | Tempo Médio (ms) | Tempo Mínimo (ms) | Tempo Máximo (ms) | Desvio Padrão (ms) | Percentual de Erros | Taxa de Transferência (KB/s) |
|--------------------|--------------------|------------------|-------------------|-------------------|--------------------|---------------------|------------------------------|
| Requisição HTTP    | 200                | 22               | 14                | 88                | 9.31               | 0.000%              | 13.43003                     |                            
| TOTAL              | 200                | 22               | 14                | 88                | 9.31               | 0.000%              | 13.43003                     |                           

## Análise dos Resultados
A tabela acima resume os resultados do teste de stress realizado com 100 requisições ao endpoint https://jsonplaceholder.typicode.com/users. Os detalhes incluem o código de resposta HTTP, tempos de resposta (média, mínimo, máximo e desvio padrão), percentual de erros, taxa de transferência e tamanho médio da resposta.
