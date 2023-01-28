public class CodeupCrypt {

    static double version;

    public static String hashPassword(String stringToHash){

        String hashedString;


        hashedString = stringToHash.replaceAll("a", "4")


                .replaceAll("A", "4")
                .replaceAll("e", "3")
                .replaceAll("E", "3")
                .replaceAll("i", "1")
                .replaceAll("I", "1")
                .replaceAll("o", "0")
                .replaceAll("O", "0")
                .replaceAll("u", "9")
                .replaceAll("U", "9");


        return hashedString;
    }

    public static boolean checkPassword(String hashedValue, String stringToCompare){
        return hashedValue.equals(hashPassword(stringToCompare));
    }

    public static void main(String[] args) {
        System.out.println(hashPassword("Apple"));
    }
}