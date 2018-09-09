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
    
    private Game game;
        
    @Before
    public void setUp(){
        game = new Game();
    }
    
    @Test
    public void canScoreGutterGame() {
        game.Roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 );
        assertThat(game.Score(), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        game.Roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.Score(), is(20));
    }
    
    @Test
    public void canScoreSpareWollowedByThree() {
        game.Roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.Score(), is(16));
    }
    
    @Test
    public void canScoreScoreStrikeFollowdByThreethenThree() {
        game.Roll(10, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.Score(), is(16));
    }
    
    @Test
    public void canScorePerfectGame() {
        game.Roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 );
        assertThat(game.Score(), is(300));
    }
    
      
}
