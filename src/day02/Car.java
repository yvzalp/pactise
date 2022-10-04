package day02;

public class Car {

    public String marka = "Honda";
    public int fiyat  =20000;

        /*
               Note: Class ==> Variable ==> Object ==> Kullanacagiz
                               Method
        */




    public static void main(String[] args) {

        //Object nasil olusturulur?
        //1)Class ismini yaziniz     2)Objeye bir isim veriniz     3) =        4)new keyword'unu kullan        5)Class ismi parantezle beraber(Constructor)
        Car renault = new Car();


        System.out.println(renault.fiyat);//20000
        System.out.println(renault.marka);//Honda


        renault.hareketEt();
        renault.dur();


        //MethodCreation class'indan object olusturduk
        MethodCreation obj = new MethodCreation();
        obj.toplamaYap(3, 5);
        
        
        renault.toplaGel();

    }

    public  void toplaGel(){

    }



    private void dur() {

        System.out.println("honda firenleri saglamdir");
    }

    private  void hareketEt() {
        System.out.println(" honda güzel hareket eder");
    }


}
