package main;

public class NewReleasePrice extends Price
{
	@Override
	PriceCategory getPriceCode()
	{
		return PriceCategory.NEW_RELEASE;
	}
}
