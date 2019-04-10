package br.com.digitalhouse;

public class Contrato implements Imprimivel {
    //Attributes
    private String nome;
    private String tipo;

    //Constructor
    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Contrato(){}

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Methods
    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal: " + this.nome + this.tipo);
    }
}
