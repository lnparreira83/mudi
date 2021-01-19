package br.com.alura.jpa.dao;

import br.com.alura.jpa.modelo.MediaComData;

import javax.persistence.*;
import java.util.List;

public class MovimentacaoDAO {

    private EntityManager em;

    public MovimentacaoDAO(EntityManager em) {
        this.em = em;
    }


    public List<MediaComData> getMediaDiariaDasMovimentacoes(){
        TypedQuery<MediaComData> query = em.createNamedQuery("mediaDiariaMovimentacoes", MediaComData.class);
        return query.getResultList();
    }
}
