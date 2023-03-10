## Start By Capgemini -Lógica de Programação e Algoritmos III 

## Sobre o projeto

O projeto foi construído durante a etapa de lógica de programação e algoritmos III, usando Java Swing para construção de telas e JDBC para persistência de dados.

Ferramenta/Tecnologia   | Versão
--------- | ------
OpenJDK | 17
Maven | 3.8.6
Apache Netbeans | 16
MySQL | 8.0
JDBC / Connector | 8.0.26

A aplicação consiste em um gerenciador de tarefas básicos a fim de utilizar todas as tecnologias vistas em trilhasa anteriores. As operações de persistência de dados traduz um CRUD.

### Diagrama ER e Classe

![todoapp](https://user-images.githubusercontent.com/77124683/194144566-1688dddc-49ed-49a1-8570-2f529e575420.png)


#### Extras

Como desafio, foi sugerido a função de editar tarefas ao clicar no botão, que foi implementado.

### Como iniciar na máquina local

Clone o repositório na sua máquina

Importe como um projeto maven existente a partir de sua IDE

Certifique-se que as depedências do pom.xml foram baixadas e adicionadas ao projeto

Inicie MainScreen.java

Configurar variáveis de acordo com as configurações do seu SGBD
```
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp"; // necessário criar schema manualmente ou adicionar a constraint "?createDatabaseIfNotExist=true&serverTimezone=UTC"
    public static final String USER = "seu usuario";
    public static final String PASS = "sua senha";
```

### Sobre o programa
É uma iniciativa da Capgemini para acelerar a formação de novos talentos em tecnologia, valorizando a inclusão e a diversidade, com cursos online gratuitos que, após finalizados, voce terá a chance de conquistar uma das mais de 500 vagas para trabalhar no time Capgemini!

[Mais informações](https://startcapgemini.com.br/)
