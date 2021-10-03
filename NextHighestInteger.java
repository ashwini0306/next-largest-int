import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextHighestInteger {
    public static List<Integer> divide(String number)
    {
        while(number.length()<1)
        {
            System.out.println("Please enter a number greater than 10:\n");
            Scanner sc =new Scanner(System.in);
            number = sc.next();
        }
        Stream<String> str = Arrays.stream(number.split(""));
        List<Integer> arr = str.map(Integer::valueOf).collect(Collectors.toList());
        return arr;
    }
    public static boolean isDesc(List<Integer> arr)
    {
        int count =0;
        for(int i=arr.size()-1;i>0;i--)
        {
            if(arr.get(i-1)>arr.get(i))
                count++;
        }
        if(count==arr.size()-1)
            return true;
        else
            return false;
    }
    public static boolean isEqual(List<Integer> arr)
    {
        return arr.stream().distinct().count()<=1;
    }
    public static void swap(List<Integer> a, int b,int c)
    {
        int temp = a.get(b);
        a.set(b,a.get(c));
        a.set(c,temp);
    }
    public static String findNext(List<Integer> a)
    {
        int i;
        for(i=a.size()-1;i>0;i--)
        {
            if(a.get(i)>a.get(i-1))
                break;
        }
        int d = a.get(i-1);
        int minindex = i;
        for(int j=a.size()-1;j>=minindex;j--)
        {
            if(a.get(j)>d && a.get(j)<a.get(minindex))
                minindex=j;
        }
        swap(a,i-1,minindex);
        Integer [] arr = new Integer[a.size()];
        arr=a.toArray(arr);
        Arrays.sort(arr,i,arr.length-1);
        a=(List)Arrays.asList(arr);
        String s = a.toString();
        return s;
    }
    public static int merge(List<Integer> a)
    {
        int d=1;
        int res=0;
        for(int i=a.size()-1;i>=0;i--)
        {
            res+=a.get(i)*d;
            d*=10;
        }
        return res;
    }
    public static boolean isGreater(String n, String h)
    {
        if(n.compareTo(h)<0)
            return true;
        else
            return false;
    }
}
