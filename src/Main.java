package mensagens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a mensagem:");
        String texto = scanner.nextLine();
        Mensagem mensagem = new MensagemSimples(texto);

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1) Criptografar a mensagem");
        System.out.println("2) Colocar a mensagem em maiúsculas");
        System.out.println("3) Assinar a mensagem");
        System.out.print("Digite uma opção: ");
        int opcao = Integer.parseInt(scanner.nextLine().trim());

        switch (opcao) {
            case 1:
                System.out.println("Mensagem original:");
                System.out.println(mensagem.getConteudo());
                mensagem = new MensagemCriptografadaDecorator(mensagem);
                break;
            case 2:
                System.out.println("Mensagem original:");
                System.out.println(mensagem.getConteudo());
                mensagem = new MensagemMaiusculaDecorator(mensagem);
                break;
            case 3:
                System.out.println("Mensagem original:");
                System.out.println(mensagem.getConteudo());
                System.out.print("Digite o nome da assinatura: ");
                String assinatura = scanner.nextLine();
                mensagem = new MensagemAssinadaDecorator(mensagem, assinatura);
                break;
            default:
                System.out.println("Opção inválida. Nenhuma operação será realizada.");
        }
        System.out.println("Mensagem final:");
        System.out.println(mensagem.getConteudo());
    }
}
