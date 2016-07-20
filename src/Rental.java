class Rental {
    private Movie _movie;
    private int _daysRented;
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    public Movie getMovie() {
        return _movie;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    double getCharge() {
    	return _movie.getCharge(_daysRented);
    }
    int getFrequenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
            return 2;
        } else 
            return 1;
    }
}
