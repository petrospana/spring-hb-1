package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Aitiseis;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AitiseisDAOImpl implements AitiseisDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Aitiseis> getAitiseis() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Aitiseis> query = currentSession.createQuery("from Aitiseis", Aitiseis.class);


        // execute the query and get the results list
        List<Aitiseis> aitiseis = query.getResultList();

        //return the results
        return aitiseis;
    }
}