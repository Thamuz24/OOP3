package com.example.lab1;

import java.sql.PreparedStatement;

public class StringFilter {
    public static void main(String[] args) {
        String text = "config129flrotzlagidczs";

        System.out.println(filter(text));
    }

    public static String filter(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            String character = text.substring(i, i + 1);
            result += checkNumberAndVowel(character);
        }
        return result;
    }

    public static String checkNumberAndVowel(String character) {
        String result = character;
        String[] wrongCharacter = {"u","e","o","a","i","0","1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < wrongCharacter.length; i++) {
            if (character.equals(wrongCharacter[i])) {
                result = "";
                break;
            }
        }
        return result;
    }
}

