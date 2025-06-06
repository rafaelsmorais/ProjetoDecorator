package mensagens; // Define o pacote onde esta classe está localizada.

public class MensagemMaiusculaDecorator extends MensagemDecorator { // Classe que estende MensagemDecorator para transformar o conteúdo da mensagem em maiúsculas.

    public MensagemMaiusculaDecorator(Mensagem mensagem) { // Construtor que recebe uma mensagem e a passa para a superclasse.
        super(mensagem); // Chama o construtor da classe base MensagemDecorator, armazenando a mensagem original.
    }

    @Override
    public String getConteudo() { // Sobrescreve o método getConteudo() para modificar o retorno da mensagem.
        return super.getConteudo().toUpperCase(); // Converte todo o conteúdo da mensagem para letras maiúsculas.
    }
}