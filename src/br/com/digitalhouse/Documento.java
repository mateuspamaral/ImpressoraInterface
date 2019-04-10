package br.com.digitalhouse;

public class Documento implements Imprimivel {

    //Attributes
    private String nome;
    private String tipo;

    //Constructord
    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Documento(){}

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
        System.out.println("Sou um documento do Word: " + this.nome + this.tipo);
    }
}
