package gr.hua.dit.ds.hb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.hb1.dao.DiefthintesDAO;
import gr.hua.dit.ds.hb1.entity.Diefthintes;




@Controller
@RequestMapping("/diefthintes")
public class DiefthintesController {

	@Autowired
    private DiefthintesDAO diefthintesDAO;
	
	
	@GetMapping("/list")
    public String listDiefthintes(Model model) {
        	
     // get customers from dao
        List<Diefthintes> diefthintes = diefthintesDAO.getDiefthintes();
        
        // add the customers to the model
        model.addAttribute("diefthintes",diefthintes);
        
        return "listAllDiefthintes";
	}
	
	
	@GetMapping("/add")
    public String addPrincipal() {
        return "principal-form";
        
        
    }
}
