public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgress;

    public Hogwarts(String name, int magicPower, int transgress) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
   public String toString() {
        return "Студент школы магии: " + this.name + " с силой магии:" + this.magicPower + "  расстояние трансгрессии:" + this.transgress ;
   }
}
