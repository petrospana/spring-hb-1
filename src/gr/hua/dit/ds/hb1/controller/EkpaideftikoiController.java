package gr.hua.dit.ds.hb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.hb1.dao.EkpaideftikoiDAO;
import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;

@Controller
@RequestMapping("/ekpaideftikoi")
public class EkpaideftikoiController {
	
	@Autowired
    private EkpaideftikoiDAO ekpaideftikoiDAO;
	
	
	@GetMapping("/list")
    public String listEkpaideftikoi(Model model) {
        	
     // get customers from dao
        List<Ekpaideftikoi> ekpaideftikoi = ekpaideftikoiDAO.getEkpaideftikoi();
        
        // add the customers to the model
        model.addAttribute("ekpaideftikoi", ekpaideftikoi);
        
        return "listAllEkpaideftikoi";
	
	}
	
	@GetMapping("/add")
    public String addTeacher() {
        return "teacher-form";


    }
}