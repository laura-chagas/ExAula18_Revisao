package ExDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionarAlgo {
    static Scanner scan = new Scanner(System.in);
    static List<String> listaDeNomes = new ArrayList<>();

    public static void main(String[] args) {
        listaNomes(qdtNomes());
        adicionarDado();
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

    public static void adicionarDado() {
        System.out.println("Digite o dado a adicionar: ");
        listaDeNomes.add(3, scan.next());

        System.out.println("Lista de nomes atual: ");
        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println(listaDeNomes.get(i));
        }
    }
}
