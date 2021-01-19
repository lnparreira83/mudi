package br.com.alura.jpa.testes;

import br.com.alura.jpa.dao.MovimentacaoDAO;
import br.com.alura.jpa.modelo.MediaComData;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestaMediaMovimentacoes {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        List <MediaComData> mediaDasMovimentacoes = new MovimentacaoDAO(em).getMediaDiariaDasMovimentacoes();

        for(MediaComData resultado : mediaDasMovimentacoes){
            System.out.println(resultado.getDia() + "-" + resultado.getMes() + " | " + resultado.getValor());
        }


    }
}
