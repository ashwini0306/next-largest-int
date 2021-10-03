import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TestCases {
    @Test
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        String n = sc.next();
        List arr = NextHighestInteger.divide(n);
        assertNotEquals(0,arr.size());
        assertFalse(NextHighestInteger.isDesc(arr));
        assertFalse(NextHighestInteger.isEqual(arr));
        String highest = NextHighestInteger.findNext(arr);
        int result = NextHighestInteger.merge(arr);
        assertNotEquals(0,result);
        assertNotEquals(0,highest);
        assertTrue(NextHighestInteger.isGreater(n,highest));
        System.out.println("The next highest number is:"+result);
    }
}