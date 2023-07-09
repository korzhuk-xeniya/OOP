public class SortingHat {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 10, 10,
                6, 7, 8);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 8, 8,
                5, 5, 6);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 9, 9,
                3, 6, 5);

        Hufflepuff zahariya = new Hufflepuff("Захария", "Смит", 6, 5,
                3, 4, 5);
        Hufflepuff sedrik = new Hufflepuff("Седрик", "Диггори", 7, 3,
                6, 4, 3);
        Hufflepuff djastin = new Hufflepuff("Джастин", "Финч-Флетчли", 5, 6,
                7, 5, 3);

        Slytherin drako = new Slytherin("Драко", "Малфой", 7, 8, 7,
                6, 7, 5, 6);
        Slytherin grehem = new Slytherin("Грэхэм", "Монтегю", 6, 5, 5,
                4, 5, 4, 3);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 4, 5, 5,
                7, 6, 7, 2);

        Ravenclaw chzhou = new Ravenclaw("Чжоу", "Чанг", 4, 6,
                5, 5, 6, 3);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 2, 6,
                4, 5, 7, 2);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 7, 1,
                8, 4, 6, 7);
        System.out.println(harry);
        System.out.println(sedrik);
        System.out.println(drako);
        System.out.println(padma);
        harry.compareTo(germiona);
        drako.compareTo(gregory);
        markus.compareTo(padma);
    }


}
