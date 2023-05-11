package Question2;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int comparacao;

        do {

            System.out.println("Digite a mensagem para saber o sentimento que ela expressa: \n");
            System.out.println("Utilize o caractere :-) Para Feliz \n");
            System.out.println("Utilize o caractere :-( Para Triste \n");
            String read = scanner.nextLine();
            

            System.out.println(Emoticons(read));

            System.out.println("Gostaria de repetir o programa? 1[Sim] 0[Não] \n");
            comparacao = scanner.nextInt();
            scanner.nextLine();

        } while (comparacao != 0);

        scanner.close();

    }

    public static String Emoticons(String read) {
        /*
         * criei um array para receber a String digitada, e utilizei o método
         * split() que serve para separar a string pelo parametro definido
         * que no caso foi o espaço de um entre o outro.
         * 
         */
        String[] takeRead = read.split(" ");
        int fun = 0;
        int upset = 0;
        int neutral = 0;

        /*
         * o for percorre o array comparando as condições em cada index
         * acrescentando no contador pro if logo abaixo do for
         */
        for (int i = 0; i < takeRead.length; i++) {

            if (takeRead[i].contains(":-(") == true) {
                upset++;
            } else if (takeRead[i].contains(":-)") == true) {
                fun++;
            } else {
                neutral++;
            }
        }

        if (fun == upset) {
            return "\nEmoção: Neutral";
        } else if (fun > upset) {
            return "\nEmoção: Fun";
        } else {
            return "\nEmoção: Upset";
        }

    }

}
