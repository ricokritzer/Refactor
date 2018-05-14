package main;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	private static final String TAB = "\t";
	private static final String NEW_LINE = System.lineSeparator();

	private String name;
	private double totalCharge = 0;
	private int renterPoints = 0;

	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name)
	{
		this.name = name;
	}

	public void addRental(Rental rental)
	{
		rentals.add(rental);
		renterPoints += rental.getFrequentRenterPoints();
		totalCharge += rental.getCharge();
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

	public double getTotalCharge()
	{
		return totalCharge;
	}

	public int getTotalFrequentRenterPoints()
	{
		return renterPoints;
	}
}
