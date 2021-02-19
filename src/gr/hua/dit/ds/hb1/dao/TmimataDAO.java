package gr.hua.dit.ds.hb1.dao;

import java.util.List;


import gr.hua.dit.ds.hb1.entity.Tmimata;

public interface TmimataDAO {
    public List<Tmimata> getTmimata();
    
    Tmimata get(int id);
	
	void save(Tmimata tmimata);
	
	void delete(Integer id);
	
	void update(Tmimata tmimata);

}