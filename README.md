Para utilizar essa API é possível rodar o projeto pela IDE ou subir ele com docker.

Para rodar pela IDE basta fazer o git clone do projeto, mas ao rodar o projeto é importante ter um banco de dados rodando na porta 3306 e alterar as informações necessárias no application.properties. 

Para subir ele com o docker basta fazer o git clone do projeto, terá que ter uma imagem mySQL (não precisa subir o container myQSL). Tera que abrir o terminal na pasta do projeto e dar o seguinte comando: docker-compose up --build --force-recreate

O projeto roda na porta localhost:8080, ele está configurado pra rodar no perfil "prod", se tudo der certo poderá ser visto um json no localhost:8080/topicos.

Em meu repositório há um projeto com um arquivo para popular o banco de dados: https://github.com/ricardodamaceno/Db-API-Rest 
Para popular basta copiar o sql do arquivo forum.sql e rodar o script no seu gerenciador de banco de dados.
Feito isso é possível ter acesso ao json pelo localhost:8080/topicos , e também poderá interagir com a API pelo swagger: localhost:8080/swagger-ui.html , ou também utilizando o Postman para ter acesso.
