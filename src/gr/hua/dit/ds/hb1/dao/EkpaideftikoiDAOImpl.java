package gr.hua.dit.ds.hb1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;
import gr.hua.dit.ds.hb1.util.DBConnectionUtil;

import javax.transaction.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EkpaideftikoiDAOImpl implements EkpaideftikoiDAO {

	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;

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

		// return the results
		return ekpaideftikoi;
	}

	@Override
	public Ekpaideftikoi get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Ekpaideftikoi ekpaideftikoi) {
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		currentSession.save(ekpaideftikoi);

		// return the results

	}

	@Override
	@Transactional
	public void delete(String username) {
		Session currentSession = sessionFactory.getCurrentSession();
		Ekpaideftikoi ekpaideftikoi;
		ekpaideftikoi = (Ekpaideftikoi)currentSession.load(Ekpaideftikoi.class,username);
	    currentSession.delete(ekpaideftikoi);

	    //This makes the pending delete to be done
	    currentSession.flush() ;
	}

	@Override
	@Transactional
	public void update(Ekpaideftikoi ekpaideftikoi) {
		
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(ekpaideftikoi);

	}

}