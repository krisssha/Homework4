package task4_8;

public class Task4_8 {
    public static void main(String[] args){


    int years = 28;
    if (years >= 2 && years <=6 ) {
        System.out.println("Тебе нужно ходить в детский сад!");
    }
    if (years >= 7 && years <= 18) {
        System.out.println("Тебе нужно ходить в школу!");
    }
    if (years >= 18 && years <= 24) {
        System.out.println("Тебе нужно ходить в университет!");
    }
    else  {
        System.out.println("Тебе нужно ходитьна работу!");
    }

        System.out.println();

    int yearsChild = 9;

    if (yearsChild < 5 ) {
        System.out.println("Ребенок не может кататься на аттракционе!");
    }
    if (yearsChild >= 5 && yearsChild < 14) {
        System.out.println("Кататься на аттракционе можно только в споровождении взрослых!");
    }
    else {
        System.out.println("Можно кататься без сопровождения взрослых!");
    }

    int one = 1;
    int two = 2;
    int free = 3;

    if (one > two && one > free) {
        System.out.println("Наибольшее число : " + one);
    }
    if ( two > one && two > free) {
        System.out.println("Наибольшее число : " + two);
    }
    else {
        System.out.println("Наибольшее число : " + free);
    }
}
}