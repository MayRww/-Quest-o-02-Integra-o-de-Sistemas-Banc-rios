

// Atua como "ponte" entre o sistema moderno e o legado.
// Implementa a interface moderna e chama o legado internamente.

import java.util.HashMap;

public class AdaptadorTransacoes implements ProcessadorTransacoes {

    private SistemaBancarioLegado legado;

    public AdaptadorTransacoes(SistemaBancarioLegado legado) {
        this.legado = legado;
    }

    @Override
    public boolean autorizar(String cartao, double valor, String moeda) {
        HashMap<String, Object> parametros = new HashMap<>();

        parametros.put("cartao", cartao);
        parametros.put("valor", valor);
        parametros.put("moedaCodigo", converterMoeda(moeda));
        parametros.put("origem", "SISTEMA_MODERNO"); 

        boolean resultado = legado.processarTransacao(parametros);

        HashMap<String, Object> resposta = legado.gerarResposta(resultado);
        System.out.println("Resposta adaptada: " + resposta);

        return resultado;
    }


    private int converterMoeda(String moeda) {
        switch (moeda.toUpperCase()) {
            case "USD": return 1;
            case "EUR": return 2;
            case "BRL": return 3;
            default:
                System.out.println("Aviso: moeda desconhecida. Usando código 0.");
                return 0;
        }
    }
}
