package myspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myspring.service.CustomerService;
import myspring.model.Customer;

@RequestMapping("/customers")//זוהי הכתובת היחסית ההתחלתית לכל הפונקציות במחלקה
@RestController //הגדרת קונטרולר
public class CustomerController {
	@Autowired//(required = true)
	private CustomerService cs;
	
	@GetMapping("/login")
	public Customer getByEmailAndPassword(@RequestParam("email") String email,@RequestParam("password") String password) {
		return	cs.getByPasswordAndEmail(password, email); 
	}
	
	@GetMapping
	public String ttt()
	{
		return "fdsfds";
	}	
	
	
	
	
}
