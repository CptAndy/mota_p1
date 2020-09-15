import java.util.Arrays;

public class Decrypter {
    public String decrypt(String userInput){
        int[] number = new int[4];
        int temp;

        int i;
        for ( i = 0; i < 4; i++) {
            number[i] =  Integer.parseInt(String.valueOf(userInput.charAt(i)));




        }
        number[0] = 10 %(number[0] - 7);
    number[1]= 10 %(number[1]- 7);
    number[2]=(number[2]-7) % 10; ;
    number[3]=(number[3]-7) % 10 ;




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