public class Main {
    public static void main(String[] args) {

        var Potter = new Gryffindor("Harry Potter", 30,15,20,30,30);
        System.out.println(Potter);

        var Granger = new Gryffindor("Hermiona Granger", 30,20,18,23,30);
        System.out.println(Granger);

        var Weasley = new Gryffindor("Ron Weasley", 10, 15,15,20,17);
        System.out.println(Weasley);

        var Malfoy = new Skytherin("Drako Malfoy", 14,17,19,21,11,15,16,18);
        System.out.println(Malfoy);

        var Montague = new Skytherin("Graham Montague", 17,18,15,13,16,21,20,11);
        System.out.println(Montague);

        var Goyle = new Skytherin("Gregory Goyle", 14,15,17,11,25,23,21,12);
        System.out.println(Goyle);

        var Smith = new Hufflepuff("Zachariah Smith", 17,19,20,25,21);
        System.out.println(Smith);

        var Diggory = new Hufflepuff("Cedric Diggory", 20,24,17,21,35);
        System.out.println(Diggory);

        var FintFletchley = new Hufflepuff("Justin FintFletchley", 16,28,18,19,20);
        System.out.println(FintFletchley);

        var Chang = new Ravenclaw("Zhou Chang", 15,20,16,18,24,21);
        System.out.println(Chang);

        var Patil = new Ravenclaw("Padma Patil", 30,21,38,17,15,27);
        System.out.println(Patil);

        var Belby = new Ravenclaw("Marcus Belby", 27,20,18,19,21,25);
        System.out.println(Belby);

        compareGryffindor(Granger,Weasley);
        compareGryffindor(Potter,Weasley);
        compareGryffindor(Granger,Potter);
        compareHufflepuff(Diggory,Smith);
        compareHogwarts(Weasley,FintFletchley);
    }
    public static void compareGryffindor(Gryffindor Granger, Gryffindor Weasley) {
        var s1 = Granger.abilyty();
        var s2 = Weasley.abilyty();
        if (s1 > s2){
            System.out.println(Granger.getName() + " лучший Гриффиндорец, чем " + Weasley.getName());
        } else {
            System.out.println(Weasley.getName() + " лучший Гриффиндорец, чем " + Granger.getName());
        }
    }
    public static void compareHufflepuff(Hufflepuff Diggory,Hufflepuff Smith) {
        var s1 = Smith.abilyty();
        var s2 = Diggory.abilyty();
        if (s1 > s2) {
            System.out.println(Smith.getName() + " лучший Пуффендуец, чем " + Diggory.getName());
        } else {
            System.out.println(Diggory.getName() + " лучший Пуффендуец, чем " + Smith.getName());
        }
    }
    public static void compareHogwarts(Gryffindor Weasley, Hufflepuff FintFletchley) {
        var s1 = Weasley.abilyty();
        var s2 = FintFletchley.abilyty();
        if (s1 > s2) {
            System.out.println(Weasley.getName() + " обладает большей магией, чем " + FintFletchley.getName());
        } else {
            System.out.println(FintFletchley.getName() + " обладает большей магией, чем " + Weasley.getName());
        }
    }
}