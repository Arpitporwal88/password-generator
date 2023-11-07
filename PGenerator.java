import java.util.*;

public class PGenerator { 
                  static char[] Password(int len) 
	{ 
                           System.out.println("Succesfuly Password Generated : ");  
                            System.out.print("Your Generated password is : "); 
                       
                                        String capital_words= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String small_words= "abcdefghijklmnopqrstuvwxyz"; 
		String numbers = "0123456789"; 
		String special_symbols = "!@&";                                         
                                        String values =   capital_words + small_words + numbers +special_symbols;
                                        Random random = new Random(); 
                                         char[] password = new char[len]; 
                                         for (int i = 0; i < len; i++) 
                                               { 
                                                     password[i] = values.charAt(random.nextInt(values.length())); 
                                               } 
                                                      return password; 
                      } 
                   public static void main(String[] args) 
	      {   
	             int length= 8; 
                                 System.out.println(Password(length)); 
                          }  
} 
