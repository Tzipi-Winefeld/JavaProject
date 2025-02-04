package myspring.dto;

import java.util.Date;

public class AdvertisementDto {

	private int code;
	
	private int areaCode;
	
	private AreaDto area_;
	
	private boolean active;
	
	private byte[] file;
	
	private CustomerDto customer_;
	
	private Date orderDate;
	
	private int customerCode;	
	
	
	public byte[] getFile() {
		return file;
	}


	public void setFile(byte[] file) {
		this.file = file;
	}


	public CustomerDto getCustomer_() {
		return customer_;
	}


	public void setCustomer_(CustomerDto customer_) {
		this.customer_ = customer_;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public int getCustomerCode() {
		return customerCode;
	}


	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public int getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}


	public AreaDto getArea() {
		return area_;
	}


	public void setArea(AreaDto area) {
		this.area_ = area;
	}
}
