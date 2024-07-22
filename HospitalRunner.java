class HospitalRunner{
	public static void main(String[] args)
	{
		if(args.length == 4)
		{
			String name = args[0];
			String date = args[1];
			String price = args[2];
			String quantity = args[3];
			
			int date = Integer.parseInt(args[1]);
			int price = Integer.parseInt(args[2]);
			int quantity = Integer.parseInt(args[3]);
		Hospital.medicine(name,date,price,quantity);
		}
		
		
	}
}