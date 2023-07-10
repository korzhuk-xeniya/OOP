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

    private void printComparableMagic(Hogwarts bestStudent, Hogwarts worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " обладает бОльшей мощностью магии, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    private void printComparableDistance(Hogwarts bestStudent, Hogwarts worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " можен трансгрессировать на бОльшее расстояние, чем "
                + worseStudent.getName() + " " + worseStudent.getSurname());
    }

    public void compareTo(Hogwarts other) {
        if (this.powerOfMagic > other.powerOfMagic) {
            printComparableMagic(this, other);
        } else if (this.powerOfMagic < other.powerOfMagic) {
            printComparableMagic(other, this);
        } else {
            System.out.println("Студенты одинаково сильны в магии");
        }
        if (this.transgressionDistance > other.transgressionDistance) {
            printComparableDistance(this, other);
        } else if (this.transgressionDistance < other.transgressionDistance) {
            printComparableDistance(other, this);
        } else {
            System.out.println("Студенты могут перемещаться одинаково далеко");
        }
    }
}


