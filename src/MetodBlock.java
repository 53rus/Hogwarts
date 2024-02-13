import java.util.Arrays;

public class MetodBlock {


    public void chooseStudentHogwarts(Hogwarts[] hogwarts, String name) {
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name)) {
                System.out.println(hogwarts[i]);
            }
        }
    }

    public void compareStudentHogwarts(Hogwarts[] hogwarts, String name, String name1) {
        Hogwarts maxPower = hogwarts[0];
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name)) {
                maxPower = hogwarts[i];
            }
            if (hogwarts[i].getName().equalsIgnoreCase(name1)) {
                if (maxPower.getMagicPower() < hogwarts[i].getMagicPower()) {
                    System.out.println("Студент: " + hogwarts[i].getName() + " обладает больщей силой магии, чем студент: " + maxPower.getName() + " " + hogwarts[i].getMagicPower() + " против " + maxPower.getMagicPower());
                } else if (maxPower.getMagicPower() == hogwarts[i].getMagicPower()) {
                    System.out.println("Cтуденты " + hogwarts[i].getName() + " и " + maxPower.getName() + " обладают одинаковой силой магии " + hogwarts[i].getMagicPower() + " против " + maxPower.getMagicPower());
                } else {
                    System.out.println("Студент: " + maxPower.getName() + " обладает больщей силой магии, чем студент: " + hogwarts[i].getName() + " " + maxPower.getMagicPower() + " против " + hogwarts[i].getMagicPower());
                }
            }
        }
    }


    public void compareStudentGriffindore(Hogwarts[] hogwarts, String name, String name1) {
        int sum = 0;
        int summ = 0;
        Hogwarts griff = null;
        Hogwarts griff2 = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name) && hogwarts[i] instanceof Griffindor) {
                Griffindor student = ((Griffindor) hogwarts[i]);
                griff = student;
                sum = student.getBravery() + student.getNobility() + student.getHonor();
            }

            if (hogwarts[i].getName().equalsIgnoreCase(name1) && hogwarts[i] instanceof Griffindor) {
                Griffindor student = ((Griffindor) hogwarts[i]);
                griff2 = student;
                summ = student.getBravery() + student.getNobility() + student.getHonor();
            }
        }

        if (sum < summ) {
                System.out.println("Студент: " + griff2.getName() + " обладает большим количеством баллов, чем студент : " + griff.getName() + " " + summ + " против " + sum + ". Факультет Гриффиндор");
            } else if (sum == summ) {
                System.out.println("Студенты: " + griff.getName() + " и " + griff2.getName() + " обладают одинаковым колличеством баллов " + sum + " и " + summ + " соответственно. Факультет Гриффиндор");
            } else {
                System.out.println("Студент: " + griff.getName() + " обладает большим количеством баллов, чем студент : " + griff2.getName() + " " + sum + " против " + summ + ". Факультет Гриффиндор");
        }
    }

    public void compareStudentPuffenduy(Hogwarts[] hogwarts, String name, String name1) {
        int sum = 0;
        int summ = 0;
        Hogwarts puff = null;
        Hogwarts puff2 = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name) && hogwarts[i] instanceof Puffenduy) {
                Puffenduy student = ((Puffenduy) hogwarts[i]);
                puff = student;
                sum = student.getHardWork() + student.getHonesty() + student.getLoyalty();
            }

            if (hogwarts[i].getName().equalsIgnoreCase(name1) && hogwarts[i] instanceof Puffenduy) {
                Puffenduy student = ((Puffenduy) hogwarts[i]);
                puff2 = student;
                summ = student.getHardWork() + student.getHonesty() + student.getLoyalty();
            }
        }

        if (sum < summ) {
            System.out.println("Студент: " + puff2.getName() + " обладает большим количеством баллов, чем студент : " + puff.getName() + " " + summ + " против " + sum  + ". Факультет Пуффендуй");
        } else if (sum == summ) {
            System.out.println("Студенты: " + puff.getName() + " и " + puff2.getName() + " обладают одинаковым колличеством баллов " + sum + " и " + summ + " соответственно. Факультет Пуффендуй");
        } else {
            System.out.println("Студент: " + puff.getName() + " обладает большим количеством баллов, чем студент : " + puff2.getName() + " " + sum + " против " + summ + ". Факультет Пуффендуй");
        }
    }

    public void compareStudentSlizerin(Hogwarts[] hogwarts, String name, String name1) {
        int sum = 0;
        int summ = 0;
        Hogwarts sliz = null;
        Hogwarts sliz2 = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name) && hogwarts[i] instanceof Slizerin) {
                Slizerin student = ((Slizerin) hogwarts[i]);
                sliz = student;
                sum = student.getAmbition() + student.getCunning() + student.getDetermination() + student.getLustForPower() + student.getResourcefulness();
            }

            if (hogwarts[i].getName().equalsIgnoreCase(name1) && hogwarts[i] instanceof Slizerin) {
                Slizerin student = ((Slizerin) hogwarts[i]);
                sliz2 = student;
                summ = student.getAmbition() + student.getCunning() + student.getDetermination() + student.getLustForPower() + student.getResourcefulness();
            }
        }

        if (sum < summ) {
            System.out.println("Студент: " + sliz2.getName() + " обладает большим количеством баллов, чем студент : " + sliz.getName() + " " + summ + " против " + sum  + ". Факультет Слизерин");
        } else if (sum == summ) {
            System.out.println("Студенты: " + sliz.getName() + " и " + sliz2.getName() + " обладают одинаковым колличеством баллов " + sum + " и " + summ + " соответственно. Факультет Слизерин");
        } else {
            System.out.println("Студент: " + sliz.getName() + " обладает большим количеством баллов, чем студент : " + sliz2.getName() + " " + sum + " против " + summ + ". Факультет Слизерин");
        }
    }

    public void compareStudentKogtevran(Hogwarts[] hogwarts, String name, String name1) {
        int sum = 0;
        int summ = 0;
        Hogwarts kogt = null;
        Hogwarts kogt2 = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName().equalsIgnoreCase(name) && hogwarts[i] instanceof Kogtevran) {
                Kogtevran student = ((Kogtevran) hogwarts[i]);
                kogt = student;
                sum = student.getCreativity() + student.getMind() + student.getWit() + student.getWisdom();
            }

            if (hogwarts[i].getName().equalsIgnoreCase(name1) && hogwarts[i] instanceof Kogtevran) {
                Kogtevran student = ((Kogtevran) hogwarts[i]);
                kogt2 = student;
                summ = student.getCreativity() + student.getMind() + student.getWit() + student.getWisdom();
            }
        }

        if (sum < summ) {
            System.out.println("Студент: " + kogt2.getName() + " обладает большим количеством баллов, чем студент : " + kogt.getName() + " " + summ + " против " + sum  + ". Факультет Когтевран");
        } else if (sum == summ) {
            System.out.println("Студенты: " + kogt.getName() + " и " + kogt2.getName() + " обладают одинаковым колличеством баллов " + sum + " и " + summ + " соответственно. Факультет Когтевран");
        } else {
            System.out.println("Студент: " + kogt.getName() + " обладает большим количеством баллов, чем студент : " + kogt2.getName() + " " + sum + " против " + summ + ". Факультет Когтевран");
        }
    }







}
