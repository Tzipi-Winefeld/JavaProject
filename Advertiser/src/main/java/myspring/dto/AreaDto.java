package myspring.dto;

public class AreaDto {

	private int code;
	private String name;
	private boolean free;
	private int pricePerMinute;
	private int pricePerView;
	
	
	public boolean isFree() {
		return free;
	}
	
	public void setFree(boolean free) {
		this.free = free;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPricePerMinute() {
		return pricePerMinute;
	}
	public void setPricePerMinute(int pricePerMinute) {
		this.pricePerMinute = pricePerMinute;
	}
	
	public int getPricePerView() {
		return pricePerView;
	}
	
	public void setPricePerView(int pricePerView) {
		this.pricePerView = pricePerView;
	}
	public static final int TOP=1;
	public static final int LEFT=2;
	public static final int RIGHT=3;
	public static final int BOTTOM=4;
	
}
