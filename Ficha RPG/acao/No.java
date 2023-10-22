package acao;
public class No {
    private Object dados;
    private No proximo, anterior;

    //<----------------CONSTRUCTOR---------------->
    public No(Object dados, No proximo, No anterior) {
        this.dados = dados;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    //<----------------GETTERS---------------->
    public Object getDados() {
        return dados;
    }


    public No getProximo() {
        return proximo;
    }


    public No getAnterior() {
        return anterior;
    }
    
    //<----------------SETTERS---------------->>

    public void setDados(Object dados) {
        this.dados = dados;
    }


    public void setProximo(No proximo) {
        this.proximo = proximo;
    }


    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    


    

    
}
