import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class TrainTimetableGUI extends JFrame {
    // declaring variable names for feautures of the GUI
    private JMenuBar menuBar;
    private JButton button1;
    private JComboBox combobox1;
    private JComboBox combobox2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label8;
    private JLabel label9;
    private JTextField textfield1;
    private JTextField textfield2;
    
    private ArrayList<Station> stationList = new ArrayList<Station>();

    //Constructor 
    /**
     * Text genereted by Simple GUI Extension for BlueJ
     * This Constructor sets up the GUI Interface
     */
    public TrainTimetableGUI(){

        this.setTitle("GUI_project");
        this.setSize(500,1000);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,500));
        contentPane.setBackground(new Color(255,255,255));
        //Search Button
        button1 = new JButton();
        button1.setBounds(193,249,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Search");
        button1.setVisible(true);
        //Travelling Option
        combobox1 = new JComboBox();
        combobox1.setBounds(43,197,150,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        combobox1.addItem("Please Select...");
        combobox1.addItem("Before");
        combobox1.addItem("After");
        // Travelling Time
        combobox2 = new JComboBox();
        combobox2.setBounds(215,197,150,35);
        combobox2.setBackground(new Color(214,217,223));
        combobox2.setForeground(new Color(0,0,0));
        combobox2.setEnabled(true);
        combobox2.setFont(new Font("sansserif",0,12));
        combobox2.setVisible(true);
        combobox2.addItem("Please Select...");
        combobox2.addItem("06");
        combobox2.addItem("07");
        combobox2.addItem("08");
        combobox2.addItem("09");
        combobox2.addItem("10");
        combobox2.addItem("11");
        combobox2.addItem("12");
        combobox2.addItem("13");
        combobox2.addItem("14");
        combobox2.addItem("15");
        combobox2.addItem("16");
        combobox2.addItem("17");
        combobox2.addItem("18");
        combobox2.addItem("19");
        combobox2.addItem("20");
        combobox2.addItem("21");
        // Station Name Label for Textfield box   
        label1 = new JLabel();
        label1.setBounds(140,88,90,35);
        label1.setBackground(new Color(255,255,255));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Station Name:");
        label1.setVisible(true);
        // Label for Software Name
        label3 = new JLabel();
        label3.setBounds(217,5,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("SansSerif",0,15));
        label3.setText(" Find a Train");
        label3.setVisible(true);
        // Label for Travelling Option
        label4 = new JLabel();
        label4.setBounds(89,167,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Travelling");
        label4.setVisible(true);
        // Label for Travelling Time
        label5 = new JLabel();
        label5.setBounds(245,165,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Hour:");
        label5.setVisible(true);
        // Label for Search Results
        label6 = new JLabel();
        label6.setBounds(89,290,800,400);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Search Results:");
        label6.setVisible(true);
        // Label for Instructions to User
        label8 = new JLabel();
        label8.setBounds(166,42,200,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("Please Complete the Fields Below");
        label8.setVisible(true);
        // Label for Instructions to User
        label9 = new JLabel();
        label9.setBounds(178,130,200,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("Please Select Time of Travel");
        label9.setVisible(true);
        // Textfield for Station Name
        textfield1 = new JTextField();
        textfield1.setBounds(220,87,150,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);
        // this Method creates an action Listener which triggers the Searching Algorithm when the user clicks the GUI Button
        button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    StationList lst  = new StationList();
                    ArrayList<Station> result = lst.searchTrainTimes(textfield1.getText(), Integer.parseInt(combobox2.getSelectedItem().toString()), combobox1.getSelectedItem().toString());
                    
                    label6.setText(showResult(result));
                }
        });
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(combobox1);
        contentPane.add(combobox2);
        contentPane.add(label1);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label8);
        contentPane.add(label9);
        contentPane.add(textfield1);
        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    /**
     * Method to Generate Menu
     */
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    
    /**
    *Iterator to search the Arraylist and find corresponding results from search
    */
      public static String showResult(ArrayList<Station> result) {
        Iterator iterator = result.iterator();
        String s = "";
        while (iterator.hasNext()) {
            Station st = (Station)iterator.next();
            s = s + st.toString();
        }
        
        return s;
    }
     
     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TrainTimetableGUI();
            }
        });
    }

}