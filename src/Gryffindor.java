public class Gryffindor extends Hogwarts {

    private  int nobility;
    private  int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int abilyty(){
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor:" + super.toString() +
                ",nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
