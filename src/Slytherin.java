public class Slytherin extends Hogwarts {
    private int trickery;
    private int determination;
    private int ambitiousness;
    private int inventiveness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int trickery, int determination, int ambitiousness, int inventiveness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.trickery = trickery;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", хитрость: %s, решительность: %s, амбициозность: %s, находчивость: %s, жажда власти: %s", trickery, determination, ambitiousness, inventiveness, lustForPower);
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int totalRate1 = student1.trickery + student1.determination + student1.ambitiousness + student1.inventiveness + student1.lustForPower;
        int totalRate2 = student2.trickery + student2.determination + student2.ambitiousness + student2.inventiveness + student2.lustForPower;
        if (totalRate1 > totalRate2) {
            System.out.println(student1.getName() + " лучший слизеринец, чем  " + student2.getName());
        } else if (totalRate2 > totalRate1) {
            System.out.println(student2.getName() + " лучший слизеринец, чем  " + student1.getName());
        } else {
            System.out.println("Оба студента Слизерина обладают одинаковыми показателями");
        }
    }
}
