package com.muratkistan.openClosedPrincible;

import java.util.ArrayList;
import java.util.List;

public class TestArea {

    public static void main(String[] args) {

        //Circle ve Rectangle classlari shape sinifini extends ettigi icin shape yerine kullanilabilirler.
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(5,12);

        //Classlarimizi Shape turunde veri tutan bir lsiteye ekledik
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        //Circle ve Rectangle classlarimiz ayni zamanda shape olduklari icin calculateArea metoduna gonderdik
        // ve if yapilariyla ugrasmadan alanlari hesaplandi
        calculateArea(shapes);

    }

    //bu hesaplama metodunda sekillerimizin alanlarini parametrede shape listesi gonderekek hesapladik.
    //Open closed Prensibine uygun hale getirmezsek asagidaki gibi kodlari gorecektik
    // dolayisiyla yapacagimiz en ufak bi gelistirme de bile butun kodumuz bozulacakti

//    public void calculateArea(String name){
//        if(name.equals("circle")){
//            //Circle alan hesapla metodu
//        }else if(name.equals("rectangle")){
//            //rectangle alan hesaplama metodu..
//        }
//
//        //Kodlarimizda surekli if statement controlu yapmak durumunda kalacaktik.
//
//
//    }


    public static void calculateArea(List<Shape> shapes){
        for(Shape shape : shapes){
            System.out.println( shape.area());
        }
    }
}
