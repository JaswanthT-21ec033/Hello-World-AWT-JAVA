import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

 class SimpleFrame {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Simple Frame");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label);

      
        frame.setSize(600, 600);


        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }
}
