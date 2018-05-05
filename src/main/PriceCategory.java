package main;

public enum PriceCategory
{
	REGULAR, NEW_RELEASE, CHILDREN;

	public static double getCharge(PriceCategory category, int days)
	{
		if (category == NEW_RELEASE)
		{
			return days * 3;
		}
		else if (category == REGULAR)
		{
			double result = 2;
			if (days > 2)
			{
				result += (days - 2) * 1.5;
			}
			return result;
		}
		else if (category == CHILDREN)
		{
			double result = 1.5;
			if (days > 3)
			{
				result += (days - 3) * 1.5;
			}
			return result;
		}
		return 0.0;
	}
}
