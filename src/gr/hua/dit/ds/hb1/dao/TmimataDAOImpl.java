package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Tmimata;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TmimataDAOImpl implements TmimataDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Tmimata> getTmimata() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Tmimata> query = currentSession.createQuery("from Tmimata", Tmimata.class);


        // execute the query and get the results list
        List<Tmimata> tmimata = query.getResultList();

        //return the results
        return tmimata;
    }
}