package com.attacomsian.thymeleaf.layouts;

public class ModelOfUser {
    private String vorname;
    private String name;
    private String alter;
    private String fleisch;
    private boolean Zwibel;
    private boolean tomato;
    private boolean salad;

    public String getFleisch() {
        return fleisch;
    }

    public void setFleisch(String fleisch) {
        this.fleisch = fleisch;
    }


    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) { this.vorname = vorname; }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public boolean isZwibel() {
        return Zwibel;
    }

    public void setZwibel(boolean zwibel) {
        this.Zwibel = zwibel;
    }

    public boolean isSalad() {
        return salad;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

}
