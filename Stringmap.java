import java.util.*;
public class Stringmap
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str1=in.nextLine();
String str2=in.nextLine();
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
int l1,l2,i,j,len1;
l1=str1.length();
l2=str2.length();
for(i=0;i<l1;i++)
{
for(j=i+1;j<l1;j++)
if(ch1[i]==ch1[j])
{
ch1[j]=' ';
}
}
for(i=0;i<l2;i++)
{
for(j=i+1;j<l2;j++)
if(ch2[i]==ch2[j])
{
ch2[j]=' ';
}
}
String str3=new String(ch1);
String str4=new String(ch2);
String str5=str3.replace(" ","");
String str6=str4.replace(" ","");
if(str5.length()==str6.length())
System.out.print("True");
else
System.out.print("False");
}
}
//INPUT:ABC   PQR;FOO  BAR
//OUTPUT:TRUE;FALSE