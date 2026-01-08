package javaapplication9.SQL.Classes;
public class UsuarioLogado {
    private static String nome, cpf, cargo, email;
    private static int id, idade;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuarioLogado.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        UsuarioLogado.cpf = cpf;
    }

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String cargo) {
        UsuarioLogado.cargo = cargo;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UsuarioLogado.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UsuarioLogado.id = id;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        UsuarioLogado.idade = idade;
    }
}