import java.util.Scanner;
class ArrayDemo4
{
public static void main(String args[])
{
int a[] = new int[10];
int i;
Scanner s = new Scanner(System.in);
System.out.println("Enter 10 values:");
for(i=0; i<=9; i++)
{
a[i] = s.nextInt();
}
for(i=0; i<=9; i++)
{
System.out.println(a[i]);
}

}
}
