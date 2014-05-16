package Game;

public class Options {
	String usr;
	String dwarf ="syrupsteam";
	String orc="jeffrey";
	String gnome="vietgnome";
	String wizard="happy potter";
	String bill="traveller bill";
	
	String lastwords = "'I didn't mean no harm...'";
	
	Main game;
	
	public Options(String usr, String option, int chapter, Main main){
		game = main;
		this.usr = usr;
		if(chapter == 1)o1(option);
		if(chapter == 2)o2(option);
		if(chapter == 3)o3(option);
		if(chapter == 305)o3h(option);
		if(chapter == 310)o3q(option);
		if(chapter == 4)o4(option);
	}
	
	private void o1(String option){
		if(option.equals("a")){
			part1Death();
		}else if(option.equals("b")){
			Say("You turn back, but by the time you arrive at the Town, you have forgotten why you are there. #LazyDeveloper");
			game.part1();
		}else if(option.equals("c")){
			Say("You accept that you will not be having ketchup with your beans tonight and carry on with your adventure.");
			game.part2();
		}else{
			error(1);
		}
	}
	private void o2(String option){
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
		if(option.equals(gnome)){
			Say(gnome + " screams with rage and runs off into the distance with a trail of fire behind him. " + gnome + " has left the party, nice one...");
			game.handOff = 1;
		}else if(option.equals(orc)){
			game.health--;
			Say(orc + " looks at his hand, then back at you - his face full of rage. He takes a swing at your head. Your health is now: " + game.health);
			game.handOff = 2; 
		}else if(option.equals(wizard)){
			Say(wizard + " waves his wand over his wrist. Instead of growing a hand, he grows a flower. " + wizard + " is angry.");
			game.handOff = 3;
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
		
		if(game.handOff == 2){
			game.health--;
			Say(orc + " looks at his hand again, then back at you - his face filling with more rage.");
		    Say(" He wraps his hands around his club and takes yet another swing at your head. Your health is now: " + game.health);
		}
		game.part3();
	}	
	private void o3(String option){
		if(option.equals("smack him in the face") || option.equals("punch him in the face") || option.equals("sing a justin beiber song") || option.equals("twerk") || option.equals("dios es grande")){
			part3Death();	
		}else if(option.equals("ask for help") || option.equals("approach him") || option.equals("ask for directions") || option.equals("talk to me") || option.equals("talk to me or i'll bash your skull in")){
			Say(bill + " Smiles and asks you where you're headed. " + dwarf + " replies, 'We are venturing to the Foggy Mountains (or Hills), could you give us directions?'");
			try {
				Thread.sleep(5000);
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
			
			game.party.add(game.bill);
			
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
			
			game.part3AndAHalf();
		}else{
			error(3);
		}
	}
	private void o3h(String option){
		if(option.equals(game.foods[game.rn].toLowerCase())){
			Say("Frank says 'Thank you, come again' in a strange and foriegn accent.");
			game.inv.add(game.foods[game.rn]);
		}else if(option.equals(game.foods[game.rn2].toLowerCase())){
			Say("Frank says 'Thank you, sir!'");
			game.inv.add(game.foods[game.rn2]);
		}else if(option.equals(game.foods[game.rn3].toLowerCase())){
			Say("Frank says 'Excellent choice!'");
			game.inv.add(game.foods[game.rn3]);
		}
		
		Say("You thank Frank for his generosity, and you continue on your quest...");
		Say("NEW ITEM AQUIRED: " + game.inv.get(game.inv.size() - 1));
		game.part4();
	}
	
	private void o3q(String option) {
		if(option.equals("yes") || option.equals("y")){
			int healthIncrement = (int) Math.ceil(Math.random() * 3);
			game.health += healthIncrement;
			Say("You have eaten your " + game.inv.get(game.inv.size() - 1) + ", which has increased your health by " + healthIncrement + " health is now " + game.health);
		}else if(option.equals("no") || option.equals("n")){
			Say("You save your " + game.inv.get(game.inv.size() - 1) + " for later");
		}else{
			error(310);
		}
		
	}
	
	private void o4(String option){
		if(option.equals("call for help") || option.equals("shout dramatically for help, with an epic twist to your voice")){
			Say(game.bill + " comes running to aid " + game.dwarf + ". 'Here have a snickers' says " + game.bill + " 'You become a right diva when you're hungry'.");
			Say(game.dwarf + " eats the Snickers. He is now calm!");
			Say("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say(game.dwarf+"'s phone beeps. It is a message from " + game.wizard + ". It reads:");
			Say("");
			Say("Far over the Foggy Mountain or Hill");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Say("To dungeons deep with our traveller Bill");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    Say("We could away ere break of day");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    Say("To find our long-forgotten ASPARAGUS");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    Say(game.wizard + " appears out of no where. 'Follow me' he says, 'We are going to the Foggy Mountain or Hill!'");
		}else if(option.equals("approach " + dwarf) || option.equals("say it is only a game")){
			part4Death();
		}else{
			error(4);
		}
	}
	
	
	//Deaths and Error
	private void part1Death(){
		Say(gnome +" shouts 'DIOS ES GRANDE!', ignites his lighter, and sets the wagon on fire. Your last words were " + lastwords);
		game.game();
	}
	
	private void part3Death(){
		Say("");
		Say("The man is very insulted and shoots you in the head. BOOM-- Headshot.");
		Say("---------------------------------------------------------------------");
		game.health -= 10;;
		Say("YOU'RE HEALTH IS NOW " + game.health + ". YOU ARE DEAD!");
		Say("");
		game.health = 10;
		game.game();
	}
	
	private void part4Death(){
		Say(game.dwarf + " grabs you by the head, and smashes it until there is nothing left apart from blood and 2 eyeballs, which he eats.");
		game.health = 10;
		game.game();
	}
	
	private void error(int i){
		Say("Are you mad?");
		if(i == 1)game.part1();
		if(i == 2)game.part2();
		if(i == 3)game.part3();
		if(i == 305)game.part3AndAHalf();
		if(i == 310)game.part4();
		if(i == 4)game.part4();	//ATM 	
	}
	
	public void Say(String x){
		
		char[] chars = x.toCharArray();
		
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i]);
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		//System.out.println(x);
	}
}
