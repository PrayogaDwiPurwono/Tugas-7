package com.Tugas7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Pegawai peg1 = new PegawaiTetap("Leon",  "258812349876", 2000000);
        Pegawai peg2 = new PegawaiTetap("Aswar", "258976541298", 1250000);
        Pegawai peg3 = new PegawaiTetap("Rendy", "259678967564", 1350000);

        Pegawai peg4 = new PegawaiHarian("Raka", "258765432123", 4500, 32);
        Pegawai peg5 = new PegawaiHarian("Riko", "258976543211", 7500, 28);
        Pegawai peg6 = new PegawaiHarian("Riki", "258123456789", 8500, 31);

        Pegawai peg7 = new Sales("Ana", "258456712344", 75, 55000);
        Pegawai peg8 = new Sales("Ani", "258767563355", 55, 45000);
        Pegawai peg9 = new Sales("Una", "258123456799", 45, 35000);

        ArrayList <Pegawai> list = new ArrayList<Pegawai>();
        list.add(peg1);
        list.add(peg2);
        list.add(peg3);
        list.add(peg4);
        list.add(peg5);
        list.add(peg6);
        list.add(peg7);
        list.add(peg8);
        list.add(peg9);

        for(Pegawai i : list){
            i.toString();
        }
    }
}

//Prayoga Dwi Purwono
//215150707111021