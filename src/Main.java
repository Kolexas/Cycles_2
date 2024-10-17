public class Main {
    public static void main(String[] args) {
        // Задание 1
        int savingsPerMonth = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + savingsPerMonth;
            month = month + 1;
            if (total >= 2_459_000) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
        // Задание 2
        int number = 0;
        while (number <= 9) {
            number = number + 1;
            System.out.print(" " + number);
        }
        System.out.println("");
        for (; number >= 1; number--) {
            System.out.print(" " + number);
        }
        // Задание 3
        System.out.println("");
        int population = 12_000_000;
        int year = 0;
        for (; year <= 10; year++) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            int birthRate = 17 * population / 1000;
            int mortality = 8 * population / 1000;
            population = population + birthRate - mortality;
        }
        // Задание 4
        System.out.println("");
        float depositAmount = 15000f;
        float percent = 1.07f;
        int month_2 = 0;
        do {
            depositAmount = depositAmount * percent;
            month_2 = month_2 + 1;
            System.out.println("Месяц " + month_2 + " сумма накоплений " + depositAmount);
        }
        while (depositAmount <= 12_000_000);
        // 5 Задание
        System.out.println("");
        float depositAmount1 = 15000f;
        float percent1 = 1.07f;
        int month_3 = 0;
        while (depositAmount1 <= 12_000_000) {
            depositAmount1 = depositAmount1 * percent1;
            month_3 = month_3 + 1;
            if (month_3 % 6 == 0) {
                System.out.println("Месяц " + month_3 + " сумма накоплений " + depositAmount1);
            }
        }
            // Задание 6
        System.out.println("");
        float depositAmount2 = 15000f;
        float percent2 = 1.07f;
        int month_4 = 0;
        do {
            depositAmount2 = depositAmount2 * percent2;
            month_4 = month_4 + 1;
            if (month_4 % 6 == 0) {
                System.out.println("Месяц " + month_4 + " сумма накоплений " + depositAmount2);
            }
        }
        while (month_4 <= 108);
        // Задание 7
        System.out.println("");
        int firstFriday = 4;
        for (int day=1; day <=31; day++) {
            if ((day-firstFriday)%7==0) {
                System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчёт");
            }
        }
        // Задание 8
        System.out.println("");
        year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (;yearBefore <= yearAfter; yearBefore++) {
            if (yearBefore % 79 == 0) {
                System.out.println(yearBefore);
            }
        }
    }
}