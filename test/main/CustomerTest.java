package main;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomerTest
{
	private final static PriceCategory PRICE_CATEGORY_1 = PriceCategory.NEW_RELEASE;
	private final static PriceCategory PRICE_CATEGORY_2 = PriceCategory.CHILDREN;

	private final static int ZERO_DAYS = 0;
	private final static int ONE_DAY = 1;
	private final static int TWO_DAYS = 2;
	private final static int THREE_DAYS = 3;
	private static final int FOUR_DAYS = 4;
	private static final int HUNDRED_DAYS = 100;

	@Test
	public void customerName()
	{
		String name = "test123";
		Customer customer = new Customer(name);
		assertThat(customer.getName(), is(name));
	}

	@Test
	public void customerChargeInitEmpty()
	{
		Customer customer = new Customer("");
		assertThat(customer.getTotalCharge(), is(0.0));
	}

	@Test
	public void customerCharge1Movie0NewDaysRented()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, ZERO_DAYS);
		assertThat(customer.getTotalCharge(), is(0.0));
	}

	@Test
	public void customerCharge1Movie1NewDaysRented()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, ONE_DAY);
		assertThat(customer.getTotalCharge(), is(3.0));
	}

	@Test
	public void customerCharge2Movie0NewDaysRented()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_2, ONE_DAY);
		assertThat(customer.getTotalCharge(), is(1.5));
	}

	@Test
	public void customerCharge1Movie2NewDaysRented()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, TWO_DAYS);
		assertThat(customer.getTotalCharge(), is(6.0));
	}

	@Test
	public void customerCharge1Movie3NewDaysRented()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, THREE_DAYS);
		assertThat(customer.getTotalCharge(), is(9.0));
	}

	@Test
	public void customerPointsInitEmpty()
	{
		Customer customer = new Customer("");
		assertThat(customer.getTotalFrequentRenterPoints(), is(0));
	}

	@Test
	public void customerPoints1Movie0Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, ZERO_DAYS);
		assertThat(customer.getTotalFrequentRenterPoints(), is(1));
	}

	@Test
	public void customerPoints1Movie1Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, ONE_DAY);
		assertThat(customer.getTotalFrequentRenterPoints(), is(1));
	}

	@Test
	public void customerPoints1Movie2Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, TWO_DAYS);
		assertThat(customer.getTotalFrequentRenterPoints(), is(2));
	}

	@Test
	public void customerPoints1Movie3Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, THREE_DAYS);
		assertThat(customer.getTotalFrequentRenterPoints(), is(2));
	}

	@Test
	public void customerPoints1Movie4Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, FOUR_DAYS);
		assertThat(customer.getTotalFrequentRenterPoints(), is(2));
	}

	@Test
	public void customerPoints1Movie100Days()
	{
		Customer customer = rentMovie(PRICE_CATEGORY_1, HUNDRED_DAYS);
		assertThat(customer.getTotalFrequentRenterPoints(), is(2));
	}

	private Customer rentMovie(PriceCategory priceCode, int days)
	{
		Customer customer = new Customer("");
		Movie movie = new Movie("", priceCode);
		Rental rental = new Rental(movie, days);
		customer.addRental(rental);
		return customer;
	}

}
