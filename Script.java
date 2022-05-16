import java.util.*;
import java.util.concurrent.TimeUnit;
public class Script {

	private String name;
	private Scanner s;
	
	public Script(String name) throws InterruptedException {
		this.name = name;
		s = new Scanner(System.in);
		playGame();
		s.close();
	}
	
	public void playGame() throws InterruptedException {
		System.out.println(wakeUp());
		TimeUnit.SECONDS.sleep(3);
		System.out.println(scenario1());
		int choice = s.nextInt();
		while (true) {
			if (choice == 1) {
				System.out.println(s1Out1());
				endGame();
				break;
			} else if (choice == 2) {
				System.out.println(s1Out2());
				endGame();
				break;
			} else if (choice == 3) {
				System.out.println(s1Out3());
				System.out.println(scenario2());
				break;
			} else if (choice == 4) {
				System.out.println(s1Out4());
				endGame();
				break;
			}
		}
		while (true) {
			int choice2 = s.nextInt();
			if (choice2 == 1) {
				System.out.println(s2Out1());
				break;
			} else if (choice2 == 2) {
				System.out.println(s2Out2());
				break;
			} else if (choice2 == 3) {
				System.out.println(s2Out3());
				break;
			} else if (choice2 == 4) {
				System.out.println(s2Out4());
				break;
			}
		}
		endGame();
	}
	
	public String wakeUp() {
		return "I think my name is " + name + "\nYou open your eyes to a mysterious place, you hear rubbling behind you. \nThere is a boar running towards you! You must run!";
	}
	
	public String scenario1() {
		return "\nYou try to run from the boar but it pursues \nYou come accross four paths which path do you chose? \n1 2 3 4";
	}
	
	public String s1Out1() {
		return "You chose Path 1, You run from the board but the path leads to a cliff \nThe boar catches you and pushes you off a cliff where you die";
		
	}
	
	public String s1Out2() {
		return "You chose Path 2, it leads you to a pot of gold guarded by a Leprechaun. \nHe steals your wallet to add to his fortune \nThen the boar catches you and pushes you off a nearby cliff where you die";
	}

	public String s1Out3() {
		return "You run from the boar all the way to a hedge maze. your only option is to enter and so you do";
	}

	public String s1Out4() {
		return "You come accross a troll gaurding a bride that says you must solve a riddle \nYou get the riddle correct however while walking accross the bridge \nIt breaks and you fall into a canyon";
	}
	
	public String scenario2() {
		return "You dont have long before the boar reaches you... you quickly think of 4 different ways to get through the maze"
				+ "\nWay 1 is by following the left wall all the way"
				+ "\nWay 2 is by following the right wall all the way"
				+ "\nWay 3 is by Climbing the Hedges to the top of the maze"
				+ "\nWay 4 is by giving up and letting the boar catch you"
				+ "\nEnter 1 2 3 or 4 for what you decide to do";
	}
	
	public String s2Out1() {
		return "The left wall takes you all the way to the end of the maze however there is a cliff and the boar catches up to you and knocks you off";
	}
	
	public String s2Out2() {
		return " The right wall was the correct choice and you find the exit. You survive the boars onslaught, congratulations well done";
	}
	
	public String s2Out3() {
		return " Wrong choice: a Pteranodon comes out of nowhere, picks you up and flies you to a cliff, then drops you";
	}
	
	public String s2Out4() {
		return "The boar catches up to you and knocks you to the ground. Then drags you all the way to a cliff, you get the point";
	}
	
	public void endGame() throws InterruptedException {
		System.out.println("\nWould you like to play again? Enter 1 to play again or 2 to quit");
		while (true) {
			if (s.nextInt() == 1) {
				playGame();
			} else if (s.nextInt() == 2) {
				break;
			}
		}
	}
}
