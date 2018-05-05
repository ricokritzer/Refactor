package main;

public enum PriceCategory
{
	REGULAR(2, 1.5, 2, 1, 1), //
	NEW_RELEASE(0, 3, 0, 0, 2), //
	CHILDREN(1.5, 1.5, 3, 3, 1);

	private double grundpreis = 0;
	private double aufpreisFaktor = 0;
	private int aufpreisAbTag = 0;
	private int rabatt;

	private int renterPointsGreaterOne = 1;

	private PriceCategory(double grundpreis, double aufpreis, int aufpreisAbTag, int rabatt, int renterPointsGreaterOne)
	{
		this.grundpreis = grundpreis;
		this.aufpreisFaktor = aufpreis;
		this.aufpreisAbTag = aufpreisAbTag;
		this.rabatt = rabatt;
		this.renterPointsGreaterOne = renterPointsGreaterOne;
	}

	public double getCharge(int days)
	{
		if (days > aufpreisAbTag)
		{
			return days * aufpreisFaktor - rabatt;
		}
		return grundpreis;
	}

	public int getFrequentRenterPoints(int daysRented)
	{
		return daysRented > 1 ? renterPointsGreaterOne : 1;
	}
}
