import java.util.Scanner;
class ArrayInsert
{
public static int [] function(int n)
{
int arr[] = new int[n];
int j=0,val=0,i=0;
Scanner s = new Scanner(System.in);
boolean found = false;
for(i=0;i<arr.length;)
{
val = s.nextInt();
j=0;
while(j<i)
{
if(arr[j]==val)
{
found=true;
break;
}
else
{
found = false;
}
j++;
}
if(found == false)
{
arr[i] = val;
i++;
}
}
return arr;
}
public static void main(String... args)
{
ArrayInsert ai = new ArrayInsert();
int arr[] = ai.function(5);
for(int i=0;i<arr.length;i++)
System.out.printf("%2d",arr[i]);
}
}
