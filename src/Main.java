// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     int x = 1000;
     System.out.println("Начальная сумма на счету клиента:" + x);
     int y = 1200;
        System.out.println("Пополнение:" + y);
int z = y>1000 ? y/100 : 0;
        System.out.println("Бонусные рубли:" + z);
        int s = x + z + y;
        System.out.println("Итоговая сумма на счету клиента: " + s);

    }
}