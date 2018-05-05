package main;

public class ChildrensPrice extends Price
{
	@Override
	PriceCategory getPriceCode()
	{
		return PriceCategory.CHILDREN;
	}
}
