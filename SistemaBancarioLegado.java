
// Representa o sistema bancário antigo, com interface incompatível.

import java.util.HashMap;

public class SistemaBancarioLegado {

    public boolean processarTransacao(HashMap<String, Object> parametros) {
        System.out.println("=== Sistema Bancário Legado ===");

        if (!parametros.containsKey("cartao") || !parametros.containsKey("valor") || !parametros.containsKey("moedaCodigo")) {
            System.out.println("Erro: parâmetros obrigatórios ausentes!");
            return false;
        }

        System.out.println("Cartão: " + parametros.get("cartao"));
        System.out.println("Valor: " + parametros.get("valor"));
        System.out.println("Código da moeda: " + parametros.get("moedaCodigo"));
        System.out.println("Origem da requisição: " + parametros.get("origem"));

        // Simula aprovação
        return true;
    }

    // Resposta no formato legado
    public HashMap<String, Object> gerarResposta(boolean sucesso) {
        HashMap<String, Object> resposta = new HashMap<>();
        resposta.put("status", sucesso ? "APROVADA" : "NEGADA");
        resposta.put("codigo", sucesso ? 200 : 400);
        return resposta;
    }
}
