package gr.hua.dit.ds.hb1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.ds.hb1.dao.AitiseisDAO;
import gr.hua.dit.ds.hb1.entity.Aitiseis;


@Controller
@RequestMapping("/aitiseis")
public class AitiseisController {
	
	@Autowired
    private AitiseisDAO aitiseisDAO;
	
	
	@GetMapping("/list")
    public String listAitiseis(Model model) {
        	
     // get customers from dao
        List<Aitiseis> aitiseis = aitiseisDAO.getAitiseis();
        
        // add the customers to the model
        model.addAttribute("aitiseis", aitiseis);
        
        return "aitiseis-list";
	}
 

}