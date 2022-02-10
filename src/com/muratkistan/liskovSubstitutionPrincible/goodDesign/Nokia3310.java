package com.muratkistan.liskovSubstitutionPrincible.goodDesign;

public class Nokia3310 extends Phone{

    //Goruldugu uzere takePhoto metotunu baska bir interface e koyduk
    //Artik Nokia3310 sinifi miras aldigi sinifin butun ozelliklerini kullanabiliyor
    //Kullanamadigi bit metot yok

    @Override
    void call() {
        //call
    }
}
