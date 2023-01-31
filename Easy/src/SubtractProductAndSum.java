
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    private static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n /= 10;
        }
        return product - sum;
    }
}
