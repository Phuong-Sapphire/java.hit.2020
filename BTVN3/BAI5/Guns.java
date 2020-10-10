package BAI5;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public int Load(int x){
        return ammoNumber+=x;
    }
    public void Shoot(int x){
        if(ammoNumber - x >= 0){
            ammoNumber-=x;
        }
        else {
            ammoNumber =0;
        }

        if(ammoNumber ==0){
            System.out.println("END");
        }
    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public Guns() {
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
