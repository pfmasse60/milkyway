package com.petemasse.java;

public class Main {
    private String menu;

    public Main() {
        menu = "Main Menu";
    }

    public static void main(String[] args) {
        Main myMain = new Main();
        System.out.println(myMain.menu);

        myMain.menu = "Hello World";
        System.out.println(myMain.menu);
    }


}

