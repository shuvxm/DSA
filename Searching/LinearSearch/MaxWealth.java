/*
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        // person -> row
        // account -> col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person, check with overall ans
            if (sum > ans)
                ans = sum;
        }
        // for (int[] account : accounts) {
        // // when you start a new col, take a new sum for that row
        // int sum = 0;
        // for (int element : account) {
        // sum += element;
        // }
        // if (sum > ans)
        // ans = sum;
        // }
        return ans;
    }

}
