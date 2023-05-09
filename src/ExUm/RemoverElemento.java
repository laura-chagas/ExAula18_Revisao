package ExUm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoverElemento {
    static Scanner scan = new Scanner(System.in);
    static List<String> listaDeNomes = new ArrayList<>();

    public static void main(String[] args) {

        listaNomes(qdtNomes());
        removerNome();

    }

    public static int qdtNomes() {
        System.out.println("Informe quantos nomes deseja inserir: ");
        int qtdeNomes = scan.nextInt();
        return qtdeNomes;

    }

    public static void listaNomes(int qtdeNomes) {

        for (int i = 0; i < qtdeNomes; i++) {
            System.out.println("Digite um nome: ");
            listaDeNomes.add(scan.next());
        }
        System.out.println("Lista de nomes: ");
        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println(listaDeNomes.get(i));
        }


    }

    public static void removerNome() {

        System.out.println("Deseja remover um nome? \n 1 - SIM        2 - Não");
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Qual nome deseja remover? ");
                listaDeNomes.remove(scan.next());
                for (int i = 0; i < listaDeNomes.size(); i++) {
                    System.out.println(listaDeNomes.get(i));
                }
                break;
            case 2:
                System.out.println("FIM DO PROGRAMA");
                System.exit(0);
            default:
                System.out.println("ERROR");
                System.exit(0);
        }

    }
}
