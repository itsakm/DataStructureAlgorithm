class SparseOrNot
{
	public static void main(String[] args) {
		int n=72;
		int a=n>>1;
		System.out.println(a);
		if((n&a)==0)
			System.out.println("Sparse");
		else
			System.out.println("Not Sparse");
		System.out.println("&="+(n&a));
		//consecutive number 0110 honge to sparse
		//nhi hoga 001001 ye sparsh hai
		/*to agr hm isko right shift krke and operate
		kr de to agr 0 aayega to sparse otherwise not
		00001100
		00000110
		~~~~~~~~
		00000100(not sparsh)


		*/

	}
}