package myspring.service;

import java.util.List;
import java.util.Optional;

import myspring.model.Customer;

public interface CustomerService {
//	void add(Customer a);
//	void delete(int code);
//	void update(Customer a);
//	List<Customer> getAll();
//	Optional<Customer> getByCode(int code);
	Customer getByPasswordAndEmail(String Passwors, String Email);
}
