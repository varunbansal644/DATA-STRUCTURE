import java.util.*;
public class Solution{
    public int solve(int A){
        int ans=0;
        int x=1;
        while(A>0)
        {
            x=x*5;
            if(A%2==1)
            {
                ans+=x;
            }
            A=A/2;
        }
        return ans;
    }
}
class Magic{
    public static void main(String args[]){
        Solution obj=new Solution();
        int new1=obj.solve(10);
        System.out.println(new1);
    }
}