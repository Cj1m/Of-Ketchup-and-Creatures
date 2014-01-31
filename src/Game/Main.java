package Game;

import java.util.ArrayList;
import java.util.Scanner;

//Written by Christopher McKay
//Written 26/01/2014 (Americans, goodluck with figuring that out)
//Story by Chris, but that doesn't matter
//Note from Chris: Chris' story tots doesnae mattter bruv, I follow ye.

public class Main {
	String usr;
	String dwarf ="Syrupsteam";
	String orc="Jeffrey";
	String gnome="Vietgnome";
	String wizard="Happy Potter";
	String bill="Traveller Bill";
	
	String option;
	String lastwords = "'I didn't mean no harm...'";
	
	int handOff;
	
	int health = 10;
	
	String[] foods = {"Potatos", "Carrots", "Beans", "Marmite", "Ketchup", "Beef","Pork", "Kentucky Fried Curry", "Dirt"};
	ArrayList<String> inv = new ArrayList<String>();
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Main main = new Main();
	}
	public Main(){
		game();
	}
	
	private void game() {
		welcome();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		part1();
	}
	
	private void welcome(){
		Say("Welcome to 'Of Ketchup and Creatures', Enjoy your playthrough...");
		Say("----------------------------------------------------------------");
		Say("What's your name, adventurer?");
		
		@SuppressWarnings("resource")
		Scanner name = new Scanner(System.in); 
		usr = name.nextLine();
		
		Say("Greetings, " + usr);
		Say("Your party:");
		Say("The Dwarf, " + dwarf);
		Say("The Orc, " + orc);
		Say("The Gnome, " + gnome);
		Say("The Wizard, " + wizard);
		Say("And of course, there's you, the human, " + usr);
	}
	
	//Part 1
	//Part 1
	private void part1(){
		Say("------------------------------------");
		Say("CHAPTER UNO: GOODBYE MY DEAR KETCHUP");
		Say("------------------------------------");
		Say("");
		Say("You watch nervously as you travel further and further away from your home, the Town Of Tomato. The fearsome wind sways the wagon from side to side. You check your supplies, you forgot the sachet of Ketchup.");
		Say("What do you do?");
		Say("");
		Say("A) Smack " + gnome + " in the face.");
		Say("");
		Say("B) Turn back for the ketchup.");
		Say("");
		Say("C) Accept that you will not have ketchup with your beans tonight.");
		Say("");
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		
		if(option.equals("a")){
			part1Death();
		}else if(option.equals("b")){
			Say("You turn back, but by the time you arrive at the Town, you have forgotten why you are there. #LazyDeveloper");
			part1();
		}else if(option.equals("c")){
			Say("You accept that you will not be having ketchup with your beans tonight and carry on with your adventure.");
			part2();
		}else{
			error(1);
		}
		
	}
	
	private void part1Death(){
		Say(gnome +" shouts 'DIOS ES GRANDE!', ignites his lighter, and sets the wagon on fire. Your last words were " + lastwords);
		game();
	}
	
	//Part 2
	//Part 2
	private void part2(){
		Say("---------------------");
		Say("CHAPTER DOS: HAND OFF");
		Say("---------------------");
		Say("");
		
		Say("You have been travelling for 2 days and 5 nights. So far, your journey has been uneventful.");
		Say("You were not the only forgetful one, half of your party forgot the food. " + dwarf + " is hungry and so are you, who do you eat?");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		
		Say("CHOP");
		Say("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Say("CHOP");
		Say("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Say("CHOMP!");
		
		if(option.equals(gnome.toLowerCase())){
			Say(gnome + " screams with rage and runs off into the distance with a trail of fire behind him. " + gnome + " has left the party, nice one...");
			handOff = 1;
		}else if(option.equals(orc.toLowerCase())){
			health--;
			Say(orc + " looks at his hand, then back at you - his face full of rage. He takes a swing at your head. Your health is now: " + health);
			handOff = 2;
		}else if(option.equals(wizard.toLowerCase())){
			Say(wizard + " waves his wand over his wrist. Instead of growing a hand, he grows a flower. " + wizard + " is angry.");
			handOff = 3;
		}else{
			error(2);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Say("");
		Say("A bright light catches your eye. You look into the distance and see a brightly lit market - a food market.");
		
		if(handOff == 2){
			health--;
			Say(orc + " looks at his hand again, then back at you - his face filling with more rage.");
		    Say(" He wraps his hands around his club and takes yet another swing at your head. Your health is now: " + health);
		}
		part3();   
	}
	
	//Part 3
	//Part 3
	private void part3(){
		Say("----------------------------");
		Say("CHAPTER TRES: TRAVELLER BILL");
		Say("----------------------------");
		Say("");
		
		Say("On your way down to the market, you find yourself walking in circles. Thankfully you meet a friendly traveller who's able to help you. He walks up to and asks if you need help. What do you do?");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		
		if(option.equals("smack him in the face") || option.equals("punch him in the face") || option.equals("sing a justin beiber song") || option.equals("twerk") || option.equals("dios es grande")){
			part3Death();	
		}else if(option.equals("help me") || option.equals("come here") || option.equals("yes") || option.equals("talk to me") || option.equals("talk to me or i'll bash your skull in") || option.equals("ask for help")){
			Say(bill + " Smiles and asks you where you're headed. " + dwarf + " replies, 'We are venturing to the Foggy Mountains (or Hills), could you give us directions?'");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Say(bill + " nods, 'Yes, I can give you directions - but only if I am able to be apart of this adventure.'");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Say("Talk...");
			Say("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Say("Argue..");
			Say("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say("Conclude.");
			Say("");
			
			Say("After a very 'lively' conversation with your party (at one point " + orc + " threatend to bash his own skull in!), you conclude that " + bill + " is allowed to join the party.");
			Say("");
			Say("'Now' says " + bill + ", 'time to get some supplies..'");
			Say("");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Say("");
			Say("2 Hours Later..");
			Say("");
			
			part3AndAHalf();
		}else{
			error(3);
		}
	}
	
	
	private void part3Death(){
		Say("");
		Say("The man is very insulted and shoots you in the head. BOOM-- Headshot.");
		Say("---------------------------------------------------------------------");
		health -= 10;;
		Say("YOU'RE HEALTH IS NOW " + health + ". YOU ARE DEAD!");
		Say("");
		health = 10;
		game();
	}
	
	//Part 3.5
	//Part 3.5
	private void part3AndAHalf() {
		Say("You arrive at the market exhausted after your long hike. You're more hungry than ever and see a food stall feet away.");
		Say("When you arrive a upbeat man welcomes you to his stall. He says:");
		Say("'Welcome fellow travellers, my name is Frank, what can I do you for? We have a large range of foods, can I interest you in any?");
		
		
		
		Say("");
		
		Say("I've got: ");
		int rn = (int) Math.round(Math.random() * 8);
		Say(foods[rn]);
		int rn2 = (int) Math.round(Math.random() * 8);
		Say(foods[rn2]);
		int rn3 = (int) Math.round(Math.random() * 8);
		Say(foods[rn3]);
		Say("");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		if(option.equals(foods[rn].toLowerCase())){
			Say("Frank says 'Thank you, come again' in a strange and foriegn accent.");
			inv.add(foods[rn]);
		}else if(option.equals(foods[rn2].toLowerCase())){
			Say("Frank says 'Thank you, sir!'");
			inv.add(foods[rn2]);
		}else if(option.equals(foods[rn3].toLowerCase())){
			Say("Frank says 'Excellent choice!'");
			inv.add(foods[rn3]);
		}
		
		Say("You thank Frank for his generosity, and you continue on your quest...");
		Say("NEW ITEM AQUIRED: " + inv.get(0));
		
		part4();
	}
	
	//Part 4
	//Part 4
	private void part4(){
		/* Part 4:
		*   Far over the Foggy Mountain or Hill
		*   To dungeons deep with our traveller Bill
		*   We could away ere break of day
		*   To find our long-forgotten ASPARAGUS!
		*/
	}
	
	private void error(int i){
		Say("Are you mad?");
		if(i == 1)part1();
		if(i == 2)part2();
		if(i == 3)part3();
		if(i == 304)part3AndAHalf();
		if(i == 4)part4();Say("Sorry, that desicion is not valid");	//ATM 	
	}
	
	public void Say(String x){
		Say(x);
	}
}
