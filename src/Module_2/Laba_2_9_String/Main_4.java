package Module_2.Laba_2_9_String;

/*In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot” delimiter
using StringTokennizer class, and iterate the StringTokenizer elements and print it out one by one to console.
String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.*/

import java.util.StringTokenizer;

public class Main_4 {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer st = new StringTokenizer(myStr, " \t\n\r,.:");
        while(st.hasMoreTokens()) System.out.println(st.nextToken()) ;
        }
}
