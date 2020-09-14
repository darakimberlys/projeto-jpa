package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaConta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("Pedro");
        conta.setNumero(1213);
        conta.setAgencia(4016);
        conta.setSaldo((double) 150000);

        em.getTransaction().begin();

        em.persist(conta);

        em.getTransaction().commit();
    }
}
