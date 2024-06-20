package myspring.dto;

import java.util.Set;

import myspring.model.Advertisement;

public class CustomerDto {

	private int code;
	private String idNumber;
	private String name;
	private String email;
	private String password;
	private Set<AdvertisementDto> orders;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<AdvertisementDto> getOrders() {
		return orders;
	}

	public void setOrders(Set<AdvertisementDto> orders) {
		this.orders = orders;
	}
}
