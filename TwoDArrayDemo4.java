//Jagged Array
import java.util.Scanner;
class TwoDArrayDemo4
{
public static void main(String args[])
{
int a[][] = new int[5][];
int i,j;
a[0] = new int[4];
a[1] = new int[2];
a[2] = new int[6];
a[3] = new int[3];
a[4] = new int[5];
Scanner s = new  Scanner(System.in);


for(i=0; i<=4; i++)
{
System.out.println("Enter "+a[i].length+" values :");
	for(j=0; j<a[i].length; j++)
	{
		a[i][j] = s.nextInt();
	}
}	
System.out.println("Output :");

for(i=0; i<=4; i++)
{
	for(j=0; j<a[i].length; j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}			   		
}
}
/*
1. 3*3 in input reverse order.
2. greatest value in each row in 3*4 2-d.
3. smallest value in each row in 3*4 2-d.
4.sum of each row in 4*4 2-d.
5.sum of each col in 4*4 2-d.
*/
