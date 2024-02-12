public  class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public  Griffindor(String name, int magicPower, int transgress, int nobility, int honor, int bravery) {
        super(name, magicPower, transgress);
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

    public String toString() {
        return "Студент школы магии: " + getName() + " сила магии:" + getMagicPower() + "  расстояние трансгрессии: " + getTransgress() + " Благородство: " + this.nobility + " Честь:" + this.honor + "  Храбрость:" + this.bravery + " Факультет: " + getClass();
    }

}
