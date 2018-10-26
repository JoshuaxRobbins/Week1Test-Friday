package com.example.josh.week1test_friday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {

        String test = "Errors in strategy cannot be correct through tactical maneuvers";
        String test2 = "Hello there! Apple!";
         System.out.print(g(test2).toString());
    }


    public static char charEncode(char input){
        if(input >= 65 && input <= 90){
            return (char)('Z' - (input - 'A'));
        }
        else if(input >= 97 && input <= 122){
            return (char)('z' - (input - 'a'));
        }
        else{
            return input;
        }
    }

    public static String f(String input){

        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length;i++){
            charArray[i] = charEncode(charArray[i]);
        }


        return String.valueOf(charArray);
    }


    public static HashMap<Character,Integer> g(String input){
        HashMap<Character,Integer> output = new HashMap<Character, Integer>();
        input = input.toLowerCase();
        for(int i = 97;i <= 122;i++){
            output.put((char)i,0);
        }

        for(int i = 0;i < input.length();i++){
            char temp = input.charAt(i);
            if(temp < 97 || temp > 122) continue;
            output.put(temp,output.get(temp) + 1);
        }


        return output;

    }

}
