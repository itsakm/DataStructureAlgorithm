import java.util.*;
class posSubset
{
	public static void findSubsets(List<List<String>> subset, ArrayList<String> nums, ArrayList<String> output, int index)
    {
        if (index == nums.size()) {
            subset.add(output);
            return;
        }

        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
        output.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n =sc.nextInt();
		int r = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String arr[]  = str.split(",");
      List<List<String>> subset = new ArrayList<>();
      ArrayList<String> input = new ArrayList<>();
      for(int i=0;i<arr.length;i++)
			input.add(arr[i]);
      findSubsets(subset, input, new ArrayList<>(), 0);
      for(int i=0;i<subset.size()-1;i++)
      {
      	for(int j=0;j<subset.size()-i-1;j++)
      	{
      		if(subset.get(j).size()>subset.get(j+1).size())
      		{
      			Collections.swap(subset,j,j+1);
      		}
      	}
      	
      }       
          for(int j = 0; j < subset.get(r+1).size(); j++){
              System.out.print(subset.get(r+1).get(j));
              if(j!=subset.get(r+1).size()-1)
             	 System.out.print(",");
          }
	}
}