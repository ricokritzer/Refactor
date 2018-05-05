package main;

public class Movie
{
	private String title;
	private Price price;

	public Movie(String title, PriceCategory category)
	{
		this.title = title;
		setPriceCode(category);
	}

	public PriceCategory getPriceCode()
	{
		return price.getPriceCode();
	}

	public void setPriceCode(PriceCategory arg)
	{
		switch (arg)
		{
			case REGULAR:
				price = new RegularPrice();
				break;
			case CHILDREN:
				price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
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