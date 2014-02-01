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
	
	int rn;
	int rn2;
	int rn3;
	
	int handOff;
	int health = 10;
	
	String[] foods = {"Potatos", "Carrots", "Beans", "Marmite", "Ketchup", "Beef","Pork", "Kentucky Fried Curry"};
	ArrayList<String> inv = new ArrayList<String>();
	
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
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		
		@SuppressWarnings("unused")
		Options chapter1Options = new Options(usr, option, 1, this);
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
		
		
		@SuppressWarnings("unused")
		Options chapter2Options = new Options(usr, option, 2, this);  
	}
	
	//Part 3
	//Part 3
	public void part3(){
		Say("----------------------------");
		Say("CHAPTER TRES: TRAVELLER BILL");
		Say("----------------------------");
		Say("");
		
		Say("On your way down to the market, you find yourself walking in circles. Thankfully you meet a friendly traveller who's able to help you. He walks up to and asks if you need help. What do you do?");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		
		@SuppressWarnings("unused")
		Options chapter3Options = new Options(usr, option, 3, this);
	}
	
	
	//Part 3.5
	//Part 3.5
	public void part3AndAHalf() {
		Say("You arrive at the market exhausted after your long hike. You're more hungry than ever and see a food stall feet away.");
		Say("When you arrive a upbeat man welcomes you to his stall. He says:");
		Say("'Welcome fellow travellers, my name is Frank, what can I do you for? We have a large range of foods, can I interest you in any?");
		
		
		
		Say("");
		
		Say("I've got: ");
		rn = (int) Math.round(Math.random() * 8);
		Say(foods[rn]);
		rn2 = (int) Math.round(Math.random() * 8);
		Say(foods[rn2]);
		rn3 = (int) Math.round(Math.random() * 8);
		Say(foods[rn3]);
		Say("");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		option = option.toLowerCase();
		@SuppressWarnings("unused")
		Options chapter305Options = new Options(usr, option, 305, this);
	}
	
	//Part 4
	//Part 4
	public void part4(){
		/* Part 4:
		*   Far over the Foggy Mountain or Hill
		*   To dungeons deep with our traveller Bill
		*   We could away ere break of day
		*   To find our long-forgotten ASPARAGUS!
		*/
	}
	
	public void Say(String x){
		System.out.println(x);
	}
}
