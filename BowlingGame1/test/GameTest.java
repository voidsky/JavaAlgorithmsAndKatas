/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author namai
 */
public class GameTest {
    @Test
    public void canMakeGame() {
        new Game();
    }
    
    @Test
    public void canRollBall() {
        Game game = new Game();
        game.Roll(0);                
    }
    
    @Test
    public void canScoreGutterGame() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.Roll(0);
        }
        assertThat(game.Score(), is(0));
        
    }
    
    
}
