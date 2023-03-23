public class FootballManager{

    public Footballer find(int number) throws FootballerExcep {
        if (number == 22) {
            System.out.println("Oyuncu eşleşti");
            return new Footballer(11,"Ozan");
        } else {
            throw new FootballerExcep("Futbolcu bulunamadı.");
        }

    }
}
