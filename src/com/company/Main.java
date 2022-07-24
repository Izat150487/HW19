package com.company;

public class Main {

    public static void main(String[] args) {
	    //1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
        //2. Квартирада жашагандар ком услуга толошот
        //3. Общежитие менен гостиницада жашагандар аренда толошот
        //4. Уй-булолор бир канча адамдан турушат
        //5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
        //6. Жашоо демек озунун адресин корсотуу


        Person[] kvartira = {new Person("Jaina", 18),
                new Person("Rayana", 20),
                new Person("Usman", 30)};


        Person[] obshejitya = {new Person("Elzat", 19),
                new Person("Beka", 20),
                new Person("Aida", 20)};


        Person[] gosti = {new Person("Alim", 22),
                new Person("", 21),
                new Person("Nurzada", 20)};

        Kvartira kvartiranty = new Kvartira("Ak-Orgo 12", kvartira);
        int count = 0;
        for (Person i : kvartira) {
            System.out.println(i);
            count++;
        }
        System.out.println("Kvartirada" + " " + count + " " + " kishi jashait" + " " + kvartiranty.getAdress());
        kvartiranty.publicService();
        System.out.println("===================================================");

        Obshejitya studenty = new Obshejitya("Ahunbaeva-175", obshejitya);
        count = 0;
        for (Person o : obshejitya) {
            System.out.println(o);
            count++;
        }
        System.out.println("Obshejitiyada" + " " + count + " " + " student jashait" + " " + studenty.getAdress());
        studenty.rent();
        System.out.println("=============================================");

        Gostinisa konoktor = new Gostinisa("Sovetskaya 100", gosti);
        System.out.println("Gostnisada" + " " + konoktor.getGosti().length + " " + " konok bar" + " " + konoktor.getAdress());
        konoktor.rent();


    }
}
