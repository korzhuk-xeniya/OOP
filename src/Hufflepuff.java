public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honest) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honest=" + honest +
                '}';
    }

    private void printComparableStudent(Hufflepuff bestStudent, Hufflepuff worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучше Пуффендуец, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    public void compareTo(Hufflepuff other) {
        int countThis = this.industriousness + this.loyalty + this.honest;
        int countOther = other.industriousness + other.loyalty + other.honest;
        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
}
