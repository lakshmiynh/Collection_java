package Bookslibraries;

public class Bookstore {

        String BookTitle;
        String BookId;
        String Author;
        String Year;
        String BuyerName;

        // Constructor
        public Bookstore(String booktitle, String bookId, String author, String year, String buyerName)
        {
            this.BookTitle = booktitle;
            this.BookId = bookId;
            this.Author = author;
            this.Year = year;
            this.BuyerName = buyerName;
        }

        // toString method for displaying details
        @Override
        public String toString()
        {
            return "BookStore{" +
                    "bookTitle='" + BookTitle + '\'' +
                    ", bookId='" + BookId + '\'' +
                    ", author='" + Author + '\'' +
                    ", year='" + Year + '\'' +
                    ", buyerName='" + BuyerName + '\'' +
                    '}';
        }
    }


