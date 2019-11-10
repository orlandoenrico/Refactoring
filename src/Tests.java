import static org.junit.Assert.*;
import org.junit.Test;

public class Tests{

    @Test
    public void testStatement(){
        Customer customer = new Customer("Orlando");
        Movie johnwick = new Movie("John Wick", 0);	
        Movie batvsup = new Movie("Batman V Superman", 1);
        Movie powerrangers = new Movie("Power Rangers", 2);
        Rental jw = new Rental(johnwick, 8);
        Rental bvs = new Rental(batvsup, 7);
		Rental pr = new Rental(powerrangers, 8);
        
		customer.addRental(jw);
    	customer.addRental(bvs);
		customer.addRental(pr);

		String resultado = "Rental Record for Orlando\n" +
			"	John Wick	11.0\n" +
			"	Batman V Superman	21.0\n" +
			"	Power Rangers	9.0\n" +
			"Amount owed is 41.0\n" +
			"You earned 4 frequent renter points";

		assertEquals(customer.statement(), resultado);
    }
} 
