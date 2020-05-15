import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        set.add(n);
        int sum = 0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        System.out.println("sum:"+sum);
        if(sum==1){
            return true;
        }else if(!set.contains(sum)){
            System.out.println("Now we try to judge whether the number:"+sum+"is a happy number");
            return isHappy(sum);
        }else{
            return false;
        }
    }
}