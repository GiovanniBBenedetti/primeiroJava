import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();


        int anoAtual = Year.now().getValue();
        int anoNascimento = anoAtual - idade;

        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos e nasceu aproximadamente em " + anoNascimento + ".");

        scanner.close();
    }
}
