package view;

import java.util.List;
import java.util.Scanner;

import controller.PlayerController;
import model.Player;

public class View {
	private Scanner sc = new Scanner(System.in);
	private PlayerController pl = new PlayerController();
	public void mainMenu() {
	while(true) {
		//메뉴창
		System.out.println("=======선수 관리 프로그램=======");
		System.out.println("[1]ㅣ선수 등록ㅣ");
		System.out.println("2. 선수 조회");
		System.out.println("3. 선수 전체조회");
		System.out.println("4. 선수 삭제");
		System.out.println("5. 선수 수정");
		System.out.println("6. 저장");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호 입력: ");
		
		
		
		
		//선택한 번호로 이동
		int menu = readInt();
		switch(menu) {
		case 1:
			addList();
			break;
		case 2:
			searchPlayer();
			break;
		case 3:
			printAll();
			break;
		case 4:
			removePlayer();
			break;
		case 5:
			setPlayer();
			break;
		case 6:
			fileSave();
			break;
		case 0:
			System.out.println("프로그램 종료");
			return;
			default:
			System.out.println("잘못 선택하였습니다.");
				break;
		}		
	}
	}
	
	private int readInt() {
		
		int menu = -1;
		
		while(!sc.hasNextInt()) {
			System.out.print("숫자를 입력해주세요. : ");
			sc.next();
		}
		menu = sc.nextInt();
		sc.nextLine();
		
		return menu;
	}
	
	
	//등록
	public void addList() {
		System.out.println("===== 선수를 등록해주세요. *****");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("등번호 : ");
		
		
		int backNumber = readInt();
		
		String position;
		
		while(true) {
			System.out.print("포지션 : " );
			position = sc.nextLine().toUpperCase();
			if(checkPosition(position)) {
				break;
			}
				
			}
		
		
		
		System.out.print("");
		int Stat = 0;
		
		
		int result = pl.addList(new Player(name, backNumber, position, Stat));
		if(result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.print("추가 실패");
		}
	}
	
	private boolean checkPosition(String position) {
		String[] pt = {"FW","MF","DF"};
		for(String str : pt) {
			if(position.equals(str)) {
				
				return true;
			}
		} return false;
	}
	//선수 조회
	public void searchPlayer() {
		System.out.println("***** 선수 조회 *****");
		System.out.print("선수 조회 : ");
		String name = sc.nextLine();
		List<Player> player =  pl.searchPlayer(name);
		if(player.isEmpty()) {
			System.out.println("해당 선수가 존재하지 않습니다.");
		}else {
			
			for(Player p:player) {
			System.out.println(p + "을(를) 조회했습니다.");
			}
		}
}
	//전체 선수 출력
	public void printAll() { //TODO:
		System.out.println("***** 등록한 선수 목록 *****");
		pl.printAll();
	}
	
	public void removePlayer() {
		System.out.println("***** 선수 삭제 *****");
		System.out.print("삭제할 선수: ");
		String name = sc.nextLine();
		
			Player player = pl.removePlayer(name);
			
		if(player!=null) {
		System.out.println(player + "을(를) 삭제했습니다.");
		}else {
			System.out.println("해당 선수가 존재하지 않습니다.");
		}
			
	}
	
	public void setPlayer() {
		
		
		
		System.out.println("***** 선수 프로필 수정 *****");
		System.out.print("검색할 선수명: ");
		String searchName = sc.nextLine();	
		Player result = pl.searchPlayerByName(searchName);
	
		if(result == null) {
			System.out.println("등록 안됨");
			return;
		}
	
		
		
		
		System.out.print("수정할 선수명 : ");
		String newName = sc.nextLine();
		
		
		System.out.print("수정할 등번호 : ");
		int newNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 포지션 : ");
		String newPosition = sc.nextLine();
		
		System.out.print("골 기록 : ");
		int newStat = sc.nextInt();
		sc.nextLine();
		

		
		Player player = pl.setPlayer(searchName, new Player(newName,newNumber,newPosition,newStat, result.getPoint()));
		
		if(player == null) {
			System.out.println("해당 선수가 존재하지 않습니다.");
		}else {
			System.out.println(player + "의 값이 변경되었습니다.");
		}
	}
	
	private void fileSave() {
		
		
		if (pl.fileSave() == 1) {
			System.out.println("파일 저장이 완료되었습니다.");
		}else {
			System.out.println("파일 저장에 실패했습니다.");
		}
		
	
}
	}

