package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Diefthintes;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DiefthintesDAOImpl implements DiefthintesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Diefthintes> getDiefthintes() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Diefthintes> query = currentSession.createQuery("from Diefthintes", Diefthintes.class);


        // execute the query and get the results list
        List<Diefthintes> diefthintes = query.getResultList();

        //return the results
        return diefthintes;
    }
}