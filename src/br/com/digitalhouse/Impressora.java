package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimiveis = new ArrayList<>();

    //Methods
    public void imprimirTudo(){
        for (int i=0;i<imprimiveis.size();i++){
            imprimiveis.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);
    }

}
