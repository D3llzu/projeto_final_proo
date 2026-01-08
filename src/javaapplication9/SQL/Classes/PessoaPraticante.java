/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9.SQL.Classes;
public class PessoaPraticante {
    private int idade, id;
    private String nome, cpf, plano, email;
    
    public PessoaPraticante(String cpf, String nome, String email, int idade, String plano){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.plano = plano;
    }
    
    public PessoaPraticante(int id, String cpf, String nome, String email, int idade, String plano){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.plano = plano;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}