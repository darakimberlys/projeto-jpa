package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Conta;
import br.com.darau.jpa.modelo.Movimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaMovimentacaoConta {
    public static void main(String[] args) throws NullPointerException{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Movimentacao movimentacao = em.find(Movimentacao.class, 2L);
        Conta conta = movimentacao.getConta();
        int quantidadeDeMovimentacoes = conta.getMovimentacoes().size();

        System.out.println("Quatidade de movimentações: " + quantidadeDeMovimentacoes);
        System.out.println("Titular da conta: " + conta.getTitular());
    }
}
