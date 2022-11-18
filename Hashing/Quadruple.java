import java.util.*;
class Quadruple
{
	public static void main(String[] args) {
		int nums[]={0,0,2,1,1};
		Arrays.sort(nums); 
		int s=3;
		int n=nums.length;
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		HashMap<ArrayList<Integer>,Integer> h = new HashMap<ArrayList<Integer>,Integer>();
		for (int i = 0; i < n - 3; i++) 
        {
          // Find other two elements after fixing second element
            for (int j = i + 1; j < n - 2; j++) 
            {
           // Find the fourth element after fixing third element    
              for (int k = j + 1; k < n - 1; k++) 
                {
            // find the fourth
                    for (int l = k + 1; l < n; l++) 
                    {
                    	
                        	if (nums[i] + nums[j] + nums[k] + nums[l] == s)
                            {

                            	ArrayList<Integer> list= new ArrayList<Integer>();
                            	list.add(nums[i]);
                            	list.add(nums[j]);
                            	list.add(nums[k]);
                            	list.add(nums[l]);
                            	System.out.println(list.toString());
                            	if(!h.containsKey(list))
                            	{
                            		h.put(list,1);
                            		al.add(list);
                            	}
                            	
                            }
                            
                            
                    }
                }
            }
    	}
    	System.out.println(al.toString());
	}
}