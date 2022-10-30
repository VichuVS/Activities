class EOP{
public static void main(String[]ar){
		int n=20;
		System.out.print("Even numbers:");
		for(int i=0; i<=n; i++){
			if(i%2==0){
				System.out.print(" "+i);
}}
        System.out.print("  Odd numbers:");
		for(int i=0;i<=n;i++){
			if(i%2!=0){
				System.out.print(" "+i);
}}
        System.out.print("  Prime numbers:");
        for(int i=2;i<=n;i++){
         boolean Prime=true;
        for (int j=2;j<i;j++){
           if(i%j==0){
           Prime=false;
        break;
}}
	      if(Prime){
	        System.out.print(" "+i);
}}}}