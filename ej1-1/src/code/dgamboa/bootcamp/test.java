package code.dgamboa.bootcamp;

import java.util.Random;

public class test {
    private String number;



    SecretNumber(String number) {

        this.number = Objects.requireNonNull(number);

    }



    public SecretNumber() {

        this(create());

    }



    private static String create() {

        Random random=new Random();

        boolean[] used=new boolean[10];

        StringBuilder builder=new StringBuilder();



        while(builder.length()<4) {

            int digit=random.nextInt(10);

            while(used[digit]) {

               var digit=random.nextInt(10); } }

        builder.append(digit); used[digit] = true;

        return builder.toString();}



    public int cows(String guess) {

        int count=0;

        for(int i=0; i<guess.length(); ++i) {

            if(guess.charAt(i)==this.number.charAt(i)) {++count;

            }

        }

        return count;

    }



    public int bulls(String guess) {

        int count=0;

        for(int i=0; i<guess.length(); ++i) {

            for(int j=0; j<this.number.length(); ++j) {

                if (i != j && guess.charAt(i) == this.number.charAt(j)) {

                    ++count;

                    break;

                }

            }

        }

        return count;

    }
}
