package gr.hua.dit.ds.hb1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.ds.hb1.dao.EkpaideftikoiDAO;
import gr.hua.dit.ds.hb1.dao.EkpaideftikoiDAOImpl;
import gr.hua.dit.ds.hb1.entity.Ekpaideftikoi;

import javax.servlet.RequestDispatcher;

@Controller
@RequestMapping("/ekpaideftikoi")
public class EkpaideftikoiController {

	RequestDispatcher dispatcher = null;

	@Autowired
	private EkpaideftikoiDAO ekpaideftikoiDAO;

	@GetMapping("/list")
	public String listEkpaideftikoi(Model model) {

		// get customers from dao
		List<Ekpaideftikoi> ekpaideftikoi = ekpaideftikoiDAO.getEkpaideftikoi();

		// add the customers to the model
		model.addAttribute("ekpaideftikoi", ekpaideftikoi);

		return "ekpaideftikoi-list";

	}

	

	@GetMapping("/add")
	public String addTeacher() {
		return "ekpaideftikoi-form";

	}
	
	@GetMapping("/update")
	public String updateTeacher() {
		return "ekpaideftikoi-update-form";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public void loginUser(Ekpaideftikoi ekpaideftikoi) {
		// user object will automatically be populated with values sent from browser or
		// jsp page. Provide your authentication logic here
	}

//--------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Ekpaideftikoi e = new Ekpaideftikoi();
		e.setUsername(request.getParameter("username"));
		e.setFirst_name(request.getParameter("first_name"));
		e.setLast_name(request.getParameter("last_name"));
		e.setEmail(request.getParameter("email"));
		e.setPassword(request.getParameter("password"));
		e.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		ekpaideftikoiDAO.save(e);


		response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
	}
	
	@RequestMapping(value = "/updateTeacher", method = RequestMethod.POST)
	protected void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Ekpaideftikoi e = new Ekpaideftikoi();
		e.setUsername(request.getParameter("username"));
		e.setFirst_name(request.getParameter("first_name"));
		e.setLast_name(request.getParameter("last_name"));
		e.setEmail(request.getParameter("email"));
		e.setPassword(request.getParameter("password"));
		e.setStathmos_id(Integer.parseInt(request.getParameter("stathmos_id")));

		ekpaideftikoiDAO.update(e);
		
		response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
	}	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	private void deleteEkpaideftikoi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		ekpaideftikoiDAO.delete(username);
		

		response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
	}

}