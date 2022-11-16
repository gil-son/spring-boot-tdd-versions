# spring-boot-tdd-versions/PT-BR/conceitos


<details><summary><h2>Annotations</h2></summary>

### @Mock
Permite criar um objeto ou interface

### @MockBean vs Mockito
Ambos são equivalentes e trazem todo o contexto da classe, ou seja, isso inclue classes injetadas e componentes que a classe em questão utiliza e precisa levar em consideração no momento do teste.

### @InjectMock
Os @Mock passam a ser instanciados através dessa anotação


### @SpringBootTest

A anotação @SpringBootTest é útil quando precisamos inicializar todo o contêiner. A anotação funciona criando o ApplicationContext que será utilizado em nossos testes. Podemos usar o atributo webEnvironment de @SpringBootTest para configurar nosso ambiente de execução


### @AutoConfigureMockMvc
Use isso quando quiser apenas configurar o MockMvc

### @AutoConfigureWebMvc
Use isso se precisar configurar a camada da web para teste, mas não precisar usar o MockMvc


### @Transactional
- O contexto de persistência
- A transação do banco de dados

</details>


