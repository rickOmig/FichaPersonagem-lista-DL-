package personagem;

import acao.*;
import ficha.Ficha;
import java.util.Scanner;

public class Personagem {

    public static Metodo met = new Metodo();
    public static Scanner input = new Scanner(System.in);

    public static void menuCriacao(){
        
 
        System.out.println("Insira o nome do seu personagem: ");
        System.out.print("Nome: "); String nome = input.nextLine();

        System.out.println("Insira a classe do seu personagem: ");
        System.out.print("Classe: "); String classe = input.next();

        System.out.println("Insira a raça do seu personagem: ");
        System.out.print("Raça: "); String raca = input.next();

        System.out.println("Insira a vida de seu personagem: ");
        System.out.print("Vida: "); int vida = input.nextInt();

        System.out.println("Insira a energia de seu personagem: ");
        System.out.print("energia: "); int energia = input.nextInt();

        met.inserir(new Ficha(nome, raca, classe, vida, energia));
        
    }


    public static void exibirTudo(){
        met.exbir();
    }
    
    public static void apagarPersonagem(){
        System.out.println("Qual personagem você deseja apagar?");
        System.out.print("id: "); int id = input.nextInt();

        if(met.apagar(id)){
            System.out.print("Personagem removido");
        }else{
            System.out.print("Personagem não removido");
        }
    }

    public static void menu(){
        System.out.println("O que você deseja fazer?");
        System.out.print("[1] Criar Personagem");
        System.out.print("[2] Exibir Personagens");
        System.out.print("[3] Apagar Personagem");
        System.out.print("[0] Sair do Programa");
        System.out.print("CMD: "); int cmd = input.nextInt();

        switch (cmd) {
            case 1:  
                menuCriacao();         
            break;

            case 2:
                exibirTudo();
            break;

            case 3:
                apagarPersonagem();
            break;
            
            case 0:
                System.exit(0);
            break;

            default:
                System.out.print("Comando não existente\nTente Novamente");
                menu();
            break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
    
}
