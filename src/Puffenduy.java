public class Puffenduy extends Hogwarts{
    private int hardWork;
    private int honesty;
    private int loyalty;

    public Puffenduy(String name, int magicPower, int transgress, int hardWork, int honesty, int loyalty) {
        super(name, magicPower, transgress);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public String toString() {
        return "Студент школы магии: " + getName() + " сила магии:" + getMagicPower() + "  расстояние трансгрессии : " + getTransgress() + " Трудолюбие: " + this.hardWork + " Честность:" + this.honesty + " Верность:" + this.loyalty + " Факультет: " + getClass();
    }
}
