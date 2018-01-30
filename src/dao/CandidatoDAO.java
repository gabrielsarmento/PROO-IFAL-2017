package dao;
import factory.ConnectionFactory;
import modelo.Candidato;
import java.sql.*;
import java.sql.PreparedStatement;
public class CandidatoDAO { 
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public CandidatoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Candidato candidato){ 
        String sql = "INSERT INTO candidato(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, candidato.getNome());
            stmt.setString(2, candidato.getCpf());
            stmt.setString(3, candidato.getEmail());
            stmt.setString(4, candidato.getTelefone());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
