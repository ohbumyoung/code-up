package model;

public class Player {
	private String name;
    private int backNumber;
    private String position;
    private int stat;
    private double point = 10.0;
   
    public Player() {
    	super();
    }
 
    public Player(int stat, double point) {
    	super();
    }
   
    public Player(String name, int backNumber, String position, int stat) {
    	super();
    	this.name = name;
        this.backNumber = backNumber;
        this.position = position;
        this.stat = stat;
    }
    
    public Player(String name, int backNumber, String position, int stat, double point) {
    	super();
    	this.name = name;
        this.backNumber = backNumber;
        this.position = position;
        this.stat = stat;
        
        if(stat>=30) {
    		this.point = point * 4.4;  
    		
    	}else if(stat>=20)  {
    		this.point = point * 3.3;
    	}else if(stat>=10) {
    		this.point = point * 2.2;
    	}else {
    		this.point = point * 1.1;
    	}
    	
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name) { // 수정  삭제
		this.name = name;
	}

    public int getBackNumber() {
    	return backNumber;
    	
    }
    
    public void setBacNumber(int backNumber) { 
		this.backNumber = backNumber;
    }
    
    
    public String getPosition() {
    	return position;
    }
    
    public void setPosition(String position) {
    	this.position = position;
    }

    public int getStat() {
    	return stat;
    }

    public void setStat(int stat) {
    	this.stat = stat;
    }
    
    public double getPoint() {
    	return point;
    }
    
    public void setPoint(double point) {
    	this.point = point;
    }

	@Override
	public String toString() {
		return "Player [이름=" + name + ", 등번호=" + backNumber + ", 포지션=" + position + ", 골=" + stat
				+ ", 골 인센티브=" + point + " 억]";
	}

    
}
