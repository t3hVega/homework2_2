public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int sorceryPower, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, sorceryPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    public void data() {
        super.data();
        System.out.println("Факультет: Гриффиндор" + "\n" +
                "Благородство: " + nobility + "\n" +
                "Честь: " + honour + "\n" +
                "Храбрость: " + bravery);
    }
    public void compareFacultyStudents(Gryffindor g) {
        int sum1 = this.bravery + this.honour + this.nobility;
        int sum2 = g.bravery + g.honour + g.nobility;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем, " + g.getName());
        } else if (sum2 > sum1) {
            System.out.println(g.getName() + " лучший Гриффиндорец чем, " + this.getName());
        } else System.out.println(this.getName() + " и " + g.getName() + " одинаково хорошие Гриффиндорцы");
    }
}
