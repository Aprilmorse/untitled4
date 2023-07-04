public class Main {
    public static void main(String[] args) {
        int amount = 1001;
        int mount = 100;
        int x;


        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
            x = amount + mount + bonus;
        } else {
            bonus = 0;
            x = amount + mount;
        }
        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговая сумма: " + x);

    }
}