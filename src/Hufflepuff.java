public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int fairness;
    public Hufflepuff (String name, int sorceryPower, int transgressionDistance, int diligence, int loyalty, int fairness) {
        super(name, sorceryPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this. fairness = fairness;
    }
    public void data() {
        super.data();
        System.out.println("Факультет: Пуффендуй" + "\n" +
                "Трудолюбие: " + diligence + "\n" +
                "Верность: " + loyalty + "\n" +
                "Честность: " + fairness);
    }
    public void compareFacultyStudents(Hufflepuff h) {
        int sum1 = this.diligence + this.loyalty + this.fairness;
        int sum2 = h.diligence + h.loyalty + h.fairness;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец чем, " + h.getName());
        } else if (sum2 > sum1) {
            System.out.println(h.getName() + " лучший Пуффендуец чем, " + this.getName());
        } else System.out.println(this.getName() + " и " + h.getName() + " одинаково хорошие Пуффендуйцы");
    }
}
