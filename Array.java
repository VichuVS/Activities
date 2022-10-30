import java.util.Arrays;
class Array{
  public static void main(String ar[]){
	  int a[]={7,0,9,4,5,8,3,2,3,1};
	  a= Arrays.stream(a).sorted().toArray();
	  System.out.print(Arrays.toString (a));
}}
