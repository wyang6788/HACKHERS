package simpleslickgame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class SimpleSlickGame extends BasicGame
{
	
	private Cat[] cats;
	private Player  player;
	private Scene firstScene;
	private Scene currentScene;
	private World world;
	
	public SimpleSlickGame(String gamename)
	{
		super(gamename);
	}
	
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		cats = new Cat[5];
		player = new Player("New Player");
		world = new World();
		Scene firstScene = new Scene("Title Screen", 0,0,0,1);		
		
		Scene credits = new Scene("Credits",0,0,0,1);
		Scene catifornia =  new Scene("Catifornia",10,0,0,1);
		catifornia.addScene(credits);
		Scene ferryTheRiver = new Scene("Ferry The Catarata",9,5,3,1);
		Scene fordTheRiver = new Scene("Ford The Catarata",9,5,8,1);
		ferryTheRiver.addScene(catifornia);
		fordTheRiver.addScene(catifornia);
		Scene travelAlone = new Scene("Travel Alone",8,2,7,2);
		Scene travelInPack = new Scene("Travel In A Pack",8,5,3,2);
		travelAlone.addScene(ferryTheRiver);
		travelAlone.addScene(fordTheRiver);
		travelInPack.addScene(ferryTheRiver);
		travelInPack.addScene(fordTheRiver);
		Scene theKittenKluster = new Scene ("The Kitten Kluster",7,15,4,2);
		theKittenKluster.addScene(travelInPack);
		theKittenKluster.addScene(travelAlone);
		Scene catnansPath = new Scene("Catnan's Secret Path",6,7,7,1);
		Scene catPath = new Scene("The Cat Path",6,10,3,1);
		Scene catopiasPath = new Scene("Catopia's Secret Path",6,7,7,1);
		catnansPath.addScene(theKittenKluster);
		catPath.addScene(theKittenKluster);
		catopiasPath.addScene(theKittenKluster);
		Scene catnan = new Scene("Catnan",5,30,2,2);
		Scene catopia = new Scene("Catopia",5,30,2,2);
		catnan.addScene(catnansPath);
		catnan.addScene(catPath);
		catopia.addScene(catopiasPath);
		catopia.addScene(catPath);
		Scene peak = new Scene("Pugs Peak",4,5,10,2);
		Scene valley = new Scene("Vulpus Valley",4,7,5,2);
		Scene rocky = new Scene("The Dogged Path",4,7,4,2);
		Scene smooth = new Scene("The Puppy Path",4,10,2,2);
		peak.addScene(catnan);
		peak.addScene(catopia);
		valley.addScene(catnan);
		valley.addScene(catopia);
		rocky.addScene(catnan);
		rocky.addScene(catopia);
		smooth.addScene(catnan);
		smooth.addScene(catopia);
		Scene mountain = new Scene("Canine Cliffs",3,15,5,2);
		Scene plains = new Scene("Puppy Plains",3,20,2,2);
		mountain.addScene(peak);
		mountain.addScene(valley);
		plains.addScene(rocky);
		plains.addScene(smooth);
		Scene fork = new Scene("The Great Fork",2,5,1,2);
		fork.addScene(mountain);
		fork.addScene(plains);
		Scene dogsborough = new Scene("Dogsborough",1,0,0,1);
		dogsborough.addScene(fork);
		Scene catnames = new Scene("Cat Names",0,0,0,1);
		catnames.addScene(dogsborough);
		Scene difficultymenu = new Scene("Difficulty Menu",0,0,0,1);
		difficultymenu.addScene(catnames);
		Scene playername = new Scene("Player Name",0,0,0,1);
		playername.addScene(difficultymenu);
		Scene prelude = new Scene("Prelude",0,0,0,1);
		prelude.addScene(playername);
		firstScene.addScene(prelude);
	
		prelude.setDescription("The hitherto of all existing cat society is the history of animal struggles. Dog and cat, bird and mouse, lion and rabbit, in a word, predator and prey stood in constant opposition to another, carried on uninterrupted, now hidden, now open fight, a fight that each time ended, either in a revolutionary reconstitution of animal society at large, or in the ruin of the dominant species. In the earlier epochs of survival history, we find almost everywhere a complicated arrangement of society into various orders, a manifold gradation of evolutionary rank. In ancient Catagonia, we have dogs, foxes, cats and mice; in the Feline Ages, cats, mice, hamsters, shrews; in almost all of these classes, again, subordinate gradations. The modern canine society that has sprouted from the ruins of feline society has not done away with species antagonisms. It has but established new breeds, new conditions of oppression, new forms of struggle in place of the old ones. Our epoch, the epoch of the canis possesses, however, this distinct feature: it has simplified animal antagonisms. Society as a whole is more and more splitting up into two great hostile camps, into two great species facing each other – the Dogs and the Cats. [Cit. \"Catmunist Manifesto\"]\n\nThus our Feline Friends must find a new home out west. Thus begins the Cat Tales.");
		catnames.setDescription("Hello and welcome fellow cat traveller!  You are just in time to join us on our journey west in search of the land of Catifornia. First order of business, please name your kittens and choose a leader for your wagon.");
		dogsborough.setDescription("You are at Dogsborough! This is the market.  Here, you will gather supplies for your journey.  Please use your Meyen to purchase the supplies you think are necessary. There will be a few points along the way where you will have the opportunity to purchase more supplies as well as various possible paths that will offer the chance to gain supplies.");
		
		
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		
		
	}

	
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		g.drawString("Hi bitches!", 30, 30);
		
	}

	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Cat Tales"));
			appgc.setDisplayMode(1280, 720, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}