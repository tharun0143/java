class Countries {
    String name;
    String continent;
    State state;

    public Countries(String name, String continent, State state) {
        this.name = name;
        this.continent = continent;
        this.state = state;
    }

    public void printDetails() {
        System.out.println("Country Details:");
        System.out.println("Name: " + name);
        System.out.println("Continent: " + continent);
        state.printDetails();
    }
}