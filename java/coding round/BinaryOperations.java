public class BinaryOperations {

    public static int evaluateBinaryExpression(char op, int a, int b) {
        if (op == 'A') {
            return a & b;
        } else if (op == 'B') {
            return a | b;
        } else if (op == 'C') {
            return a ^ b;
        }
        return -1; // Invalid operation
    }

    public static int OperationsBinarystring(String str) {
        if (str == null) {
            return -1;
        }

        int n = str.length();
        int result = str.charAt(0) - '0'; 

        for (int i = 1; i < n; i += 2) {
            char op = str.charAt(i);
            int operand = str.charAt(i + 1) - '0';
            result = evaluateBinaryExpression(op, result, operand);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "0C1A1B1C1C1B0A0";
        int result = OperationsBinarystring(str);

        System.out.println("Output: " + result);
    }
}
