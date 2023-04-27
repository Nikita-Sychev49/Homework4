public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        boolean ageOverEight = age >= 18;
        boolean ageLessEight = age < 18;
        if (ageOverEight) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (ageLessEight) {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 10;
        boolean coldWeather = temperature < 5;
        boolean hotWeather = temperature > 5;
        if (coldWeather) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (hotWeather) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        boolean speedExceeded = speed > 60;
        boolean speedNormal = speed < 60;
        if (speedExceeded) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        if (speedNormal) {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 70;
        boolean ageGoToSleep = age < 2;
        boolean ageGoToKindergarten = age >= 2 && age <= 6;
        boolean ageGoToSchool = age >= 7 && age <= 18;
        boolean ageGoToUniversity = age > 18 && age < 24;
        boolean ageGoToWork = age > 24 && age < 60;
        boolean ageGoToRelax = age > 60;
        if (ageGoToSleep) {
            System.out.println("Если возраст человека равен " + age + " то, ему пора спать");
        } else if (ageGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в детский сад");
        } else if (ageGoToSchool) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в школу");
        } else if (ageGoToUniversity) {
            System.out.println("Если возраст человека равен " + age + " ,то его место в университете");
        } else if (ageGoToWork) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора ходить на работу");
        } else if (ageGoToRelax) {
            System.out.println("Если возраст человека равен " + age + " ,то он может отдохнуть");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 5;
        boolean notAttractions = age < 5;
        boolean canWithAdult = age >= 5 && age <= 14;
        if (notAttractions) {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему нельзя кататься на аттракционе");
        } else if (canWithAdult) {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatsCount = 60;
        int standCount = 42;

        int seatsUsed = 50;
        int standUsed = 36;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standUsed < standCount) {
            System.out.println("Есть еще " + (standCount - standUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 10;
        int three = 1;

        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }
        else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }
        else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}
