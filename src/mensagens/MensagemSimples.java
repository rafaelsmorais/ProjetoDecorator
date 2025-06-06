package mensagens; // Define o pacote onde esta classe está localizada.

public class MensagemSimples implements Mensagem { // Classe que implementa a interface Mensagem para representar uma mensagem básica.
    private String texto; // Variável que armazena o conteúdo da mensagem.

    public MensagemSimples(String texto) { // Construtor que recebe um texto e inicializa a variável.
        this.texto = texto; // Define o conteúdo da mensagem.
    }

    @Override
    public String getConteudo() { // Implementação do método da interface Mensagem.
        return texto; // Retorna o conteúdo da mensagem.
    }
}