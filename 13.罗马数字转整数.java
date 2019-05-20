// import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        // ========== 方法一 ==========
        // Map<Character, Integer> map = new HashMap<>();
        // map.put('M', 1000);
        // map.put('D', 500);
        // map.put('C', 100);
        // map.put('L', 50);
        // map.put('X', 10);
        // map.put('V', 5);
        // map.put('I', 1);

        // char currentRoman;
        // char nextRoman;
        // int prevNum = map.get(s.charAt(0));
        // int nextNum = 0;
        // int currentNum = 0;
        // int total = prevNum;

        // for (int i = 1; i < s.length(); i++) {
        //     currentRoman = s.charAt(i);
        //     currentNum = map.get(currentRoman);
        //     if (i <= s.length() - 2) {
        //         nextRoman = s.charAt(i + 1);
        //         nextNum = map.get(nextRoman);
        //     }
        //     if (s.length() == 2) {
        //         if (currentNum > prevNum) {
        //             total = currentNum - total;
        //         } else {
        //             total = currentNum + total;
        //         }
        //     } else {
        //         if (currentNum > prevNum) {
        //             if (i == 1){
        //                 total = currentNum - total;
        //             } else {
        //                 total = total + currentNum;
        //             }
                    
        //         } else {

        //             if (currentNum <= prevNum && currentNum >= nextNum){
        //                 total = total + currentNum;
        //             } else {
        //                 total = total - currentNum;
        //             }

        //         }
        //         prevNum = currentNum;
        //     }
        // }
        // return total;

        // ========== 方法二 ==========
        int total = 0;
        for (int i = 0; i < s.length() ; i++) {
            
            if (i < s.length() - 1 && map(s.charAt(i)) < map(s.charAt(i+1))){
                total = total + map(s.charAt(i+1)) - map(s.charAt(i));
                i++;
            } else {
                total = total + map(s.charAt(i));
            }
        }
        return total;
    }

    public int map(char a) {
        switch(a){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
