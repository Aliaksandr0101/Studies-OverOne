import java.util.Scanner;

public class HomeworkTwoFive {
    public void scheck(){
         /*На вход подается 5 чисел. Первая двойка цена за киллограм картошки (рубли и копейки), вторая двойка - количесвто у нас денег,
                и пятая цифра количество в килограммах сколько нам нужно купить. Узнать хватит ли денег для покупки.*/
         int priceRubl, priceCent, moneyRubl, moneyCent, weightKg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 цифр. Первые две - стомость рубли и копейки, следующая двойка - количество денег в кошельке и 5 вес картошки в килограмах сколько нужно купить");
        priceRubl = scanner.nextInt();
        priceCent = scanner.nextInt();
        moneyRubl = scanner.nextInt();
        moneyCent = scanner.nextInt();
        weightKg = scanner.nextInt();

    }
}
