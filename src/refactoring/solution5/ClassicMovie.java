package refactoring.solution5;

public class ClassicMovie implements MovieType {

	@Override
	public double getCharge(int _daysRented) {
		return (_daysRented / 5);
	}

	@Override
	public int getFrequentRenterPoints(int _daysRented) {
		return 3;
	}

}
