package gr.hua.dit.ds.hb1.dao;

import java.util.List;

import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;

public interface EkpaideftikoiDAO {
    public List<Ekpaideftikoi> getEkpaideftikoi();
    
    Ekpaideftikoi get(int id);
	
	void save(Ekpaideftikoi ekpaideftikoi);
	
	void delete(String username);
	
	boolean update(Ekpaideftikoi ekpaideftikoi);

}