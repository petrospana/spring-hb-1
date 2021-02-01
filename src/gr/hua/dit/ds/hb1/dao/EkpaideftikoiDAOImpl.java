package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EkpaideftikoiDAOImpl implements EkpaideftikoiDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Ekpaideftikoi> getEkpaideftikoi() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Ekpaideftikoi> query = currentSession.createQuery("from Ekpaideftikoi", Ekpaideftikoi.class);


        // execute the query and get the results list
        List<Ekpaideftikoi> ekpaideftikoi = query.getResultList();

        //return the results
        return ekpaideftikoi;
    }
}