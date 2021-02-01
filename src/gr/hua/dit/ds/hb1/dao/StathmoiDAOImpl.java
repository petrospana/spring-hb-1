package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Stathmoi;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StathmoiDAOImpl implements StathmoiDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Stathmoi> getStathmoi() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Stathmoi> query = currentSession.createQuery("from Stathmoi", Stathmoi.class);


        // execute the query and get the results list
        List<Stathmoi> stathmoi = query.getResultList();

        //return the results
        return stathmoi;
    }
}