import java.util.Scanner;

class Zoho
{
	public static void print(String s)
	{
		for(int j=0;j<s.length();j++)
		{
        for(int k=0;k<s.length()-j-1;k++)
        {
        	System.out.print(" ");
        }
		for(int i=0;i<j+1;i++)
		{
			System.out.print(s.charAt(((s.length())/2+i)%s.length()));
		}
		    System.out.println(" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		print(input);
	}
}