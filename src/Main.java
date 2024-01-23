public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int cat = 5;
        System.out.println("Значение переменной cat c типом int равно " + cat);
        byte apple = 100;
        System.out.println("Значение переменной apple c типом byte равно " + apple);
        short weight = 5000;
        System.out.println("Значение переменной weight c типом short равно " + weight);
        long height = 20000;
        System.out.println("Значение переменной height c типом long равно " + height);
        float kg = 12.34567f;
        System.out.println("Значение переменной kg c типом float равно " + kg);
        double price = 34.5678954097;
        System.out.println("Значение переменной double c типом price равно " + price);

        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println("Задание 3");
        int ludmilaP = 23;
        int annaS = 27;
        int ekaterinaA = 30;
        int paper = 480;
        int everyStudent = paper / (ludmilaP+annaS+ekaterinaA);
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");

        System.out.println("Задание 4");
        int efficiency = 16;
        int time = 2;
        int forOne = efficiency / time;
        int twenty = 20;
        int inTwenty = forOne * twenty;
        System.out.println("За " + twenty + " минут машина произвела " + inTwenty + " штук бутылок");
        int day = 1440;
        int inDay = forOne * day;
        System.out.println("За " + day + " минут машина произвела " + inDay + " штук бутылок");
        int treeDays = day * 3;
        int inTreeDays = forOne * treeDays;
        System.out.println("За " + treeDays + " минут машина произвела " + inTreeDays + " штук бутылок");
        int month = day * 30;
        int inMonth = forOne * month;
        System.out.println("За " + month + " минут машина произвела " + inMonth + " штук бутылок");

        System.out.println("Задание 5");
        int totalCans = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int forOneClass = whitePaint + brownPaint;
        int totalClasses = totalCans / forOneClass;
        int brownForClass = totalClasses * brownPaint;
        int whiteForClass = totalClasses * whitePaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteForClass + " банок белой краски и " + brownForClass + " банок коричневой краски");

        System.out.println("Задание 6");
        int weightOfBananas = 80 * 5;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggWeight = 4 * 70;
        int totalWeight  = weightOfBananas + milkWeight + iceCreamWeight + eggWeight;
        int kilogram = totalWeight / 1000;
        System.out.println("Вес завтрака спортсмена равен " + totalWeight + " грамм или " + kilogram + " килограмм");

        System.out.println("Задание 7");
        int needToReset = 7 * 1000;
        int twoHondredAndFifty = needToReset / 250;
        int fiveHundred = needToReset / 500;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, ему понадобиться " + twoHondredAndFifty + " дней; а если он будет терять по 500 грамм в день, то сбрости 7 килограмм за " + fiveHundred + " дней");

        System.out.println("Задание 8");
        int mashaUsedTo = 67760;
        int raising = 10;
        int mashaIsNow = ((mashaUsedTo / 100) * raising) + mashaUsedTo;
        int earlierM = mashaUsedTo * 12;
        int nowM = mashaIsNow * 12;
        int differenceM = nowM - earlierM;
        System.out.println("Теперь Маша получает " + mashaIsNow + " рублей в месяц. Годовой доход вырос на " + differenceM);

        int denisUsedTo = 83690;
        int denisIsNow = ((denisUsedTo / 100) * raising) + denisUsedTo;
        int earlierD = denisUsedTo * 12;
        int nowD = denisIsNow * 12;
        int differenceD = nowD - earlierD;
        System.out.println("Теперь Денис получает " + denisIsNow + " рублей в месяц. Годовой доход вырос на " + differenceD);

        int christinaUsedTo = 76230;
        int christinaIsNow = ((christinaUsedTo / 100) * raising) + christinaUsedTo;
        int earlierC = christinaUsedTo * 12;
        int nowC = christinaIsNow * 12;
        int differenceC = nowC - earlierC;
        System.out.println("Теперь Кристина получает " + christinaIsNow + " рублей в месяц. Годовой доход вырос на " + differenceC);






    }
}