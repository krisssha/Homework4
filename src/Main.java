public class  Main {
    public static void main(String[] args) {
        int a = 18;
        if (a >= 18) {
            System.out.println("Поздравляю, вам есть 18!");
        }
        if (a < 18) {
            System.out.println("Возраст совершенолетия еще не наступил, нужно подождать!");
        }
        System.out.println();
        int years = 40;
        if (years >= 7 && years < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (years >= 18 && years < 24) {
            System.out.println("Закончили школу, можно отправляться в университет!");
        }
        if (years >= 24) {
            System.out.println("Закончили университет, нужно отправляться на работу!");
        }
        System.out.println();

        int capacity = 102;
        int seatPlace = 60;
        int standing = capacity - seatPlace;
        int place = 88;
        if (place <= 102) {
            System.out.println("Вам хватает места!");
        }
          else {
            System.out.println("Вагон переполнен!");
        }
          if (place <= 60){
              System.out.println("У вас сидячее место!");
          }
          else {
              System.out.println("У вас стоячее место!");
          }
    }


}

