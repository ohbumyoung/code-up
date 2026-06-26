package after;
// 입, 출력 화면
public class View {
	
	private Controller controller;
	
	public View() {
		this.controller = new Controller();
	}
	
	public void dispiay() {
		
		controller.getInfo();
		
		System.out.println(controller.getInfo());
	}

}
