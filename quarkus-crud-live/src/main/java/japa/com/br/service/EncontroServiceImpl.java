package japa.com.br.service;

import japa.com.br.model.Encontro;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class EncontroServiceImpl implements EncontroService {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Encontro> lista() {
        return em.createQuery("select e from Encontro e", Encontro.class).getResultList();
    }
}
