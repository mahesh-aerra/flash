package array;

public class demo 
{

	public static void main(String[] args)
	{
		//creating array of characters
		char[] source={'h','a','p','p','y','l','e','a','r','n','i','n','g'};
		char[] destination=new char[20];
		
		//copying elements from one array to another array
		System.arraycopy(source,0,destination,1,10);
		System.out.println(new String(destination));
		
		//deleting elements from array
		int flag=3;
		for(int i=0; i<source.length; i++)
			if(flag==1)
			{
				for(int j=i+1; i<source.length-1; j++)
				{
					source[i]=source[j];
					i++;
					
				}
				System.out.println(source);
			}
			

	}

}
