package Game;

import java.util.Scanner;

//Written by Christopher McKay
//Written 26/01/2014 (Americans, goodluck with figuring that out)
//Story by Chris, but that doesn't matter

public class Main {
	String usr;
	String dwarf ="Syrupsteam";
	String orc="Jeffrey";
	String gnome="Vietgnome";
	String wizard="Happy Potter";
	
	String option;
	String lastwords = "'I didn't mean no harm...'";
	
	int handOff;
	int health = 10;
	
	public static void main(String[] args) {
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
		System.out.println("Welcome to the Of Ketchup and Creatures, Enjoy your stay...");
		System.out.println("-----------------------------------------------------");
		System.out.println("Name?");
		Scanner name = new Scanner(System.in); 
		usr = name.nextLine();
		System.out.println("Hello, " + usr);
		System.out.println("Your party:");
		System.out.println("The Dwarf, " + dwarf);
		System.out.println("The Orc, " + orc);
		System.out.println("The Gnome, " + gnome);
		System.out.println("The Wizard, " + wizard);
		System.out.println("And ofcourse, there's you, the human, " + usr);
	}
	
	private void part1(){
		System.out.println("------------------------------------");
		System.out.println("CHAPTER UNO: GOODBYE MY DEAR KETCHUP");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("You watch nervously as you travel further and further away from your home, the Town Of Tomato. The fearsome wind sways the wagon from side to side. You check your supplies, you forgot the sachet of Ketchup.");
		System.out.println("What do you do?");
		System.out.println("A) Smack " + gnome + " in the face.");
		System.out.println("B) Turn back for the ketchup.");
		System.out.println("C) Accept that you will not have ketchup with your beans tonight.");
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		if(option.equals("A")){
			part1Death();
		}else if(option.equals("B")){
			System.out.println("You turn back, but by the time you arrive at the Town, you have forgotten why you are there. #LazyDeveloper");
			part1();
		}else if(option.equals("C")){
			System.out.println("You accept that you will not be having ketchup with your beans tonight, and carry on with your adventure.");
			part2();
		}else{
			error(1);
		}
		
	}
	
	private void part1Death(){
		System.out.println(gnome +" shouts 'DIOS ES GRANDE!', ignites his lighter, and sets the wagon on fire. Your last words were " + lastwords);
	}
	
	private void part2(){
		System.out.println("---------------------");
		System.out.println("CHAPTER DOS: HAND OFF");
		System.out.println("---------------------");
		System.out.println("");
		
		System.out.println("You have been travelling for 2 days and 5 nights. So far, your journey has been uneventful. You were not the only forgotful one, half of your party forgot the food. " + dwarf + " is hungry and so are you, who do you eat?");
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine();
		
		System.out.println("CHOP");
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CHOP");
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CHOMP!");
		
		if(option.equals(gnome)){
			System.out.println(gnome + " screams with rage and runs off into the distance with a trail of fire behind him. " + gnome + " has left the party, nice one..");
			handOff = 1;
		}else if(option.equals(orc)){
			health--;
			System.out.println(orc + " looks at his hand, then back at you - his face full of rage. He takes a swing at your head. Your health is now: " + health);
			handOff = 2;
		}else if(option.equals(wizard)){
			System.out.println(wizard + " waves his wand over his wrist. Instead of growing a hand, it grows a flower. " + wizard + " is angry.");
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
		
		System.out.println("");
		System.out.println("A bright light catches your eye. You look into the distance and see a brightly lit market - a food market.");
		
		if(handOff == 2){
			health--;
			System.out.println(orc + " looks at his hand again, then back at you - his face still full of rage. He takes another swing at your head. Your health is now: " + health);
		}
	}
	
	private void error(int i){
		System.out.println("Are you mad? ");
		if(i == 1);part1();
		if(i == 2);part2();
	}
}
