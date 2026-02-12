class ForEachLoopDemo
{
public static void main(String args[])
{
int a[] = {5,10,15,20,25,30,35,40,45,50};
int i;
System.out.println("Display By Using Index Loop :");
for(i=0; i<=9; i++)
{
System.out.println("a["+i+"]="+a[i]);
}
System.out.println("Display By Using For-Each Loop :");
//x will work for each element of array one by one
for(int x : a)
{
	System.out.println(x);
}
}
}
