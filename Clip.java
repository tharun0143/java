class Clip {
    String color;
    String type;

    Clip(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void details() {
        System.out.println("Clip [color=" + color + ", type=" + type + "]");
    }
}