package com.nahida.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk = "hMLGBuSBnCNMdaSBfshiCNMoMLGBdSBjioTMD,hSBoMLGBdfCNMisohidTMD";
        String[] arr = { "TMD", "CNM", "SB", "MLGB" };
        for (String s : arr) {
            talk = talk.replace(s, "***");
        }
        System.out.println(talk);
    }
}
