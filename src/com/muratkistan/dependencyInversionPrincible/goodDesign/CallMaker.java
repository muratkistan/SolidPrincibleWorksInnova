package com.muratkistan.dependencyInversionPrincible.goodDesign;

import java.util.List;

public class CallMaker {

    //Goruldugu uzere artik VideoCall ve VoiceCall siniflarina dogrudan bagli degiliz
    //Arade ICaller isimli bir interface ile bagliyiz. Bunu abstract class ile de yapabilirdik.
    //Artik ICaller interfaceinin implement eden herhangi bir sinifi burada kullanabilecegiz.

    private List<ICaller> callerList ;

    public CallMaker(List<ICaller> callerList) {
        this.callerList = callerList;
    }

    public void makeCall(){
        for (ICaller caller : callerList) {
            caller.makeCall();
        }
    }
}
