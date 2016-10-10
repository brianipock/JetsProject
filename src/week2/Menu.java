package week2;

public class Menu {
	private Jet[] jets = new Jet[0];
	private boolean loop = true;
	
//	public void menu(){
		while (loop){
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
				System.out.println(jets[5]);
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				
				break;
			default:
				System.err.println(" Invalid response, please enter a number from the Menu");
				break;
			
			}//switch
//		}//while
			
			private listJets{
				for (int i=0; i < jets.length; i++){
					System.out.println(jets[i].getModel() + " " + jets[i].getRange() + " " + jets[i].getSpeed() + " " + jets[i].getPrice());
					
				}
			}
		}
}
