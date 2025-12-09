import java.util.*;

public class Solution{
    public static int robs(ArrayList<Integer> nums){
        if(nums ==null || nums.isEmpty()){
            return 0;
        }
        int p1=0;
        int p2=0;
        for(int num:nums){
            int maxLoot=Math.max(p2+num,p1);
            p2=p1;
            p1=maxLoot;
        }
        return p1;
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        if(kb.hasNextLine()){
            String line =kb.nextLine();
            Scanner lineScanner=new Scanner(line);
            ArrayList<Integer> houses=new ArrayList<Integer>();
            while(lineScanner.hasNextInt()){
                houses.add(lineScanner.nextInt());
            }
            lineScanner.close();
            System.out.println(robs(houses));
        }
        kb.close();
    }
}