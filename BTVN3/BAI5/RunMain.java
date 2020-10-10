package BAI5;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Guns a = new Guns();
        Guns b = new Guns();
        a.setWeaponName("DSR-Precision DSR 50");
        b.setWeaponName("Thompson M1921");
        a.setAmmoNumber(100);
        b.setAmmoNumber(100);
        Random rd = new Random();
        do {
           int x = rd.nextInt(20) + 1;
           a.Shoot(x);
           x = rd.nextInt(20) + 1;
           b.Shoot(x);
           if(a.getAmmoNumber() == 0 && b.getAmmoNumber() == 0){
               System.out.println("the first gun is equal to the second gun");
           }
           else if(a.getAmmoNumber() == 0){
               System.out.println("the first gun has no more ammo");
               System.out.println("the second gun is winner");
           }
           else if(b.getAmmoNumber() == 0){
               System.out.println("the second gun has no more ammo");
               System.out.println("the first gun is winner");
           }

        }while (a.getAmmoNumber() != 0 && b.getAmmoNumber() !=0);
    }
}
