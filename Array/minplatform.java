import java.util.*;
class minplatform
{
	public static void main(String[] args) {
		int a[]={900 ,1100 ,1235};
		int d[]={1000 ,1200 ,1240};
		Arrays.sort(a);
		Arrays.sort(d);
		int station=0;
		int max=0;
		int i=0,j=0;
		while(i<a.length && j<d.length)
		{
			System.out.println("a[i]="+a[i]);
			System.out.println("d[j]="+d[j]);
			if(a[i]<d[j])
			{
				station++;
				if(station>=max)
					max=station;
				i++;
			}
			else if(a[i]>d[j])
			{
				station--;
				j++;
			}
			System.out.println("station="+station);
			System.out.println("max="+max);
		}



		
		System.out.println(station);
	}

}