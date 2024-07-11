import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que entre com um número entre 0 e 1000
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Fechando o scanner após a leitura
        scanner.close();

        // Verificando se o número está dentro do intervalo permitido
        if (number < 0 || number > 1000) {
            System.out.println("Number must be between 0 and 1000.");
            return;
        }

        // Chamando o método para calcular a soma dos dígitos
        int sum = sumDigits(number);

        // Exibindo o resultado
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }

    // Método para calcular a soma dos dígitos de um número
    public static int sumDigits(int number) {
        int sum = 0;

        // Iterando sobre cada dígito do número
        while (number > 0) {
            // Obtendo o último dígito do número usando o operador % (resto da divisão)
            int digit = number % 10;

            // Adicionando o dígito à soma
            sum += digit;

            // Removendo o último dígito do número usando o operador / (divisão inteira)
            number /= 10;
        }

        return sum;
    }
}
