import java.util.Scanner;
class ArrayDemo6
{
public static void main(String args[])
{
int i,j,t,size;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array :");
size = s.nextInt();

int a[] = new int[size];

System.out.println("Enter "+size+" values:");
for(i=0; i<size; i++)
{
a[i] = s.nextInt();
}

for(i=0; i<size; i++)
{
	for(j=i+1; j<size; j++)
	{
		if(a[i]>a[j])
		{
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
}

System.out.println("Output : ");
for(i=0; i<size; i++)
{
System.out.println("a["+i+"]="+a[i]);
}

}
}
