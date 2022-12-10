import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");
        int age = 16;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то человек несовершеннолетний.");
        }
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то вы совершеннолетний.");
        }

        // Задача №2
        System.out.println("Задача №2");
        int temperature = 10; // задаем температуру
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

        // Задача №3
        System.out.println("Задача №3");
        int speed = 90; // задаем скорость
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }

        // Задача №4
        System.out.println("Задача №4");
        int ageNew = 25; // задаем возраст человека
        if (ageNew > 2 && ageNew <= 6) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в детский сад.");
        } else {
            if (ageNew >= 7 && ageNew < 18) {
                System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в школу.");
            } else {
                if (ageNew >= 18 && ageNew < 24) {
                    System.out.println("Если возраст человека равен " + ageNew + ", то ему место в университете.");
                } else {
                    if (ageNew >= 24) {
                        System.out.println("Если возраст человека равен " + ageNew + ", то ему пора работать.");
                    }
                    // Задача №4
                    System.out.println("Задача №5");
                    int ageChild = 15; // задаем возраст ребенка
                    if (ageChild < 5) {
                        System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
                    } else {
                        if (ageChild >= 5 && ageChild < 14) {
                            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
                        } else {
                            if (ageChild >= 14) {
                                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");
                            }
                        }
                        // Задача №6
                        System.out.println("Задача №6");
                        int totalSeatsInWagon = 102; // всего мест
                        int seats = 60; // сидячие места
                        int standing = totalSeatsInWagon - seats; // стоячие места
                        int seatsBusy = 60; // занято сидячих мест
                        int standingBusy = 35; // занято стоячих мест
                        if (seatsBusy < seats) {
                            System.out.println("Еще свободно " + (seats - seatsBusy) + " сидячих мест.");
                        } else {
                            System.out.println("Свободных сидячих мест нет.");
                        }
                        if (standingBusy < standing) {
                            System.out.println("Еще свободно " + (standing - standingBusy) + " стоячих мест.");
                        } else {
                            System.out.println("Свободных стоячих мест нет.");
                        }
                    }
                        // Задача №7
                        System.out.println("Задача №7");
                         int one = 16;
                         int two = 120;
                         int three = 13;
                         if (one > two && one > three) {
                             System.out.println("Максимальное число - " + one);
                         } else if (two > one && two > three) {
                             System.out.println("Максимальное число - " + two);
                         } else if (three > one && three > two) {
                             System.out.println("Максимальное число - " + three);
                         } else if (one == two && one > three) {
                             System.out.println("Максимальные числа - " + one + " и " + two);
                         } else if (one == three  && one > two) {
                             System.out.println("Максимальные числа - " + one + " и " + three);
                         } else if (two == three  && two > one) {
                             System.out.println("Максимальные числа - " + two + " и " + three);
                         } else {
                             System.out.println("Все числа равны");
                         }
                        }
                    }
                }
            }
        }




