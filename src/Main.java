import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // сканер будет принимать то что написал user
        Scanner scanner = new Scanner(System.in);
        // меню блюд
        Food[] eats = new Food[4];
        eats[0] = new Food("колбаса",20);
        eats[1] = new Food("мышь",10);
        eats[2] = new Food("мясо",2);
        eats[3] = new Food("хлеб",4);

        // кошка пока голоден
        Cat cat = new Cat(0);
        // цикл вайл для повторного кормления кошки
        while (true){
            System.out.println("меню для кошек");
            for (int i = 0; i < eats.length; i++) {
                System.out.println((i+1)+" " + eats[i].nameFood);
            }
            System.out.println("выберите номер блюда");
            int vyborFood = scanner.nextInt();
            if (vyborFood == 0){
                break;
            }
            int satiet = cat.feed(eats[vyborFood-1]);
            System.out.println("кошка сьела " + eats[vyborFood-1].nameFood + " сытый на " + satiet);
        }
        scanner.close();
    }
}