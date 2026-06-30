import java.util.ArrayList;
import java.util.List;

public class solution{
    
    public ArrayList<Integer> topTenNotifications(int[] nums){
       ArrayList<Integer> result = new ArrayList<>();
      backtrack(result,nums,new ArrayList<>(),0);
      return result; 
        
    }
    public void backtrack(ArrayList<Integer> result,int[] nums,List<Integer> tempList,int start){
        if(tempList.size() == 10){
            result.add(tempList);
        }
        else{
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);

             backtrack(result,nums,tempList,i++);
        }
      }
    }  

    public static void main(String[] args){
      int[] nums = {1,2,3,4,5,6,7,8,10};
      solution so = new solution();
      ArrayList<Integer> result = so.topTenNotifications(nums);
      System.out.println(result);
    }
       
}