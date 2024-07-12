public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativeness;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wittiness, int creativeness) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativeness = creativeness;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativeness() {
        return creativeness;
    }

    public void setCreativeness(int creativeness) {
        this.creativeness = creativeness;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", ум: %s, мудрость: %s, остроумие: %s, креативность: %s", intelligence, wisdom, wittiness, creativeness);
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int totalRate1 = student1.intelligence + student1.wisdom + student1.wittiness + student1.creativeness;
        int totalRate2 = student2.intelligence + student2.wisdom + student2.wittiness + student2.creativeness;
        if (totalRate1 > totalRate2) {
            System.out.println(student1.getName() + " лучший когтевранец, чем " + student2.getName());
        } else if (totalRate2 > totalRate1) {
            System.out.println(student2.getName() + " лучший когтевранец, чем  " + student1.getName());
        } else {
            System.out.println("Оба студента Когтеврана обладают одинаковыми показателями");
        }
    }
}
