package com.muratkistan.liskovSubstitutionPrincible.goodDesign;

public class IphoneX extends  Phone implements ITakePhoto {

    //Bu classta da bir sorun yok cunku miras aldigi classlarin butun ozelliklerini kullanabiliyor
    //Ancak Phone classinda iphone icin uygun olmayan bir metot olsaydi o zaman prensibi yine ihlal etmis olacaktik

    @Override
    public void takePhoto() {//from ItakePhoto Interface
        //take photo
    }

    @Override
    void call() { // from Phone abstract class
        // call
    }
}
