package Bookslibraries;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class BookMap
{
    Bookstore books1=new Bookstore("SriRamayana Darshanam","B0011","Kuvempu", "1990","deva");
    Bookstore books2=new Bookstore("Mahabharatha","B0020","Valmiki", "1890","vidhu");
    Bookstore books3=new Bookstore("Untuchability","B0019","anvitha", "1947","lakshmi");
    Bookstore books4=new Bookstore("Ahero","B0035","Narayan", "2000","gowtham");
    Bookstore books5=new Bookstore("Karvalo","B0013","Poorna", "1999","deepa");
    Bookstore books6=new Bookstore("magicmorining","B0029","jhon", "2001","veera");
    Bookstore books7=new Bookstore("yayathi","B0078","girishkarnad", "1990","lakshmi");
    static HashMap<Integer,Bookstore> list=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void addBooks()
    {
        System.out.println("HashTable................................");
        System.out.println();
        list.put(1,books1);
        list.put(2,books2);
        list.put(3,books3);
        list.put(4,books4);
        list.put(5,books5);
        list.put(6,books6);
        list.put(7,books7);
    }

    public void display()
    {
        System.out.println("Displaying all books:");
        for (Integer key : list.keySet())
        {
            Bookstore value = list.get(key);
            System.out.println("ID: " + key + ", " + value);
        }
        System.out.println();
    }


    public void getAuthorOfBook()
    {
        System.out.println("Enter the Book title to know its Author:");
        String bookName = sc.nextLine();
        boolean found = false;

        for (Bookstore book : list.values())
        {
            if (book.BookTitle.equalsIgnoreCase(bookName))
            {
                System.out.println("Author: " + book.Author);
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("Book not found.");
        }
    }

    public void getBuyersdetails()
    {
        System.out.println("by entering the BookName get the buyers details");
        System.out.println("Enter the BookName");
        String name=sc.nextLine();
        for(Bookstore b:list.values())
        {
            if(b.BookTitle.equals(name))
            {
                System.out.println(b.BuyerName);
            }
        }
    }

    public void isContainBook()
    {
        System.out.println("Search the Book if it is there in the List.......................");
        System.out.println("Enter the Book title");
        String bookToCheck = sc.nextLine();
        boolean contain=true;
        for (Bookstore title : list.values())
        {
            if (title.BookTitle.equalsIgnoreCase(bookToCheck))
            { // Corrected parenthesis
                contain=true;
            }

        }
        if(contain==true)
        {
            System.out.println("it contains=" + contain);
        }
        else
        {
            System.out.println("No book");
        }
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        BookMap booklist= new BookMap();
        booklist.addBooks();
        System.out.println("Enetr your choice");
        System.out.println("1.Display the Added Book list");
        System.out.println("2.get the authors of the Book");
        System.out.println("3.get the Buyers details");
        System.out.println("4.check the book is contain the book");
        int choice= scanner.nextInt();
        switch(choice)
        {
            case 1:if(choice==1)
            {
                booklist.display();
                break;
            }
            case 2:if(choice==2)
            {
                booklist.getAuthorOfBook();
                break;
            }
            case 3:if(choice==3)
            {
                booklist.getBuyersdetails();
                break;
            }
            case 4:if(choice==4)
            {
                booklist.isContainBook();
                break;
            }
        }
    }
}
