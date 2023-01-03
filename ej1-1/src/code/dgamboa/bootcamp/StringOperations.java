package code.dgamboa.bootcamp;

public class StringOperations {

    public static String ellipsify(String a, int max){
        var i = a.indexOf(" ", max-1);
        return a.length() <= max ? a : i == -1 ? a + "..." : a.substring(0, i) + "...";
    }

    public static String hexString(int a, int b, int c){
        var hexa = Integer.toHexString(a).length()==2 ? Integer.toHexString(a) : "0"+Integer.toHexString(a);
        var hexb = Integer.toHexString(b).length()==2 ? Integer.toHexString(b) : "0"+Integer.toHexString(b);
        var hexc = Integer.toHexString(c).length()==2 ? Integer.toHexString(c) : "0"+Integer.toHexString(c);
        return   hexa.toUpperCase()+hexb.toUpperCase()+hexc.toUpperCase();
    }

    public static String domain(String s){
        var sub = s.substring(8);
        var i = sub.indexOf("/");
        String url = i == -1 ? sub : sub.substring(0,i);
        return url;
    }

    public static int countSubstring(String s, String sub){
        int i = 0, count = 0;
        while ((i = s.indexOf(sub, i)) != -1){
            ++count;
            i += sub.length() -1;
        }
        return count;
    }

    public static int countWords(String s){
        String space = " ";
        int i = 0, count = 0;
        while ((i = s.indexOf(space, i)) != -1){
            ++count;
            i += space.length();
        }
        return count+1;
    }

    public static boolean isVowel(char c) {
        var upperCase = Character.toUpperCase(c);
        return switch(upperCase) {
            case 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public static int countVowels(String sentence) {
        var vowels = 0;
        for (var i = 0; i < sentence.length(); ++i) {
            var current = sentence.charAt(i);
            if (isVowel(current)) {
                ++vowels;
            }
        }
        return vowels;
    }

    public static String format(String phone, String format) {
        var builder = new StringBuilder();
        var phoneIndex = 0;
        for (var i = 0; i < format.length(); ++i) {
            var character = format.charAt(i);
            if (character != 'X') {
                builder.append(character);
            } else {
                var phoneDigit = phone.charAt(phoneIndex);
                builder.append(phoneDigit);
                ++phoneIndex;
            }
        }
        return builder.toString();
    }

    public static String formattedPhone(String phone) {
        if (phone.length() == 10) {
            return format(phone, "(XXX) XXX-XXXX");
        } else if (phone.length() == 7) {
            return format(phone, "XXX XXXX");
        } else {
            return phone;
        }
    }

    // 6.1 - por lo menos una mayuscula, un número, un caracter especial, min 8 caracteres
    public static boolean isStrongPassword(String s){
        var upperCase = false;
        var number = false;
        var specialChar = false;
        var minChar = false;
        for (int i = 0; i < s.length(); i++) {
            char charac = s.charAt(i);
            upperCase |= Character.isUpperCase(charac);
            number |= switch(charac) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> true;
                default -> false;
            };
            specialChar = Character.isLetterOrDigit(charac) ? false : true;
            //System.out.println(upperCase + " " + number + " " + specialChar);
        }
        minChar = s.length() < 8 ? false : true;
        var valid = upperCase & number & specialChar;
        return valid;
    }

    public static String camelCaseToSnakeCase(String palabra){
        var builder = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            char charac = palabra.charAt(i);
            if(Character.isUpperCase(charac)){
                builder.append("_"+Character.toLowerCase(charac));
            } else {
                builder.append(charac);
            }
        }
        return builder.toString();
    }

    public static String SnakeCaseTocamelCase(String palabra){
        var builder = new StringBuilder();
        var space = false;
        for (int i = 0; i < palabra.length(); i++) {
            char charac = palabra.charAt(i);
            if(charac == '_'){
                space = true;
            } else {
                if(space == true){
                    builder.append(Character.toUpperCase(charac));
                    space = false;
                } else {
                    builder.append(charac);
                }
            }
        }
        return builder.toString();
    }
}
