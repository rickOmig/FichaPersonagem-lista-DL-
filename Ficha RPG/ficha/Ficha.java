package ficha;
/**
 * Ficha
 */
public class Ficha {

    private String nome, classe, raca;
    private int energia, vida, id;
    private int a=0;

    
    public Ficha(String nome, String raca, String classe, int vida, int energia) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.energia = energia;
        this.vida = vida;
        this.id = a++;
    }

    //<----------------GETTERS---------------->

    public String getNome() {
        return nome;
    }


    public String getClasse() {
        return classe;
    }


    public String getRaca() {
        return raca;
    }


    public int getEnergia() {
        return energia;
    }


    public int getVida() {
        return vida;
    }


    public int getId() {
        return id;
    }


    //<----------------GETTERS---------------->


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setId(int id) {
        this.id = id;
    }
    //<----------------toString---------------->


    @Override
    public String toString() {
        return "| id: " +id+ "nome: " +nome+ " | classe: " +classe+ " | raca: " +raca+ " | energia:" +energia+ " | vida: " +vida+ " |\n";
            
    } 

}