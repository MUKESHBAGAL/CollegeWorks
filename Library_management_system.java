    import java.util.Scanner;
    
    class Enter_In_Library {
        Scanner sc = new Scanner(System.in);
    
        public void displayOptions() {
            System.out.println("1. TAKE BOOK");
            System.out.println("2. RENEW BOOK");
            System.out.println("3. RETURN BOOK");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    takeBook();
                    break;
                case 2:
                    renewBook();
                    break;
                case 3:
                    returnBook();
                    break;
                default:
                    System.out.println("YOU ENTERED SOMETHING WRONG INPUT, PLEASE TRY AGAIN");
                    displayOptions();
            }
        }
    
        void takeBook() {
            System.out.print("Enter registration number: ");
            String registrationNumber = sc.next();
            String[] bookNumbers = {"JAVA", "C++", "C", "DSA"};
    
            boolean isValid = isValidRegistrationNumber(registrationNumber);
    
            if (isValid) {
                System.out.println("Available books are: ");
                for (String book : bookNumbers)
                    System.out.printf("%s ", book);
    
                System.out.println("\nEnter Book Name: ");
                String book = sc.next();
                if (book.equals("JAVA")) {
                    CHOOSE_JAVA_BOOK();
                } else if (book.equals("C++")) {
                    CHOOSE_CPP_BOOK();
                } else if (book.equals("C")) {
                    CHOOSE_C_BOOK();
                } else if (book.equals("DSA")) {
                    CHOOSE_DSA_BOOK();
                } else {
                    System.out.println("\nInvalid book name!");
                    System.out.println("Please try again");
                    takeBook();
                }
            } else {
                System.out.println("\nInvalid registration number!");
                System.out.println("Please try again");
                takeBook();
            }
        }
    
    
                public static boolean isValidRegistrationNumber(String registrationNumber) {
                    if (registrationNumber == null || registrationNumber.length() != 10) {
                        return false; // Registration number should be 10 characters long
                    }
                    
                    try {
                        int year = Integer.parseInt(registrationNumber.substring(0, 4));
                    
                        if (year < 2020 || year >= 2024) {
                            return false; // Year should be between 2000 and 2023
                        }
                    } catch (NumberFormatException e) {
                        return false; // Unable to parse year
                    }
                    
                    String departmentId = registrationNumber.substring(4, 7);
                    
                    return departmentId.equalsIgnoreCase("bit")
                            || departmentId.equalsIgnoreCase("bcs")
                            || departmentId.equalsIgnoreCase("bme")
                            || departmentId.equalsIgnoreCase("bch");
                }
        
                    void CHOOSE_JAVA_BOOK(){
                                System.out.println("Select Auther Name: ");
                                System.out.println("1.Authors: Kathy Sierra & Bert Bates\n2.Author: Herbert Schildt\n3.Author: Barry A. Burd\n4.Author: Joshua Bloch.\n5.Author: Eric Freeman.");
                                
                                int ch = sc.nextInt();
                                switch (ch) {
                                case 1:  
                                        System.out.println("\n  Head First Java Book.By Authors: Kathy Sierra & Bert Bates  successfully taken! And Book Number is 123456 ");
                                            break;
                                case 2:
                                        System.out.println("\n  A Beginner's Guide JAVA Book.By Author: Herbert Schildt successfully taken!  And Book Number is 134562");
                                            break;
                                case 3:
                                        System.out.println("\n   Java for Dummies JAVA Book.By Author: Barry A. Burd successfully taken! And Book Number is 145623");
                                            break;
                                 case 4:
                                        System.out.println("\n  Effective Java Book.By Author: Joshua Bloch successfully taken! And Book Number is 156234");
                                            break;
                                case 5:
                                        System.out.println("\n  Head First Design Patterns JAVA Book.By Author: Eric Freeman successfully taken! And Book Number is 162345");
                                            break;
                                default:{
                                        System.out.println("YOUR SELECTION IS WRONG TRY ONE MORE TIME");
                                        CHOOSE_JAVA_BOOK();
                            
                         } 
                        
                     }
                
                  }
                  void CHOOSE_CPP_BOOK(){
                                System.out.println("Select Auther Name: ");
                                System.out.println("1.Author: Ulla Kirch-Prinz. Edition: 1st Edition. ... ");
                                System.out.println("2.Author: Michael Dawson. Edition: 3rd Edition. ... ");
                                System.out.println("3.Author: Josee Lajoie and Stanley B. Lippman. ... ");
                                System.out.println("4.Author:ohn Smiley.");
                               
                
                                int ch = sc.nextInt();
                                switch (ch) {
                                case 1:  
                                        System.out.println("\n  Head First Java Book.By Author: Ulla Kirch-Prinz. Edition: 1st Edition. ... successfully taken! And Book Number is 213456 ");
                                            break;
                                case 2:
                                        System.out.println("\n  A Beginner's Guide JAVA Book.By Author: Michael Dawson. Edition: 3rd Edition. ...  successfully taken!  And Book Number is 234561");
                                            break;
                                case 3:
                                        System.out.println("\n   Java for Dummies JAVA Book.By Author: Josee Lajoie and Stanley B. Lippman. ... successfully taken! And Book Number is 245613");
                                            break;
                                 case 4:
                                        System.out.println("\n  Effective Java Book.By Author: ohn Smiley. successfully taken! And Book Number is 245613");
                                            break;
                                default:{
                                        System.out.println("YOUR SELECTION IS WRONG TRY ONE MORE TIME");
                                         CHOOSE_CPP_BOOK();
                            
                         } 
                        
                     }
                      
                  }
                  void CHOOSE_C_BOOK() {
                            System.out.println("Select Author Name: ");
                            System.out.println("1.Authors: By Greg Perry and Dean Miller");
                            System.out.println("2.Author: Brian Kernighan  and Dennis Ritchie");
                            System.out.println("3.Author: Zed Shaw");
                            System.out.println("4.Author: Joshua Bloch");
                        
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:  
                                    System.out.println("\nC Programming Absolute Beginner Guide Book. By Authors: By Greg Perry and Dean Miller. Successfully taken! And Book Number is 312456");
                                    break;
                                case 2:
                                    System.out.println("\nThe C Programming Language (2nd Edition) Book. By Author: Brian Kernighan  and Dennis Ritchie. Successfully taken! And Book Number is 324561");
                                    break;
                                case 3:
                                    System.out.println("\nLearn C the Hard Way Book. By Author: Zed Shaw. Successfully taken! And Book Number is 345612");
                                    break;
                                case 4:
                                    System.out.println("\nHead First C Book. By Author: David Griffiths and Dawn Griffiths. Successfully taken! And Book Number is 356124");
                                    break;
                                default:{
                                    System.out.println("YOUR SELECTION IS WRONG. TRY AGAIN.");
                                    CHOOSE_C_BOOK(); // Recursive call to allow the user to try again
                                }
                            }
                }
                
                  void CHOOSE_DSA_BOOK() {
                            System.out.println("Select Author Name: ");
                            System.out.println("1.Authors: Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein");
                            System.out.println("2.Author: Narasimha Karumanchi");
                            System.out.println("3.Author: Robert Sedgewick and Kevin Wayne");
                            System.out.println("4.Author: Aditya Bhargava");
                        
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:  
                                    System.out.println("\nIntroduction to Algorithms Book. By Authors: Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein. Successfully taken!  And Book Number is 412356");
                                    break;
                                case 2:
                                    System.out.println("\nData Structures and Algorithms Made Easy Book. By Author: Narasimha Karumanchi. Successfully taken!  And Book Number is 423561");
                                    break;
                                case 3:
                                    System.out.println("\nAlgorithms Book. By Author: Robert Sedgewick and Kevin Wayne. Successfully taken!  And Book Number is 435612");
                                    break;
                                case 4:
                                    System.out.println("\nGrokking Algorithms Book. By Author: Aditya Bhargava. Successfully taken!  And Book Number is 456123");
                                    break;
                                default:{
                                    System.out.println("YOUR SELECTION IS WRONG. TRY AGAIN.");
                                    CHOOSE_DSA_BOOK(); // Recursive call to allow the user to try again
                                }
                            }
                   }
        
        void renewBook() {
            System.out.println("You selected: RENEW BOOK");
            // Implement logic to renew a book
        }
    
        void returnBook() {
            System.out.println("Book Is Returned !!!");
        }
        
    }
    
    public class Main {
        static Scanner sc = new Scanner(System.in);
    
        public static void main(String[] args) {
            int ch;
            Enter_In_Library el = new Enter_In_Library();
    
            System.out.println("1. Enter in library");
            System.out.println("2. Exit in library");
    
            try {
                ch = sc.nextInt();
    
                switch (ch) {
                    case 1:
                        el.displayOptions();
                        break;
                    default:
                        System.out.println("Thank you For Coming!!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
    }

