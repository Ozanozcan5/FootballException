public class Main {
    int number;
    String name;

    public Main(int number, String name){
        this.number= number;
        this.name=name;
    }
    public static Main find(int number) throws FootballerExcep {
        if (number == 22) {
            return new Main(22, "Ozan Özcan");
        } else {
            throw new FootballerExcep("Futbolcu  Bulunamadı");
        }

    }
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
    public static void main(String[] args) {

        Main s = null;
        try {
            s = Main.find(22);
            System.out.println("Number : " + s.getNumber());
            System.out.println("Name : " + s.getName());
        } catch (FootballerExcep e) {
            System.out.println(e.getMessage());
        }
    }
}