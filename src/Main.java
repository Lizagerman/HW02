public class
Main {
    public static void main(String[] args) {
        // дз 1
        // задание 1
        System.out.println("задание 1");

        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // заданеи 2
        System.out.println("задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // задание 3
        System.out.println("задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);



        // дз 2
        // задание 4
        System.out.println("задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend /=  7;
        System.out.println(friend);

        // задание 5
        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        // дз 3
        // задание 6
        System.out.println("задание 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов "+(boxer1Weight+boxer2Weight));
        System.out.println("Разница весов двух бойцов "+(boxer2Weight-boxer1Weight));

        // задание 7
        System.out.println("задание 7");
        System.out.println("Разница весов двух бойцов (1й способ) "+(boxer2Weight-boxer1Weight));
        System.out.println("Разница весов двух бойцов (2й способ) "+(boxer2Weight%boxer1Weight));



        // задание 8
        System.out.println("задание 8 ч.1");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours/hoursPerDay;
        System.out.println("Всего работников в компании – " +totalEmployees+ " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;

        System.out.println("Если в компании работает " +totalEmployees + " человека, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");

    }

}