# itau-core

Requisitos para desenvolvimento

# Pré-requisito
- Docker versão mais atual
- Maven versão mais atual
- Git client versão mais atual
- SOAP UI versão mais atual
- IDE para Desenvolvimento: STS, Eclipse ou IntelliJ
- Criar um diretório na estação chamado workpsace que conterá os códigos-fonte

# Baixar o código-fonte

- Via linha de comando, entrar no diretório que conterá os códigos-fonte e executar os comandos abaixo, caso esteja vazio:

	git init
	git clone https://github.com/natokratos/itau-core.git

- Abrir a IDE de desenvolvimento, importar como projeto Maven existente

# Compilar a aplicação

- Via linha de comando, mudar para o diretório itau-core dentro do diretório de códigos-fonte
  
	cd $HOME/workspace/itau-core
  
- Via linha de comando, executar o comando abaixo para gerar as classes, executar os testes e gerar o relatório de cobertura:

	mvn clean install test  

- A partir daqui basta usar a IDE de desenvolvimento para construir o código, compilar e testar a aplicação

# Relatório de Cobertura

- O relatório estará disponível dentro deste mesmo diretório em target/site/jacoco/index.html, deve ser acessado por um browser de sua escolha

# Rodando a aplicação local
  
- Para rodar basta executar a aplicação pelo IDE de desenvolvimento

# Rodando a aplicação no Docker

aaaa

# Web Services SOAP

- Para acessar os WebServices SOAP, digite o seguinte endereço pelo browser:

	http://localhost:9090/services/transfers
	http://localhost:9090/services/transfers?wsdl
	  
	http://localhost:9090/services/accounts
	http://localhost:9090/services/accounts?wsdl

- Para testar os serviços use o SOAP UI. Abra a ferramenta, crie um novo projeto e aponte para um dos WSDL localizados dentro da aplicação em:

	src/main/resoruces/AccountsImplService.wsdl
	src/main/resoruces/TransfersImplService.wsdl

- Após a criação, adicione o outro WSDL ao projeto. A ferramenta já irá criar objetos para testar todos os métodos disponíveis nos WSDL

- Selecione um dos métodos, preencha as informações necessárias e execute
- Você pode salvar os casos de teste criados numa suíte maior para executar sempre que precisar

# Banco em memória

- Para acessar o H2 (banco em memória) use o seguinte endereço:

	http://localhost:9090/h2
    
- Coloque no campo JDBC_URL o valor jdbc:h2:mem:itaudb
  
- Coloque no campo Username o valor sa
  
- Deixe o campo Password vazio
  
- Clique em Connect
  