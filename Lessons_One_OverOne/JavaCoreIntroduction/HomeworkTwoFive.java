package JavaCoreIntroduction;

import java.util.Scanner;

public class HomeworkTwoFive {
    public void check(){
        /*На вход подаётся 5 чисел. Первая двойка - цена килограмма картошки в рублях и копейках. Вторая двойка - имеющиеся с собой деньги. Третье число - нужное количество килограммов. Необходимо узнать, хватит ли денег на покупку.
        Пример ввода: 2 20 3 40 1.
        Вывод: хватит.
                Пример ввода: 2 0 2 4 2.
        Вывод: не хватит.*/
         int priceRubl, priceCent, moneyRubl, moneyCent, weightKg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 цифр. Первые две - стомость рубли и копейки, следующая двойка - количество денег в кошельке и 5 вес картошки в килограмах сколько нужно купить");
        priceRubl = scanner.nextInt();
        priceCent = scanner.nextInt();
        moneyRubl = scanner.nextInt();
        moneyCent = scanner.nextInt();
        weightKg = scanner.nextInt();
        int transferPriceRubl = priceRubl * 100 + priceCent;
        int transferMoneyRubl = moneyRubl * 100 + moneyCent;
        int follPriceProduct = weightKg * transferPriceRubl;
        if(follPriceProduct <= transferMoneyRubl) {
            System.out.println("Денег достаточно");
        }else
            System.out.println("Денег не хватит");

    }
}
