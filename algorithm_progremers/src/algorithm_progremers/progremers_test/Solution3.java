package algorithm_progremers.progremers_test;

import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        Solution3 solution3 = new Solution3();
        solution3.solution(enroll, referral, seller, amount);
    }
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, Integer> enrolls = new HashMap<>();
        HashMap<String, String> referrals = new HashMap<>();
        HashMap<String, Integer> sellers = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            enrolls.put(enroll[i], 0);
            referrals.put(enroll[i], referral[i]);
        }
        for (int i = 0; i < seller.length; i++) {
            sellers.put(seller[i], amount[i]);
        }

        for (int i = 0; i < enroll.length; i++) {
            int price = sellers.getOrDefault(enroll[i], 0) * 100;
            answer[i] = price - price/10;
            String refer = referrals.get(enroll[i]);
            while (!refer.equals("-")) {
                String tmp = referrals.get(refer);

                    price = price / 10;

                enrolls.put(refer,enrolls.get(refer)+price - price/10);
                refer = referrals.get(refer);
            }
        }
        for (int i = 0; i < enroll.length; i++) {
            answer[i] += enrolls.get(enroll[i]);
        }




        return answer;
    }
}
