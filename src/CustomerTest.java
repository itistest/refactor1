public class CustomerTest {

    @org.junit.Test
    public void statement() {
        //电影
        Movie m1 = new Movie("电影1", Movie.CHILDRENS);
        Movie m2 = new Movie("电影2", Movie.CHILDRENS);
        Movie m3 = new Movie("电影3", Movie.CHILDRENS);
        Movie m4 = new Movie("电影4", Movie.CHILDRENS);
        Movie m5 = new Movie("电影5", Movie.CHILDRENS);
        Movie m6 = new Movie("电影6", Movie.NEW_RELEASE);
        Movie m7 = new Movie("电影7", Movie.NEW_RELEASE);
        Movie m8 = new Movie("电影8", Movie.REGULAR);
        Movie m9 = new Movie("电影9", Movie.REGULAR);
        Movie m10 = new Movie("电影10", Movie.REGULAR);
        Movie m11 = new Movie("电影11", Movie.REGULAR);
        Customer customer = new Customer("Mike");
        customer.addRental(new Rental(m1,1));
        customer.addRental(new Rental(m2,2));
        customer.addRental(new Rental(m3,3));
        customer.addRental(new Rental(m4,4));
        customer.addRental(new Rental(m5,5));
        customer.addRental(new Rental(m6,1));
        customer.addRental(new Rental(m7,2));
        customer.addRental(new Rental(m8,1));
        customer.addRental(new Rental(m9,2));
        customer.addRental(new Rental(m10,3));
        customer.addRental(new Rental(m11,4));
        String exepectedResult = 
            "Rental Record for Mike\n" +
            "\t电影1\t1.5\n" +
            "\t电影2\t1.5\n" +
            "\t电影3\t1.5\n" +
            "\t电影4\t3.0\n" +
            "\t电影5\t4.5\n" +
            "\t电影6\t3.0\n" +
            "\t电影7\t6.0\n" +
            "\t电影8\t2.0\n" +
            "\t电影9\t2.0\n" +
            "\t电影10\t3.5\n" +
            "\t电影11\t5.0\n" +
        "Amount owed is 33.5\n" +
        "You earned 12 frequent renter points";

        org.junit.Assert.assertEquals(exepectedResult, customer.statement());
    }

}