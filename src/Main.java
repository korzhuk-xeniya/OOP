public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер", 10, 10),
                new Hogwarts("Гермиона", "Грейнджер", 8, 8),
                new Hogwarts("Рон", "Уизли", 9, 9),
                new Hogwarts("Драко", "Малфой", 7, 8),
                new Hogwarts("Грэхэм", "Монтегю", 6, 5),
                new Hogwarts("Грегори", "Гойл", 4, 5),
                new Hogwarts("Захария", "Смит", 6, 5),
                new Hogwarts("Седрик", "Диггори", 7, 3),
                new Hogwarts("Джастин", "Финч-Флетчли", 5, 6),
                new Hogwarts("Чжоу", "Чанг", 4, 6),
                new Hogwarts("Падма", "Патил", 2, 6),
                new Hogwarts("Маркус", "Белби", 7, 1),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 10, 10, 6, 7, 8),
                new Gryffindor("Гермиона", "Грейнджер", 8, 8, 5, 5, 6),
                new Gryffindor("Рон", "Уизли", 9, 9, 3, 6, 5),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 6, 5, 3, 4, 5),
                new Hufflepuff("Седрик", "Диггори", 7, 3, 6, 4, 3),
                new Hufflepuff("Джастин", "Финч-Флетчли", 5, 6, 7, 5, 3),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 7, 8, 7, 6, 7, 5,6),
                new Slytherin("Грэхэм", "Монтегю", 6, 5, 5, 4, 5,4,3),
                new Slytherin("Грегори", "Гойл", 4, 5, 5, 7, 6,7,2),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 4, 6, 5, 5, 6, 3),
                new Ravenclaw("Падма", "Патил", 2, 6, 4, 5, 7, 2),
                new Ravenclaw("Маркус", "Белби", 7, 1, 8, 4, 6, 7),
        };
        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(slytherins);
        printService.print(ravenclaws);

    }
}