/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.texttool;

public class TextTool {
    public static void main(String[] args) {
        System.out.println("Welcome to the Text Utility Tool!");
        System.out.println("Use this tool for simple text operations.");
        
        String sample = "Hello from TextTool";
        System.out.println("Sample text: " + sample);
        System.out.println("Character count: " + countCharacters(sample));
        System.out.println("Reversed: " + reverseText(sample));
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
