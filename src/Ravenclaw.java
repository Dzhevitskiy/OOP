public class Ravenclaw extends Hogwarts {

    private int creation;
    private int smart;
    private int witty;
    private int wise;

    public Ravenclaw(String name, int magic, int transgression, int creation, int smart, int witty, int wise) {
        super(name, magic, transgression);
        this.creation = creation;
        this.smart = smart;
        this.witty = witty;
        this.wise = wise;
    }

    public int getCreation() {
        return creation;
    }

    public int getSmart() {
        return smart;
    }

    public int getWitty() {
        return witty;
    }

    public int getWise() {
        return wise;
    }

    @Override
    public String toString() {
        return "Ravenclaw:" + super.toString() +
                ",creation=" + creation +
                ", smart=" + smart +
                ", witty=" + witty +
                ", wise=" + wise;
    }
}
