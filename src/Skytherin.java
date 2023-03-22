public class Skytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int trickery;
    private int lustForPower;

    public Skytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int trickery, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.trickery = trickery;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getTrickery() {
        return trickery;
    }

    public int getLustForPower() {
        return lustForPower;
    }


    @Override
    public String toString() {
        return "Skytherin:" + super.toString() +
                " ,cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", trickery=" + trickery +
                ", lustForPower=" + lustForPower;
    }
}
