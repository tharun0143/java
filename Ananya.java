class Ananya {
    String mobile;
    Knife knife;
	

    Ananya(String mobile, Knife knife) {
        this.mobile = mobile;
        this.knife = knife;
    }

    void details() {
        System.out.println("Ananya [mobile=" + mobile + "]");
        knife.details();
    }
}