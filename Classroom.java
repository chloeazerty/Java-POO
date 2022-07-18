public class Classroom {
    public static void main(String[] args) {

       Wilder tom =  new Wilder("Tom", true);
       Wilder jerry =  new Wilder("Jerry", false);

       System.out.println("Je m'appelle " + tom.getFirstname() + " et je suis " + String.valueOf(tom.aware) );
        System.out.println("Je m'appelle " + jerry.getFirstname() + " et je suis " + String.valueOf(jerry.aware) );
    }
}
