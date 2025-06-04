package themes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("1 - Cadastrar produto");
            opcao = sc.nextInt();
            sc.nextLine();

        } while (opcao != 0);
    }
}
