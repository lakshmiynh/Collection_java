package Bookslibraries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BookList
{
    Bookstore books1=new Bookstore("SriRamayana Darshanam","B0011","Kuvempu", "1990","deva");
    Bookstore books2=new Bookstore("Mahabharatha","B0020","Valmiki", "1890","vidhu");
    Bookstore books3=new Bookstore("Untuchability","B0019","anvitha", "1947","lakshmi");
    Bookstore books4=new Bookstore("Ahero","B0035","Narayan", "2000","gowtham");
    Bookstore books5=new Bookstore("Karvalo","B0013","Poorna", "1999","deepa");
    Bookstore books6=new Bookstore("magicmorining","B0029","jhon", "2001","veera");
    Bookstore books7=new Bookstore("yayathi","B0078","girishkarnad", "1990","lakshmi");
    static ArrayList<Bookstore> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void addBooks()
    {
        System.out.println("HashSet................................");
        System.out.println();
        list.add(books1);
        list.add(books2);
        list.add(books3);
        list.add(books4);
        list.add(books5);
        list.add(books6);
        list.add(books7);
    }

    public void diplay()
    {
        System.out.println("itearte using Iterator...................................");
        Iterator<Bookstore> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Bookstore item = iterator.next();
            System.out.println(item);
        }
    }

    public void getAuthorofBook()
    {
        System.out.println("get the Author Name by Search the Booktitle...................................");
        System.out.println("Enter teh Book title to know its Author Name");
        String bookname=sc.nextLine();
        for(Bookstore book:list)
        {
            if(book.BookTitle.equals(bookname))
            {
                System.out.println(book.Author);
            }
        }
    }

    public void getBuyersdetails()
    {
        System.out.println("by entering the BookName get the buyers details");
        System.out.println("Enter the BookName");
        String name=sc.nextLine();
        for(Bookstore b:list)
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
        for (Bookstore title : list)
        {
            if (title.BookTitle.equalsIgnoreCase(bookToCheck))
            {
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
        BookList booklist=new BookList();
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
                booklist.diplay();
                break;
            }
            case 2:if(choice==2)
            {
                booklist.getAuthorofBook();
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

