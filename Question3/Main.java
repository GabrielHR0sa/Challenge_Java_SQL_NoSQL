package Question3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de usuario: \n");
        String nome = scanner.nextLine();

        int c = 0;
        int e = 0;

        //matriz com perguntas e respostas
        String[][] PerguntasRespostas = {
                { "1 - Informe o resultado da operação: 5 * (2+2)", "20" },
                { "2 - Informe o resultado da operação: 50 / 2 + 10 ", "35" },
                { "3 - int nome = 'Jose';  A declaração de variavel esta correta ? ( V[verdadeiro] F[falso] )", "F" },
                { "4 - Informe o resultado da operação: (100 + 50) / 2", "75" },
                { "5 - O comando javac é utilizado para definir variaveis? ( V[verdadeiro] F[falso] )", "F" },
                { "6 - Informe o resultado da operação: (1000 - 900) * 10", "1000" },
                { "7 - Informe o resultado da operação: 5 * 10 ", "50" },
                { "8 - count++; A variável count será incrementada? ( V[verdadeiro] F[falso] )", "V" },
                { "9 - Informe o resultado da operação: 200 / 100", "2" },
                { "10 - Informe o resultado da operação: 123 + 456", "579" },
        };

        System.out.println("\n -------------Começando o questionário------------\n");

        //Exibição das perguntas e comparação de respostas
        for (int i = 0; i < PerguntasRespostas.length; i++) {

            System.out.println(PerguntasRespostas[i][0]);

            System.out.println("Resposta da questão " + (i + 1) + " : ");
            String resposta = scanner.nextLine();

            if (resposta.equals(PerguntasRespostas[i][1])) {
                System.out.println("Parabéns! Resposta correta\n");
                System.out.println("---------------------------------\n");
                c++;
            } else {
                System.out.println("Que pena! Resposta errada.\n");
                System.out.println("---------------------------------\n");
                e++;
            }

        }

        Retorno(nome, c, e);

        scanner.close();
    }

    public static void Retorno(String nome, int c, int e) {

        System.out.println("\n---------------------------------");
        System.out.println("User: " + nome);
        System.out.println("Right: " + c);
        System.out.println("Wrong: " + e);
    }

}
