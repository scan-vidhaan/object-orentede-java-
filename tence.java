import java.util.*;
class book {
String name;
String author;
int nump;
 int peice;
book()
{}
book(String name,String author,int price,int nump)
{

this.name=name;
this.author=author;
this.price=price;
this.nump=nump;
}
void accept()
{
Scanner s= new Scanner(System.in);
System.out.print("Enter the number of the book");
name=s.nextline();
System.out.print("Enter the author of the book");
 prince=s.nextInt();
System.out.print("Enter the number of pages of the book");
 nump=s.nextInt();
}
public String to String()
{
retun("Name:"+name "\n" "Author :"+author "\n" +price "\n " " Number of pages:"+nump);
}
}
class tence
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in)
Book b1= new book("Metwa,"Anvish",414,345);
System.out.println("Constructor values:\n"+b1);
System.out println("Enter the number of books");
 int n=a.nextInt();
book b[]=new book[n];
for(int i=0;i<n;i++)
{
System.out.print("Details of the book" +i+"" +b[i]);
System.out.print(b[i]);
}
}
}