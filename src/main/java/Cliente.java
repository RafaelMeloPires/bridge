public abstract class Cliente {

    protected PlanoFidelidade plano;
    protected float valorCompra;

    public Cliente(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setPlano(PlanoFidelidade plano) {
        this.plano = plano;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public abstract float calcularValorFinal();
}
