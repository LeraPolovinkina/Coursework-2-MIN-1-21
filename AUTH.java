import com.opencsv.CSVWriter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.*;

public class AUTH implements ActionListener {
    public static JLabel userlabel;
    public static JTextField userText;
    public static JLabel passwordLabel;
    public static JPasswordField passwordText;
    public static JButton button;
    public static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        panel.setBackground(Color.orange);
        frame.setTitle("Coursework MIN-1-21. Construction company");
        frame.setBounds(450, 150, 500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        userlabel = new JLabel("Choose type of account");
        userlabel.setFont(new Font("Serif", Font.BOLD, 15));
        userlabel.setBounds(10, 20, 200, 25);
        panel.add(userlabel);

        userText = new JTextField(20);
        userText.setBounds(170, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 15));
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(170, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Enter");
        button.setBounds(210, 80, 80, 25);
        button.addActionListener(new AUTH());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 500, 25);
        panel.add(success);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        if (user.equals("Director") && password.equals("director")) {
            Director.DirEnterToMenu();
            try {attendance(new String[]{"BAIZBECOVA ADEL"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else if (user.equals("Marketer") && password.equals("marketer")) {
            Marketer.MarketerEnterToMenu();
            try {attendance(new String[]{"BERLICOVA NAGIMA"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else if (user.equals("HR") && password.equals("hr")) {
            HR.HREnterToMenu();
            try {attendance(new String[]{"SAZANOV DASTAN"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else if (user.equals("Manager") && password.equals("manager")) {
            Manager.ManagerEnterToMenu();
            try {attendance(new String[]{"POLOVINKINA VALERIIA"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else if (user.equals("Sale manager") && password.equals("salesman")) {
            try {SaleManager.SaleManagerEnterToMenu();
            } catch (IOException ex) {
                ex.printStackTrace();}
            try {attendance(new String[]{"JUNUSOV SANDJARBEK"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else if (user.equals("Employee") && password.equals("employee")) {
            try {
                Employee.EmployeeEnterToMenu();
            } catch (IOException ex) {
                ex.printStackTrace();}
            try {attendance(new String[]{"AVAZOV BEKSULTAN"});
            } catch (IOException ex) {
                ex.printStackTrace();}
        } else {
            success.setText("Sorry, but we didn't find this type of account, please\t" +
                    "repeat.");
            success.setFont(new Font("Serif", Font.ITALIC, 14));}}

    public static void attendance(String [] user) throws IOException {
        String currentTime = String.valueOf(Calendar.getInstance().getTime());
        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String[] array = {Arrays.toString(user), currentTime};
        writer.writeNext(array);
        writer.close();}}