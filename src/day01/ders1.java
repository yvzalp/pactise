package day01;

public class ders1 {


    public int a =25;



    public static void main(String[] args) {


         int sayi =25;

        //Variable nasil olusturulur?

        //1)Access Modifier   2)Data Type     3)Variable ismi     4) =       5)Deger    6);

        // Java'da ";" Ingilizce'deki "." gibidir
        // Ingiliozce'de "cumle" deriz, Java'da "statement" deriz

        // "=" sembolu "Assignment(Atama) Operator" olarak adlandirilir
        // "Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar

         int a = 13;
         int height = 183;
         String b="dfghjklyguhjk fghjk fghjklö";

        //Java'da Data Type'lari
    /*
                                        Primitive Data Types
        1)int: Integer'in kisaltmasi. Integer tamsayi demektir. 32 bit kullanir.
               Matematik'de tamsayilarin basi ve sonu yoktur fakat Java'da tamsayilarin basi ve sonu vardir.
               En kucuk int = -2,147,483,648
               En buyuk int =  2,147,483,647

        2)byte: Tamsayilar icin kullanilir. 8 bit kullanir.
                En kucuk byte = -128
                En buyuk byte = 127

       3)short: Tamsayilar icin. 16 bit kullanir.
                En kucuk short = -32768
                En buyuk short = 32767

       4)long: Tamsayilar icindir. 64 bit kullanir.
               En kucuk long = -9,223,372,036,854,755,808
               En buyuk long =  9,223,372,036,854,755,807

      5)float: Ondalikli sayilar icindir. 32 bit kullanir
               "float" virgulden sonra 7 basamak icerebilir
               "float" degerlerinde sona "f" veya "F" koymaniz gerekir



      6)double: Ondalikli sayilar icindir. 64 bit kullanir.
                "double" virgulden sonra 16 basamak icerebilir

      7)boolean: "true" veya "false" degerleri icin kullanilir. 1 bit kullanir.



      8)char: Tek karakterler icin kullanilir. 16 bit kullanir
              A, c, 2, ?, _, =
              Note: "char" lara deger verirken, degeri tek tirnak arasina koyunuz. Yoksa hata verir.

              Note: Java buyuk ve kucuk harflere duyarlidir.
                    Java icin TRUE ile true tamamen farklidir



     Note: Numeric Data Types: byte < short < int < long < float < double
           Numeric Olmayan Data Types: boolean - char

                                            Non-Primitive Data Types
      String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir.
              String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

              Primitive ile Non-Primitive lerin farki nedir?
     */
         byte price = 12;
         short populationOfVillage = 23000;
         float priceOfShirt = 13.99F;
         double weightOfCell = 0.000012045;

        //Siz "long" demenize ragmen Java verilen sayiyi "int" kabul eder
        //Bu yuzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz
         long populationOfWorld = 7000000000L;

        //Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
         long x = 1234;

         boolean isOld = true;
         boolean isRich = false;

         char initial = 'S';

         String name = "Tom Hanks";

        //Note: "main method" arabanin motoru gibidir.
        //      "main method" calismadan hicbirsey calismaz


        }




}
