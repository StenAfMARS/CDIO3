
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUI extends JPanel {
    private static final int RECT_X = 20;
    private static final int RECT_Y = RECT_X;
    private static final int RECT_WIDTH = 100;
    private static final int RECT_HEIGHT = RECT_WIDTH;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the rectangle here
        //Left coloum
        g.drawRect(20,20,100,100);
        g.drawRect(20,120,100,100);
        g.drawRect(20,220,100,100);
        g.drawRect(20,320,100,100);
        g.drawRect(20,420,100,100);
        g.drawRect(20,520,100,100);
        g.drawRect(20,620,100,100);
        g.drawRect(20,720,100,100);

        //Right
        g.drawRect(720,20,100,100);
        g.drawRect(720,120,100,100);
        g.drawRect(720,220,100,100);
        g.drawRect(720,320,100,100);
        g.drawRect(720,420,100,100);
        g.drawRect(720,520,100,100);
        g.drawRect(720,620,100,100);
        g.drawRect(720,720,100,100);

        //Top
        g.drawRect(20,20,100,100);
        g.drawRect(120,20,100,100);
        g.drawRect(220,20,100,100);
        g.drawRect(320,20,100,100);
        g.drawRect(420,20,100,100);
        g.drawRect(520,20,100,100);
        g.drawRect(620,20,100,100);
        g.drawRect(720,20,100,100);

        //Bottom
        g.drawRect(20,720,100,100);
        g.drawRect(120,720,100,100);
        g.drawRect(220,720,100,100);
        g.drawRect(320,720,100,100);
        g.drawRect(420,720,100,100);
        g.drawRect(520,720,100,100);
        g.drawRect(620,720,100,100);
        g.drawRect(720,720,100,100);


    }

    public static class SwingButtonExample extends JPanel implements ActionListener {
        protected JButton b1, b2, b3;

        public SwingButtonExample() {


            b1 = new JButton("Throw the dices");
            b1.setVerticalTextPosition(AbstractButton.CENTER);
            b1.setHorizontalTextPosition(AbstractButton.LEADING);
            b1.setMnemonic(KeyEvent.VK_D);
            b1.setActionCommand("disable");
            b1.setLocation(400,400);

            b2 = new JButton("Buy the property");
            b2.setVerticalTextPosition(AbstractButton.BOTTOM);
            b2.setHorizontalTextPosition(AbstractButton.CENTER);
            b2.setActionCommand("middle");
            b2.setMnemonic(KeyEvent.VK_M);
            /*if (player.money < felt.money)
            {
                b2.setEnabled(false);
            } else {
                b2.setEnabled(true);
            }*/

            b3 = new JButton("Buy the house");
            //Use the default text position of CENTER, TRAILING (RIGHT).
            b3.setMnemonic(KeyEvent.VK_E);
            b3.setActionCommand("enable");
             /*if (player.money < house.money || player.own3OfAKind == true)
            {
               b3.setEnabled(false);
            } else {
              b3.setEnabled(true);
            }*/

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            b1.setToolTipText("Klik her for at slå med terningerne");
            b2.setToolTipText("Klik her for at købe egendommen");
            b3.setToolTipText("Klik her for at lægge huse på dine egendommen");

            add(b1);
            add(b2);
            add(b3);
        }


        public void actionPerformed(ActionEvent e)
        {
            //In here is where the logic shall be for when you the button should be open or locked
            //If the player doesn't have enough money to buy the place the button will be disable



            //the player needs to have alle 3 of a place before they can build house and ofcause have enough money for it

        }
    }

    @Override
    public Dimension getPreferredSize() {
        // so that our GUI is big enough
        return new Dimension(RECT_WIDTH + 2 * RECT_X, RECT_HEIGHT + 2 * RECT_Y);
    }

    // create the GUI explicitly on the Swing event thread
    private static void createAndShowGui() {

        int BUTTON_LOCATION_X = 300;  // location x
        int BUTTON_LOCATION_Y = 50;   // location y
        int BUTTON_SIZE_X = 140;      // size height
        int BUTTON_SIZE_Y = 50;       // size width

        //felterne
        GUI mainPanel = new GUI();

        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);

        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);



        //Adding buttons to the pane
        SwingButtonExample newContentPane = new SwingButtonExample();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.getContentPane().add(newContentPane);





        frame.setSize(1000,1000);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
}