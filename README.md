📚 Java-POO-LMS-CLI: Sistema de Gerenciamento de Biblioteca (CLI)

    Status do Projeto: ✅ Concluído para Treinamento em Java Core | 🚀 Pronto para Migração para PostgreSQL

Este projeto é um ambiente de treinamento em Java Puro, focado em solidificar os conceitos da Programação Orientada a Objetos (POO) e Arquitetura de Software. O sistema simula um Gerenciamento de Biblioteca, persistindo os dados em arquivos de texto (CSV/TXT).

A estrutura foi desenhada usando o Padrão Repositório e Inversão de Dependência (Interfaces), garantindo que a migração futura para um banco de dados (como PostgreSQL) exija a alteração de apenas uma única camada de código.

✨ Conceitos de Java Aplicados (Seu Portfólio)

Este projeto demonstra a aplicação prática dos seguintes conceitos avançados e pilares da POO:
Conceito Java	Classes/Interfaces Onde Encontrar	Demonstração Prática
Abstração & Herança	Pessoa.java, Usuario.java	A classe Usuario herda métodos e atributos da classe abstrata Pessoa.
Encapsulamento	Todas as classes (Livro, Usuario, etc.)	Uso de atributos private e métodos public (Getters/Setters) para controlar o acesso.
Polimorfismo	Pessoa.java e Usuario.java	Implementação do método getTipoPessoa() (abstrato em Pessoa) com comportamentos diferentes.
Interfaces & Generics	IRepositorio<T>, LivroRepositorio	Criação de um contrato genérico (IRepositorio) para desacoplar o Serviço da Persistência (Arquivo).
Coleções (Collections)	LivroRepositorio, BibliotecaService	Uso de List<T> para gerenciar dados em memória e Map<K, V> para rastrear empréstimos.
Exceções Customizadas	ExcessaoLMS	Tratamento de erros de negócio (ex: Livro indisponível, Usuário não encontrado) com classes de exceção próprias.
Leitura/Gravação de Arquivos	*Repositorio.java	Persistência do estado do sistema em arquivos de texto (simulando um armazenamento de dados).

📐 Estrutura do Projeto (Clean Architecture Setup)

A estrutura segue a separação de responsabilidades (SRP) para garantir a escalabilidade:

src
├── br.com.lms.main          // Inicialização e Fluxo de Execução
├── br.com.lms.model         // Entidades de Dados (POO Pura)
├── br.com.lms.repository    // Camada de Persistência (Arquivos)
├── br.com.lms.service       // Regras de Negócio e Lógica Principal
└── br.com.lms.util          // Utilitários e Tratamento de Exceções

💡 Como Rodar o Projeto

Pré-requisitos

    Java Development Kit (JDK) 8 ou superior instalado.

Passos

    Clone o repositório:
    Bash

git clone https://github.com/SEU-USUARIO/Java-POO-LMS-CLI.git
cd Java-POO-LMS-CLI

Compile e Execute (Via terminal ou IDE):

    IDE (IntelliJ, Eclipse): Abra a pasta do projeto e execute a classe br.com.lms.main.MainApplication.

    Terminal (Avançado):
    Bash

        # Compile (se não estiver usando Maven/Gradle)
        javac -d bin src/br/com/lms/main/MainApplication.java
        # Execute
        java -cp bin br.com.lms.main.MainApplication

    O sistema será iniciado no console, apresentando o menu de opções.

🔮 Próximos Passos (Roadmap)

O projeto está arquitetado para ser facilmente expandido. Ideias para contribuição:

    [Refactor] Adicionar um ORM (Hibernate) para migração completa do *Repositorio para PostgreSQL.

    [Feature] Implementar gerenciamento de datas de Empréstimo e multa por atraso.

    [Feature] Adicionar a funcionalidade de "Fila de Espera" para livros emprestados.
