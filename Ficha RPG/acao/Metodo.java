package acao;
/**
 * Metodo
 */


import ficha.Ficha;

public class Metodo {
    private No inicio, atual, auxiliar;

    public boolean verificador(){
        return inicio == null;
    }

    public void inserir (Object dados){ 
        if(verificador()){
            inicio = new No(dados,null,null);
        } else {
            atual = new No(dados, null, null);
            auxiliar.setProximo(atual);
            auxiliar = atual;

        }
    }

    private No pesquisar(int id){
        No referencia = inicio;
        Ficha p;
        while(referencia != null){
            p = (Ficha)referencia.getDados();
            if (id == p.getId()){
                return referencia;
            }
            referencia=referencia.getProximo();
        }
        return null;
    }

    public boolean apagar(int id){
        No referencia = pesquisar(id);
        if(referencia != null){
            if(referencia == inicio){
                inicio = referencia.getProximo();
                referencia.setProximo(null);
                inicio.setAnterior(null);
            } else if(referencia == atual){
                auxiliar = referencia.getAnterior();
                atual = auxiliar;
                referencia.setAnterior(null);
                referencia.setProximo(null);
            } else{
                referencia.getAnterior().setProximo(referencia.getProximo());
                referencia.getProximo().setAnterior(referencia.getAnterior());
                referencia.setAnterior(null);
                referencia.setProximo(null);
            }
            return true;
        }
        return false;
    }

    public void exbir(){
        No referencia = inicio;
        while(referencia != null){
            System.out.print(referencia.getDados());
            referencia = referencia.getProximo();
        }
    }
}
