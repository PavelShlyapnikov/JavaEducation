package Timus.tasks_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/Timus/tasks_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshallAndlilly = 2;

        try {

            BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                      new BufferedReader(new FileReader(inputFileName));

            String readLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if(numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")) {
                    numberOfPairs++;
                }
            }

            int result;

            int guest = (marshallAndlilly + numberOfFriends + numberOfPairs);

            if(guest == 13) {
                result = (guest * 100) +100;
            } else {
                result = guest * 100;
            }

            System.out.println(result);

            System.out.println();
        } catch (IOException exception) {

        }

    }
}
