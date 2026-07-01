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
	
	public PlayerController() {
		fileLoad();
	}
	
	 // 등록	
	public int addList(Player player) {
		list.add(player);
		return 1;
		
	}
	public void printAll() {
		if(list.isEmpty()) {
	        System.out.println("==================================");
	        System.out.println("등록된 선수가 없습니다.");
	        System.out.println("==================================");
	        return;
	    }

	    for(Player p : list) {
	        System.out.println(p);
	    }
		
		
	}
// 검색
	public List<Player> searchPlayer(String name) {
		List<Player> result = new ArrayList<>(); //[]
		
		
		for(Player p : list) {
						
			if(p.getName().contains(name)) {
				
				result.add(p);
			}
		}
		
		
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
	// 파일 입력
	public int fileSave(){
		
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("player.txt"))){
					
					
					for(Player p : list) {
						
						String data = p.getName() + "/" + p.getBackNumber() + "/" + p.getPosition()+ "/" + p.getStat() + "\n";
								
						
						bw.write(data);
						bw.flush();
					}
					
				}catch(IOException e) {
					e.printStackTrace();
					
					return 0;
				}
				return 1;
			}
		
	//파일 출력
	private void fileLoad() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
			
			String content;
			while ( (content = br.readLine()) != null) {
				
					
					
					String[] datas = content.split("/"); 
					
					Player p = new Player(datas[0], Integer.valueOf(datas[1]), datas[2], Integer.valueOf(datas[3]));
					list.add(p);
				}
			}catch(IOException e) {
			
		}
			
		}
		
	}
	
	
		
