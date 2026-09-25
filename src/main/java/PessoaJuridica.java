public class PessoaJuridica extends Cliente{

    public PessoaJuridica(float valorCompra) {
        super(valorCompra);
    }

    @Override
    public float calcularValorFinal() {
        float desconto = valorCompra * plano.percentualDesconto();
        return valorCompra - desconto + 15f;
    }
}
