import java.util.Scanner;
class ArrayDemo5
{
public static void main(String args[])
{
int i,size;
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
System.out.println("a["+i+"]="+a[i]);
}

}
}
