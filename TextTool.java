/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.texttool;

public class TextTool {
    public static void main(String[] args) {
        System.out.println("Welcome to TextTool!");
        System.out.println("Use this tool to count characters in a text.");
        
        String sample = "Hello from TextTool";
        System.out.println("Sample text: " + sample);
        System.out.println("Character count: " + countCharacters(sample));
    }

    public static int countCharacters(String text) {
        return text.length();
    }
}
