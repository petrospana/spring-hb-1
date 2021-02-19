package gr.hua.dit.ds.hb1.dao;

import java.util.List;

import gr.hua.dit.ds.hb1.entity.Diefthintes;
import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;

public interface DiefthintesDAO {
    public List<Diefthintes> getDiefthintes();

    Diefthintes get(int id);
	
	void save(Diefthintes diefthintes);
	
	void delete(String username);
	
	void update(Diefthintes diefthintes);


}