/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paradehackerland;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author nvharish
 */
class Result {

    public int getSwapTime(String color) {
        String findStr = "01";
        String replaceStr = "10";
        int t = 0;
        while (color.contains(findStr)) {
            color = color.replaceAll(findStr, replaceStr);
            t++;
        }
        return t;
    }
}

public class ParadeHackerLand {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        String fileName = "input.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String binCode;
        Result result = new Result();
        while ((binCode = br.readLine()) != null) {
            System.out.println(result.getSwapTime(binCode));
        }
    }

}
