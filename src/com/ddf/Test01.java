package com.ddf;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        String s1 = "I am a student! What about you?";
        String[] list = s1.split(" ");
        System.out.println(list);

        String result = "";
        for (int i = list.length - 1; i >= 0; i--) {
            String word = list[i];
            if (isEndWithPunctuation(word)) {
                result += word.substring(word.length() - 1);
                result += word.substring(0, word.length() - 1)+" ";
            } else {
                result += word+" ";
            }
        }
        System.out.println(result);
    }

    private static boolean isEndWithPunctuation(String s) {
        char endChar = s.charAt(s.length() - 1);
        if (endChar >= 'a' && endChar <= 'z')
            return false;
        if (endChar >= 'A' && endChar <= 'Z')
            return false;
        return true;
    }
}
