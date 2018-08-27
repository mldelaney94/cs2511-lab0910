package refactoring.solution5;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	//added freqRenterPoints as class variable
    private String _name;
    private List<Rental> _rentals;
    private int _freqRenterPoints;
    
    public Customer (String name) {
        this._name = name;
        this._rentals = new ArrayList<>();
        this._freqRenterPoints = 0;
    }
	
	public void addRental(Movie movie, int numDays) {
		_rentals.add(new Rental(movie, numDays));
	}
	
	public String getName (){
		return _name;
	}
	
	public String statement() {
		
		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental r: _rentals) {
			//show figures for this rental
			result += "\t" + r.getMovie().getTitle() + "\t" + 	String.valueOf(r.getCharge()) + "\n";
		}
		
		/* Initial code for implemented the new requirement - frequent renter points
		 * Apply a series of refactoring techniques to improve the design
		 */
		// add frequent renter points
		for (Rental r: _rentals) {
			 _freqRenterPoints += r.getFrequentRenterPoints();
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) +	"\n";
		// add footer line for frequent-renter points
		result += "You earned " + String.valueOf(_freqRenterPoints) 	+ " frequent renter points";
		return result;
	}


	public String htmlStatement() {
		String result = "";
		return result;
	}
	

	// Two options: Sometimes leave the old method to delegate to the old method.  This is useful if it is a public
	// method 
	
	private double getCharge(Rental r) {
		return r.getCharge();
	}
	
	private double getTotalCharge() {
		double result = 0;
		for (Rental r: _rentals) {
			result += r.getCharge();
		}
		return result;
	}
}
