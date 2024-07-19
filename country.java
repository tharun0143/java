class country{
	static int no;
	public static void states(String[] state)
	{ for(no=0;no<state.length;no--)
		{
		System.out.println("state is:"+state[no]);
		}
	}
	
	public static void pincode(int[] pin)
	{
		for(no=pin.length;no>=0;no--)
		{
		System.out.println("pincode is:"+pin[no]);
		}
	}
	
	public static void primeMinister(String[] minister)
	{     for(no=pin.length;no>=0;no--)
		{
		System.out.println("Prime minister name is:"+minister[no]);
		}
	}
	
	public static void cabinetMinister(String[] MP)
	{
		for(no=pin.length;no>=0;no--)
		{
		System.out.println("cabinet minister name is:"+MP[no]);
		}
	}

	public static void politicalParties(String[] parties)
	{ 
	for(no=pin.length;no>=0;no--)
	{
		System.out.println("Political party is:"+parties[no]);
	}
	}
}