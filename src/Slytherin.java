public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    private void printComparableStudent(Slytherin bestStudent, Slytherin worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучше Слизеринец, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    public void compareTo(Slytherin other) {
        int countThis = this.trick + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int countOther = other.trick + other.determination + other.ambition + other.resourcefulness + other.lustForPower;
        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
}
