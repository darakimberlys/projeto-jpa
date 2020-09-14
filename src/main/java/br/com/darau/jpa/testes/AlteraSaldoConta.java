package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraSaldoConta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta contaid1 = em.find(Conta.class, 1L);
        em.getTransaction().begin();
        contaid1.setSaldo(95000000.0);
        em.getTransaction().commit();
//        Conta contaid2 = em.find(Conta.class, 2L);
//        em.getTransaction().begin();
//        contaid2.setSaldo(15.0);
//        contaid2.setNumero(1513);
//        contaid2.setTitular("Kourtney");
//        Conta contaid3 = em.find(Conta.class, 3L);
//        contaid3.setSaldo(19.0);
//        contaid3.setNumero(4593);
//        contaid3.setTitular("Kim");
//        Conta contaid4 = em.find(Conta.class, 4L);
//        contaid4.setSaldo(45.0);
//        contaid4.setNumero(8563);
//        contaid4.setTitular("Khloé");
//        Conta contaid5 = em.find(Conta.class, 5L);
//        contaid5.setSaldo(35.0);
//        contaid5.setNumero(9850);
//        contaid5.setTitular("Robert");
//        em.getTransaction().commit();
    }
}
