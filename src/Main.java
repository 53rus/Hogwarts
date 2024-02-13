public class Main {

    public static void main(String[] args) {
        MetodBlock metodBlock = new MetodBlock();
        Hogwarts[] hogwarts = new Hogwarts[]{
               // new Hogwarts("Гарри Потер", 79, 83),
               // new Hogwarts("Гермиона Грейрджер", 40, 40),
               // new Hogwarts("Рон Уизли", 56, 70),
               // new Hogwarts("Драко Малфой", 50, 63),
               // new Hogwarts("Грэхэм Монтегю", 65, 77),
               // new Hogwarts("Грегой Гойл", 57, 87),
               // new Hogwarts("Захари Симт", 63, 72),
               // new Hogwarts("Седрик Диггори", 61, 81),
               // new Hogwarts("Джастин Финч-Флетчли", 55, 73),
               // new Hogwarts("Чжоу Чанг", 67, 78),
               // new Hogwarts("Падма Патил", 77, 88),
               // new Hogwarts("Маркус Белби", 69, 81),
               // если делать так, то я не понимаю как достать поля которые уникальны для каждого из класса, что бы напечатать результат поиска методом metodBlock.checkHogwarts

                new Griffindor("Гарри Потер", 79, 83, 89, 73, 94),
                new Griffindor("Гермиона Грейрджер", 40, 40, 50, 56, 60),
                new Griffindor("Рон Уизли", 56, 70, 48, 52, 35),
                new Slizerin("Драко Малфой", 50, 63, 45, 36, 95, 100, 97),
                new Slizerin("Грэхэм Монтегю", 65, 77, 54, 78, 62, 47, 68),
                new Slizerin("Грегой Гойл", 57, 87, 14, 97, 23, 15, 100),
                new Puffenduy("Захари Симт", 63, 72, 58, 74, 12),
                new Puffenduy("Седрик Диггори", 61, 81, 35, 78, 44),
                new Puffenduy("Джастин Финч-Флетчли", 55, 73, 64, 84, 36),
                new Kogtevran("Чжоу Чанг", 67, 78, 26, 57, 66, 87),
                new Kogtevran("Падма Патил", 77, 88, 37, 77, 68, 18),
                new Kogtevran("Маркус Белби", 69, 81, 57, 58, 33, 49),

                // в этом случае, я не могу так же достать поля, которые уникальны для каждого из классов, что бы использовать их в методе нахождения и срвнения учеников факультета.
                // Вообще не понятно как из общего массива получить объекты определенного класса, как передать параметр в метод, по которому он будет сравнивать принадлежность объекта определенному классу.
                // с такой реализацией массива хранящего в себе все объекты классов, работают только методы   metodBlock.checkHogwarts(), metodBlock.compareStudent()
        };
        Griffindor[] griffindors = new Griffindor[]{
                new Griffindor("Гарри Потер", 79, 83, 89, 73, 94),
                new Griffindor("Гермиона Грейрджер", 40, 40, 50, 56, 60),
                new Griffindor("Рон Уизли", 56, 70, 48, 52, 35),
        };
        Puffenduy[] puffenduys = new Puffenduy[]{
                new Puffenduy("Захари Симт", 63, 72, 58, 74, 12),
                new Puffenduy("Седрик Диггори", 61, 81, 35, 78, 44),
                new Puffenduy("Джастин Финч-Флетчли", 55, 73, 64, 84, 36),
        };
        Kogtevran[] kogtevrans = new Kogtevran[]{
                new Kogtevran("Чжоу Чанг", 67, 78, 26, 57, 66, 87),
                new Kogtevran("Падма Патил", 77, 88, 37, 77, 68, 18),
                new Kogtevran("Маркус Белби", 69, 81, 57, 58, 33, 49),
        };
        Slizerin[] slizerins = new Slizerin[]{
                new Slizerin("Драко Малфой", 50, 63, 45, 36, 95, 100, 97),
                new Slizerin("Грэхэм Монтегю", 65, 77, 54, 78, 62, 47, 68),
                new Slizerin("Грегой Гойл", 57, 87, 14, 97, 23, 15, 100),
        };

        metodBlock.checkHogwarts(hogwarts,"грегой гойл");
        metodBlock.compareStudent(hogwarts,"гарри потер","грэхэм монтегю");
        metodBlock.bestGriffindor(griffindors);
        metodBlock.bestPuffenduy(puffenduys);
        metodBlock.bestKogtevran(kogtevrans);
        metodBlock.bestSlizerin(slizerins);
    }
}