// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 1000;
        System.out.println("Начальная сумма на счету клиента:" + account);
        int addition = 1200;
        System.out.println("Пополнение:" + addition);
        int bonus = addition > 1000 ? addition / 100 : 0;
        System.out.println("Бонусные рубли:" + bonus);
        int balance = account + bonus + addition;
        System.out.println("Итоговая сумма на счету клиента: " + balance);

    }
}