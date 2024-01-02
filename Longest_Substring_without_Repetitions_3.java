import java.util.HashMap;

public class Longest_Substring_without_Repetitions_3 {

//        public static int lengthOfLongestSubstring(String s) {
//
//            HashMap<Character, Integer> map = new HashMap<>();
//
//            String ans = shorten("",s, map);
//
//            ans.contains()
//
//            return ans.length();
//
//
//
//        }
//
//
//        public static String shorten(String p, String up, HashMap<Character,Integer> map){
//            if(up.length() == 0){
//                return p;
//            }
//
////            HashMap<Character, Integer> map = new HashMap<>();
//
//            char ch = up.charAt(0);
//
//            String res = "";
//
//            if(map.containsKey(ch)){
//                res += shorten(p, up.substring(1),map);
//            }else{
//                map.put(ch,1);
//                res+=shorten(p+ch, up.substring(1), map);
//            }
//
//            return res;
//        }


        public static int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int start = 0;
            int end = 0;
            int maxLength = 0;

            while (end < s.length()) {
                char ch = s.charAt(end);

                if (map.containsKey(ch) && map.get(ch)>= start) {
                    // Move start index to the right of the previous occurrence of ch
                    start = map.get(ch) + 1;
                }

                // Update the current character's last seen index
                map.put(ch, end);
                end++;

                // Update the maximum length if needed
                maxLength = Math.max(maxLength, end - start);
            }

            return maxLength;
        }


    public static void main(String[] args) {
        String s = "abba";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
