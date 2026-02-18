import java.util.Scanner;

public class scanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo!");
        System.out.println("Primeiramente, digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Agora preciso que digite seu cpf: ");
        String cpf = scanner.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Agora digite a sua altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("por último, digite o seu estado civil: ");
        String estcivil = scanner.nextLine();

        System.out.println("Seu nome é " + nome + ", seu CPF é " + cpf +
                ", a sua idade é " + idade + " anos, seu peso é " + peso +
                "kg, sua altura é " + altura + "cm e seu estado civil atual é " + estcivil + ".");

        System.out.println("Pra finalizar o atendimento, é necessário que me confirme se suas informações estão corretas.");
        System.out.println("Para isso, preciso que digite 'true' para 'sim' e 'false' para 'não'.");
        boolean confirmacao = scanner.nextBoolean();

        System.out.println("A sua resposta foi '" + confirmacao + "', então encerramos o atendimento por aqui, até a próxima!");

        scanner.close();

    }
}
