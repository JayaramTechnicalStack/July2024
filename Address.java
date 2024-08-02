package hasa;

public class Address {
	
	private String flatNo;
	private String addressLine1;
	private String addressLine2;
	private String landMark;
	private String city;
	private int picode;
	
	
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPicode() {
		return picode;
	}
	public void setPicode(int picode) {
		this.picode = picode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", landMark=" + landMark + ", city=" + city + ", picode=" + picode + "]";
	}
	
	
	
	

}
