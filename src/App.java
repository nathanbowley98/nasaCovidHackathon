import javax.swing.*;

public class App {

    public App() {
        //new JFrame container
        JFrame jFrame = new JFrame("Nasa covid tracker");

        //initial frame size
        jFrame.setSize(275, 100);

        //terminate the program when closed
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a text-based label
        JLabel jLabel = new JLabel("map of the world.");

        //add the label to the content pane.
        jFrame.add(jLabel);

        //display the frame.
        jFrame.setVisible(true);

        //display the map


    }

    public static void main(String[] args) {
        //create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() { public void run() { new App(); } } );
    }
}
