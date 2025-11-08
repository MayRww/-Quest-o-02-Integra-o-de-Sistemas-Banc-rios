
// Demonstra o uso do Adaptador para integrar sistema moderno e legado.

public class Main {
    public static void main(String[] args) {

        SistemaBancarioLegado legado = new SistemaBancarioLegado();
        ProcessadorTransacoes processador = new AdaptadorTransacoes(legado);

        System.out.println("===== Teste de Integração (Adapter) =====\n");

        processador.autorizar("5555-6666-7777-8888", 250.75, "USD");
        processador.autorizar("9999-0000-1111-2222", 480.00, "BRL");
        processador.autorizar("3333-4444-5555-6666", 100.00, "XYZ"); // moeda inválida

        System.out.println("\n===== Fim da Simulação =====");
    }
}
