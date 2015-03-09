import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class PassengerMenus {

	/**
	 * @param args
	 * @return 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		boolean run = true;
        while (run){
		Scanner input = new Scanner(System.in);
		System.out.println("============ Menu 1 ============");
        System.out.print("Enter option(1, 2, 3): ");
        String option = input.nextLine();
        Integer option1 = Integer.valueOf(option);
        if(option1 == 3){
        	System.exit(0);
        }
        
        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        
        
        System.out.print("Enter your last name: "); 
        String last = input.nextLine();
        if(option1 == 1){
        System.out.println("newPassenger: " + first + " "+ last);
        }
        if(option1 == 2){
        System.out.println("findPassenger: " + first + " "+ last);
        }
        
		System.out.println("============ Menu 2 ============");
        System.out.print("Enter option(1, 2, 3, 4): ");
        String option2 = input.nextLine();
        int option3;
        option3 = Integer.valueOf(option2);
        
        
        if (option3 == 1){
        System.out.print("Enter <Originating airport> (three letter code): ");
        String origin = input.nextLine();
        
        System.out.print("Enter <Destination airport> (three letter code): ");
                String destin = input.nextLine();
	
        System.out.println("findAvalibleFlig1htPlans: " + origin + " "+ destin);
        break;
        }
        
        if (option3 ==4){
        	run=true;
        }
        if (option3 ==2){
        	get();
        
        	break;
        }
        if (option3 ==3){
            
        	break;
        }
        }

        	
        
        }

		private static String[] codes = {"GNV", "BTR", "MCO", "MIA", "ATL", "IAH", "LAX", "JFK", "LGA", "ORD", "BOS", "ANC", "DEN", "SLC", "SFO", "IAD", "SEA", "OKC"};
		
		// Used internally.
		private static int getRandomInt(int min, int max)
		{
			int x;  // We're going to divide integers.
			// Don't allow y == 0!

			x = (int) (Math.random() * (max - min) + min);
			
			return x;
		}
		
		/**
		 * Gets a randomly-generated itinerary - a array of sequential airport code pairings. 
		 * @return
		 */
		public static String[] get()
		{
			ArrayList<String> codeList = new ArrayList<String>(Arrays.asList(codes));
			
			Collections.shuffle(codeList);
			
			int count = getRandomInt(1, 6);
			
			String[] itinerary = new String[count];
			
			for(int i=0; i < count; i++)
			{
				itinerary[i] = codeList.get(i) + "-" + codeList.get(i+1);
			}
			
			return itinerary;
		}
	
        }



