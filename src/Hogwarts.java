abstract public class Hogwarts {
    private String name;
    private int sorceryPower;
    private int transgressionDistance;
    public Hogwarts (String name, int sorceryPower, int transgressionDistance) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }
    public void data() {
        System.out.println("Имя студента: " + name + "\n" +
                "Сила магии: " + sorceryPower + "\n" +
                "Дистанция трансгрессии: " + transgressionDistance + " метров");
    }
    public void compareSchoolStudents(Hogwarts h1) {
        int sum1 = this.sorceryPower + this.transgressionDistance;
        int sum2 = h1.sorceryPower + h1.transgressionDistance;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " обладает большей мощностью магии чем, " + h1.getName());
        } else if (sum2 > sum1) {
            System.out.println(h1.getName() + " обладает большей мощностью магии чем, " + this.getName());
        } else System.out.println(this.getName() + " и " + h1.getName() + " обладает одинаковой мощностью магии");
    }
}
