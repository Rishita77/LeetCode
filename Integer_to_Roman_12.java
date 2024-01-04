import java.util.HashMap;

public class Integer_to_Roman_12 {



    public class Solution {


        public static String intToRoman(int num) {
            // Define arrays to store the Roman numeral symbols and their corresponding values
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    num -= values[i];
                    result.append(symbols[i]);
                }
            }

            return result.toString();
        }
    }

}
