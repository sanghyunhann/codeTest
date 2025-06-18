package programmers.lv1;

public class MakePrime {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int n) {
        if (n<2) {
            return false;
        } else {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n%i==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
