import java.util.Scanner;


public class ticket {
    public static void main(String[] args) {

        int KM, age, select;

        Scanner input = new Scanner(System.in);

        System.out.print("KM Giriniz :");
        KM = input.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        age = input.nextInt();

        System.out.println("Yolculuk Tipi :\n1-Tek Yön\n2-Gidiş-Dönüş");
        System.out.print("Yolculuk Tipini Seçniz :");
        select = input.nextInt();

        double perKM = 0.10, total, saleTicket;

        if (select == 1 || select == 2) {
            if (KM > 0 && age > 0) {
                if (select == 1) {
                    total=KM*perKM;
                    if (age < 12) {
                        saleTicket = total / 2;
                        System.out.println(saleTicket);
                    } else if (age >= 12 && age <= 24) {
                        saleTicket = total - (total * 0.10);
                        System.out.print(saleTicket);
                    } else if (age > 65) {
                        saleTicket = total - (total * 0.30);
                        System.out.print(saleTicket);
                    } else {
                        System.out.println(total);
                    }

                }if (select == 2) {
                    if (age < 12) {
                        total = KM * perKM * 2;
                        saleTicket = (total - (total * 0.2)) / 2;
                        System.out.print(saleTicket);
                    } else if (age >= 12 && age <= 24) {
                        total = KM * perKM * 2;
                        saleTicket = (total - (total * 0.10)) - ((total - (total * 0.10)) * 0.20);
                        System.out.print(saleTicket);
                    }else if (age > 65) {
                        total = KM * perKM * 2;
                        saleTicket = (total - (total * 0.30)) - ((total - (total * 0.30)) * 0.20);
                        System.out.print(saleTicket);
                    }

                }
            } else {
                System.out.print("Hatalı Değer Girdiniz!");
            }
        } else {
            System.out.print("Hatalı Değer Girdiniz!");
        }
    }


}



