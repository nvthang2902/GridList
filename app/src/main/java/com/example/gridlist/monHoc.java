package com.example.gridlist;

public class monHoc {
    public String tenMonHoc;
    public String moTa;
    public int image;

    public monHoc(String tenMonHoc, String moTa, int image) {
        this.tenMonHoc = tenMonHoc;
        this.moTa = moTa;
        this.image = image;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getImage() {
        return image;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
