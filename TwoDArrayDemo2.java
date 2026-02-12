//Jagged Array
class TwoDArrayDemo2
{
public static void main(String args[])
{
int a[][] = {
			{1,2},
			{1,2,3,4},
			{1},
			{1,2,3,4,5},
			{1,2,3,4,5,6}
			   			};
int i,j;

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
