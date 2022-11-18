class StringRotate
{
	public static void main(String[] args) {
		String sa="mightandmagic";
		String sb="andmagicmigth";
		String temp=sa.concat(sa);
		for(int i=0;(i+sb.length())<=temp.length();i++)
		{
			System.out.println(i);
			System.out.println(i+sb.length());
			String temp1=temp.substring(i,(i+sb.length()));
			System.out.println(temp1);
			if(temp1.equals(sb)){

				System.out.println("yes");
				System.exit(0);	
			}
		}

	}
}