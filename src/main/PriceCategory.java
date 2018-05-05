package main;

public enum PriceCategory
{
	REGULAR(2, 1.5, 2, 1), //
	NEW_RELEASE(0, 3, 0, 0), //
	CHILDREN(1.5, 1.5, 3, 3);

	private double grundpreis = 0;
	private double aufpreisFaktor = 0;
	private int aufpreisAbTag = 0;
	private int rabatt;

	private PriceCategory(double grundpreis, double aufpreis, int aufpreisAbTag, int rabatt)
	{
		this.grundpreis = grundpreis;
		this.aufpreisFaktor = aufpreis;
		this.aufpreisAbTag = aufpreisAbTag;
		this.rabatt = rabatt;
	}

	public double getCharge(int days)
	{
		if (days > aufpreisAbTag)
		{
			return days * aufpreisFaktor - rabatt;
		}
		return grundpreis;
	}

	public static double getCharge(PriceCategory category, int days)
	{
		return category.getCharge(days);
	}

	public static int getFrequentRenterPoints(PriceCategory cat, int daysRented)
	{
		switch (cat)
		{
			case CHILDREN:
				return 1;
			case NEW_RELEASE:
				return (daysRented > 1) ? 2 : 1;
			case REGULAR:
				return 1;
			default:
				return 1;
		}
	}
}
