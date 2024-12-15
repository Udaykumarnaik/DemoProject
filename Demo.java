//Single level inheritence

class Chinna
{
	public void bank()
	{
		System.out.println("Chinna maintain accounts");
	}
}
class Ammu extends chinna
{
	public void balance()
	{
		System.out.println("Chinna manage my accounts");
	}
}
class Test
{
	public static void main(String [] args)
	{
		Ammu a = new Ammu();
		a.balance();
	}
}