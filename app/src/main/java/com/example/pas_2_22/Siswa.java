package com.example.pas_2_22;

public class Siswa {
    private String nama;
    private String nomorAbsen;
    private int avatar;

    public Siswa(String nama, String nomorAbsen, int avatar) {
        this.nama = nama;
        this.nomorAbsen = nomorAbsen;
        this.avatar = avatar;
    }
    public String getNama() {
        return nama;
    }
    public String getNomorAbsen() {
        return nomorAbsen;
    }
    public int getAvatar() {
        return avatar;
    }
}