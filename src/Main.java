//2. [PIRAMIDE] Escreva um programa que mostre no console
//uma pirâmide de números, com um número de linhas entre
//1 e 9, fornecido pelo usuário. Caso o número esteja fora do
//limite, mostrar mensagem de erro e solicitar novamente
//o número. Por exemplo, se o número de linhas for 4, o resultado
//será:
//         1
//        121
//       12321
//      1234321

//IMPORT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Incluindo a função SCANNER
        Scanner scanner = new Scanner(System.in);

        // Solicitando o número de linhas através do scanner
        System.out.print("Digite o número desejado: " +
                "(Entre 1 a 9)");
        int nmrLinhas = scanner.nextInt();


        if (nmrLinhas >= 1 && nmrLinhas < 9){

            // Criar a pirâmide
            for (int i = 1; i <= nmrLinhas; i++) {

                // Adiconando espaço do lado esquerdo
                for (int j = 1; j <= (nmrLinhas - i); j++) {
                    System.out.print(" ");
                }

                // Primeira metade dos números
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Segunda metade dos números
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                // Pular de linha
                System.out.println();
            }
        } else {
            System.out.println("O numero informado é " +
                    "maior" +
                    " que o 9 ou menor que 1.");
        }
    scanner.close();
    }
}