package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Mathites;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MathitesDAOImpl implements MathitesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Mathites> getMathites() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Mathites> query = currentSession.createQuery("from Mathites", Mathites.class);


        // execute the query and get the results list
        List<Mathites> mathites = query.getResultList();

        //return the results
        return mathites;
    }
}