package mensagens;

public class MensagemCriptografadaDecorator extends MensagemDecorator {

    public MensagemCriptografadaDecorator(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String getConteudo() {
        // Criptografa apenas o conteúdo original da mensagem base
        String conteudoOriginal = mensagem.getConteudo();
        String criptografado = new StringBuilder(conteudoOriginal).reverse().toString();
        return criptografado;
    }
}
