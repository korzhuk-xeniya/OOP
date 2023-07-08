public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
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
}
