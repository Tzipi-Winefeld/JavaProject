package myspring.dto;

public class ViewsAdvertisementDto extends AdvertisementDto{

	private int wantedViews;
	private int amountViews;
	public int getWantedViews() {
		return wantedViews;
	}
	public void setWantedViews(int wantedViews) {
		this.wantedViews = wantedViews;
	}
	public int getAmountViews() {
		return amountViews;
	}
	public void setAmountViews(int amountViews) {
		this.amountViews = amountViews;
	}

}
