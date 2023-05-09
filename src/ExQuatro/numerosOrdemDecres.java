package ExQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numerosOrdemDecres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numerosLista = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe um número: ");
            numerosLista.add(scan.nextInt());
        }

        if (numerosLista.get(0) < numerosLista.get(1)) {
            System.out.println(numerosLista.get(1) + " " + numerosLista.get(0));
        } else if (numerosLista.get(1) < numerosLista.get(0)) {
            System.out.println(numerosLista.get(0) + " " + numerosLista.get(1));
        } else {
            System.out.println("ERROR");
        }


    }
}
