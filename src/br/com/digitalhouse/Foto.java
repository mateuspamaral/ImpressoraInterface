package br.com.digitalhouse;

public class Foto implements Imprimivel {

    //Attributes
    private String nome;
    private String tipo;

    //Constructors
    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Foto(){}

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
        System.out.println("Sou uma selfie: " + this.nome + this.tipo);
    }
}
