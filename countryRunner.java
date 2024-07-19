class countryRunner{
	public static void main(String[]args)
	{
		String state[] ={"Karnataka","Tamil Nadu","Andra paradesh","Kerala","maharashtra","uttara pradesh","meghalaya","odisha","delhi","Panjab","Haryana","Gujarath","Arunachala pradesh","Jammu and kashmir","Himachal pradesh","Sikkim","west bengal"};
		country.states(state);
		
		int [] pincode={1234,567890,9876,987654,2345,123456,7654,6790,9876,2345678,9876543,87654,456,3456,98765,987654,4567,2323,};
		country.pincode(pincode);
		
		String PM[]={"NARENDRA MODI","MANMOHAN SINGH","VINAY KUMAR","VINUTHA","JAWAHARLAL NEHARU","ZAKIR HUSSAIN","PRATHIBHA PATIL","AMITH SHAH","RAMANATH BAGAIR"};
		country.primeMinister(PM);
		
		String minister[] = {"RAJA SINGH","RANATH KOVIND","UNCLE PIMAN","INDIRAKKA","RAHUL PAPPU","SONIAKKA","kumaranna","somanna","prahlad joshi","jp nadda"};
		country.cabinetMinister(minister);
		
		String parties[]={"BJP","CONGRESS","JDS","NDA"};
		country.politicalParties(parties);
	}
}