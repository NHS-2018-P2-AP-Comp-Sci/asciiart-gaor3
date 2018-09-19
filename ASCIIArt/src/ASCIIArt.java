/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {
		//This is a Panda!!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello, I'm a Panda and I love eating bamboo!!!\n");
		ears ();
		head ();
		body ();
		legs ();
	}
	public static void ears () {
		System.out.println("      ___         ___   __");
		System.out.println("     /|||\\       /|||\\ |__|/|");
		System.out.println("     \\UUU/_______\\UUU/ |  |/ ");

	}
	public static void head () {
		System.out.println("        /         \\  |\\|__|");
		System.out.println("       /           \\  \\|  | ");
		System.out.println("       | (^) . (^) |   |__|/| ");
		System.out.println("        \\_________/    |  |/");
	}
	public static void body () {
		System.out.println("     ___/|||||||||\\___ |__|");
		System.out.println("    (||/           \\||)|  |");
		System.out.println("      /             \\  |__|/| ");
		System.out.println("      |      x      ||\\|  |/");
		System.out.println("       \\___________/  \\|__|");

	}
	public static void legs () {
		System.out.println("         /|||^|||\\     |  |");
		System.out.println("      __/|||/ \\|||\\__  |__|");
		System.out.println("     ||||||/   \\|||||| |__|  ");
		
	}
}