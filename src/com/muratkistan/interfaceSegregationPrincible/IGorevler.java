package com.muratkistan.interfaceSegregationPrincible;

public interface IGorevler {
    //Gorevler isminde bir interfacimiz var ve icerisinde asagidaki metotlar bulunsun

     void mintikaTemizligi(); //Soldier a ait

     void egitimYaptir(); //Sergeant a ait

     void torendeKonusmaYap(); //Generale ait

     void sinavCek(); //Soldiera ait

    //Simdi soldier,sergeant ve general siniflarimiza bu interface i implement ettigimizi dusunelim.
    //Soldierin sadece mintikatemizligi ve sinav cekmesi lazim ancak egitimYaptir ve torendeKonusmaYap metotlarina da sahip oldu
    //Ya da Generalin mintikaTemizligi metotu oldu. Bunun olmasi mumkun mu
    //Dolayisiyla classlarimiza gereksiz metot eklememeliyiz. Bu metotlari ayri ayri interfaceler olusturup oralarda tanimlamaliyiz



}
