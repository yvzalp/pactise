package day02;

public class MethodCreation {


        //main method icinde kullanacaginiz hersey "static" olmalidir.
        public static void main(String[] args) {


           // System.out.println(toplamaYap(1.2, 5));
            //System.out.println(ucSayiyiCarp(2, 1.5, 6));

           // System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));

            //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
            //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==> Satirbasi yapar      ii)System.out.print() ==> Satirbasi yapmaz



            System.out.println(cikarmaYap(5,25));

            carpmaYap(5,10);


            System.out.println(  bölmeYap(100,25));

            toplamaYap(1.2, 5);


        }

    public static void toplamaYap(double v, int i) {

        System.out.println(v+i);
    }


    public static int bölmeYap(int a,int b) {

        return (a/b);
    }


    public static void carpmaYap(int a,int b) {

        System.out.println(a*b);

    }



    public static int cikarmaYap(int a, int b) {

            return a-b;

    }

















/*
    //Example 1: Toplama islemi yapan bir method olusturunuz
        public static double toplamaYap(double a, double b){
            return a+b;
        }
        //Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
        public static double ucSayiyiCarp(double a, double b, double c){
            return a*b*c;
        }
        //Example 3: Us sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdiriniz
        public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
            return (a+b) * c;
        }

 */

}
