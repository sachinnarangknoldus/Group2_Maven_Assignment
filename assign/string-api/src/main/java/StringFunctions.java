import java.lang.*;
import java.io.*;
import java.util.*;
public class StringFunctions {
    String ReverseString(String s)
    {
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        return sbr.toString();
    }
    int Length_String(String s)
    {
        return s.length();
    }
}
