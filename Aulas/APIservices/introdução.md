## Chamadas basicas de um projeto de API Web

*model/entity: representa a entidade do banco de dados;
- Classe responsável pela abstração de tabelas em nosso banco de dados;
- Exemplo: User, Product, Order;
- "Campos da tabela";

*repository/dao: representa a camada de acesso ao banco de dados;
- Responsável por realizar operações CRUD (Create, Read, Update, Delete) em nosso banco de dados;
- Exemplo: UserRepository, ProductRepository, OrderRepository;
- Interfase responsável pela comunicação direta com o banco de dados;
- Exemplo: MySQL, PostgreSQL, MongoDB;
- "Métodos da tabela";

*service: representa a camada de negocio;
- Classe responsável por toda a regra de negócio e tratativa de dados;
- Exemplo: UserService, ProductService, OrderService;

*controller: representa a camada de apresentação;
-"End Point" responsável por controlar todas as requisições do lado de fora da API, através de Url's segundo o protocolo HTTP;
- Exemplo: UserController, ProductController, OrderController;

- Responsável por chamar as classes de negocio e passar os dados para a camada de acesso ao banco de dados;
- Exemplo: UserService, ProductService, OrderService;

front ↔️controllers↔️services↔️repository↔️model