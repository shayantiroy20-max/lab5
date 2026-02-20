import java.util.*;

class StringOperationsLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Change case + Reverse
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        // Change case manually
        String changed = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c))
                changed += Character.toLowerCase(c);
            else
                changed += Character.toUpperCase(c);
        }
        System.out.println("The string after changing the case is " + changed);

        // Reverse string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("The string after reversing is " + reversed);


        // 2) Compare two strings (ASCII difference like strcmp)
        System.out.print("\nEnter the second string for comparision : ");
        String str2 = sc.nextLine();

        int diff = 0;
        int len = Math.min(str.length(), str2.length());
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=str2.charAt(i)){
                diff = str.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if(diff==0) diff = str.length() - str2.length();

        System.out.println("The difference between ASCII value is " + diff);


        // 3) Insert one string into another
        System.out.print("\nEnter the string to be inserted into first string : ");
        String insert = sc.nextLine();
        String inserted = str + " " + insert;
        System.out.println("The string after insertion is : " + inserted);


        // 4) Convert to uppercase and lowercase
        System.out.print("\nEnter a String : ");
        String s3 = sc.nextLine();
        System.out.println("Uppercase: " + s3.toUpperCase());
        System.out.println("Lowercase: " + s3.toLowerCase());


        // 5) Character search and position
        System.out.print("\nEnter a String : ");
        String s4 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        sc.nextLine();   // clear buffer

        int pos = s4.indexOf(ch);
        if(pos >= 0)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");


        // 6) Palindrome check
        System.out.print("\nEnter a String : ");
        String s5 = sc.nextLine();
        String rev = new StringBuilder(s5).reverse().toString();

        if(s5.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");


        // 7) Count words, vowels, consonants
        System.out.print("\nEnter a String : ");
        String s6 = sc.nextLine();

        int words = s6.trim().isEmpty() ? 0 : s6.trim().split("\\s+").length;

        int vowels=0, consonants=0;
        for(char c : s6.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)>=0) vowels++;
                else consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}