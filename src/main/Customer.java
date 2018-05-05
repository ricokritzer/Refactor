package main;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	private static final String TAB = "\t";
	private static final String NEW_LINE = System.lineSeparator();

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name)
	{
		this.name = name;
	}

	public void addRental(Rental arg)
	{
		rentals.add(arg);
	}

	public String getName()
	{
		return name;
	}

	public String statement()
	{
		StringBuilder sb = new StringBuilder("Rental Record for " + getName() + NEW_LINE);
		for (Rental rental : this.rentals)
		{
			sb.append(TAB + rental.getMovie().getTitle() + TAB + rental.getCharge() + NEW_LINE);
		}

		sb.append("Amount owed is " + getTotalCharge() + NEW_LINE);
		sb.append("You earned " + getTotalFrequentRenterPoints() + " frequent renter points");
		return sb.toString();
	}

	double getTotalCharge()
	{
		double result = 0;
		for (Rental rental : this.rentals)
		{
			result += rental.getCharge();
		}
		return result;
	}

	int getTotalFrequentRenterPoints()
	{
		int result = 0;
		for (Rental rental : this.rentals)
		{
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}
}
