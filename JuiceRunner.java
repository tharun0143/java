class JuiceRunner{
	public static void main(String[] args)
	{
		if(args.length == 5)
		{
			String name = args[0];
			String brand = args[1];
			String flavour = args[2];
			int price = Integer.parseInt(args[3]);
			int quantity = Integer.parseInt(args[4]);
		Juice.juice(name,brand,flavour,price,quantity);
		}
		
		
	}
} 