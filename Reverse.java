class Reverse{
	public static void main(String[] ar){
		 int num =12345,reversed = 0;
		 System.out.println(num);
		 while(num!=0){
			 int digit = num%10;
			 reversed =(reversed*10)+num%10;
			 num/=10;
		 System.out.print(reversed);
}}} 