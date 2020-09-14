package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Conta;
import br.com.darau.jpa.modelo.Movimentacao;
import br.com.darau.jpa.modelo.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaRelacionamento {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular("Pedro");
        conta.setNumero(1213);
        conta.setAgencia(4016);
        conta.setSaldo(150000.0);

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(LocalDateTime.now());
        movimentacao.setDescricao("Churrascaria");
        movimentacao.setValor(new BigDecimal(200.0));
        movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
       // movimentacao.setConta(conta);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("darau");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(conta);
        em.persist(movimentacao);
        em.getTransaction().commit();

        em.close();
    }
}
