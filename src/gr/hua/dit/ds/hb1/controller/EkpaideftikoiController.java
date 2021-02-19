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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action == null) {
			action = "LIST";
		}

		switch (action) {

		case "LIST":
			response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
			break;

//		case "EDIT":
//			updateEkpaideftikoi(request, response);
//			break;

		case "DELETE":
			deleteEkpaideftikoi(request, response);
			break;

		default:
			response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
			break;

		}

	}

	@GetMapping("/add")
	public String addTeacher() {
		return "ekpaideftikoi-form";

	}

//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String processFormv2(HttpServletRequest request, Model model) {
//
//		return "register_2";

//	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public void loginUser(Ekpaideftikoi ekpaideftikoi) {
		// user object will automatically be populated with values sent from browser or
		// jsp page. Provide your authentication logic here
	}

//--------------------------------------------------------------------------------------------------

//	private void listEkpaideftikoi(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		List<Ekpaideftikoi> ekpaideftikoi = ekpaideftikoiDAO.getEkpaideftikoi();
//
//		response.setAttribute("list", ekpaideftikoi);
//
//		dispatcher = response.getRequestDispatcher("/view/ekpaideftikoi-list.jsp");
//
//		dispatcher.forward(request, response);
//	}

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
//			if () {
//				
//				System.out.println("ALL GOOD");
//			}
//			else {
//				System.out.println("PEOI");
//			}

		response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
	}

	private void deleteEkpaideftikoi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		ekpaideftikoiDAO.delete(username);
		

		response.sendRedirect("/spring-hb-1/ekpaideftikoi/list");
	}

}