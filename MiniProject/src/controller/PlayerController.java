package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Player;



public class PlayerController {

	List<Player> list = new ArrayList<>();
	private final String FILE_NAME = "player.txt";
	
	 // 등록	
	public int addList(Player player) {
		list.add(player);
		return 1;
		
	}
	public void printAll() {
		for(Player p : list) {
			System.out.println(p);
		}
	}
// 검색
	public List<Player> searchPlayer(String name) {
		List<Player> result = new ArrayList<>(); //[]
		// 검색 결과 목록을 저장하기 위해 리스트 생성
		
		for(Player p : list) {
			// 전체 선수 목록에서 전달 받은 이름(name)이 포함된 선수가 있을 경우			
			if(p.getName().contains(name)) {
				// 결과 목록에 추가
				result.add(p);
			}
		}
		
		// 검색 결과 목록을 반환
		 return result;
	}
	
	public Player searchPlayerByName(String name) {
		
		for(Player p : list) {
					
			if(p.getName().equals(name)) {
			
				return p;
			}
		} 
		
		
		 return null;
	}
	
	
	// 삭제
	public Player removePlayer(String name) {
		/*
		 
		 */
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	// 수정
	public Player setPlayer(String name, Player player ) {
	
		for(int i = 0; i<list.size(); i++) {
		 Player p = list.get(i);
		 if(p.getName().equals(name)) {
			
			return list.set(i, player);	
			 
		 } 
		}
		return null;
	}
	// 파일 저장
	public int fileSave(){
		
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("player.txt"))){
					
					// {선수명}|{등번호}|{포지션}|{기록}
					for(Player p : list) {
						
						String data = p.getName() + "|" + p.getBackNumber() + "|" + p.getPosition()+ "|" + p.getStat() + "\n";
								
						
						bw.write(data);
						bw.flush();
					}
					
				}catch(IOException e) {
					e.printStackTrace();
					
					return 0;
				}
				return 1;
			}
		
	
	private void fileLoad() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
			
			String content;
			while ( (content = br.readLine()) != null) {
				if(content.contains("|")) {
					
					// "/" 를 기준으로 문자열을 쪼개기 => 문자열.split(구분자)
					String[] datas = content.split("|"); // ["가수명", "곡명"]
					
					addList(new Player(datas[0], Integer.valueOf(datas[1]), datas[2], Integer.valueOf(datas[3])));
				}
			}
			
		}catch(IOException e){
			
		}
		
	}
	
	
		
}