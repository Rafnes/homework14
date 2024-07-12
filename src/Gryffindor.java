public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", благородство: %s, честь: %s, храбрость: %s", nobility, honor, bravery);
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int totalRate1 = student1.bravery + student1.nobility + student1.honor;
        int totalRate2 = student2.bravery + student2.nobility + student2.honor;
        if (totalRate1 > totalRate2) {
            System.out.println(student1.getName() + " лучший гриффиндорец, чем  " + student2.getName());
        } else if (totalRate2 > totalRate1) {
            System.out.println(student2.getName() + " лучший гриффиндорец, чем  " + student1.getName());
        } else {
            System.out.println("Оба студента Гриффиндора обладают одинаковыми показателями");
        }
    }
}
