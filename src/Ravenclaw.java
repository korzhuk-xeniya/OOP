public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int smart, int wise, int wit, int creativity) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                "smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    private void printComparableStudent(Ravenclaw bestStudent, Ravenclaw worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучше Когтевранец, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    public void compareTo(Ravenclaw other) {
        int countThis = this.smart + this.wise + this.wit + this.creativity;
        int countOther = other.smart + other.wise + other.wit + other.creativity;
        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
}
