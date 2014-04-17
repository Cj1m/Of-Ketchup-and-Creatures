package Game;

import java.util.ArrayList;
import java.util.Scanner;

//Written by Christopher McKay
//Written 26/01/2014 (Americans, goodluck with figuring that out)
//Story by Chris, but that doesn't matter
//Note from Chris: Chris' story tots doesnae mattter bruv, I follow ye.

public class Main {
	String version="v 21";
	
	String usr;
	String dwarf ="Syrupsteam";
	String orc="Jeffrey";
	String gnome="Vietgnome";
	String wizard="Happy Potter";
	String bill="Traveller Bill";
	
	
	int rn;
	int rn2;
	int rn3;
	
	int handOff;
	int health = 10;
	
	String[] foods = {"Potatos", "Carrots", "Beans", "Marmite", "Ketchup", "Beef", "Pork", "Kentucky Fried Curry", "Lutefisk", "Salmon", "Generic Hazelnut Chocolate Spread", "Bag O' Weasels", "Jam Donut", "Glazed Donut", "Ketchup Donut"};
	ArrayList<String> inv = new ArrayList<String>();
	ArrayList<String> party;
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Main main = new Main();
	}
	public Main(){
		game();
	}
	
	public void game() {
		welcome();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		part1();
	}
	
	public void welcome(){
		party = new ArrayList<String>();
		
		Say("Of-Ketchup-and-Creatures " + version);
		Say("");
		Say("  __        __     __");
		Say(" /  \\  | /  /  \\   /");
		Say("|    | |\\  /____\\ |");
		Say(" \\__/  | | |    |  \\__");
		Say("");
		Say("Welcome to 'Of Ketchup and Creatures', Enjoy your playthrough...");
		Say("----------------------------------------------------------------");
		Say("What's your name, adventurer?");
		
		@SuppressWarnings("resource")
		Scanner name = new Scanner(System.in); 
		usr = name.nextLine();
		hacertrampa(usr);
		
		Say("Greetings, " + usr);
		Say("Your party:");
		Say("The Dwarf, " + dwarf);
		Say("The Orc, " + orc);
		Say("The Gnome, " + gnome);
		Say("The Wizard, " + wizard);
		Say("And of course, there's you, the human, " + usr);
		
		party.add(dwarf);
		party.add(orc);
		party.add(gnome);
		party.add(wizard);
	}
	
	//Part 1
	//Part 1
	public void part1(){
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
		
		@SuppressWarnings("unused")
		Options chapter1Options = new Options(usr, option(), 1, this);
	}
	
	
	//Part 2
	//Part 2
	public void part2(){
		Say("---------------------");
		Say("CHAPTER DOS: HAND OFF");
		Say("---------------------");
		Say("");
		
		Say("You have been travelling for 2 days and 5 nights. So far, your journey has been uneventful.");
		Say("You were not the only forgetful one, half of your party forgot the food. " + dwarf + " is hungry and so are you, who do you eat?");
		
		@SuppressWarnings("unused")
		Options chapter2Options = new Options(usr, option(), 2, this);  
	}
	
	//Part 3
	//Part 3
	public void part3(){
		Say("----------------------------");
		Say("CHAPTER TRES: TRAVELLER BILL");
		Say("----------------------------");
		Say("");
		
		Say("On your way down to the market, you find yourself walking in circles. Thankfully you meet a friendly traveller who's able to help you. He walks up to and asks if you need help. What do you do?");

		@SuppressWarnings("unused")
		Options chapter3Options = new Options(usr, option(), 3, this);
	}
	
	
	//Part 3.5
	//Part 3.5
	public void part3AndAHalf() {
		Say("You arrive at the market, exhausted after your long hike. You're more hungry than ever and see a food stall feet away.");
		Say("When you arrive an upbeat man welcomes you to his stall. He says:");
		Say("'Welcome fellow travellers, my name is Frank, what can I do you for? We have a large range of foods, can I interest you in any?");
		
		int foodLength = foods.length - 1;
		
		Say("I've got: ");

		rn = (int) Math.round(Math.random() * foodLength);
		Say(foods[rn]);
		rn2 = (int) Math.round(Math.random() * foodLength);
		Say(foods[rn2]);
		rn3 = (int) Math.round(Math.random() * foodLength);

		Say(foods[rn3]);
		Say("");
		
		Options chapter305Options = new Options(usr, option(), 305, this);
	}
	
	//Part 4
	//Part 4
	public void part4(){
		Say("-------------------------------------------");
		Say("CHAPTER CUATRO: THE FOGGY MOUTAIN (OR HILL)");
		Say("-------------------------------------------");
		Say("");
		Say("Now you, and the remains of your party, " + party + " are on the road, travelling.");
		

		Say("");
		Say("Before continuing your adventure, do you want to eat your " + inv.get(0) + "?");
		
		Options chapter310Options = new Options(usr, option(), 310, this);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Say("");
		Say("After a long day, you and your party decide to make camp for the night.");
		Say("You lay down on the grass, using your rucksack as a pillow");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Say("The next morning you are awoken by the sound of " + dwarf + " screaming at his phone, while playing Clash of Clans.");
		Say("You also notice that " + wizard + " is not with you, but there are other problems at hand, " + dwarf + " is raging!");
		Say("You need to help " + dwarf + "... But how?");
		
		Options chapter4Options = new Options(usr, option(), 4, this);
	}
	
	private String option(){	
		String o;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		o = sc.nextLine();
		o = o.toLowerCase();
		return(o);
	}
	
	//Easier to type Say(); than System.out.println();
	public void Say(String x){
		System.out.println(x);
	}
	
	private void hacertrampa(String usr){
		String lusr = usr.toLowerCase();
		switch(lusr){
		case "stark":
			Say("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say("Incoming signal from Ned!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say("Message received");
			Say("");
			
			Say("Winter is coming, here, have some beans!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say("NEW ITEM AQUIRED: " + foods[2]);
			Say("Ned shoves the food into your mouth.");
			int healthIncrement = (int) Math.floor(Math.random() * 10);
			health += healthIncrement;
			Say("Health is now: " +health);
			Say("");
			Say("Returning to game...");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Say("");
			Say("");
		}
	}
}
