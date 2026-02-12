import java.util.Scanner;
class TwoDArrayDemo3
{
public static void main(String args[])
{
int a[][] = new int[4][4];
int i,j;
Scanner s = new  Scanner(System.in);

System.out.println("Enter 16 values in 4*4 2-d :");
for(i=0; i<=3; i++)
{
	for(j=0; j<=3; j++)
	{
		a[i][j] = s.nextInt();
	}
}	
System.out.println("Output :");

for(i=0; i<=3; i++)
{
	for(j=0; j<=3; j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}			   		
}
}
