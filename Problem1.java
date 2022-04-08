/*
A man invests a certain amount on monthly basis in a bank. He withdraws that money once in 4 years which is a leap year, to make a big scale purchase .He starts next investment exactly 183 days after the purchase .

Initially, he makes a note of his purchase date
Given the date(dd) and month(mm) of his purchase. The task here is to help him find the date and month to start his investment.

His next investment date is calculated from the next day of his purchase.
Display the date as on 183rd day.
*/


import java.util.Scanner;
public class Problem1
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int D[]={31,29,31,30,31,30,31,31,30,31,30,31};
String M[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
int dd=sc.nextInt();
String mm=sc.next();
int j=0;
for(int i=0;i<M.length;i++)
{
if(mm.equalsIgnoreCase(M[i]))
{
j=i;
break;
}
}
int DD=183;
int date=D[j]-dd;
DD=DD-date;
j=(j+1)%12;
while(true)
{
DD=DD-D[j];
j=(j+1)%12;
if(DD<29 || DD<30 || DD<31)
break;
}
System.out.println(DD+" "+M[j]);
}
}
