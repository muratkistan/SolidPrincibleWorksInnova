package com.muratkistan.dependencyInversionPrincible.badDezign;

public class CallMaker {

    // Burada goruldugu uzere CallMaker sinifimiz VideoCall ve  VoiceCall siniflarina bagimli hale geldi
    //Cunku dogrudan bagli olarak tanimladik.
    // Bu Dependency Inversion Prensibine aykiri bir durumdur. Bu sorunu goodDesign paketinde duzenleyecegiz
    public VideoCall videoCall = new VideoCall();
    public VoiceCall voiceCall = new VoiceCall();

    public void callNow(){
        videoCall.call();
        voiceCall.call();
    }

}
