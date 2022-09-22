package myexamples;
class publik
{
	private String name;
	public String getName()
	{
      return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
		
	}
	public int i=1;
	 void display()
	{
		System.out.println(i);
	    //v return i;
	}
}
	 class g{
		 
	 protected int l,j;
	 protected int display1(int b,int c)
	 {
		 int k;
		l=b;
		j=c;
		k = l+j;
	   return k;
	 }
	
}

 public class modifiers extends publik extends g {
             
	     
	public static  void main(String[] args) {

		// TODO Auto-generated method stub
		publik obj = new publik();
		obj.setName("birpal");
		System.out.println("the name is "+ obj.getName());
		obj.display();
		obj.display1(2,3);
	}

}
