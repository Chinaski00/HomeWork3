public class Main {
    public static void main(String[] args) {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        float e = 1.2F;
        double f = 2.4;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача2
        double dub = 27.12;
        long integer1 = 987_678_965_549L;
        double dub2 = 2.786;
        boolean aus = false;
        short eee = 569;
        short ee1 = -159;
        long long1 = 27897;
        byte klein = 69;

        //Задача 3
        int studentA = 23;
        int studentB = 27;
        int studentC = 30;
        int Paper = 480;
        int allPapers = Paper / (studentA + studentB + studentC);
        System.out.println("На каждого ученика рассчитано " + allPapers + " листов бумаги.");

        //Задача 4
        int bottle = 16;
        byte time = 2;
        int bottlesMint = bottle / time;
        byte time1 = 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesMint * time + " штук.");

        int cytki = 24;
        int minytCytki = 24 * 60; //1440 минут
        System.out.println("За сутки машина произвела бутылок " + bottlesMint * minytCytki + " штук.");

        int zaTriDnya = minytCytki * 3; //4320 минут за 3 дня
        int trete = minytCytki * 3;
        System.out.println("За три дня машина произвела бутылок " + bottlesMint * trete + " штук.");

        int mecyac = 30; //дней/суток в месяце
        int minytMecyac = minytCytki * 30; // минут в 30ти сутках
        int chetvertoe = 10 * trete;
        System.out.println("За 1 месяц машина произвела бутылок " + bottlesMint * chetvertoe + " штук.");

        //Задача 5
        int allBanok = 120;
        int whiteBank = 2;
        int brownBank = 4;
        int oneClass = whiteBank + brownBank; //банок на один класс = 6
        int allClass = allBanok / oneClass; //всего классов 20
        int allWhiteBankClass = allClass * whiteBank; //40 банок белой краски
        int allBrownBankClass = allClass * brownBank; //80 банок коричневой краски
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteBankClass + " банок белой краски и " + allBrownBankClass + " банок коричневой краски.");

        //Задача 6
        int banana = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;
        int bananaGramm = banana * 80; //грамм в 5ти бананах
        int milkGramm = milk * 105; // грамм в двухста мл. молока
        int iceCreamGramm = 2 * 100; // грамм в двух брикетов мороженного
        int eggGramm = 4 * 70; // грамм в 4ёх яйцах

        float allGramms = bananaGramm + milkGramm + iceCreamGramm + eggGramm; //всего грамм
        System.out.println("Вес завтрака составляет " + (allGramms / 1000) + " кг.");

        //Задача 7
        int sportsGramm = 7;//7кг необходимо скинуть
        int kgGramm = 7 * 1000;//грамм необходимо скинуть 7000
        int periGramm = kgGramm / 250;//28 дней
        int vtoroiGramm = kgGramm / 500;//14 дней
        int sredneeZnachenieDney = (periGramm + vtoroiGramm) / 2;
        System.out.println(periGramm + " уйдёт дней для похудения по 250 грамм.");
        System.out.println(vtoroiGramm + " уйдёт дней для похудения по 500 грамм.");
        System.out.println(sredneeZnachenieDney + " уйдёт дней в среднем для похудения.");

        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int yearMasha = 67760 * 12;//зп за год маши
        int yearDenis = 83690 * 12;//зп за год дениса
        int yearKristina = 76230 * 12;//зп за год кристины

        int procMasha = masha * 10 / 100; //10% от зп
        int procDenis = denis * 10 / 100; //10% от зп
        int procKristina = kristina * 10 / 100; //10% от зп

        int plusMasha = masha + procMasha; // зп в месяц с прибавкой для маши
        int plusDenis = denis + procMasha;// зп в месяц с прибавкой для дениса
        int plusKristina = kristina + procMasha;// зп в месяц с прибавкой для кристины

        int newYearMasha = plusMasha * 12;//за за год с повышением для маши
        int newYearDenis = plusDenis * 12;//за за год с повышением для дениса
        int newYearKristina = plusKristina * 12;//за за год с повышением для кристины

        int raznicaMasha = newYearMasha - yearMasha;//между годовым доходом до и после повышения
        int raznicaDenis = newYearDenis - yearDenis;//между годовым доходом до и после повышения
        int raznicaKristina = newYearKristina - yearKristina;//между годовым доходом до и после повышения

        System.out.println("Маша теперь получает " + plusMasha + " рублей. Годовой доход вырос на " + raznicaMasha + " рублей.");
        System.out.println("Денис теперь получает " + plusDenis + " рублей. Годовой доход вырос на " + raznicaDenis + " рублей.");
        System.out.println("Кристина теперь получает " + plusKristina + " рублей. Годовой доход вырос на " + raznicaKristina + " рублей.");


    }
}
