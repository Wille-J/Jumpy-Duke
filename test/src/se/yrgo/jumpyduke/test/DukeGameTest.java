package se.yrgo.jumpyduke.test;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.junit.jupiter.api.Test;
import se.yrgo.jumpyduke.DukeGame;
import se.yrgo.jumpyduke.screens.MenuScreen;

import static org.junit.jupiter.api.Assertions.*;

class DukeGameTest extends Game {
    SpriteBatch sb;
    DukeGame dukeGame = new DukeGame();

    @Override
    public void create() {
        sb = new SpriteBatch();
    }

    @Test
    public void testCreateDukeGameObjectNotNull() {
        assertNotNull(dukeGame);
    }
//    Probably gradle needs pointing to correct working directory
//    Not yet working
//    @Test
//    public void testCreateMenuScreenObjectNotNull(){
//        assertNotNull(new MenuScreen(sb, dukeGame));
//    }

}