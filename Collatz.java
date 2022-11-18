class Collatz
{

    static int printCollatz(int n)
    {
        // We simply follow steps
        // while we do not reach 1
        int count =1;
        while (n != 1)
        {
            System.out.print(n + " ");
            count++;
     
            // If n is odd
            if ((n & 1) == 1)
                n = 3 * n + 1;
     
            // If even
            else
                n = n / 2;
        }
     
        // Print 1 at the end
        System.out.print(n);
        return count;
    }
	public static void main(String[] args) {
		int max =0;
		int res =0;
		for(int i=1;i<=5;i++){
			int temp = printCollatz(i);
			if(temp>= max){
				max = temp;
				res =i;
			}
			System.out.println(" "+printCollatz(i));
			System.out.println();
			System.out.println(res);
		}
		
	}
}