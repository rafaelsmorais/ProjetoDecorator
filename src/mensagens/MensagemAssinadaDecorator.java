package mensagens; // Declara o pacote onde esta classe está localizada.

/**
 * Decorador que adiciona uma assinatura ao final da mensagem.
 */
public class MensagemAssinadaDecorator extends MensagemDecorator {

    private final String assinatura; // Armazena o nome da assinatura.

    /**
     * Construtor que recebe a mensagem original e a assinatura.
     *
     * @param mensagem   Objeto Mensagem a ser decorado.
     * @param assinatura Nome ou frase de assinatura.
     */
    public MensagemAssinadaDecorator(Mensagem mensagem, String assinatura) {
        super(mensagem); // Inicializa a superclasse com a mensagem original.

        if (assinatura == null || assinatura.trim().isEmpty()) {
            throw new IllegalArgumentException("Assinatura não pode ser vazia ou nula.");
        }

        this.assinatura = assinatura; // Atribui a assinatura à variável.
    }

    /**
     * Retorna o conteúdo original da mensagem com a assinatura adicionada.
     *
     * @return Texto decorado com assinatura.
     */
    @Override
    public String getConteudo() {
        return super.getConteudo() + "\n\nAtenciosamente,\n" + assinatura;
        // Junta o conteúdo original com uma saudação e a assinatura.
    }
}
