public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int wittiness;
    private int creativity;
    public Ravenclaw (String name, int sorceryPower, int transgressionDistance, int wisdom, int wittiness, int creativity) {
        super(name, sorceryPower, transgressionDistance);
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }
    public void data() {
        super.data();
        System.out.println("Факультет: Когтевран" + "\n" +
                "Мудрость: " + wisdom + "\n" +
                "Остроумие: " + wittiness + "\n" +
                "Креативность: " + creativity);
    }
    public void compareFacultyStudents(Ravenclaw r) {
        int sum1 = this.wisdom + this.wittiness + this.creativity;
        int sum2 = r.wisdom + r.wittiness + r.creativity;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец чем, " + r.getName());
        } else if (sum2 > sum1) {
            System.out.println(r.getName() + " лучший Когтевранец чем, " + this.getName());
        } else System.out.println(this.getName() + " и " + r.getName() + " одинаково хорошие Когтевранцы");
    }
}
