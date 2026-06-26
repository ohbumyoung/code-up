package om.kh.ex2.model;

public abstract class SmartPhone {
	
	private String maker;
	
	public SmartPhone() {
		
		 this.maker = maker;
		
	}
	public abstract String printInformation();
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}

}
