
package QLMONAN;

/**
 *
 * @author admini
 */
public class NguyenLieu {
    private String name;
    private int soLuong;
    private float giaTien;

    public NguyenLieu() {
    }

    public NguyenLieu(String name, int soLuong, float giaTien) {
        this.name = name;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "NguyenLieu{" + "name=" + name + ", soLuong=" + soLuong + ", giaTien=" + giaTien + '}';
    }
    
}
