package simpleslickgame;

public class Cat {

	public String name;
	private int health;
	private boolean isSick;
	private boolean isLeader;
	
	
	public Cat(String name){
		this.name = name;
		health = 100;
		isSick = false;
		isLeader = false;
	}
	
	public void setName(String  name){
		this.name = name;	
	}
	
	public void setLeader(){
		isLeader = true;
	}
	
	public void gainHealth(int value){
		health = health + value;
	}
	
	public void loseHealth(int value){
		health = health - value;
	}
	
	public String getName(){
		return name;
	}

	public boolean getIsSick(){
		return isSick;
	}
	
	public  boolean getIsLeader(){
		return isLeader;
	}
	
}
