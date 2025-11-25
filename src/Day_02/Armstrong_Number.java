package Day_02;

//An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

//        Input: n = 153
//        Output: true
//        Explanation: Number of digits : 3.
//                13 + 53 + 33 = 1 + 125 + 27 = 153.

public class Armstrong_Number {

    public static boolean isArmstrong(int n){
        int temp = n;
        int digits = 0;
        while (temp != 0){           // Count the digits
            temp = temp / 10;
            digits++;
        }

        int temp1 = n;
        int sum = 0;
        while (temp1 != 0){        // extract each digit and raise by digits
            int last = temp1 % 10;
            temp1 = temp1 / 10;
            sum = (int) (sum + Math.pow(last,digits));
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 371;
        boolean result = isArmstrong(n);
        System.out.println(result);

    }
}
