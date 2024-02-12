public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public String toString() {
        return "Студент школы магии: " + getName() + " сила магии:" + getMagicPower() + "  расстояние трансгрессии: " + getTransgress() +  " Хитрость:" + this.cunning + " Решительность:" + this.determination + " Амбициозность:" + this.ambition + " Находчивость:" + this.resourcefulness + " Жажда Власти:" +this.lustForPower + " Факультет: " + getClass();
    }
}
