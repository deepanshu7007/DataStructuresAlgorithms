class FindEven
{
public static int extractEven(int num)
{
int dig=1,prev=0,newVal=0;
int temp = num,rem = 0;
while(temp!=0)
{
rem = temp % 10;
if((rem%2)==0)
{
newVal = rem * dig;
newVal = newVal + prev;
prev = newVal;
dig = dig * 10;
}
temp = temp / 10;
}
return newVal;
}
public static void main(String... args)
{
System.out.printf("%d",extractEven(8134));
}
}
