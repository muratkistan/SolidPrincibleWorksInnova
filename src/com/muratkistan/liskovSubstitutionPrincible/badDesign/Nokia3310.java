package com.muratkistan.liskovSubstitutionPrincible.badDesign;

public class Nokia3310  extends Phone{
    @Override
    void call() {
        //call
    }

    //Goruldugu gibi 3310 ile fotograf cekmek mumkun degildir
    //Burada Liskov Substitution prensibine aykiri hareket ediyoruz
    //Cunku miras aldigimiz classtaki her ozelligi kullanamiyoruz
    //Bu sorunu goodDesign paketinde duzeltecegiz
    @Override
    void takePhoto() {
        //Can not take photo
    }
}
