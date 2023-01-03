package code.dgamboa.bootcamp;

public class Main {
    public static void main(String[] args) {
        Main instance = new Main();
        int a = 2, b = 13;
        double c = 60, d = 60, e = 45, f = 90, g = 35, h = 50;

        System.out.println("0. La hipotenusa es: "+ Geometry.hypotenuse(a,b));
        System.out.println("2.1 "+ a +" es par? " + Arithmetic.isEven(a) + b +" es par? " + Arithmetic.isEven(b));
        System.out.println("2.2 "+ a +" es impar? " + Arithmetic.isOdd(a) + b +" es impar? " + Arithmetic.isOdd(b));
        System.out.println("2.3.1 La diferencia (3-2) es: " + Arithmetic.differenceOfSquare(3,2));
        System.out.println("2.3.2 La diferencia (1-1) es: " + Arithmetic.differenceOfSquare(1,1));
        System.out.println("2.4.1 El tercer angulo de "+c+" y "+d+" es: " + Geometry.thirdAngle(c,d));
        System.out.println("2.4.2 El tercer angulo de "+e+" y "+f+" es: " + Geometry.thirdAngle(e,f));
        System.out.println("2.4.3 El tercer angulo de "+g+" y "+h+" es: " + Geometry.thirdAngle(g,h));
        System.out.println("2.5 El lado b es: " + Geometry.lawOfSins(5.0, 60.0,60.0));
        System.out.println("3.1 3, 4, 5 Is a triangle? " + Geometry.isTriangle(3.0,4.0,5.0));
        System.out.println("3.2 17, 10, 7 Is a triangle? " + Geometry.isTriangle(17.0, 10.0, 7.0));
        System.out.println("3.3 La distancia es: " + Geometry.distance(0.0,0.0,1.0,1.0));
        System.out.println("4.1.1 max 4 " + StringOperations.ellipsify("Java is fun", 4));
        System.out.println("4.1.2 max 7 " + StringOperations.ellipsify("Java is fun", 7));
        System.out.println("4.1.3 max 2 " + StringOperations.ellipsify("Java is fun", 2));
        System.out.println("4.1.4 max 20 " + StringOperations.ellipsify("Java is fun", 20));
        System.out.println("4.2.1 RGB 0 0 0 " + StringOperations.hexString(0,0,0));
        System.out.println("4.2.1 RGB 255 255 255 " + StringOperations.hexString(255,255,255));
        System.out.println("4.2.1 RGB 12 15 77 " + StringOperations.hexString(12,15,77));
        System.out.println("4.3.1 domain " + StringOperations.domain("https://www.java.com/en/"));
        System.out.println("4.3.2 domain " + StringOperations.domain("https://jcp.org"));
        System.out.println("5.1.1 La suma de 1234 es: " + Arithmetic.digitSum(1234));
        System.out.println("5.1.2 La suma de 555 es: " + Arithmetic.digitSum(555));
        System.out.println("5.2.1 La serie numérica 1 es: " + Arithmetic.numericSerie2(1));
        System.out.println("5.2.2 La serie numérica 2 es: " + Arithmetic.numericSerie2(2));
        System.out.println("5.3.1 ab aparece " + StringOperations.countSubstring("abracadabra", "ab") + " veces en la cadena abracadabra");
        System.out.println("5.3.1 01 aparece " + StringOperations.countSubstring("110101110101100", "01") + " veces en la cadena 110101110101100");
        System.out.println("5.4.1 La frase -one- tiene " + StringOperations.countWords("one") + " palabras");
        System.out.println("5.4.1 La frase -two words- tiene " + StringOperations.countWords("two words") + " palabras");

        var passwords = new String[]{"Abc123$_", "Abc12345", "abc123$_", "Abcdef$_", "ABC123$_"};
        var count = 0;
        for (var item: passwords) {
            ++count;
            System.out.println("6.1." + count + " El password "+ item +" es: "+ StringOperations.isStrongPassword(item));
        }

        System.out.println("6.2.1 El número 1 es primo ? " + Arithmetic.isPrime(1));
        System.out.println("6.2.1 El número 7 es primo ? " + Arithmetic.isPrime(7));
        System.out.println("6.2.1 El número 100 es primo ? " + Arithmetic.isPrime(100));

        System.out.println("6.4.1 lastThreeDigits to SnakeCase: " + StringOperations.camelCaseToSnakeCase("lastThreeDigits"));
        System.out.println("6.4.2 vowels to SnakeCase: " + StringOperations.camelCaseToSnakeCase("vowels"));
        System.out.println("6.4.3 last_three_digits to CamelCase: " + StringOperations.SnakeCaseTocamelCase("last_three_digits"));

        System.out.println("7.1 stats \n" + instance.histogram(new int[] {5, 1, 3}));
        System.out.println("7.2 el mayor item en la lista -1, 10, 3 es: " + instance.max(new int[] {-1, 10, 3}));
        System.out.println("7.2 el mayor item en la lista 5, 4, 3 es: " + instance.max(new int[] {5, 4, 3}));
        System.out.println("7.3.1 el resumen de la lista es: " + instance.stats(new int[] {3}));
        System.out.println("7.3.2 el resumen de la lista es: " + instance.stats(new int[] {2}));
        System.out.println("7.3.3 el resumen de la lista es: " + instance.stats(new int[] {5,5}));
        System.out.println("7.3.4 el resumen de la lista es: " + instance.stats(new int[] {0, 1, 2, 3, 2, 0, 5, 1, 2}));

//        StringBuilder b = new StringBuilder();
//        for (var n : instance.stats(new int[] {0, 1, 2, 3, 2, 0, 5, 1, 2})){
//            System.out.println(n);
//        }

    }



    // Cap 7
    String histogram(int[] stats){
        var builder = new StringBuilder();
        for (int i = 0; i < stats.length; i++) {
            builder.append("*".repeat(stats[i]));
            builder.append(" \n");
        }
        return builder.toString();
    }

    int max(int[] array){
        var maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    int[] stats(int[] stats){
        var resultado = new int[6];
        StringBuilder b = new StringBuilder();
        for(var item : stats){
            resultado[item]++;
        }
        for (int i = 0; i < resultado.length; i++) {
            b.append("");
        }
        return resultado;
    }

    // Cap 8


}