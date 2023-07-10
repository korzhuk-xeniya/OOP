public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
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
        return "Gryffindor{"
                + super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    private void printComparableStudent(Gryffindor bestStudent, Gryffindor worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучше Гриффиндорец, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    public void compareTo(Gryffindor other) {
        int countThis = this.nobility + this.honor + this.bravery;
        int countOther = other.nobility + other.honor + other.bravery;
        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }
}

