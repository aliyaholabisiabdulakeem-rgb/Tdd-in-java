import java.util.Scanner;

public class CreditCardValidator{
public static String getCardType(int[] creditCard){
    if (creditCard[0] == 4){
        return "Visa Card";
}
    if (creditCard[0] == 5){
        return "Master Card";
}
    if (creditCard[0] == 3 && creditCard[1] == 7){
        return "American Express Card";
}
    if (creditCard[0] == 6){
        return "Discover Card";
}
    else{
        return "Invalid card";
}
}
public static boolean checkCardValidity(int[] creditCard){
    int total = 0;
    for(int index = creditCard.length - 1; index >= 0; index--){
        int number = creditCard[index];
        if((creditCard.length - 1 - index) % 2 == 1){
            number = number * 2;
            if(number > 9){
                number = number - 9;
}
}
        total = total + number;
}
    return total % 10 == 0;
}
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, Kindly Enter Card details to verify"); 
        String CreditCardNumber = input.nextLine();

    int[] creditCard = new int[CreditCardNumber.length()];
    for(int count = 0; count < CreditCardNumber.length(); count++){
        creditCard[count] = CreditCardNumber.charAt(count) - '0';
} 
    String CreditCardType = getCardType(creditCard);
    int CreditCardLength = creditCard.length;
    boolean isCreditCardValid = checkCardValidity(creditCard);
    
    if(CreditCardLength < 13 || CreditCardLength > 16){
        boolean isCardValid = false;
}
   String ValidityStatus = "Inavalid";
    if(isCreditCardValid && CreditCardType != ("Invalid card")){
         ValidityStatus = "Valid";
}
    
    System.out.println("**************************************");
    System.out.println("**Credit Card Type: " + CreditCardType);
    System.out.println("**Credit Card Number: " + CreditCardNumber);
    System.out.println("**Credit Card Digit Length: " + CreditCardLength);
    System.out.println("**Credit Card Validity Status: " + ValidityStatus);
    System.out.println("***************************************");
}
}


