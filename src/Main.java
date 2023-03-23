public class Main {

    public static void main(String[] args) {

        Footballer s = null;

        try {
            s = Footballer.find(23);
            System.out.println("Number : " + s.getNumber());
            System.out.println("Name : " + s.getName());
        } catch (FootballerExcep e) {
            System.out.println(e.getMessage());
        }
    }
}