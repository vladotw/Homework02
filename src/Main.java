public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("Task1");
        System.out.println();

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

    }

    public static void task2() {

        System.out.println("Task2");
        System.out.println();

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("new dog = " + dog);
        System.out.println("new cat = " + cat);
        System.out.println("new paper = " + paper);
        System.out.println();

    }

    public static void task3() {

        System.out.println("Task3");
        System.out.println();

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("new dog = " + dog);
        System.out.println("new cat = " + cat);
        System.out.println("new paper = " + paper);
        System.out.println();

    }

    public static void task4() {

        System.out.println("Task4");
        System.out.println();

        var friend = 19;

        System.out.println("friend = " + friend);

        friend = friend + 2;

        System.out.println("friend = " + friend);

        friend = friend / 7;

        System.out.println("friend = " + friend);
        System.out.println();
    }

    public static void task5() {

        System.out.println("Task5");
        System.out.println();

        var frog = 3.5;

        System.out.println("frog = " + frog);

        frog = 3.5 * 10;

        System.out.println("frog = " + frog);

        frog = frog / 3.5;

        System.out.println("frog = " + frog);

        frog = frog +4;

        System.out.println("frog = " + frog);
        System.out.println();
    }

    public static void task6() {

        System.out.println("Task6");
        System.out.println();

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;

        System.out.println("Общий вес бойцов " + totalBoxersWeight + " кг.");

        var weightDifference = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Разница между весами бойцов = " + weightDifference + "кг.");
        System.out.println();

    }

    public static void task7() {

        System.out.println("Task7");
        System.out.println();

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов = " + weightDifference1 + "кг.");

        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами бойцов = " + weightDifference2 + "кг.");
        System.out.println();
    }

    public static void task8() {

        System.out.println("Task8");
        System.out.println();

        var totalTime = 640;
        var oneEmloyeeTime = 8;
        var totalStaffNumber = totalTime / oneEmloyeeTime;

        System.out.println("Всего работников в компании - " + totalStaffNumber + " человек");

        totalStaffNumber = totalStaffNumber + 94;
        totalTime = oneEmloyeeTime * totalStaffNumber;
        System.out.println("Если в компании работает " + totalStaffNumber + " человек, то всего "
                            + totalTime + " часов работы может быть поделено между сотрудниками");



    }
}