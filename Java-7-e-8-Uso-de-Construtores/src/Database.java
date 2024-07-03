import java.sql.*;
// import java.util.Scanner;

public class Database {
    private static final String URL = "jdbc:sqlite:BancoUsers.db";
    // Scanner scanner = new Scanner(System.in);
    public Connection connection;

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(URL);
            connection.setAutoCommit(false);
            System.out.println("Conexão realizada! Banco de dados: " + URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC do SQLite não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    public void createTableClientes() {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Clientes (ID INTEGER PRIMARY KEY, nome VARCHAR, nascimento VARCHAR, cpf VARCHAR, telefone VARCHAR)");
            connection.commit();
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes (nome, nascimento, cpf, telefone) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:BancoUsers.db");
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, cliente.nome);
            statement.setString(2, cliente.nascimento);
            statement.setString(3, cliente.cpf);
            statement.setString(4, cliente.telefone);

            statement.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}