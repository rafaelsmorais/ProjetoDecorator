package mensagens; // Define o pacote "mensagens" onde a interface está localizada.

public interface Mensagem { // Declara uma interface chamada "Mensagem".
    String getConteudo(); // Método abstrato que retorna o conteúdo da mensagem como uma String.
    // Qualquer classe que implementar essa interface deve fornecer uma implementação para este método.
}