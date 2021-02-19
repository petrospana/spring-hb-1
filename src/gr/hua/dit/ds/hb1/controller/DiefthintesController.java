package gr.hua.dit.ds.hb1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.ds.hb1.dao.DiefthintesDAO;
import gr.hua.dit.ds.hb1.dao.StathmoiDAO;
import gr.hua.dit.ds.hb1.dao.TmimataDAO;
import gr.hua.dit.ds.hb1.entity.Diefthintes;
import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;
import gr.hua.dit.ds.hb1.entity.Stathmoi;
import gr.hua.dit.ds.hb1.entity.Tmimata;




@Controller
@RequestMapping("/diefthintes")
public class DiefthintesController {

	@Autowired
    private DiefthintesDAO diefthintesDAO;
	
	@Autowired
	private StathmoiDAO stathmoiDAO;
	
	@Autowired
	private TmimataDAO tmimataDAO;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/list")
    public String listDiefthintes(Model model) {
        	
     // get customers from dao
        List<Diefthintes> diefthintes = diefthintesDAO.getDiefthintes();
        
        // add the customers to the model
        model.addAttribute("diefthintes",diefthintes);
        
        return "diefthintes-list";
	}
//============================================================================================STATHMOI======================================================================	
	@Secured("ROLE_ADMIN")
	@GetMapping("/stathmoilist")
    public String listStathmoi(Model model) {
        	
     // get customers from dao
        List<Stathmoi> stathmoi = stathmoiDAO.getStathmoi();
        
        // add the customers to the model
        model.addAttribute("stathmoi",stathmoi);
        
        return "stathmoi-list";
	}
//================================================================================================================================================================================	
	
//============================================================================================TMIMATA==============================================================================	
	@Secured("ROLE_ADMIN")
	@GetMapping("/tmimatalist")
    public String listTmimata(Model model) {
        	
     // get customers from dao
        List<Tmimata> tmimata = tmimataDAO.getTmimata();
        
        // add the customers to the model
        model.addAttribute("tmimata",tmimata);
        
        return "tmimata-list";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/tmimataAdd")
    public String addTmimata() {
        return "tmimata-form";
        
        
    }
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/registerTmimata", method = RequestMethod.POST)
	protected void doPostTmimata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Tmimata t = new Tmimata();
		t.setUsername(request.getParameter("username"));
		t.setTmima_id(Integer.parseInt(request.getParameter("tmima_id")));
		t.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		tmimataDAO.save(t);


		response.sendRedirect("/spring-hb-1/diefthintes/tmimatalist");
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/tmimataUpdate")
	public String updateTmimata() {
		return "tmimata-update-form";

	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/updateTmimata", method = RequestMethod.POST)
	protected void doUpdateTmimata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Tmimata t = new Tmimata();
		t.setUsername(request.getParameter("username"));
		t.setTmima_id(Integer.parseInt(request.getParameter("tmima_id")));
		t.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		tmimataDAO.update(t);


		response.sendRedirect("/spring-hb-1/diefthintes/tmimatalist");
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/tmimataDelete", method = RequestMethod.GET)
	private void deleteTmimata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		diefthintesDAO.delete(id);
		

		response.sendRedirect("/spring-hb-1/diefthintes/tmimatalist");
	}
	
//======================================================================================================================================================================================	
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/add")
    public String addPrincipal() {
        return "diefthintes-form";
        
        
    }
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/update")
	public String updatePrincipal() {
		return "diefthintes-update-form";

	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public void loginUser(Diefthintes diefthintes) {
		// user object will automatically be populated with values sent from browser or
		// jsp page. Provide your authentication logic here
	}

//--------------------------------------------------------------------------------------------------

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/registerPrincipal", method = RequestMethod.POST)
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Diefthintes d = new Diefthintes();
		d.setUsername(request.getParameter("username"));
		d.setFirst_name(request.getParameter("first_name"));
		d.setLast_name(request.getParameter("last_name"));
		d.setEmail(request.getParameter("email"));
		d.setPassword(request.getParameter("password"));
		d.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		diefthintesDAO.save(d);


		response.sendRedirect("/spring-hb-1/diefthintes/list");
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/updatePrincipal", method = RequestMethod.POST)
	protected void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Diefthintes d = new Diefthintes();
		d.setUsername(request.getParameter("username"));
		d.setFirst_name(request.getParameter("first_name"));
		d.setLast_name(request.getParameter("last_name"));
		d.setEmail(request.getParameter("email"));
		d.setPassword(request.getParameter("password"));
		d.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		diefthintesDAO.update(d);
		
		response.sendRedirect("/spring-hb-1/diefthintes/list");
	}	

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	private void deleteDiefthintes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		diefthintesDAO.delete(username);
		

		response.sendRedirect("/spring-hb-1/diefthintes/list");
	}
}
