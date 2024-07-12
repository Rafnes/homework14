public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return String.format("%s, сила магии: %s, дистанция трансгрессии: %s", name, magicPower, transgressionDistance);
    }

    public static void printStudent(Hogwarts student) {
        System.out.println(student);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int totalRate1 = student1.magicPower + student1.transgressionDistance;
        int totalRate2 = student2.magicPower + student2.transgressionDistance;
        if (totalRate1 > totalRate2) {
            System.out.println(student1.name + " обладает большими магическими способностями, чем " + student2.name);
        } else if (totalRate2 > totalRate1) {
            System.out.println(student2.name + " обладает большими магическими способностями, чем " + student1.name);
        } else {
            System.out.println("Оба студента обладают одинаковыми магическими способностями");
        }
    }
}
