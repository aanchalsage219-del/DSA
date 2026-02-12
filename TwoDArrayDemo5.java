import java.util.Scanner;
class TwoDArrayDemo5
{
public static void main(String args[])
{
int a[][] = new int[3][4];
int i,j,min;
Scanner s = new  Scanner(System.in);

System.out.println("Enter 12 values in 3*4 2-d :");
for(i=0; i<=2; i++)
{
	for(j=0; j<=3; j++)
	{
		a[i][j] = s.nextInt();
	}
}	

System.out.println("Output :");

for(i=0; i<=2; i++)
{
min = a[i][0];
	for(j=0; j<=3; j++)
	{
		if(min>a[i][j])
		{
		min = a[i][j];
		}
	}
	System.out.println("Min of row "+i+" is :"+min);
}			   		
}
}
