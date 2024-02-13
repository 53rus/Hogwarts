public class MetodBlock {


    public void checkHogwarts (Hogwarts[] hogwarts,String name) {
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name)) {
                System.out.println(hogwarts[i]);
            }
        }
    }

    public void compareStudent(Hogwarts[] hogwarts, String name, String name1) {
        Hogwarts maxPower = hogwarts[0];
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name)) {
                maxPower = hogwarts[i];
            }
            if (hogwarts[i].getName().equalsIgnoreCase(name1)) {
                if (maxPower.getMagicPower() < hogwarts[i].getMagicPower()) {
                    System.out.println("Студент: " + hogwarts[i].getName() + " обладает больщей силой магии, чем студент: " + maxPower.getName() + " " + hogwarts[i].getMagicPower() + " против " + maxPower.getMagicPower());
                } else {
                    System.out.println("Студент: " + maxPower.getName() + " обладает больщей силой магии, чем студент: " + hogwarts[i].getName() + " " + maxPower.getMagicPower() + " против " + hogwarts[i].getMagicPower());
                }
            }
        }
    }

    public  void bestGriffindor (Griffindor[] griffindors) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            sum1 = griffindor.getBravery() + griffindor.getHonor() + griffindor.getNobility();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(griffindors[number].getName() + " Лучший в Гриффиндоре");
    }
    public  void bestPuffenduy(Puffenduy[] puffenduys) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy puffenduy = puffenduys[i];
            sum1 = puffenduy.getHardWork() + puffenduy.getHonesty() + puffenduy.getLoyalty();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(puffenduys[number].getName() + " Лучший в Пуффендуе ");
    }
    public  void bestKogtevran(Kogtevran[] kogtevrans) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            sum1 = kogtevran.getCreativity() + kogtevran.getWit() + kogtevran.getWisdom() + kogtevran.getMind();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(kogtevrans[number].getName() + " Лучший в Когтевранце ");
    }
    public  void bestSlizerin(Slizerin[] slizerins) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            sum1 = slizerin.getCunning() + slizerin.getDetermination() + slizerin.getAmbition() + slizerin.getResourcefulness() + slizerin.getLustForPower();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(slizerins[number].getName() + " Лучший в Слизерин ");
    }

}
