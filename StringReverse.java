class StringReverse
{
public static void swap(char []arr,int i,int j)
{
char temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
public static char []interChange(char[] arr,int lb,int ub)
{
    while(lb<=ub)
    {
        swap(arr,lb,ub);
        lb++;
        ub--;
    }
    return arr;
}
public static char[] formSentence(char []arr,int lb,int ub)
{
    arr = interChange(arr,0,arr.length-1);
    
    int i=0;
    int j=0;
    while(j<arr.length-1)
    {
        if(arr[j+1]==' ')
        {
            interChange(arr,i+1,j);
            i=j+1;
        }
        j+=1;
    }
    interChange(arr,i+1,j);
    return arr;
}
public static void main(String... args)
{
String str = "PLACED BE TO WANT I";
char[] arr = str.toCharArray();
arr = formSentence(arr,0,arr.length);
for(char c:arr)
{
    System.out.printf("%c",c);
}
}
}