package desafios;

import java.util.Scanner;

public class desafiologicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //obtendo os valores boolean com o Scanner
        System.out.println("VOcê trabalhou na terça ?");
        boolean trabalhoterca = scanner.nextBoolean();
        System.out.println("Você Trabalhou na Quinta ?");
        boolean trabalhoquinta = scanner.nextBoolean();

        //operador logico E AND (&&)
        System.out.println("Os trabalhos deram certo, vamos comprar uma TV de 50 Polegadas " +  (trabalhoterca && trabalhoquinta));

        //operador logico OU OR ||
        System.out.println("Apenas um dos trabalhos deram certo, nesse caso vamos comprar uma TV de 32 Polegadas " +  (trabalhoquinta || trabalhoterca));

        //operador logico XOR
        System.out.println(" Você comprou a TV de 32 ou a TV de 52 Polegadas nesse caso vamos tomar sorvete no Shopping  " +  (trabalhoquinta ^ trabalhoterca));

        //operador Logico NOT
        System.out.println("você não trabalhou em nenhum dos dias nesse caso vamos ficar em casa " +  (!trabalhoquinta));
        System.out.println("não tomar sorvete pode ser considerdo algo saudavel " +  (!trabalhoterca));
        scanner.close();
    }
}
