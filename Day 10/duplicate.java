// public class DuplicateWords {
//     public static void main(String[] args) {

//         String str = "Java is great Java is easy Java";
//         str = str.toLowerCase();

//         String words[] = str.split(" ");

//         for (int i = 0; i < words.length; i++) {

//             int count = 1;

//             if (words[i].equals("0"))
//                 continue;

//             for (int j = i + 1; j < words.length; j++) {

//                 if (words[i].equals(words[j])) {
//                     count++;
//                     words[j] = "0";
//                 }
//             }

//             if (count > 1) {
//                 System.out.println(words[i] + " = " + count);
//             }
//         }
//     }
// }
// count number of duplicate word in string 


// public class CountWords {
//     public static void main(String[] args) {

//         String str = "Java is an object oriented programming language";

//         String words[] = str.trim().split("\\s+");

//         System.out.println("Total Words = " + words.length);
//     }
// }

//count number of words in given string

//a Program to Count Number of Occurrences of Substring
// public class SubstringCount {
//     public static void main(String[] args) {

//         String str = "Java is Java and Java is powerful";
//         String sub = "Java";

//         int count = 0;
//         int index = 0;

//         while ((index = str.indexOf(sub, index)) != -1) {
//             count++;
//             index = index + sub.length();
//         }

//         System.out.println("Occurrences = " + count);
//     }
// }

// Java Program to Count Occurrences of Each Character
// public class CharacterCount {
//     public static void main(String[] args) {

//         String str = "programming";

//         char ch[] = str.toCharArray();

//         for (int i = 0; i < ch.length; i++) {

//             int count = 1;

//             if (ch[i] == '0')
//                 continue;

//             for (int j = i + 1; j < ch.length; j++) {

//                 if (ch[i] == ch[j]) {
//                     count++;
//                     ch[j] = '0';
//                 }
//             }

//             if (ch[i] != '0')
//                 System.out.println(ch[i] + " = " + count);
//         }
//     }
// }

// Java Program to Merge Two String Arrays
// public class MergeArrays {
//     public static void main(String[] args) {

//         String arr1[] = {"Java", "Python", "C"};
//         String arr2[] = {"HTML", "CSS", "JavaScript"};

//         String result[] = new String[arr1.length + arr2.length];

//         int index = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             result[index++] = arr1[i];
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             result[index++] = arr2[i];
//         }

//         System.out.println("Merged Array:");

//         for (String s : result) {
//             System.out.println(s);
//         }
//     }
// }

//6. Java Program to Remove Duplicate Words from String
// public class RemoveDuplicateWords {
//     public static void main(String[] args) {

//         String str = "Java Java is is easy easy";

//         String words[] = str.split(" ");

//         for (int i = 0; i < words.length; i++) {

//             if (words[i].equals("0"))
//                 continue;

//             for (int j = i + 1; j < words.length; j++) {

//                 if (words[i].equals(words[j])) {
//                     words[j] = "0";
//                 }
//             }
//         }

//         System.out.println("After Removing Duplicates:");

//         for (String word : words) {
//             if (!word.equals("0"))
//                 System.out.print(word + " ");
//         }
//     }
// }

// 7. Java Program to Reverse a String
// Method 1 (Using Loop)
// public class ReverseString {
//     public static void main(String[] args) {

//         String str = "Java";

//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         System.out.println("Reverse = " + rev);
//     }
// }


// 8. Java Program to Reverse Each Word of a String
// public class ReverseEachWord {
//     public static void main(String[] args) {

//         String str = "Java is awesome";

//         String words[] = str.split(" ");

//         for (String word : words) {

//             for (int i = word.length() - 1; i >= 0; i--) {
//                 System.out.print(word.charAt(i));
//             }

//             System.out.print(" ");
//         }
//     }
// }

// 9. Java Program to Swap Two Strings
// public class SwapStrings {
//     public static void main(String[] args) {

//         String a = "Hello";
//         String b = "World";

//         a = a + b;

//         b = a.substring(0, a.length() - b.length());

//         a = a.substring(b.length());

//         System.out.println("First String = " + a);
//         System.out.println("Second String = " + b);
//     }
// }

// 10. Java Program to Check if String Contains Only Digits
// public class DigitsOnly {
//     public static void main(String[] args) {

//         String str = "123456";

//         boolean flag = true;

//         for (int i = 0; i < str.length(); i++) {

//             if (!Character.isDigit(str.charAt(i))) {
//                 flag = false;
//                 break;
//             }
//         }

//         if (flag)
//             System.out.println("Contains Only Digits");
//         else
//             System.out.println("Contains Characters Also");
//     }
// }



// class Account {

//     protected int accountNumber;
//     protected String accountHolder;
//     protected double balance;

//     Account(int accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     void deposit(double amount) {
//         balance += amount;
//         System.out.println(amount + " Deposited.");
//     }

//     void withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println(amount + " Withdrawn.");
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }

//     void display() {
//         System.out.println("----------------------------");
//         System.out.println("Account No : " + accountNumber);
//         System.out.println("Name       : " + accountHolder);
//         System.out.println("Balance    : " + balance);
//     }
// }

// class SavingsAccount extends Account {

//     double interestRate;

//     SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
//         super(accountNumber, accountHolder, balance);
//         this.interestRate = interestRate;
//     }

//     void addInterest() {
//         double interest = balance * interestRate / 100;
//         balance += interest;
//         System.out.println("Interest Added : " + interest);
//     }

//     @Override
//     void display() {
//         super.display();
//         System.out.println("Interest Rate : " + interestRate + "%");
//     }
// }

// class CurrentAccount extends Account {

//     double overdraftLimit;

//     CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
//         super(accountNumber, accountHolder, balance);
//         this.overdraftLimit = overdraftLimit;
//     }

//     @Override
//     void withdraw(double amount) {
//         if (balance + overdraftLimit >= amount) {
//             balance -= amount;
//             System.out.println(amount + " Withdrawn.");
//         } else {
//             System.out.println("Overdraft Limit Exceeded.");
//         }
//     }

//     boolean isOverdraft() {
//         return balance < 0;
//     }

//     @Override
//     void display() {
//         super.display();
//         System.out.println("Overdraft Limit : " + overdraftLimit);
//     }
// }

// class Bank {

//     Account accounts[] = new Account[10];
//     int count = 0;

//     void openAccount(Account a) {
//         accounts[count++] = a;
//     }

//     void closeAccount(int accountNumber) {
//         for (int i = 0; i < count; i++) {
//             if (accounts[i].accountNumber == accountNumber) {
//                 for (int j = i; j < count - 1; j++) {
//                     accounts[j] = accounts[j + 1];
//                 }
//                 count--;
//                 System.out.println("Account Closed Successfully");
//                 return;
//             }
//         }
//     }

//     void updateAccounts() {
//         for (int i = 0; i < count; i++) {

//             if (accounts[i] instanceof SavingsAccount) {
//                 ((SavingsAccount) accounts[i]).addInterest();
//             }

//             if (accounts[i] instanceof CurrentAccount) {
//                 CurrentAccount c = (CurrentAccount) accounts[i];
//                 if (c.isOverdraft()) {
//                     System.out.println("Letter Sent to " + c.accountHolder + " (Overdraft Alert)");
//                 }
//             }
//         }
//     }

//     void payDividend(double amount) {
//         for (int i = 0; i < count; i++) {
//             accounts[i].deposit(amount);
//         }
//     }

//     void displayAll() {
//         for (int i = 0; i < count; i++) {
//             accounts[i].display();
//         }
//     }
// }

// public class duplicate{

//     public static void main(String[] args) {

//         Bank bank = new Bank();

//         SavingsAccount s1 = new SavingsAccount(101, "Aditya", 50000, 5);
//         SavingsAccount s2 = new SavingsAccount(102, "Rahul", 30000, 4);

//         CurrentAccount c1 = new CurrentAccount(201, "Amit", 10000, 5000);
//         CurrentAccount c2 = new CurrentAccount(202, "Rohit", 5000, 7000);

//         bank.openAccount(s1);
//         bank.openAccount(s2);
//         bank.openAccount(c1);
//         bank.openAccount(c2);

//         c1.withdraw(14000);

//         bank.updateAccounts();

//         bank.payDividend(1000);

//         System.out.println("\n----- All Accounts -----");
//         bank.displayAll();

//         bank.closeAccount(102);

//         System.out.println("\n----- After Closing Account -----");
//         bank.displayAll();
//     }
// }


