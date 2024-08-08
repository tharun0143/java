class Key {
    double weight;
    String brand;

    Key(double weight, String brand) {
        this.weight = weight;
        this.brand = brand;
    }

    void details() {
        System.out.println("Key [weight=" + weight + ", brand=" + brand + "]");
    }
}