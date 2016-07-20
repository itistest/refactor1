public class CustomerTest {

    @org.junit.Test
    public void statement() {
        //��Ӱ
        Movie m1 = new Movie("��Ӱ1", Movie.CHILDRENS);
        Movie m2 = new Movie("��Ӱ2", Movie.CHILDRENS);
        Movie m3 = new Movie("��Ӱ3", Movie.CHILDRENS);
        Movie m4 = new Movie("��Ӱ4", Movie.CHILDRENS);
        Movie m5 = new Movie("��Ӱ5", Movie.CHILDRENS);
        Movie m6 = new Movie("��Ӱ6", Movie.NEW_RELEASE);
        Movie m7 = new Movie("��Ӱ7", Movie.NEW_RELEASE);
        Movie m8 = new Movie("��Ӱ8", Movie.REGULAR);
        Movie m9 = new Movie("��Ӱ9", Movie.REGULAR);
        Movie m10 = new Movie("��Ӱ10", Movie.REGULAR);
        Movie m11 = new Movie("��Ӱ11", Movie.REGULAR);
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
            "\t��Ӱ1\t1.5\n" +
            "\t��Ӱ2\t1.5\n" +
            "\t��Ӱ3\t1.5\n" +
            "\t��Ӱ4\t3.0\n" +
            "\t��Ӱ5\t4.5\n" +
            "\t��Ӱ6\t3.0\n" +
            "\t��Ӱ7\t6.0\n" +
            "\t��Ӱ8\t2.0\n" +
            "\t��Ӱ9\t2.0\n" +
            "\t��Ӱ10\t3.5\n" +
            "\t��Ӱ11\t5.0\n" +
        "Amount owed is 33.5\n" +
        "You earned 12 frequent renter points";

        org.junit.Assert.assertEquals(exepectedResult, customer.statement());
    }

}