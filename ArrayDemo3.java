class ArrayDemo3
{
public static void main(String args[])
{
int a[] = {5,2,8,3,6};
int i,max;
max = a[0];
for(i=0; i<=4; i++)
{
	if(max>a[i])
	{
	max = a[i];
	}
}
System.out.println("Min = "+max);
}
}

/*
1.Array Addition
2.Array Merging
3.Array Serching
4.Array Sorting
*/


