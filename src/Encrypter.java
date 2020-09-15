import java.util.Arrays;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.trim;

public class Encrypter {

    public String encrypt(String userInput){
       int[] number = new int[4];
       int temp;

int i;
        for ( i = 0; i < 4; i++) {
           number[i] =  Integer.parseInt(String.valueOf(userInput.charAt(i)));

number[i] = (number[i]+ 7) % 10;



        }


        temp = number[0];
        number[0] = number[2];
        number[2] = temp;
        temp = number[1];
        number[1] = number[3];
        number[3] = temp;

        StringBuilder builder = new StringBuilder();

userInput = Arrays.toString(number) .replace(",", "")  //remove the commas
        .replace("[", "")  //remove the right bracket
        .replace("]", "")  //remove the left bracket
        .replace(" ", "");
        System.out.println(userInput);
        return userInput;
    }
}
