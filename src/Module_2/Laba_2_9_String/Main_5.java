package Module_2.Laba_2_9_String;

/*Create public static method checkPersonWithRegExp(String userNameString) which take String as argument
and return boolean value. This method must return true only if argument string value begin from Uppercase,
then other chars in Lowercase and contains only letters. In main() method declare array of String
with next values: {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
Add code to check each of these values with checkPersonWithRegExp() method and print result to console.*/

public class Main_5 {
    public static void main(String[] args) {
        String [] strings = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String str : strings) System.out.println(str+": "+checkPersonWithRegExp(str));
    }

    private static boolean checkPersonWithRegExp(String userNameString) {
        if (userNameString.length() < 2) return false;
        return userNameString.matches("[A-Z][a-z]+");
    }
}
