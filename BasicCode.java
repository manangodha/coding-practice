package strings;
import java.util.*;
public class copy_string {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter string");
        String str2[]=new String[10];
        String str1[]=new String[10];
        int i;
        for(i=0;i<10;i++)
        {
            str2[i]=sc.nextLine();
        }
        for(i=0;i<10;i++)
        {
            str1[i]=str2[i];
        }
        for(i=0;i<10;i++)
        {
            System.out.print(str1[i]+" ");
        }
    }
    /*
     int i = 0; 
    for (i=0; s1[i] != '\0'; i++) 
       s2[i] = s1[i]; 
    s2[i] = '\0'; 
    
    */
}
