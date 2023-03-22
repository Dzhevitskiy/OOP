public class Hufflepuff extends Hogwarts {

    private int honest;
    private int loyalty;
    private int industriousness;

    public Hufflepuff(String name, int magic, int transgression, int honest, int loyalty, int industriousness) {
        super(name, magic, transgression);
        this.honest = honest;
        this.loyalty = loyalty;
        this.industriousness = industriousness;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int abilyty(){
        return honest + loyalty + industriousness;
    }

    @Override
    public String toString() {
        return "Hufflepuff:" + super.toString() +
                ",honest=" + honest +
                ", loyalty=" + loyalty +
                ", industriousness=" + industriousness;

    }
}
