PANAGARAM:

public class panagaram {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String str = sc.nextLine();
		  String src = str.toLowerCase();
		   System.out.println(isExample(src));
		   }
	  
	  private static boolean isExample(String s) {
		  if(s.length()< 26) {
			  return false;
		  }
		  else {
			  for(char ch='a';ch <= 'z';ch++) {
				  if(s.indexOf(ch)< 0) {
					  return false;
				  }
			  }
		  }
		    return true ;
	  }
}
