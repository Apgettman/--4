public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte cat = 1;
        short mouse = 3;
        int dog = 7;
        long elephant = 110L;
        double sugar = 4.5;
        float salt = 1.5f;
        boolean dogBlack = dog > 10;
        char bar = 33;
        System.out.println(dogBlack);

        // Задание 2
        byte catWhite = 67;
        short mouseGrey = 27897;
        int dogWhite = 569;
        long elephantGrey = 987678965549L;
        double sugarWhite = - 159;
        float saltRose = 2.786f;
        boolean dogJava = dogWhite > 27.12;
        char barJava = 43;
        System.out.println(barJava);

        // Задание 3
        var teacher1 = 23;
        var teacher2 = 27;
        var teacher3 = 30;
        var teacher = teacher1 + teacher2 + teacher3;
        var paper = 480 / teacher;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги!");

        // Задание 4
        var bottleMachine = 16;
        var bottleTime = 2;
        var minutes = 20;
        var bottle = 20 / 2 * 16;
        System.out.println("За " + minutes + " минут машина произвела " + bottle + " штук бутылок!");
        var dayMinutes = 14400;
        var bottleDay = dayMinutes / minutes * bottleMachine;
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок!");
        var threeDayMinutes = 43200;
        var bottleThreeDay = threeDayMinutes / minutes * bottleMachine;
        System.out.println("За 3 дня машина произвела " + bottleThreeDay + " штук бутылок!");
        var monthMinutes = 432000;
        var bottleMonth = monthMinutes / minutes * bottleMachine;
        System.out.println("За месяц машина произвела " + bottleMonth + " штук бутылок!");

        // Задание 5
        var colorWhiteBrown = 120;
        var colorWhite = 2;
        var colorBrown = 4;
        var classOne = 4 + 2;
        var classes = colorWhiteBrown / classOne;
        var classWhite = classes * colorWhite;
        var classBrown = classes * colorBrown;
        System.out.println("В школе, где " + classes + " классов, нужно " + classWhite + " банок белой краски и " + classBrown + " банок коричневой краски!");

        // Задание 6
        var bananas = 5;
        var bananasOneGram = 80;
        var bananasGram = 5 * 80;
        var milk = 200;
        var milkOneGram = 105;
        var milkGram = 105 * 2;
        var iceCream = 2;
        var iceCreamGram = 100;
        var ice = 2 * 100;
        var eggs = 4;
        var eggOneGram = 70;
        var eggGram = 4 * 70;
        System.out.println("В блендаре " + bananasGram + " грамм бананов, " + milkGram + " грамм молока, " + ice + " грамм пломбира и " + eggGram + " грамм яиц!");
        var sportBreakfast = bananasGram + milkGram + ice + eggGram;
        System.out.println("Общий вес спорт-завтрака состовляет " + sportBreakfast + " грамм!");
        float sportFast = sportBreakfast / 1000f;
        System.out.println("Общий вес в киллограмах состовляет " + sportFast + "!");

        // Задача 7
        var throwOff = 7000;
        var weightLossDay = 250;
        var loseWeightDay = 500;
        var throwOffDay = throwOff / weightLossDay;
        var throwDay = throwOff / loseWeightDay;
        System.out.println("При похудении спортцмена в день на 250 грамм, уходит " + throwOffDay + " дней!");
        System.out.println("А при похудении спортсмена в день на 500 грамм, уходит " + throwDay + " дней!");

        // Задание 8
        var mashaMonth = 67760;
        var denisMonth = 83690;
        var kristinaMonth = 76230;
        var plusCash = mashaMonth * 0.1;
        var mashaMonthCash = mashaMonth + plusCash;
        var year = plusCash * 12;
        System.out.println("Маша теперь получает " + mashaMonthCash + " рублей. Годовой доход вырос на " + year + " рублей");
        var plusCashDen = denisMonth * 0.1;
        var denisMonthCash = denisMonth + plusCashDen;
        var yearDen = plusCashDen * 12;
        System.out.println("Денис теперь получает " + denisMonthCash + " рублей. Годовой доход вырос на " + yearDen + " рублей");
        var plusCashKris = kristinaMonth * 0.1;
        var krisMonthCash = kristinaMonth + plusCashKris;
        var yearKris = plusCashKris * 12;
        System.out.println("Кристина теперь получает " + krisMonthCash + " рублей. Годовой доход вырос на " + yearKris + " рублей");

      }
    }