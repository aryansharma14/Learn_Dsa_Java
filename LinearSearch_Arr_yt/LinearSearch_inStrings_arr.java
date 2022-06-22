package com.Aryan.LinearSearch_Arr;

public class LinearSearch_inStrings_arr {


    static boolean Searcher(String str , char ch){ // for loop

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                return true;

            }

        }
        return false;

    }
    static boolean Searcher2(String str , char ch) { // for each loop.................

        if (str.length() == 0){
            return false;

        }
        for (char x: str.toCharArray())
              {
                  if (ch == x){
                      return true;
                  }

        }
        return false;
    }


    public static void main(String[] args) {

        String  str = "ARYANSLAND";
        char target = 'W';

        boolean ans = Searcher2(str,target);
        System.out.println(ans);





    }
}
