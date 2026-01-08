package javaapplication9.SQL;
import java.util.*;
import javaapplication9.SQL.Classes.PessoaFuncionario;
import javaapplication9.SQL.Classes.PessoaPraticante;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class PessoaDAO {
    Connection conexao;

    public PessoaDAO(){
        conexao = new Conexao().getConexao();
    }
          
    //inserir os dados de uma pessoa no mysql
    public void inserirPesPraticante(PessoaPraticante p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO praticante (cpf, nome, email, idade, plano) VALUES (?, ?, ?, ?, ?)");
            
            stmt.setString(1, p.getCpf());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getEmail());
            stmt.setInt(4, p.getIdade());
            stmt.setString(5, p.getPlano());
            
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
            
        }
    }
    
    public void inserioPesFunciorio (PessoaFuncionario p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO funcionario (cpf, nome, email, idade, cargo, salario) VALUES (?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1, p.getCpf());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getEmail());
            stmt.setInt(4, p.getIdade());
            stmt.setString(5, p.getCargo());
            stmt.setDouble(6, p.getSalario());
            
            stmt.executeUpdate();
            
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
        }
    }
    
    public void atualizarPesPraticante(PessoaPraticante p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("UPDATE praticante SET nome = ?, email = ?, idade = ?, plano = ? WHERE cpf = ?");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getIdade());
            stmt.setString(4, p.getPlano());
            stmt.setString(5, p.getCpf());
            
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
            
        }
    }
    public void atualizarPesFuncionario(PessoaFuncionario p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("UPDATE funcionario SET nome = ?, email = ?, idade = ?, cargo = ?, salario = ? WHERE cpf = ?");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getIdade());
            stmt.setString(4, p.getCargo());
            stmt.setDouble(5, p.getSalario());
            stmt.setString(6, p.getCpf());
            
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
            
        }
    }
    public void deletarPesPraticante(PessoaPraticante p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("DELETE FROM praticante WHERE cpf = ?");

            stmt.setString(1, p.getCpf());
            
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
            
        }
    }
    public void deletarPesFuncionario(PessoaFuncionario p){
        try{
            PreparedStatement stmt = conexao.prepareStatement("DELETE FROM funcionario WHERE cpf = ?");
            
            stmt.setString(1, p.getCpf());
            
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Err: " + e);
            
        }
    }
          
    public ArrayList<PessoaPraticante> consultarPraticante(){
        ArrayList<PessoaPraticante> ALpp = new ArrayList <PessoaPraticante>();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM praticante");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                PessoaPraticante Opp = new PessoaPraticante(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getInt("idade"), rs.getString("plano"));
                ALpp.add(Opp);
            }
            
        }catch (SQLException e){
            System.out.println("Err: " + e);
        }
        return ALpp;     
    }
    
    public ArrayList <PessoaFuncionario> consultarFuncionar(){
        ArrayList <PessoaFuncionario> ALpf = new ArrayList <PessoaFuncionario>();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM funcionario");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                PessoaFuncionario Opf = new PessoaFuncionario (rs.getInt ("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getInt("idade"), rs.getString("cargo"), rs.getDouble("salario"));
                ALpf.add(Opf);
            }
            
        } catch (SQLException e) {
            System.out.println("Err: " + e);
        }
        return ALpf;
    }
   
}