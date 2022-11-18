import java.util.*;
class Time implements Comparable<Time>
{
	int start;
	int end;
	Time(int start,int end)
	{
		this.start = start;
		this.end = end;
	}
	public int compareTo(Time o)
	{
		return this.end - o.end;
	}
}
public class ActivitySelectionProblem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Time arr[] = new Time[n];
		for(int i=0;i<n;i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr[i]=new Time(start,end);
		}
		System.out.println(activity(arr));
	}
	public static int activity(Time arr[])
	{
		Arrays.sort(arr);
		int count = 1 ;
		int j=0;
		for(int i =1 ;i<arr.length;i++)
		{
			if(arr[i].start>arr[j].end)
			{
				count++;
			}
			j=i;
		}
		return count;
	}
}