package myspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import myspring.model.Customer;

public interface CustomerReposirory extends JpaRepository<Customer, Integer>{

	Customer findByPasswordAndEmail(String Password, String Email);

}
