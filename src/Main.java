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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10.0;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTotal =(weightSecondBoxer + weightSecondBoxer);
        System.out.println("Общий вес бойцов равен " + weightTotal + " кг!");
        var difference =(weightSecondBoxer - weightFirstBoxer);
        System.out.println("Разница в весе бойцов равна " + difference + " кг!");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var difference1 =(weightSecondBoxer - weightFirstBoxer);
        System.out.println("Разница в весе бойцов путём вычитания равна " + difference1 + " кг!");
        var difference2 =(weightSecondBoxer % weightFirstBoxer);
        System.out.println("Разница в весе бойцов путём вычичисления остатка от деления равна " + difference2 + " кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var oneEmployee = 8;
        var totalEmployees =(totalHours / oneEmployee);
        System.out.println("Всего работников в компании: " + totalEmployees + " человек");
        var moreEmployees =(totalEmployees + 94);
        var hoursForMoreEmployees =(totalHours / moreEmployees);
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + hoursForMoreEmployees + " часа работы может быть поделено между сотрудниками ");
    }
}