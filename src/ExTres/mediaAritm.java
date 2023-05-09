package ExTres;
/*Faça um programa que contenha um método que receba o tamanho
de uma lista como parâmetro e que retorne a lista com a capacidade
inicial recebida pelo usuário.
Logo depois faça um método que adicione valores nessa lista, os valores
devem ser recebidos pelo usuário respeitando a capacidade inicial
além disso esse método deve retornar true caso a adição seja bem sucedida e
false caso o contrário.
Por fim um método que retorna a média aritmética
dos números armazenados na lista.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mediaAritm {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe a quantidade de números que vão ser digitados: ");
        int tamanhoLista = scan.nextInt();

        List<Integer> listaDeNumeros = capacidadeLista(tamanhoLista);

        adicionarNumerosNaLista(listaDeNumeros, tamanhoLista);

        mediaAritm(listaDeNumeros);

    }

    public static List<Integer> capacidadeLista(int tamanhoLista) {

        List<Integer> listaDeNumeros = new ArrayList(tamanhoLista);
        return listaDeNumeros;
    }

    public static boolean adicionarNumerosNaLista(List<Integer> listaDeNumeros, int tamanhoLista) {

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite um número: ");
            listaDeNumeros.add(scan.nextInt());

        }
        return true;

    }

    public static void mediaAritm(List<Integer> listaDeNumeros) {
        int totalsoma = 0;

        for (int i = 0; i < listaDeNumeros.size(); i++) {
            totalsoma += listaDeNumeros.get(i);
        }
        System.out.println("Total da soma: " + totalsoma);

        System.out.println("-------------------------------");

        double media;

        media = totalsoma / listaDeNumeros.size();
        System.out.println("A média é: " + media);


    }


}
