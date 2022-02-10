package com.muratkistan.liskovSubstitutionPrincible.badDesign;

public class IphoneX extends Phone{

    //bu classta iskov Substitution prensibine aykiri bir durum yok ancak
    //Phone classinda iphone icin uygun olmayan bir metot olsaydi o zaman prensibi yine ihlal etmis olacaktik

    //Bu metotlar iphone icin uygun metotlar.
    @Override
    void call() {
        //call
    }

    @Override
    void takePhoto() {
        //take photo
    }
}
