public class Xor1 {
    public static int operation(char op, int a, int b) {
        if (op == 'A')
            return a & b;
        else if (op == 'B')
            return a | b;
        else if (op == 'C')
            return a ^ b;

        return -1;
    }

    public static int Opearations1(String str) {
        if (str == null) {
            return -1;
        }

        int n = str.length();
        int result = str.charAt(0) - '0';

        for (int i = 1; i < n; i += 2) {
            char op = str.charAt(i);
            int operand = str.charAt(i + 1) - '0';
            result = operation(op, result, operand);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int ans = Opearations1(str);

        System.out.println(ans);
    }

}
