package com.administratie;

public class Main {

    public static void main(String[] args) {
	// write your code here



        User u = FileTextService.getInstance().readUserFromFile(
                "/Users/clyde/IdeaProjects/Laborator-07/files2/user.csv")  ;

        System.out.println(u);
    }
}
