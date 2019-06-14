import java.util.*;
public class Cricket
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str=in.nextLine();
char ch[]=str.toCharArray();
int balls=0,extras=0,wickets=0,Totalruns=0,overs=0;
int strike=1,nonstrike=2,nextplayer=3;
int i,j,l,trun,stemp;
int players[]=new int[12];
l=str.length();
for(i=0;i<l;i++)
{
if(ch[i]=='W')
{
extras=extras+1;
}
else if(ch[i]=='O')
{
wickets=wickets+1;
strike=nextplayer;
nextplayer=nextplayer+1;
balls= balls+1;
}
else if(ch[i]=='.')
{
balls= balls+1;
}
else
{
balls= balls+1;
trun=ch[i]-48;
players[strike]=players[strike]+trun;
if(trun%2==1)
{
stemp=strike;
strike=nonstrike;
nonstrike=stemp;
}
}
if(balls==6)
{
overs=overs+1;
balls=0;
stemp=strike;
strike=nonstrike;
nonstrike=stemp;
}
}
for(j=1;j<nextplayer;j++)
{
System.out.println("P"+j+"="+players[j]);
Totalruns=Totalruns+players[j];
}
System.out.println("Strike="+strike);
System.out.println("Non strike="+nonstrike);
System.out.println("Total="+(Totalruns+extras));
System.out.println("Overs="+overs);
System.out.println("Extras: "+extras);
System.out.println("Wicket(s): "+wickets);
System.out.println("Remaining wicket(s): "+(10-wickets));
}
}
//INPUT:  ...222431666
//OUTPUT:
P1 — 7 (runs)
P2 — 25 (runs)
Strike - P1
Non-Strike - P2
Total — 32
Overs — 2
Extra - 0
Wicket(s) - 0
Remaining Wicket(s) — l0