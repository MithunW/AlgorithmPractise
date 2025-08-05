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
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        List<Integer> intList = Arrays.stream(n.split("")).map(Integer::parseInt).collect(Collectors.toList());
        long sum =intList.stream().mapToInt(Integer::intValue).sum();
        
        if(k!=0){
            sum=sum*k;
        }
        
        if (sum>=0 && sum<10){
            return (int)sum;
            
        }else{
            return superDigitHelper(sum);
        }

    }
    public static int superDigitHelper(long n) {
        if (n <10){
            return (int)n;
        }
        long sum = 0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        
        return superDigitHelper(sum);

    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
