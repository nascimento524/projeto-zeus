import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaBiblioteca {
    private static final String DB_URL = "jdbc:sqlite:biblioteca.db";
    
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            criarTabelaUsuarios(conn);
            criarTabelaLivros(conn);
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bem-vindo à Livraria JavaBooks!");
            System.out.println("Aqui você pode cadastrar-se, escolher livros e realizar o pagamento.");
            
            System.out.println("\nCadastro de Usuário");
            System.out.print("Digite seu nome: ");
            String nomeUsuario = scanner.nextLine();
            System.out.print("Digite seu e-mail: ");
            String emailUsuario = scanner.nextLine();
            inserirUsuario(conn, nomeUsuario, emailUsuario);
            
            Map<String, Double> carrinho = new HashMap<>();
            double totalCompra = 0.0;
            
            Map<Integer, Livro> livros = carregarLivros(conn);
            
            System.out.println("\nLivros Disponíveis:");
            for (Map.Entry<Integer, Livro> entry : livros.entrySet()) {
                Livro livro = entry.getValue();
                System.out.println(livro.getId() + ". " + livro.getTitulo() + " - Preço: R$" + livro.getPreco());
            }
            
            while (true) {
                System.out.println("\nEscolha o número do livro desejado (ou digite 0 para finalizar):");
                int livroId = scanner.nextInt();
                if (livroId == 0) {
                    break;
                }
                Livro livroEscolhido = livros.get(livroId);
                if (livroEscolhido == null) {
                    System.out.println("Livro não encontrado. Por favor, tente novamente.");
                    continue;
                }
                double precoLivro = livroEscolhido.getPreco();
                System.out.println("Livro adicionado ao carrinho: " + livroEscolhido.getTitulo() + " - Preço: R$" + precoLivro);
                carrinho.put(livroEscolhido.getTitulo(), precoLivro);
                totalCompra += precoLivro;
            }
            
            System.out.println("\nCarrinho de Compras:");
            for (Map.Entry<String, Double> entry : carrinho.entrySet()) {
                System.out.println(entry.getKey() + " - Preço: R$" + entry.getValue());
            }
            System.out.println("Total da compra: R$" + totalCompra);
            
            // Implemente aqui o sistema de pagamento
            
            System.out.println("\n===== Nota Fiscal =====");
            System.out.println("Nome do Cliente: " + nomeUsuario);
            System.out.println("Email do Cliente: " + emailUsuario);
            System.out.println("Itens Comprados:");
            for (Map.Entry<String, Double> entry : carrinho.entrySet()) {
                System.out.println(entry.getKey() + " - Preço: R$" + entry.getValue());
            }
            System.out.println("Total da compra: R$" + totalCompra);
            
            scanner.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
    
    private static void criarTabelaUsuarios(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "email TEXT NOT NULL)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        }
    }
    
    private static void criarTabelaLivros(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS livros (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "titulo TEXT NOT NULL," +
                     "preco REAL NOT NULL)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        }
    }
    
    private static void inserirUsuario(Connection conn, String nome, String email) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
        }
    }
    
    private static Map<Integer, Livro> carregarLivros(Connection conn) throws SQLException {
        Map<Integer, Livro> livros = new HashMap<>();
        String sql = "SELECT * FROM livros";
        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                double preco = rs.getDouble("preco");
                livros.put(id, new Livro(id, titulo, preco));
            }
        }
        return livros;
    }
}

class Livro {
    private int id;
    private String titulo;
    private double preco;
    
    public Livro(int id, String titulo, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public double getPreco() {
        return preco;
    }
}
