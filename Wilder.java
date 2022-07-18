public class Wilder {
    private String firstname;
    public boolean aware;

    //constructor
    public Wilder(String firstname) {
        this.firstname = firstname;

    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }


    // getters & setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    //instance method
    public String whoAmI(){
        return "Je m'appelle " + getFirstname() + "et je suis " + aware;
    }
}