package test2;



public class metot3 
{
	public static void main(String[] args)
	{
		int sayilar[] = new int[]{3,14,35,46,57,88,91};		
		System.out.println(topla(2, 4));
		System.out.println(topla(sayilar));
	}

	public static int topla(int i1, int i2)
	{
	    return i1 + i2;
	}
	public static int topla(int i1, int i2, int i3)
	{
	    return i1 + i2 + i3 ;
	}
	public static int topla(int dizideger[] )
	{
		int tmp = 0;
		for(int s : dizideger)
			tmp+=s;
		return tmp;
	}
}
