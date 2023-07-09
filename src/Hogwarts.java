public abstract class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance;
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


