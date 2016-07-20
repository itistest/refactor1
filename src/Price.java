public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);
	int getFrequenterPoints(int daysRented) {
		return 1;
	}
}
