package mensagens; // Define o pacote onde esta classe está localizada.

public class MensagemAssinadaDecorator extends MensagemDecorator { // Classe que estende MensagemDecorator para adicionar uma assinatura à mensagem.
    private String assinatura; // Armazena a assinatura que será adicionada à mensagem.

    public MensagemAssinadaDecorator(Mensagem mensagem, String assinatura) { // Construtor que recebe uma mensagem e uma assinatura.
        super(mensagem); // Chama o construtor da classe base (MensagemDecorator).
        this.assinatura = assinatura; // Define a assinatura que será usada na mensagem.
    }

    @Override
    public String getConteudo() { // Sobrescreve o método getConteudo() para adicionar a assinatura à mensagem.
        return super.getConteudo() + "\n\nAtenciosamente,\n" + assinatura; // Retorna o conteúdo original da mensagem com a assinatura adicionada.
    }
}