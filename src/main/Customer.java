package main;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	private static final String TAB = "\t";

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String newname)
	{
		name = newname;
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
		StringBuilder sb = new StringBuilder("Rental Record for " + getName() + "\n");
		for (Rental rental : this.rentals)
		{
			Rental each = rental;
			// show figures for this rental
			sb.append(TAB + each.getMovie().getTitle() + TAB + each.getCharge() + "\n");
		}

		// add footer line
		sb.append("Amount owed is " + getTotalCharge() + "\n");
		sb.append("You earned " + getTotalFrequentRenterPoints() + " frequent renter points");
		return sb.toString();
	}

	private double getTotalCharge()
	{
		double result = 0;
		for (Rental rental : this.rentals)
		{
			Rental each = rental;
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints()
	{
		int result = 0;
		for (Rental rental : this.rentals)
		{
			Rental each = rental;
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

}
