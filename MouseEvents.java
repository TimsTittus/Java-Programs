import javax.swing.*;
import java.awt.event.*;

public class SimpleMouseEventDemo extends JFrame implements MouseListener {

    JLabel label;

    public SimpleMouseEventDemo() {
        // Set up the frame
        setTitle("Mouse Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        label = new JLabel("Click anywhere!", SwingConstants.CENTER);
        add(label);

        // Add MouseListener to the frame
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Frame");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleMouseEventDemo demo = new SimpleMouseEventDemo();
            demo.setVisible(true);
        });
    }
}
