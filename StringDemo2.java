package myprojects;

public class StringDemo2 {
	public static void main(String[] args) {
	     
        String inputStr ="liril";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
    }
}

