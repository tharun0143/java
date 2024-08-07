public class ClassRunner {
    public static void main(String[] args) {
        // Owner object
        Owner owner = new Owner("John Doe", 45, "Male");

        //  Hotel object
        Hotel hotel = new Hotel("Grand Hotel", owner);
        hotel.printDetails();

        //  SoftwareEngineer object
        SoftwareEngineer engineer = new SoftwareEngineer("Jane Smith", 10, "Senior Developer", 120000);
        
        // Company object
        Company company = new Company(1, "Tech Corp", "Silicon Valley", engineer);
        company.printDetails();

        // CapitalCity object
        CapitalCity capitalCity = new CapitalCity("Capital City", 5000000);

        // State object
        State state = new State("California", "English", capitalCity);
        state.printDetails();

        // Country object
        Countries country = new Countries("USA", "North America", state);
        country.printDetails();
    }
}