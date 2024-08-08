class Keybunch {
    String material;
    Key key;

    Keybunch(String material, Key key) {
        this.material = material;
        this.key = key;
    }

    void details() {
        System.out.println("Keybunch [material=" + material + "]");
        key.details();
    }
}
