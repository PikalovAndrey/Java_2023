package Laba6;

public class HexStringConverter {
    
    public static int hexStringToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null.");
        }
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = Character.digit(c, 16);
            
            if (digit == -1) {
                throw new IllegalArgumentException("Input string contains non-hexadecimal characters.");
            }
            
            result = result * 16 + digit;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Приклади використання
        try {
            System.out.println(hexStringToInt("CAFECDADA")); // Результат: 51966
            System.out.println(hexStringToInt("1A"));   // Результат: 26
            System.out.println(hexStringToInt("FF"));   // Результат: 255
            System.out.println(hexStringToInt("0"));    // Результат: 0
                           
                            //  Некоректні вхідні дані  \\
            // hexStringToInt(null);    // Викличе IllegalArgumentException
            // hexStringToInt("");      // Викличе IllegalArgumentException
            // hexStringToInt("GHIJ"); // Викличе IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
