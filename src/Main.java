public class Main {
    public static void main(String[] args) {
        //task1
        int total = 0;
        int money = 15000;
        int monthCount = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + money;
            monthCount = monthCount + 1;
            System.out.println("Месяц " + monthCount + " сумма накоплений равна " + total);
        }

        //task2
        int num = 1;
        while (num <= 10) {
            System.out.print(" " + num + " ");
            num++;
        }
        System.out.println(" ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }

        //task3
        int Y = 12_000_000;
        int diffY = Y/1000;
        int born = 17;
        int dead = 8;
        for (int year = 0; year <= 10; year++) {
            Y = Y + (diffY * (born - dead));
            System.out.println("год " + year + " численность населения составляет " + Y);
        }

        //task4
        int total2 = 0;
        int salary2 = 15000;
        int month2 = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + salary2;
            month2 = month2 + 1;
            System.out.println("Месяц " + month2 + " сумма накоплений равна " + total2);
        }

        //task5
        int total3 = 0;
        int salary3 = 15000;
        int month3 = 0;
        while (total3 <= 12_000_000) {
            total3 = total3 + total3 * 7 / 100;
            total3 = total3 + salary3;
            month3 = month3 + 1;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + total3);
            }
        }

        //task6
        int total4 = 0;
        int salary4 = 15000;
        int month4 = 0;
        int totalMonth = 9 * 12;
        while (month4 <= totalMonth) {
            total4 = total4 + total4 * 7 / 100;
            total4 = total4 + salary4;
            month4 = month4 + 1;
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + " сумма накоплений равна " + total4);
            }
        }

        //task7

        int daysInWeek = 7;
        int daysInMonth = 31;
        int fridayDate = 1;
        for (int i = fridayDate; i <= daysInMonth; i = i + daysInWeek) {
            System.out.println("Сегодня пятница, " + i + "-e число. Необходимо подготовить отчет.");
        }

        //task8
        int startYear = 2024 - 200;
        int finishYear = 2024 + 100;
        for (int i = 0; i <= finishYear; i = i + 79) {
            if (i >= startYear) {
                System.out.println(i);
            }
        }
    }
}