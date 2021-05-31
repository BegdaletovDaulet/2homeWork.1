package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        National national = new National("Daulet", 15, "Кыргыз", "саз");
        System.out.println(national.getInfo());
        System.out.println("______________________________");
        Student student = new Student("Azamat", 20, "Русская", "Komuz", 3, Gender.FEMALE);
        System.out.println(student.getInfo() + "(женщина)");
        student.playMusic();
    }
}
