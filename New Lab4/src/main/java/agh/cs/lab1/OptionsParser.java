package agh.cs.lab1;

import java.util.Arrays;

public class OptionsParser {

    public static MoveDirection[] parse(String[] args){
        MoveDirection[] wynik = new MoveDirection[args.length];
        int i,j;
        for(i=0, j=0; i<args.length ; i++) {
            switch (args[i]){
                case "f":
                case "forward":
                    wynik[j] = MoveDirection.FORWARD;
                    j++;
                    break;
                case "b":
                case "backward":
                    wynik[j] = MoveDirection.BACKWARD;
                    j++;
                    break;
                case "l":
                case "left":
                    wynik[j] = MoveDirection.LEFT;
                    j++;
                    break;
                case "r":
                case "right":
                    wynik[j] = MoveDirection.RIGHT;
                    j++;
                    break;
            }
        }
        return Arrays.copyOf(wynik, j);
    }
}
