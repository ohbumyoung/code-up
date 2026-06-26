package after;
// 기능들 정리


	public class Controller {
	
	// Model 객체를 관리
	private Model model;
	
	public Controller() {
		this.model = new Model();
	}
	
	public String getInfo() {
		if(model != null) {
			return "이름 : " + model.getName();
		} else {
			return "정보가 없습니다.";
		}
	}
}
