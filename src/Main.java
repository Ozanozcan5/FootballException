public class Main {

    public static void main(String[] args) throws FootballerExcep {
        System.out.println("Aradığınız Oyuncu");
        Footballer s =new Footballer(22,"Ozan Özcan");
        FootballManager footballManager = new FootballManager();

        System.out.println("Futbolcu = "+ s.getName()+" "+s.getNumber());
        try {
            Footballer footballer = footballManager.find(24) ;
            System.out.println("Number : "+s.getNumber());
            System.out.println("Name : " + s.getName());
        } catch (FootballerExcep e) {
            System.out.println(e.getMessage());
        }
    }
}