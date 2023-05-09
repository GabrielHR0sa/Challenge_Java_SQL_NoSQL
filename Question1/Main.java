package Question1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pega as informações do usuário sobre a quantidade de funcionarios e armazena
        // no array
        System.out.println("Insira a quantidade de funcionários que serão cadastrados: \n");
        int qtFuncionarios = scanner.nextInt();

        if (qtFuncionarios <= 0) {
            System.out.println("Favor digitar um numero válido de funcionários");
        } else {

            int vet[] = new int[qtFuncionarios];
            String[] nome = new String[qtFuncionarios];
            double salario[] = new double[qtFuncionarios];

            // Solicita a inserção de informações
            for (int i = 0; i < vet.length; i++) {

                System.out.println("\nInsira o nome do funcionário " + (i + 1) + ": ");
                nome[i] = scanner.next();
                scanner.nextLine();
                System.out.println("\nInsira o salário do funcionário " + (i + 1) + ": ");
                salario[i] = scanner.nextDouble();

            }

            // Exibição
            for (int i = 0; i < vet.length; i++) {
                System.out.println("---------------------------");
                System.out.println("Employee: " + nome[i]);
                System.out.println("Salary: " + salario[i]);
                Calculo(salario[i]);
                System.out.println("---------------------------\n");
            }

        }

        scanner.close();
    }

    // Calcula o bonus ou o desconto do funcionário baseado no salário
    public static void Calculo(double salario) {
        double resultado;

        if (salario <= 1000) {
            resultado = (salario / 100) * 20;
            System.out.println("Bonus: R$" + resultado);
            System.out.println("Líquid Salary: R$" + (salario + resultado));
        } else if (salario > 1000 && salario <= 2000) {
            resultado = (salario / 100) * 10;
            System.out.println("Bonus: R$" + resultado);
            System.out.println("Líquid Salary: R$" + (salario + resultado));
        } else {
            resultado = (salario / 100) * 10;
            System.out.println("Discount: R$" + resultado);
            System.out.println("Líquid Salary: R$" + (salario - resultado));
        }
    }

}
