package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;
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

	@Override
	public Tmimata get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Tmimata tmimata) {
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		currentSession.save(tmimata);
		
	}

	@Override
	public void delete(Integer id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Tmimata tmimata;
		tmimata = (Tmimata)currentSession.load(Tmimata.class,id);
	    currentSession.delete(tmimata);

	    //This makes the pending delete to be done
	    currentSession.flush() ;
		
	}

	@Override
	@Transactional
	public void update(Tmimata tmimata) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(tmimata);
		
	}
}