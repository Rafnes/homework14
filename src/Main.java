public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 94, 90, 89, 91, 99);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 90, 99, 80, 85, 99);
        Gryffindor ron = new Gryffindor("Рон Уизли", 68, 61, 86, 91, 50);

        Slytherin draco = new Slytherin("Драко Малфой", 90, 99, 98, 90, 89, 71, 99);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 80, 70, 69, 51, 81, 40, 84);
        Slytherin gregory = new Slytherin("Грегори Гойл", 81, 71, 81, 59, 100, 70, 64);

        Hufflepuff zachary = new Hufflepuff("Захария Смит", 61, 44, 49, 80, 90);
        Hufflepuff sedrick = new Hufflepuff("Седрик Диггори", 66, 44, 40, 90, 99);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 80, 77, 49, 63, 77);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 77, 44, 65, 80, 74, 88);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 47, 24, 15, 60, 71, 99);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 59, 20, 35, 10, 4, 8);

        Hogwarts.printStudent(padma);
        Hogwarts.printStudent(ron);
        Hogwarts.compareStudents(padma, ron);
        Gryffindor.compareStudents(harry, hermione);
        Hufflepuff.compareStudents(sedrick, justin);
        Ravenclaw.compareStudents(zhou, marcus);
        Slytherin.compareStudents(draco, gregory);
    }
}