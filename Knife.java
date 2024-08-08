class Knife {
    double weight;
    double height;

    Knife(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    void details() {
        System.out.println("Knife [weight=" + weight + ", height=" + height + "]");
    }
}