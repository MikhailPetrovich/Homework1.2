public class Main {
    public static void main(String[] args) {
       // Задание 1
        byte rpea = 5;
        short apple =10;
        int kiwi = 15;
        long orange =250L;
        float millet = 4.5f;
        double corn = 2.5;
        char bar = 35;
        boolean pearLarge = rpea > 10;



        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println(" Общий вес боксеров " + weightOfAllBoxers + "кг");
        System.out.println (" Разница в весе боксеров " + weightDifference + "кг");

        // Задача 3

        int bananas = 5;
        int bananaWeight = 80;
        int milk = 2;
        int milkWeight =105;
        int iceCreamIceCream = 2;
        int iceCreamIceCreamWeight = 100;
        int rawEggs = 4;
        int rawEggWeight =70;
        int totalWeight = bananas*bananaWeight+milk*milkWeight+iceCreamIceCream*iceCreamIceCreamWeight+rawEggs*rawEggWeight;
        double totalWeightInKilograms = totalWeight / 1_000D;
        System.out.println(" Общий вес в кг " + totalWeightInKilograms);

        // Задача 4

        double needToLoseWeight =7_000D;
        int minWeightLossPerDay = 250;
        int maxWeightLossPerDay = 500;
        double averageLoseWeightPerDay = minWeightLossPerDay + (maxWeightLossPerDay-minWeightLossPerDay) / 2D;
        System.out.println(" Максимум дней для похудкния " + needToLoseWeight / minWeightLossPerDay);
        System.out.println(" Минимум дней для похуденмя " + needToLoseWeight / maxWeightLossPerDay);
        System.out.println(" Средниее кол-во дней для похудения " + needToLoseWeight / averageLoseWeightPerDay);


        //Задача 5

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        double IndexingPercent = 1.1;

        double newMashaSalary = mashaSalary * IndexingPercent;
        double newDenisSalary = denisSalary * IndexingPercent;
        double newKristinaSalary = kristinaSalary * IndexingPercent;

        double mashaSalaryYearChanged = 12 *(newMashaSalary - mashaSalary );
        double denisSalaryYearChanged = 12 * (newDenisSalary - denisSalary);
        double kristinaSalaryYearChanged = 12 * (newKristinaSalary - kristinaSalary);

        System.out.println(" Маша теперь получит " + newMashaSalary + " рублей. Годовой доход вырос на "
        + mashaSalaryYearChanged + " рублей. ");
        System.out.println("Денис теперь получит " + newDenisSalary + " рублей. Годовой доход вырос на "
        + denisSalaryYearChanged + " рублей. ");
        System.out.println("Кристина теперь получит " + newKristinaSalary + " рублей Годовой доход вырас на "
        + kristinaSalaryYearChanged + " рублей. ");

















    }
}