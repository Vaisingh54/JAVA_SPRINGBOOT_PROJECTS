package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {


public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
String [] count=new String[sc.nextInt()];
System.out.println("Enter elements of array");
for(int i=0;i<count.length;i++)
{
count[i]=sc.next();
}
System.out.println("**********************************");
Arrays.sort(count);
for(int i=0;i<count.length;i++)
{
if(i<(count.length/2)+1)
System.out.println(count[i].toUpperCase());
else
System.out.println(count[i]);
}


}

}
