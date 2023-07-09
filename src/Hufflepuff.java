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

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
