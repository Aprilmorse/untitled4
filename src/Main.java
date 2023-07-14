public class Main {
    public static void main(String[] args) {
        int amount = 1001;
        int mount = 100; //объявление переменных
        int bonus;
        int result; //объявление переменной

        if (amount > 1000) {
            bonus = amount / 100;
            result = amount + mount + bonus;
        } else {
            bonus = 0;
            result = amount + mount;
        }
        System.out.println("Количество бонусов: "+bonus);
        System.out.println("Итоговая сумма: "+result);

    }
}