
// Interface: ProcessadorTransacoes
// Define o formato moderno de processamento.

public interface ProcessadorTransacoes {
    boolean autorizar(String cartao, double valor, String moeda);
}
