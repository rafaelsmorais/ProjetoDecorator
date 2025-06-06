package mensagens; // Define o pacote onde esta classe está localizada.

/**
 * Classe que representa uma mensagem básica, sem alterações.
 */
public class MensagemSimples implements Mensagem { // Implementa a interface Mensagem.

    private final String texto; // Armazena o conteúdo da mensagem.

    /**
     * Construtor da classe que recebe o texto da mensagem.
     *
     * @param texto Conteúdo da mensagem.
     */
    public MensagemSimples(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("O conteúdo da mensagem não pode ser vazio ou nulo.");
        }
        this.texto = texto; // Atribui o conteúdo à variável.
    }

    /**
     * Retorna o conteúdo da mensagem.
     *
     * @return Texto original.
     */
    @Override
    public String getConteudo() {
        return texto;
    }
}
