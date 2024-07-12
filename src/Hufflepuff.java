public class Hufflepuff extends Hogwarts {
    private int tirelessness;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int tirelessness, int loyalty, int honest) {
        super(name, magicPower, transgressionDistance);
        this.tirelessness = tirelessness;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getTirelessness() {
        return tirelessness;
    }

    public void setTirelessness(int tirelessness) {
        this.tirelessness = tirelessness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", трудолюбие: %s, верность: %s, честь: %s", tirelessness, loyalty, honest);
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int totalRate1 = student1.tirelessness + student1.loyalty + student1.honest;
        int totalRate2 = student2.tirelessness + student2.loyalty + student2.honest;
        if (totalRate1 > totalRate2) {
            System.out.println(student1.getName() + " лучший пуффендуец, чем " + student2.getName());
        } else if (totalRate2 > totalRate1) {
            System.out.println(student2.getName() + " лучший пуффендуец, чем " + student1.getName());
        } else {
            System.out.println("Оба студента Пуффендуя обладают одинаковыми показателями");
        }
    }
}
