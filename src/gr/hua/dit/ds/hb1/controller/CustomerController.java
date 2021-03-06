package gr.hua.dit.ds.hb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.hb1.dao.CustomerDAO;
import gr.hua.dit.ds.hb1.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
        
        // inject the customer dao
        @Autowired
        private CustomerDAO customerDAO;
        
        @RequestMapping("/list")
        public String listCustomers(Model model) {
                
                // get customers from dao
                List<Customer> customers = customerDAO.getCustomers();
                
                // add the customers to the model
                model.addAttribute("customers",customers);
                
                return "list-customers";
        }

}
