package simpleslickgame;

import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Scene {
	
	private String stageName;
	private int stageNum;
	private int distance;
	private int dangerLevel;
	private int neighbors;
	private ArrayList<Scene> scenes;
	private String description;
	private Image background;
	
	
	
	public Scene(String stageName, int stageNum, int distance, int dangerLevel, int neighbors){
		this.stageName = stageName;
		this.stageNum = stageNum;
		this.distance = distance;
		this.dangerLevel = dangerLevel;
		this.neighbors = neighbors;
		scenes = new ArrayList<Scene>();
		description = null;
	}
	
	public void  setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setBackground(String filepath){
		try {
			background = new Image(filepath);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setBackground(Image background){
		
		this.background = background;
	
	}
	
	public Image getBackground(){
		return background;
	}
	
	public String getStageName(){
		return stageName;
	}
	
	public int getStageNum(){
		return stageNum;
	}
	
	public int getDistance(){
		return distance;
	}
	
	public int getDangerLevel(){
		return  dangerLevel;
	}
	
	public int getNeighbors(){
		return neighbors;
	}
	
	public void addScene(Scene s){
		scenes.add(s);
	}
	
	public Scene getNextScene(int n){
		return scenes.get(n);
	}
		
}
