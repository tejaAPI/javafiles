class Continue
{
public static void main(String[] args)
{
int i;
Scanner sc=new Scanner(System.in);
for(i=1;i<=10;i++)
{
if(i==5)
{
continue;
}
System.out.println(i);
}
}
}