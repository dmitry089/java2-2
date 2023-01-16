public class Main {
    public static void main(String[] args) {
        int cost = 100;
        int depositAmount = 1530;
        int bonusCalculation = depositAmount / 100;

        if (bonusCalculation < 1000) {
            System.out.println("Итоговый счет:" + (cost + depositAmount + bonusCalculation));
            System.out.println("Количество бонусов:" + bonusCalculation);
        } else {
            System.out.println("Итоговый счет:" + (cost + depositAmount));
        }
    }
}