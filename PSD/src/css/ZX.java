package css;

public class ZX {
	
	String name;
	int ageLimit;
	String notice;
	

	public ZX(String name, int ageLimit, String notice) {
		this.name = name;
		this.ageLimit = ageLimit;
		this.notice = notice;
		
		
	}
	
		public void movie1() {
			for(int i = 0; i<1; i++ ) {
				
				if(i<19) {
					System.out.println(name + "는(은)" + "전 연령 시청 가능한 영화입니다.");
				}else {
					System.out.println(name + "는(은)" +"청소년 시청 불가 영화입니다.");
				}
			}
		}
		
	
	public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("시간: " + ageLimit + "분");
        System.out.println("연령제한: " + notice + "살");
	}

	

	

}
