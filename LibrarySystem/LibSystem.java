package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<String> books = new ArrayList<String>();

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public void displayBooks() {
        System.out.println(books);
    }

    public void issueBook(String bookName) {
        if (books.contains(bookName)) {
            books.remove(bookName);
            System.out.println("Book issued to you!");
        } else {
            System.out.println("This Book is not available!");
        }
    }

    public void returnBook(String bookName) {
        books.add(bookName);
        System.out.println("You have returned the Book!");
    }
}

public class LibSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("1. Add a Book \n2. Display a Book  \n3. Issue a Book  \n4. Return a Book");
        System.out.print("Enter your Choice: (1/2/3/4): ");
        Integer choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (choice == 1) {
            System.out.print("Enter BookName: ");
            String book = sc.nextLine();
            lib.addBook(book);
            System.out.println("Book added successfully!");

        } else if (choice == 2) {
            lib.displayBooks();

        } else if (choice == 3) {
            System.out.print("Enter BookName: ");
            String book = sc.nextLine();
            lib.issueBook(book);

        } else if (choice == 4) {
            System.out.print("Enter BookName: ");
            String book = sc.nextLine();
            lib.returnBook(book);

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}


//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Library {
//	private ArrayList<String> books = new ArrayList<String>();
//	
//	public void addBook(String bookName) {
//		books.add(bookName);
//		
//	}
//	
//	public void displayBooks() {
//		System.out.println(books);
//	}
//	
//	public void issueBook(String bookName) {
//		if(books.contains(bookName)) {
//		books.remove(bookName);
//		System.out.println("Book issued to you!");
//		}else {
//			System.out.println("This Book is not available!");
//		}
//	}
//	
//	public void returnBook(String bookName) {
//		books.add(bookName);
//		System.out.println("You have returned the Book!");
//	}
//}
//public class LibSystem {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Library lib = new Library();
//		
//		System.out.println("1. Add a Book \n2. Display a Book  \n3. Issue a Book  \n4. Return a Book");
//		System.out.println("Enter your Choice: (1/2/3/4):");
//		Integer choice = sc.nextInt();
//		
//		if (choice == 1 ) {
//			System.out.println("Enter BookName:");
//			String book = sc.nextLine();
//			lib.addBook(book);
//			System.out.println("Book added successfully!");
//			
//		} else if (choice == 2 ) {
//			lib.displayBooks();
//			
//		} else if (choice == 3 ) {
//			System.out.println("Enter BookName:");
//			String book = sc.nextLine();
//			lib.issueBook(book);
//			
//		} else if (choice == 4 ) {
//			System.out.println("Enter BookName:");
//			String book = sc.nextLine();
//			lib.returnBook(book);
//			
//		} else {
//			System.out.println("Invalid Choice!");
//		}
//		
//		sc.close();
//	}
//}
