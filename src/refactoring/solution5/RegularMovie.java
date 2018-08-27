package refactoring.solution5;

public class RegularMovie implements MovieType {
	private int charge = 3;
	@Override
	public double getCharge(int _daysRented) {
		return charge * _daysRented;
	}


	@Override
	public int getFrequentRenterPoints(int _daysRented) {
		return 2;
	}

}
