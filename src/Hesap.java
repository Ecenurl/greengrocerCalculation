import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {

        double armut=2.14,Elma=3.67,Domates = 1.11,Muz= 0.95,Patlıcan = 5.00 ,kga ,tutar,kge,kgd,kgm,kgp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Armut Kac Kilo ?" + "");
        kga=sc.nextDouble();
        armut=2.14 * kga;
        System.out.print("Elma Kac Kilo ?" +" ");
        kge=sc.nextDouble();
        Elma=3.67 * kge;
        System.out.print("Domates Kac Kilo ?"+" ");
        kgd=sc.nextDouble();
        Domates=1.11 * kgd;
        System.out.print("Muz Kac Kilo ?"+" ");
        kgm=sc.nextDouble();
        Muz = 0.95 * kgm;
        System.out.print("Patlican Kac Kilo ?"+" ");
        kgp=sc.nextDouble();
        Patlıcan=5.00 * kgp;

        tutar=armut+Elma+Domates+Muz+Patlıcan;
        System.out.print("Tutar: " +" "+ tutar);





    }
}
