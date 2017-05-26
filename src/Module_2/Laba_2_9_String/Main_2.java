package Module_2.Laba_2_9_String;

/*Create a class Main with a main() method. In method main() declare two local variables
myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
Write code to display all of the letters, which are present in the first word, but absent in the second.*/

import org.jetbrains.annotations.NotNull;

public class Main_2 {
    @NotNull
    public static String unique(String string_1, String string_2) throws NullPointerException{
        StringBuilder arrayResult = new StringBuilder();
        boolean boolAdd;
        for (int i = 0; i < string_1.length(); i++) {
            boolAdd = true;
            for (char a : string_2.toLowerCase().toCharArray()) {       //Проверяю есть ли і-я буква первой строки
                if (a == string_1.toLowerCase().charAt(i)) {            //во второй строке. Если есть, то добавлять
                    boolAdd = false;                                    //ее в результирующую строку не будем.
                    break;
                }
            }
            if (boolAdd && arrayResult.indexOf((string_1.toLowerCase().substring(i, i+1))) < 0) //Проверяю есть ли уже
                arrayResult.append(string_1.toLowerCase().charAt(i));            //такая буква в результирующей строке.
        }
        return arrayResult.toString();
    }

    public static void main(String[] args) {
        String myStr1="CooaccrotOon@9o", myStr2="maQEmaqe";
        System.out.println(unique(myStr1,myStr2));
    }
}
