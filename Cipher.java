import java.io.*;

public class Cipher { 
    
    public static BufferedReader br;
    public static StringBuilder cipher;
   
    public static void main(String[] args) throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        
        Main();
       
    }
    public static void Main()throws IOException{
        
        System.out.println("Enter string to be encrypted: ");
        String text = br.readLine();
        text = text.toUpperCase();
        
        System.out.println("Please Enter the key: ");
        int s = Integer.parseInt(br.readLine());
         
        System.out.println("Text: " + text); 
        System.out.println("Key: " + s); 
        System.out.println("Cipher: " + encrypt(text,s));
        
        System.out.println("Do you want to Encypt again?\n"
                + "y/n");
        String yn = br.readLine();
        
        if(yn.equalsIgnoreCase("y")){
            Main();
        }
        else{
            System.out.println("Thank you");
            System.exit(0);
        }
    }
    // Encrypts text using a shift od s 
    public static StringBuffer encrypt(String text, int s) { 
        StringBuffer result = new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            //if (Character.isUpperCase(text.charAt(i))) 
            //{ 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            //} 
            /*else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } */
        } 
        return result; 
    }
    
} 