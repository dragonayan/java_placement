public class Binray_to_Decimal {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int num1 = 0, num2 = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) {
                num1 = a.charAt(i--) - '0';
            } else {
                num1 = 0;
            }
            if (j >= 0) {
                num2 = b.charAt(j--) - '0';
            } else {
                num2 = 0;
            }

            int sum = num1 + num2 + carry;
            ans.insert(0, sum % 2);
            carry = sum / 2;
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String sum = addBinary(a, b);
        System.out.println(sum); // Output: "100"

        a = "100";
        b = "110";
        sum = addBinary(a, b);
        System.out.println(sum); // Output: "10101"
    }
}
