package main;

import java.util.ArrayList;
import java.util.List;

class Customer
{
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
		String result = "Rental Record for " + getName() + "\n";
		for (Rental rental : this.rentals)
		{
			Rental each = rental;
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
		}

		// add footer line
		result += "Amount owed is " + getTotalCharge() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		return result;
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
