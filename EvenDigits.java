
package  com.saurabh;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class EvenDigits {
    public static void main(String args[]) {
        int nums = [12,345,2,6,7896];
        System.out.println(findNumbers(nums));
    }
        static int findNumbers ( int[] nums){
            int count = 0;
            for (int num : nums) {
                if (even(num)) {
                    count++;
                }
            }
            return count;

        }
        // function to check eve or not
        static boolean even ( int num){
            int numberOfDigits = Digits(num);
            return numberOfDigits % 2 == 0;
        }
        // count number of digits
        static int Digits ( int num)
        {
            if (num < 0) {
                num = num * -1;
            }
            if (num == 0) {
                return 1;
            }
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10;
            }
            return count;
        }

    }
