import java.util.*;
public class Longestsubstring
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String s1="";
String s3="";
String temp="";
int i,j,l,l1,templen=0;
l=s.length();
for(i=0;i<l;i++)
{
for(j=i+1;j<=l;j++)
{
s1=s1+s.substring(i,j)+" ";
}
}
String[] s2=s1.split(" ");
l1=s2.length;
for(i=0;i<l1;i++)
{
temp="";
char ch[]=s2[i].toCharArray();
for(j=0;j<s2[i].length();j++)
{
if(temp.indexOf(s2[i].charAt(j))==-1)
{
temp=temp+s2[i].charAt(j);
}
}
if(temp.length()==s2[i].length())
{
if(s2[i].length()>templen)
{
templen=s2[i].length();
s3=s2[i];
}
}
}
System.out.print(s3);
}
}
//INPUT:JAVACONCEPTOFTHEDAY
//OUTPUT:OFTHEDAY