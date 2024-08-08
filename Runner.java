public class Runner {
    public static void main(String[] args) {
        
        Key key = new Key(50.5, "Yale");
        Keybunch keybunch = new Keybunch("Leather", key);

        Clip clip = new Clip("Red", "Metal");
        Ganavi ganavi = new Ganavi("ganavi@example.com", clip);

        Knife knife = new Knife(150.0, 20.5);
        Ananya ananya = new Ananya("1234567890", knife);

        System.out.println("Details for Keybunch:");
        keybunch.details();

        System.out.println("\nDetails for Ganavi:");
        ganavi.details();

        System.out.println("\nDetails for Ananya:");
        ananya.details();
    }
}