public class Slitherine extends Hogwarts {
    private int cunningness;
    private int resoluteness;
    private int ambitiousness;
    private int inventiveness;
    private int thirstForPower;

    public Slitherine(String name, int sorceryPower, int transgressionDistance, int cunningness, int resoluteness, int ambitiousness, int inventiveness, int thirstForPower) {
        super(name, sorceryPower, transgressionDistance);
        this.cunningness = cunningness;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.inventiveness = inventiveness;
        this.thirstForPower = thirstForPower;
    }
    public void data() {
        super.data();
        System.out.println("Факультет: Слизерин" + "\n" +
                "Хитрость: " + cunningness + "\n" +
                "Решительность: " + resoluteness + "\n" +
                "Амбициозность: " + ambitiousness + "\n" +
                "Находчивость: " + inventiveness + "\n" +
                "Жажда власти: " + thirstForPower);
    }
    public void compareFacultyStudents(Slitherine s) {
        int sum1 = this.cunningness + this.resoluteness + this.ambitiousness + this.inventiveness + this.thirstForPower;
        int sum2 = s.cunningness + s.resoluteness + s.ambitiousness + s.inventiveness + s.thirstForPower;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец чем, " + s.getName());
        } else if (sum2 > sum1) {
            System.out.println(s.getName() + " лучший Слизеринец чем, " + this.getName());
        } else System.out.println(this.getName() + " и " + s.getName() + " одинаково хорошие Слизеринцы");
    }
}
