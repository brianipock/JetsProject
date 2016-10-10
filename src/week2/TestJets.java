package week2;

import java.util.*;

public class TestJets {
	static Jet jets[];

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);		
		jets = new Jet[5];
		Pilot p1 = new Pilot("Sully Sullenberger", 65, 40);
		Pilot p2 = new Pilot("Buzz Aldren", 45, 20);
		Pilot p3 = new Pilot("Herman Goring", 43, 12);
		Pilot p4 = new Pilot("Baron Manfred Von Richthoven ", 28, 5);
		Pilot p5 = new Pilot("John Glenn", 77, 52);
		jets [0] = new Jet("F-16 Viper", 1350, 2622f, 18_800_000f, p1);
		jets [1] = new Jet("A-10 Warthog", 439, 800f, 18_800_000, p2);
		jets [2] = new Jet("F-35 Lightning II", 1379, 1999f, 104_000_000f, p3);
		jets [3] = new Jet("F-22 Raptor", 1498, 1839f, 339_000_000f, p4);
		jets [4] = new Jet("1903 Wright Flyer", 34, 0.161364f, 3_000f, p5);
	
		
		
		
		
		while (true){
			System.out.println("Welcome to the directory of Jets");
			System.out.println("1):    List Fleet of Jets");
			System.out.println("2):    View Fastest Jet");
			System.out.println("3):    View Jet with Longest Range");
			System.out.println("4):    Add a Jet to the Fleet");
			System.out.println("5):    Quit");
			System.out.println("Please enter a number from one of the following menu items.");
			System.out.println();
			int menuNumb = kb.nextInt();
			
			 
			if ( menuNumb == 5)
				break;
			
			switch (menuNumb){
			case 1:
				listJets();
				
				
				break;
			case 2:
				fastestJet();
				break;
			case 3:
				longestRange();
				break;
			case 4:
				addJet(kb);
				
				break;
			default:
				System.err.println(" Invalid response, please enter a number from the Menu");
				break;
			
			
			
			}//switch	
		}//while
	}
//		kb.close();

public static void listJets(){
	for (Jet jet : jets) {
		System.out.println(jet);
	}
}
public static void fastestJet(){
	Jet fastest =  jets[0];
	for (Jet j : jets) {
		if (fastest.getSpeed() < j.getSpeed()){
			fastest = j;
		}
	}
	System.out.println(fastest);
}
public static void longestRange(){
	Jet longest = jets[0];
	for (Jet j : jets){
		if (longest.getRange()< j.getRange()){
			longest = j;
		}
	}
	System.out.println(longest);
}
public static void addJet(Scanner kb){
	Jet[] newList = new Jet[jets.length + 1];
	for (int i = 0; i < jets.length; i++){
		newList[i] = jets[i];
	}
	System.out.println("Enter a new Jet Model");
	String model = kb.nextLine();
	model = kb.nextLine();
	System.out.println("Enter the new Jet speed in MPH");
	double speed = kb.nextDouble();
	System.out.println("Enter the new Jet range in Miles");
	float range = kb.nextFloat();
	System.out.println("Enter the new Jet price");
	float price = kb.nextFloat();
	
//	newList[--newList.length] = new Jet();
	newList[jets.length] = new Jet(model, speed, range, price, new Pilot("Amelia Erheart", 28, 6));
		jets = newList;
		if (jets[jets.length-1].getModel().equals("null") ||
				jets[jets.length-1].getSpeed() <= 0 ||
				 jets[jets.length-1].getRange() <= 0 || 
				 jets[jets.length-1].getPrice() <= 0) {
	
			throw new IllegalArgumentException("All information not entered");
		 }
}

// List<Jet[]> list = new ArrayList<Jet[]>();
// list.iterator();
//
//
// System.out.println(list);

}
// Class