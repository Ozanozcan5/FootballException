public class Footballer {
    int number;
    String name;

    public int getNumber() {
        return number;
    }

    public void setId(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Footballer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public static Footballer find(int number) throws FootballerExcep {
        if (number == 22) {
            return new Footballer(22, "Ozan Özcan");
        } else {
            throw new FootballerExcep("Futbolcu  Bulunamadı");
        }

    }
}