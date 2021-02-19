package gr.hua.dit.ds.hb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.hb1.dao.MathitesDAO;
import gr.hua.dit.ds.hb1.entity.Mathites;


@Controller
@RequestMapping("/mathites")
public class MathitesController {
	
	@Autowired
    private MathitesDAO mathitesDAO;
	
	
	@GetMapping("/list")
    public String listMathites(Model model) {
        	
     // get customers from dao
        List<Mathites> mathites = mathitesDAO.getMathites();
        
        // add the customers to the model
        model.addAttribute("mathites",mathites);
        
        return "mathites-list";
	
	}
}