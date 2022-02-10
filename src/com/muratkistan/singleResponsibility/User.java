package com.muratkistan.singleResponsibility;


public class User {
    //Prensibe uygun alanlar  : baslangic
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //prensibe uygun alanlar :  bitis


    //Prensibe aykiri metot
    //Bu metot baska bir classta tanimlanmali ve
    // o classtan user nesnesi olusturularak sendEmail() metotuna parametre olarak gonderilmeli.
    //Mail gondermek icin ayri bir servis yazilmali ki her ihtiyac oldugunda rahatlikla kullanilabilsin.
    public String sendEmail(){
        return "Mail gonderiliyor " + email;
    }



}
