public class Longest_Common_Prefix_14 {

    public String longestCommonPrefix(String[] strs) {

        int size = strs.length;

        if(size == 0) {
            return "";
        }
        if(size == 1) {
            return strs[0];
        }
        String f = strs[0];

        String prefix = f;

        for(int i = 1; i<strs.length; i++){

            prefix = comp(prefix, strs[i]);


        }

        return prefix;
    }

    public String comp(String f , String s){

        int min = Math.min(f.length(), s.length());

        String p = "";

        for(int i = 0; i<min; i++){
            if(f.charAt(i) == s.charAt(i)){
                p += f.charAt(i);
            }else{
                return p;
            }

        }
        return p;

    }
}
}
