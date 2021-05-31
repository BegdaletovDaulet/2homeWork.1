package com.company;

public class National extends Person {
    private String instruments;
    private String national;

    public National(String name, int age, String national, String instruments) {
        super(name, age);
        this.national = national;
        this.instruments = instruments;
    }

    public String getInstruments() {
        return instruments;
    }

    public String getNational() {
        return national;
    }

    public void playMusic(National national, String instruments) {
        System.out.println("играть на гитаре");
    }

    public final void playMusic() {
        System.out.println("играть на комузе");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " national='" + national + '\'' + "instruments='" + instruments + '\'';
    }
}
