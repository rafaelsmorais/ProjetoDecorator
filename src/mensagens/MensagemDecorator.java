package mensagens; // Define o pacote onde esta classe está localizada.

public abstract class MensagemDecorator implements Mensagem { // Classe abstrata que implementa a interface Mensagem e serve como base para decoradores.
    protected Mensagem mensagem; // Armazena a mensagem original que será decorada/modificada.

    public MensagemDecorator(Mensagem mensagem) { // Construtor que recebe uma mensagem como parâmetro.
        this.mensagem = mensagem; // Inicializa a mensagem para permitir a modificação por subclasses.
    }

    @Override
    public String getConteudo() { // Implementação do método getConteudo() da interface Mensagem.
        return mensagem.getConteudo(); // Retorna o conteúdo original da mensagem, sem modificações.
    }
}