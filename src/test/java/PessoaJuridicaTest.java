import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaJuridicaTest {

    @Test
    void deveRetornarPJBronze(){
        PlanoFidelidade plano = new Bronze();
        PessoaJuridica pj = new PessoaJuridica(100.0f);
        pj.setPlano(plano);
        assertEquals(110f, pj.calcularValorFinal());
    }

    @Test
    void deveRetornarPJPrata(){
        PlanoFidelidade plano = new Prata();
        PessoaJuridica pj = new PessoaJuridica(100.0f);
        pj.setPlano(plano);
        assertEquals(105f, pj.calcularValorFinal());
    }

    @Test
    void deveRetornarPJOuro(){
        PlanoFidelidade plano = new Ouro();
        PessoaJuridica pj = new PessoaJuridica(100.0f);
        pj.setPlano(plano);
        assertEquals(95f, pj.calcularValorFinal());
    }

}