package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Cliente;
import br.com.darau.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRCC {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("darau");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setId(1L);

        Cliente cliente = new Cliente();
        cliente.setNome("Pedrinho");
        cliente.setEndereco("Rua Pio X");
        cliente.setProfissao("DEV");
        cliente.setConta(conta);

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
