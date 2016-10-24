import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n,fact=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==0)
{
System.out.println("The factorial is:1");
}
else
{
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("The factorial is:"+fact);
}
}
}
