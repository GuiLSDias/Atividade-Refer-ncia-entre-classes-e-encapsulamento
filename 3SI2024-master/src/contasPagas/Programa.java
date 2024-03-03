package contasPagas;

public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto();

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();

        Conta conta = new Conta();
        Conta conta1 = new Conta();

        produto.setValorProduto(1500.89);
        produto.setDescricaoProduto("Notebook core i7");
        cliente.setNomeCliente("Guilherme");
        cliente.setCpf("129.129.129-29");
        conta.setIdConta(1);
        conta.setDataPagamento("01/03/2024");
        conta.setDataVencimento("05/03/2024");
        conta.setPro(produto);
        conta.setCli(cliente);

        produto1.setValorProduto(2545.99);
        produto1.setDescricaoProduto("TV LED 42");
        cliente1.setNomeCliente("Daniela");
        cliente1.setCpf("204.882.349.82");
        conta1.setIdConta(2);
        conta1.setDataVencimento("01/07/2011");
        conta1.setDataPagamento("30/06/2011");
        conta1.setPro(produto1);
        conta1.setCli(cliente1);

        conta.visualizarConta();
        conta1.visualizarConta();

    }
}
