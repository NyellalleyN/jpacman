
package nl.tudelft.jpacman.level;

import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * New Test Case example
 * @author Alleyn Murphy
 */
public class UnitTest {

    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    private Player ThePlayer = Factory.createPacMan();


    @Test
    void testSetDirection()
    {
        Direction east = Direction.valueOf("EAST");
        assertThat(ThePlayer.getDirection()).isEqualTo(east);
        Direction north = Direction.valueOf("NORTH");
        ThePlayer.setDirection(north);
        assertThat(ThePlayer.getDirection()).isEqualTo(north);
    }

    @Test
    void testHasSquare()
    {
        assertThat(ThePlayer.hasSquare()).isNotEqualTo(null);
    }


}
