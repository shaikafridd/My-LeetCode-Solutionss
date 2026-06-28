class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count the occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character to the write pointer
            chars[write++] = currentChar;
            
            // If the character repeated, convert count to string and write digits
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        // The write pointer now represents the new length of the compressed array
        return write;
    }
}