import java.awt.*;

public class Button
{
    private int x1, y1, x2, y2;

    private String label;

    private String state;

    private Game game;

    public Button(Game game, int x1, int y1, int x2, int y2, String label, String state)
    {
        this.game = game;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.label = label;
        this.state = state;
    }

    public void draw(Graphics g)
    {
        g.setColor(new Color(140, 122,105));
        g.fillRoundRect(x1, y1, x2-x1, y2-y1, 50, 50);
    }

    public boolean mouseInBounds(int mouseX, int mouseY)
    {
        if (mouseX >= x1 && mouseX <= x2 && mouseY >= y1 && mouseY <= y2)
        {
            return true;
        }
        return false;
    }

    public String press()
    {
        return state;
    }
}
