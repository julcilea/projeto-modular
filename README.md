# projeto-modular

Projeto de automação estruturado com Java + Selenium, simulando uma aplicação com duas funcionalidades: Login e Cadastro.Com uso de boas práticas e padrões como Page Object, e opcionalmente Singleton para WebDriver e Factory para dados.

### Passo 1 – Separação por Camadas
- Crie uma estrutura mínima, separando os seguintes tipos de arquivos:
Pages: arquivos que representam cada página da aplicação e encapsulam os elementos e ações (ex.: LoginPage, CadastroPage).
- Tests: arquivos que contêm os testes propriamente ditos.
- Utils ou Helpers: funções auxiliares, como geração de dados ou configuração.
- Config: parâmetros como URL, dados padrões e setup dos testes.


### Passo 2 – Aplicação de Design Patterns
- Aplique, no mínimo, os seguintes padrões de projeto:
- Page Object: para representar cada tela (Login e Cadastro).
- Se desejar, pode aplicar também Singleton para WebDriver ou Factory para dados de teste.


### Passo 3 – Separação por Domínio ou Funcionalidade
- Organize suas pastas e arquivos considerando os domínios:
Tudo que for relacionado à funcionalidade de Login fica junto (ex.: login/LoginPage.java, login/LoginTest.java).
- Tudo que for relacionado à funcionalidade de Cadastro fica agrupado da mesma forma.


### Passo 4 – Convenções e Padronizações
Garanta que:
- Os nomes dos arquivos sejam claros e consistentes (ex.: LoginPage.java, CadastroPage.java).
- Os métodos dentro das classes tenham nomes que expressem claramente suas funções (ex.: preencherUsuario(), clicarNoBotaoLogin()).
- As estruturas de pasta sigam uma hierarquia lógica e padronizada.

