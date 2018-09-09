/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namai
 */
public class Game {
    
    private int roll = 0;
    private int[] rolls = new int[21];
   
    public void Roll(int...rolls)
    {
        for (int pinsDown : rolls) {
            Roll(pinsDown);
        }
    }
    
    public void Roll(int pinsDown) {
        rolls[roll++] = pinsDown;
    }
    
    public int Score() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(cursor) ) {
                score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
                cursor++;
            }
            else if (isSpare(cursor)) {
                score += 10 + rolls[cursor + 2];
                cursor += 2;
                
            } else {
                score += rolls[cursor] + rolls[cursor+1];
                cursor += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int cursor) {
        return rolls[cursor] == 10;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }
    
}
