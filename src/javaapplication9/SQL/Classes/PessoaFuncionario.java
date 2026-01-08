/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9.SQL.Classes;
public class PessoaFuncionario {
    private int idade, id;
    private Double salario;
    private String nome, cpf, cargo, email;
    
    public PessoaFuncionario(String cpf, String nome, String email, int idade, String cargo, Double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }
    public PessoaFuncionario(int id, String cpf, String nome, String email, int idade, String cargo, Double salario){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}