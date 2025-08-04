import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        String ciphered = "";
        k=k%26;
        for(int i =0; i<s.length();i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                char cipheredChar = (char)(s.charAt(i)+k);
                if (cipheredChar > 'Z'){
                    cipheredChar = (char)(((int)'A')+(int)cipheredChar - ((int)'Z')-1);
                }
                
                ciphered=ciphered+(Character.toString(cipheredChar));
            }else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                char cipheredChar = (char)(s.charAt(i)+k);
                if (cipheredChar > 'z'){
                    cipheredChar = (char)(((int)'a')+(int)cipheredChar - ((int)'z')-1);
                }
                ciphered=ciphered+(Character.toString(cipheredChar));
            }
            else{
                ciphered=ciphered+(Character.toString((char)(s.charAt(i))));
            }
            
        }
    return ciphered;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
