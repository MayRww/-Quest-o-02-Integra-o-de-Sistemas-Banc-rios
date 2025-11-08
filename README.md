Questão 02 – Integração de Sistemas Bancários

eu usei o padrão Adapter para compatibilizar duas interfaces incompatíveis, a moderna (ProcessadorTransacoes) e a legada (SistemaBancarioLegado).
pois permite que o sistema atual se comunique com o legado sem precisar alterar o código antigo, traduzindo chamadas e respostas entre os dois formatos.

A classe AdaptadorTransacoes atua como uma ponte entre as interfaces, convertendo os parâmetros modernos em estruturas HashMap exigidas pelo legado, adicionando campos obrigatórios e também traduzindo as respostas para o formato atual.

Com isso, o sistema mantém baixo acoplamento, reutiliza o código legado e respeita os princípios SOLID, especialmente OCP (aberto para extensão, fechado para modificação) e DIP (dependência de abstrações, não de implementações).

Com isso o novo sistema pode continuar usando autorizar(...), sem conhecer os detalhes do legado.

O adaptador converte os parâmetros para o formato esperado pelo legado (HashMap).

O adaptador também traduz a resposta do legado para o formato moderno.

os princípios solids utilizado:

RP	Cada classe tem uma responsabilidade única (processar, adaptar ou simular o legado), 
OCP	O sistema pode ser estendido com novos adaptadores sem alterar o código existente, 
DIP	O código moderno depende da abstração (ProcessadorTransacoes), não do sistema legado.
