import java.util.*;
public class FractionalKnapsack
{
	public static double getMaxValue(int wt[], int val[], int capacity)
	{
		ItemValue arr[] = new ItemValue[wt.length];
		for(int i = 0; i<wt.length ; i++)
		{
			arr[i] = new ItemValue(wt[i],val[i],i);
		}

		Arrays.sort(arr, new Comparator<ItemValue>(){
			public int compare(ItemValue o1, ItemValue o2)
			{
				return o2.cost.compareTo(o1.cost);
			}
		});

		double totalVal = 0d;

		for(ItemValue i: arr )
		{
			int curwt = (int)i.wt;
			int curval = (int)i.val;

			if(capacity - curwt >= 0)
			{
				capacity = capacity - curwt;
				totalVal = totalVal + curval;
			}
			else
			{
				double fraction = ((double)capacity/ (double)curwt);
				capacity = (int)(capacity - curwt*fraction);
				totalVal = totalVal + curval * fraction;
				break;
			}
		}
		return totalVal;
	}
	 public static void main(String[] args)
    {
        int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
  
        double maxValue = getMaxValue(wt, val, capacity);
  
        // Function call
        System.out.println("Maximum value we can obtain = "
                           + maxValue);
    }
}
class ItemValue
{
	Double cost;
	double wt,val,ind;

	public ItemValue(double wt, double val, double ind)
	{
		this.wt = wt;
		this.val = val;
		this.ind = ind;
		this.cost = new  Double((double)val/(double)wt);
	}
}