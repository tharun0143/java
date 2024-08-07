class Company {
    int id;
    String name;
    String location;
    SoftwareEngineer engineer;

    public Company(int id, String name, String location, SoftwareEngineer engineer) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.engineer = engineer;
    }

    public void printDetails() {
        System.out.println("Company Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        engineer.printDetails();
	
    }
}