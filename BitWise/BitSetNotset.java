class BitSetNotset
{
	public static void main(String[] args) {
	
	int n=4;
	int a=1;
	int x=2;
	a=a<<x;
	System.out.println(a);
	System.out.println(a&n);
	System.out.println(Integer.toBinaryString(n));	
	}
}