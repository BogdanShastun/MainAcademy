package Module_2.Laba_2_9_String;

/*Create static method: uniqueChars(String s), which must take a String as argument
and return an array of distinct (unique) chars (char[]) of the given string.
In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument.
Print result to console.*/

import org.jetbrains.annotations.NotNull;

public class Main_3 {
    @NotNull
    public static char[] uniqueChars(String string) throws NullPointerException{
        StringBuilder arrayResult = new StringBuilder();
        boolean boolAdd;
        for (int i = 0; i < string.length(); i++) {
            boolAdd = true;
            for (int j = 0; j < string.length(); j++) {
                if (string.toLowerCase().charAt(i) == string.toLowerCase().charAt(j) && i != j) {
                    boolAdd = false;
                    break;
                }
            }
            if (boolAdd && arrayResult.indexOf((string.toLowerCase().substring(i, i+1))) < 0)
                arrayResult.append(string.toLowerCase().charAt(i));
        }
        if (arrayResult.toString().isEmpty()) System.out.println("Уникальных символов в строке НЕТ!!!");
        else System.out.print("В строке '"+string+"' такие уникальные символы: ");
        return arrayResult.toString().toCharArray();
    }

    public static void main(String[] args) {
        String myStr1 = "adadс";
        System.out.println(uniqueChars(myStr1));
    }
}
