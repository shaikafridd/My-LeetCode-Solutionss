class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() == t.length()){

            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result = Arrays.equals(str1, str2); 

            if(result){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}