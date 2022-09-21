package myexamples;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
		String i = "65";        
		int c = Integer.parseInt(i);
		long l = Long.parseLong(i);
		float f = Float.parseFloat(i);
		short s = Short.parseShort(i);
		char ch = (char)Integer.parseInt(i);
        double d = Double.parseDouble(i);
		System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(s);
        System.out.println(l);
        System.out.println(ch);
		}
		/*catch(NumberFormatException nfe)
		{
			System.out.println("invalid number");
			
		}*/
	}


