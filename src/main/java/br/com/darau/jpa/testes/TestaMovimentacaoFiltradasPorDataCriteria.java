package br.com.darau.jpa.testes;

import br.com.darau.jpa.modelo.Movimentacao;
import br.com.darau.jpa.modelo.dao.MovimentacaoDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestaMovimentacaoFiltradasPorDataCriteria {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        MovimentacaoDao dao = new MovimentacaoDao(em);
        List<Movimentacao> movimentacaoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(null, null, null);
        for (Movimentacao movimentacao : movimentacaoesFiltradasPorData) {
            System.out.println("Descricao -> " + movimentacao.getDescricao());
            System.out.println("Valor -> " + movimentacao.getValor());
            System.out.println("------------------------------------");
        }
    }
}
