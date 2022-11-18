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
    static long mod=(long)(Math.pow(10,9)+7);

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */
    public static long fact(int n)
    {
        long res=1;
        for(int i=2;i<=n;i++)
        {
            res=(res*i)%mod;
        }
        return res;
    }
    public static long bin_exp(long a,long b)
    {
        if(b==0)
            return 1;
        else if(b==1)
            return a%mod;
        else
        {
            long temp=bin_exp(a,b/2);
            temp=(temp*temp)%mod;
            if(b%2==0)
                return temp;
            else 
                return ((a%mod)*temp)%mod;
            
        }
    }
    public static int solve(int n, int m) {
    // Write your code here
        return (int)(((fact(n+m-1)%mod)*((bin_exp((fact(m-1)*fact(n)),(mod-2)))%mod))%mod);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.solve(n, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
