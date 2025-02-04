package myspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import myspring.dao.CustomerReposirory;
import myspring.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	
	@Autowired
	private CustomerReposirory CustomerRep;
	
	@Override
	public Customer getByPasswordAndEmail(String Passwors, String Email) {
//		return mapper.map(CustomerRep.findByPasswordAndEmail(Passwors, Email),CustomerDto.class);
		return CustomerRep.findByPasswordAndEmail(Passwors, Email);
	}

//	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
//	private CustomerReposirory customertRep;
//	@Override
//	public void add(Customer a) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(int code) {
//		customertRep.deleteById(code);
//	}
//
//	@Override
//	public void update(Customer a) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Customer> getAll() {
//		return customertRep.findAll();
//	}
//
//	@Override
//	public Optional<Customer> getByCode(int code) {
//		return customertRep.findById(code);
//	}
////	@Override
////	public Customer getByEmailAndPassword(@RequestParam String email,@RequestParam String password) {
////		
////		for (int i = 0; i < customertRep.count(); i++) {
////			if(customertRep.getById(i).getEmail().equals(email)&&customertRep.getById(i).getPassword().equals(password))
////				return customertRep.getOne(i);
////		}
////		return null;
////	}
//	
////	@Autowired
//
////	private ModelMapper mapper;

	




//	@Autowired
//	@Override
//
//	public Customer getByPasswordAndEmail(String Passwors, String Email) {
//
////		return mapper.map(CustomerRep.findByPasswordAndEmail(Passwors, Email),CustomerDto.class);
//
////		return ((CustomerReposirory) CustomerRep).findByPasswordAndEmail(Passwors, Email);
//		return CustomerRep.findByPasswordAndEmail(Passwors, Email);
//
//	}
//
//	@Autowired
//	@Override
//	public Customer getByEmailAndPassword(String Email, String Password) {
//		// TODO Auto-generated method stub
//		return ((CustomerReposirory) CustomerRep).findByPasswordAndEmail(Email, Password);
////		return null;
//	}
	

	

}
