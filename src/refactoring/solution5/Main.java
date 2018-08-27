package refactoring.solution5;

public class Main {

	public static void main(String[] args) {
		Customer barry = new Customer("Barry");
		Customer charles = new Customer("Charles");
	
		charles.statement();
		
		Movie lion_King = new Movie ("Lion King", new ChildrensMovie());
		Movie psycho = new Movie ("Psycho", new ClassicMovie());
		
		System.out.println(psycho.getCharge(24));
		
		barry.addRental(lion_King, 22);
		barry.addRental(psycho, 123);
		
		System.out.println(barry.statement());
	}

}