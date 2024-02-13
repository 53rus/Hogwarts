public class Main {

    public static void main(String[] args) {
        MetodBlock metodBlock = new MetodBlock();
        Hogwarts[] hogwarts = new Hogwarts[]{
                new Griffindor("Гарри Потер", 1, 83, 111, 32, 55),
                new Griffindor("Гермиона Грейрджер", 40, 40, 50, 56, 60),
                new Griffindor("Рон Уизли", 56, 70, 41, 52, 35),
                new Slizerin("Драко Малфой", 50, 63, 45, 36, 95, 100, 97),
                new Slizerin("Грэхэм Монтегю", 79, 77, 54, 78, 62, 47, 68),
                new Slizerin("Грегой Гойл", 57, 87, 14, 97, 23, 15, 100),
                new Puffenduy("Захари Симт", 63, 72, 35, 78, 44),
                new Puffenduy("Седрик Диггори", 61, 81, 35, 78, 44),
                new Puffenduy("Джастин Финч-Флетчли", 55, 73, 64, 84, 36),
                new Kogtevran("Чжоу Чанг", 67, 78, 26, 57, 66, 87),
                new Kogtevran("Падма Патил", 77, 88, 37, 77, 68, 18),
                new Kogtevran("Маркус Белби", 69, 81, 57, 58, 33, 49),
        };

       // metodBlock.chooseStudentHogwarts(hogwarts,"грегой гойл");
       // metodBlock.compareStudentHogwarts(hogwarts,"гарри потер","грэхэм монтегю");
       // metodBlock.bestGriffindor(griffindors);
       // metodBlock.bestPuffenduy(puffenduys);
       // metodBlock.bestKogtevran(kogtevrans);
       // metodBlock.bestSlizerin(slizerins);
        // metodBlock.compareStudentGriffindore(hogwarts,"гарри потер", "Гермиона Грейрджер");
       // metodBlock.compareStudentSlizerin(hogwarts,"драко МАлфой", "грегой гойл");
        metodBlock.compareStudentKogtevran(hogwarts,"чжоу чанг","маркус белби");
       // metodBlock.compareStudentPuffenduy(hogwarts,"седрик диггори", "захари симт");
    }
}