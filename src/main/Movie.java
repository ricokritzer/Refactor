package main;

public class Movie
{
	private String title;
	private Price price;
	private PriceCategory category;

	public Movie(String title, PriceCategory category)
	{
		this.title = title;
		this.category = category;
		this.price = new Price(category);
	}

	public PriceCategory getPriceCode()
	{
		return category;
	}

	public String getTitle()
	{
		return title;
	}

	double getCharge(int daysRented)
	{
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented)
	{
		return price.getFrequentRenterPoints(daysRented);
	}

}