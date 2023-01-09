package org.example;

import java.util.HashMap;
import java.util.Map;

class BalancedWordCounter {

    public Integer count (String input) {
        Integer counter = 0;
        if(input == null) throw new RuntimeException("input is null");
        if(!checkIfLettersOnly(input)) throw new RuntimeException("Use letters only!");
        for (int i=0; i<input.length(); i++){
            for(int j=i+1; j<=input.length();j++){
                String subword = input.substring(i,j);
                System.out.println(subword);
                if(checkIfBalanced(subword)) counter++;
            }
        }
        return counter;
    }

    private boolean checkIfLettersOnly (String input){
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }

    public boolean checkIfBalanced (String word) {
        Map<Character,Integer> occurenceMap = new HashMap<>();
        for(int i=0; i<word.length();i++){
            if(occurenceMap.containsKey(word.charAt(i)))
                occurenceMap.put(word.charAt(i), occurenceMap.get(word.charAt(i))+1);
            else
                occurenceMap.put(word.charAt(i),1);
        }
        System.out.println(occurenceMap);
        if(occurenceMap.values().stream().distinct().count() <= 1){
            System.out.println("balanced");
            return true;
        } else {
            System.out.println("not balanced");
            return false;
        }
    }
}
