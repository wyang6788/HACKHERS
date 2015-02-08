package simpleslickgame;

public class Player {

	private String name;
	private int money;
	private int food;
	private int medicine;
	private int claws;
	private int mice;
	private int distanceTraveled;
	
	public Player(String name){
		this.name = name;
		money = 0;
		food = 0;
		medicine = 0;
		claws = 0;
		mice = 0;
		distanceTraveled = 0;
	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMoney(int value){
		money = value;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setFood(int value){
		food = value;
	}
	
	public int getFood(){
		return food;
	}
	
	public void setMedicine(int value){
		medicine = value;
	}
	
	public int getMedicine(){
		return medicine;
	}
	
	public void setClaws(int value){
		claws = value;
	}
	
	public int getClaws(){
		return claws;
	}
	
	public void setMice(int value){
		mice = value;
	}
	
	public int getMice(){
		return mice;
	}
	
	public void setDistanceTraveled(int value){
		distanceTraveled =  value;
	}
	
	public int getDistanceTraveled(int value){
		return distanceTraveled;
	}
	
}
