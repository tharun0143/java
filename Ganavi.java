class Ganavi {
    String email;
    Clip clip;

    Ganavi(String email, Clip clip) {
        this.email = email;
        this.clip = clip;
    }

    void details() {
        System.out.println("Ganavi [email=" + email + "]");
        clip.details();
    }
}