import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaFisicaTest {

    @Test
    void deveRetornarPFBronze(){
        PlanoFidelidade plano = new Bronze();
        PessoaFisica pf = new PessoaFisica(100.0f);
        pf.setPlano(plano);
        assertEquals(95f, pf.calcularValorFinal());
    }

    @Test
    void deveRetornarPFPrata(){
        PlanoFidelidade plano = new Prata();
        PessoaFisica pf = new PessoaFisica(100.0f);
        pf.setPlano(plano);
        assertEquals(90f, pf.calcularValorFinal());
    }

    @Test
    void deveRetornarPFOuro(){
        PlanoFidelidade plano = new Ouro();
        PessoaFisica pf = new PessoaFisica(100.0f);
        pf.setPlano(plano);
        assertEquals(80f, pf.calcularValorFinal());
    }

}