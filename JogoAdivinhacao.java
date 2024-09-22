import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido = random.nextInt(100) + 1;
        int tentativasMaximas = 10;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("O numero correto está entre 1 e 100. Você tem " + tentativasMaximas + " tentativas.");

        while (tentativas < tentativasMaximas && !acertou) {
            System.out.print("Digite seu chute: ");
            int chute = scanner.nextInt();
            tentativas++;

            if (chute < 1 || chute > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
            } else if (chute < numeroEscolhido) {
                System.out.println("O número é maior que " + chute + ".");
            } else if (chute > numeroEscolhido) {
                System.out.println("O número é menor que " + chute + ".");
            } else {
                acertou = true;
            }
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou " + numeroEscolhido + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você errou :( O número sorteado era:" + numeroEscolhido);
    }

        scanner.close();
    }
}
