import java.util.*;

 class Hi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        String result = isPermutationSubstring(s, t);
        System.out.println(result);
    }

    public static String isPermutationSubstring(String s, String t) {
        List<String> permutations = generatePermutations(s);

        for (String perm : permutations) {
            if (!perm.contains(t)) {
                return "Yes";
            }
        }

        return "No";
    }

    public static List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        generatePermutationsHelper(s.toCharArray(), 0, result);
        return result;
    }

    public static void generatePermutationsHelper(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutationsHelper(chars, index + 1, result);
            swap(chars, index, i);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
