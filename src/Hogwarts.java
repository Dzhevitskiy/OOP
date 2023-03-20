public class Hogwarts {

    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
}
