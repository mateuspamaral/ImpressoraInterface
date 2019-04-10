package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        Contrato contrato = new Contrato("Contrato",".java");
        Foto foto = new Foto("Foto",".jpeg");
        Documento documento = new Documento("Documento",".xdoc");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();

    }
}
