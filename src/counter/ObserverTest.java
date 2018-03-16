package counter;

import java.util.Scanner;

/**
 * Testing the observer code works. 
 * Every time you enter a number, it should display the updated total count on the console.
 * 
 * @author Gunthee Tawewatmongkol
 */
public class ObserverTest {

	public static void main(String[] args) {
		final Scanner console = new Scanner(System.in);
        Counter counter = new Counter();  
        ConsoleView view = new ConsoleView(counter);
        counter.addObserver(view);
        
        while(true) {
            System.out.print("Count how many? ");
            int howmany = console.nextInt();
            if (howmany == 0) System.exit(0);
            counter.add(howmany);
        }
	}
}
