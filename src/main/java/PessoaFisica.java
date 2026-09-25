public class PessoaFisica extends Cliente{

    public PessoaFisica(float valorCompra) {
        super(valorCompra);
    }

    @Override
    public float calcularValorFinal() {
        float desconto = valorCompra * plano.percentualDesconto();
        return valorCompra - desconto;
    }
}
