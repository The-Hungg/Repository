import java.util.HashMap;
import java.util.Map;

public class StringProcessor {

    // Chuyển đổi chuỗi sang chữ hoa
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Chuyển đổi chuỗi sang chữ thường
    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    // Đảo ngược trạng thái chữ
    public static String reverseCase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }

    // Tìm kiếm chuỗi con trong chuỗi
    public static boolean containsSubstring(String input, String substring) {
        return input.contains(substring);
    }

    // Trích xuất chuỗi con từ chuỗi
    public static String extractSubstring(String input, int start, int end) {
        return input.substring(start, end);
    }

    // Thay thế chuỗi con trong chuỗi
    public static String replaceSubstring(String input, String target, String replacement) {
        return input.replace(target, replacement);
    }

    // Kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Đếm số từ trong chuỗi
    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }

    // Đếm tần suất xuất hiện của mỗi ký tự trong chuỗi
    public static void characterFrequency(String input) {
        char[] characters = input.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : characters) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
  
  public static void main(String[] args) {
        //
    }
}
