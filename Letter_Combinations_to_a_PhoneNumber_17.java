import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_to_a_PhoneNumber_17 {

        public List<String> letterCombinations(String digits) {

            if(digits.isEmpty()){
                return new ArrayList<>();
            }
            return PhonePad("", digits);
        }

        public List<String> PhonePad(String p, String up) {
            if (up.isEmpty()) {
                List<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }

            int digit = up.charAt(0) - '0';
            List<String> list = new ArrayList<>();

            if(digit == 7){
                for (int i = (digit - 2) * 3; i <= 3 * (digit - 1); i++) {
                    char ch = (char) ('a' + i);
                    list.addAll(PhonePad(p + ch, up.substring(1)));
                }

            }else if(digit == 8){
                for (int i = (digit - 2) * 3; i < 3 * (digit - 1); i++) {
                    char ch = (char) ('a' + i+1);
                    list.addAll(PhonePad(p + ch, up.substring(1)));
                }

            }else if(digit ==9){

                for (int i = (digit - 2) * 3; i <= 3 * (digit - 1); i++) {
                    char ch = (char) ('a' + i+1);
                    list.addAll(PhonePad(p + ch, up.substring(1)));
                }

            }else{

                for (int i = (digit - 2) * 3; i < 3 * (digit - 1); i++) {
                    char ch = (char) ('a' + i);
                    list.addAll(PhonePad(p + ch, up.substring(1)));
                }
            }

            return list;
        }
    }
