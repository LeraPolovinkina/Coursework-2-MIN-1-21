import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.*;
import java.util.List;

class Director extends AUTH{

    public static ArrayList<Integer> listForChart = new ArrayList<>();

    public static void DirEnterToMenu(){
        JFrame Dir = new JFrame();
        JPanel layer = new JPanel();
        layer.setVisible(true);
        layer.setLayout(null);
        Dir.setTitle("Menu (Director)");
        layer.setBackground(new Color(208,255,206));
        Dir.setBounds(450, 175, 500, 480);
        Dir.setVisible(true);
        JButton employee_list = new JButton("Employee list");
        AUTH instance = new AUTH();
        employee_list.addActionListener(instance);
        employee_list.setBounds(190, 20, 120, 25);
        employee_list.addActionListener(e -> {
            try {
                Director.employeeList();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton presence = new JButton("Presence");
        presence.setBounds(190, 50, 120, 25);
        presence.addActionListener(instance);
        presence.addActionListener(e -> {
            Director.time();
            try {
                Director.attendance();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton clients = new JButton("Clients");
        clients.addActionListener(instance);
        clients.setBounds(190, 80, 120, 25);
        clients.addActionListener(instance);
        clients.addActionListener(e -> {
            try {
                Director.clients();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton budget = new JButton("Budget");
        budget.addActionListener(instance);
        budget.setBounds(190, 110, 120, 25);
        budget.addActionListener(e -> Director.budget());

        JButton salary = new JButton("Salary");
        salary.addActionListener(instance);
        salary.setBounds(190, 140, 120, 25);
        salary.addActionListener(e -> {
            try {
                Director.salary();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton addEmployee = new JButton("Add employee");
        addEmployee.setBounds(190, 170, 120, 25);
        addEmployee.addActionListener(instance);
        addEmployee.addActionListener(e -> {
            try {
                Director.addEmployee();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton deleteEmployee = new JButton("Delete employee");
        deleteEmployee.setBounds(175, 200, 150, 25);
        deleteEmployee.addActionListener(instance);
        deleteEmployee.addActionListener(e -> {
            try {
                Director.deleteEmployee();
            } catch (IOException | CsvException ex) {
                ex.printStackTrace();}});
        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 170, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                Manager.mySalary(1);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        Dir.add(layer);
        layer.add(employee_list);
        layer.add(presence);
        layer.add(clients);
        layer.add(budget);
        layer.add(salary);
        layer.add(addEmployee);
        layer.add(deleteEmployee);
        layer.add(mySalary);}

    public static void employeeList() throws IOException {
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/info.csv";
        String line;
        ArrayList <String> employeeList = new ArrayList <>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            employeeList.add(Arrays.toString(values));
            int number = 0;
            for (int i = 0; i < employeeList.size(); i++) {
                number = i;
            }System.out.println(number +" "+ (values[0]));}
    }

    public static void clients() throws IOException {
        clientsList("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/bishkek.csv",0);
        clientsList("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/kara-balta.csv",1);
        clientsList("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/talas.csv",2);
        clientsList("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tokmok.csv",3);
        clientsList("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/others.csv",4);
        writeNumberOfClientsToFile();
        FUNCTIONS demo = new FUNCTIONS("Clients");
        demo.setSize(660, 460);
        demo.setBounds(450,215,560,400);
        demo.setVisible(true);
    }

    public static void budget(){
        BarChart_AWT chart = new BarChart_AWT("Budget", "Budget");
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );}

    public static void salary() throws IOException {
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/salary.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            System.out.println((values[0]));}}

    public static void addEmployee() throws IOException {
        System.out.println("Enter your name and position");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/info.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] nameRecord =name.split(",");
        writer.writeNext(nameRecord);
        System.out.println("New employee added");
        writer.close();
    }

    public static void deleteEmployee() throws IOException, CsvException {
        System.out.println("Enter the line number");
        Scanner sc = new Scanner(System.in);
        int rowNumber = sc.nextInt();
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/info.csv";
        CSVReader reader2 = new CSVReader(new FileReader(path));
        List<String[]> allElements = reader2.readAll();
        allElements.remove(rowNumber);
        FileWriter sw = new FileWriter(path);
        CSVWriter writer = new CSVWriter(sw);
        writer.writeAll(allElements);
        System.out.println("Deletion completed");
        writer.close();
    }

    public static void time() {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {}
                JFrame frame = new JFrame("Real time");
                frame.setBounds(450, 200, 150, 30);
                frame.add(new MyPanel());
                frame.pack();
                frame.setVisible(true);});}

    public static void attendance() throws IOException {
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
        String line;
        ArrayList <String> employeeList = new ArrayList <>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(";");
            employeeList.add(Arrays.toString(values));
            int number = 0;
            for (int i = 0; i < employeeList.size(); i++) {
                number = i;
            }System.out.println(number +" "+ (values[0]));}}

    public static void clientsList(String path, int index) throws IOException {
        String line;
        ArrayList <String> list = new ArrayList <>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            list.add(Arrays.toString(values));
            int number = 0;
            for (int i = 0; i < list.size(); i++) {
                number = i;
            }System.out.println(number +" "+ (values[0]));
            listForChart.add(index, list.size());}}

    public static void writeNumberOfClientsToFile() throws IOException {
        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/clients.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        writer.writeNext(new String[]{String.valueOf(listForChart)});
        writer.close();
    }

    public static class MyPanel extends JPanel {
        public final JLabel horloge;
        public MyPanel() {
            setLayout(new BorderLayout());
            horloge = new JLabel();
            horloge.setFont(
                    UIManager.getFont("Label.font").deriveFont(Font.BOLD, 14f));
            horloge.setText(
                    DateFormat.getDateTimeInstance().format(new Date()));
            add(horloge);
            Timer t = new Timer(500, e -> horloge.setText(DateFormat.getDateTimeInstance().format(new Date())));
                t.setRepeats(true);
                t.setCoalesce(true);
                t.setInitialDelay(0);
                t.start();}}}

class Marketer extends AUTH{

    public static void MarketerEnterToMenu(){
        JFrame Mark = new JFrame();
        JPanel layer = new JPanel();
        layer.setVisible(true);
        layer.setLayout(null);
        layer.setBackground(new Color(136,104,142));
        Mark.setTitle("Menu (Marketer)");
        Mark.setBounds(450, 175, 500, 480);
        Mark.setVisible(true);
        AUTH instance = new AUTH();
        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 20, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                Manager.mySalary(2);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton myTasks = new JButton("My tasks");
        myTasks.setBounds(190, 50, 120, 25);
        myTasks.addActionListener(instance);
        myTasks.addActionListener(e -> {
            try {
                SaleManager.myTasks("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForMarketer.csv");
            } catch (IOException ex) {
                ex.printStackTrace();}});
        Mark.add(layer);
        layer.add(mySalary);
        layer.add(myTasks);}}

class HR extends AUTH{

    public static void HREnterToMenu() {
        JFrame Hr = new JFrame();
        Hr.setTitle("Menu (HR)");
        Hr.setBounds(450, 175, 500, 480);
        Hr.setVisible(true);
        JPanel layer = new JPanel();
        layer.setVisible(true);
        layer.setLayout(null);
        layer.setBackground(new Color(253,163,163));
        JButton employeeListForHr = new JButton("List of candidates");
        AUTH instance = new AUTH();
        employeeListForHr.addActionListener(instance);
        employeeListForHr.setBounds(175, 20, 150, 25);
        employeeListForHr.addActionListener(e -> {
            try {
                HR.employeeslistforhr();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton addingCandidates = new JButton("Add candidates");
        addingCandidates.addActionListener(instance);
        addingCandidates.setBounds(175, 50, 150, 25);
        addingCandidates.addActionListener(e -> {
            try {
                HR.addcandidates();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 80, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                Manager.mySalary(3);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton myTasks = new JButton("My tasks");
        myTasks.setBounds(190, 110, 120, 25);
        myTasks.addActionListener(instance);
        myTasks.addActionListener(e -> {
            try {
                SaleManager.myTasks("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForHR.csv");
            } catch (IOException ex) {
                ex.printStackTrace();}});
        Hr.add(layer);
        layer.add(employeeListForHr);
        layer.add(addingCandidates);
        layer.add(mySalary);
        layer.add(myTasks);}

    public static void employeeslistforhr() throws IOException {
        String employee_path = "/Users/lerapolovinkina/Downloads/EmployeesForHR.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(employee_path));
        System.out.println("List of current employees: ");
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            count++;
            System.out.println(str[0]);}
        System.out.println("Currently are employed - " + (count-1) + " people.");}

    public static void addcandidates() throws IOException {
        String employee_path = "/Users/lerapolovinkina/Downloads/EmployeesForHR.csv";
        System.out.println("Please enter candidate's name and desired position like shown in example:\n" +
                    "Friendly neighbor: TOBEY MAGUIRE");
        Scanner sc = new Scanner(System.in);
        String candidate = sc.nextLine();
        CSVWriter writer = new CSVWriter(new FileWriter(employee_path, true));
        String [] nameRecord = candidate.split(" ");
        writer.writeNext(nameRecord);
        writer.close();
            System.out.println("New candidate was added to the list.");}}

class Manager extends AUTH{

    public static void ManagerEnterToMenu(){
        JFrame Man = new JFrame();
        JPanel layer = new JPanel();
        Man.setTitle("Menu (Manager)");
        Man.setBounds(450, 175, 500, 480);
        layer.setBackground(new Color(163,217,253));
        Man.setVisible(true);
        JButton employee_list = new JButton("Employee list");
        AUTH instance = new AUTH();
        employee_list.addActionListener(instance);
        employee_list.setBounds(190, 20, 120, 25);
        employee_list.addActionListener(e -> {
            try {
                Director.employeeList();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton schedule = new JButton("Presence");
        schedule.setBounds(190, 50, 120, 25);
        schedule.addActionListener(instance);
        schedule.addActionListener(e -> Director.time());
        schedule.addActionListener(e -> {
            try {
                Director.attendance();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton clients = new JButton("Clients");
        clients.addActionListener(instance);
        clients.setBounds(190, 80, 120, 25);
        clients.addActionListener(e -> {
            try {
                Director.clients();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton coverageArea = new JButton("Coverage area");
        coverageArea.setBounds(190, 110, 120, 25);
        coverageArea.addActionListener(instance);
        coverageArea.addActionListener(e -> {
            try {
                Director.clients();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton addClients = new JButton("Add clients");
        addClients.setBounds(190, 140, 120, 25);
        addClients.addActionListener(instance);
        addClients.addActionListener(e -> {
            try {
                Director.clients();
                chooseTheCity();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 170, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                mySalary(4);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton deleteClient = new JButton("Delete client");
        deleteClient.setBounds(190, 200, 120, 25);
        deleteClient.addActionListener(instance);
        deleteClient.addActionListener(e -> {
            try {
                chooseTheCityForDeletingClient();
            } catch (IOException | CsvException ex) {
                ex.printStackTrace();}});
        JButton setTask = new JButton("Set task");
        setTask.setBounds(190, 230, 120, 25);
        setTask.addActionListener(instance);
        setTask.addActionListener(e -> {
            try {
                chooseAccountForSettingTask();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        Man.add(layer);
        layer.add(employee_list);
        layer.add(schedule);
        layer.add(clients);
        layer.add(addClients);
        layer.add(mySalary);
        layer.add(deleteClient);
        layer.add(setTask);}

    public static void chooseTheCity() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the city: ");
        String city = sc.nextLine().toUpperCase(Locale.ROOT);
        switch (city) {
            case "BISHKEK" -> addClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/bishkek.csv");
            case "KARA-BALTA" -> addClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/kara-balta.csv");
            case "TALAS" -> addClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/talas.csv");
            case "TOKMOK" -> addClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tokmok.csv");
            case "OTHERS" -> addClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/others.csv");
            default -> {
                System.out.println("Something go wrong.Try again");
                chooseTheCity();}}}

    public static void addClient(String csv) throws IOException {
        System.out.println("Enter the name of client: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] nameRecord =name.split(",");
        writer.writeNext(nameRecord);
        System.out.println("New client added. If you want add somebody else, tab + ");
        String again= sc.nextLine();
        if(again.equals("+")){
            chooseTheCity();
        }else{
            return;}
        writer.close();}

    public static void mySalary(int number) throws IOException {
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/salary.csv";
        String line = Files.readAllLines(Paths.get(path)).get(number);
        System.out.println(line);}

    public static void chooseTheCityForDeletingClient() throws IOException, CsvException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the city: ");
        String city = sc.nextLine().toUpperCase(Locale.ROOT);
        switch (city) {
            case "BISHKEK" -> deleteClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/bishkek.csv");
            case "KARA-BALTA" -> deleteClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/kara-balta.csv");
            case "TALAS" -> deleteClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/talas.csv");
            case "TOKMOK" -> deleteClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tokmok.csv");
            case "OTHERS" -> deleteClient("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/others.csv");
            default -> {
                System.out.println("Something go wrong.Try again");
                chooseTheCityForDeletingClient();}}}

    public static void deleteClient(String path) throws IOException, CsvException {
         System.out.println("Enter the line number");
         Scanner sc = new Scanner(System.in);
         int rowNumber = sc.nextInt();
         CSVReader reader2 = new CSVReader(new FileReader(path));
         List<String[]> allElements = reader2.readAll();
         allElements.remove(rowNumber);
         FileWriter sw = new FileWriter(path);
         CSVWriter writer = new CSVWriter(sw);
         writer.writeAll(allElements);
         System.out.println("Deletion completed");
         writer.close();}

    public static void chooseAccountForSettingTask() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the account: ");
        String city = sc.nextLine().toUpperCase(Locale.ROOT);
        switch (city) {
            case "EMPLOYEE" -> setTask("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForEmployee.csv");
            case "HR" -> setTask("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForHR.csv");
            case "MARKETER" -> setTask("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForMarketer.csv");
            case "SALE MANAGER" -> setTask("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForSaleManager.csv");}}

    public static void setTask(String csv) throws IOException {
        System.out.println(": ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] nameRecord =name.split("_");
        writer.writeNext(nameRecord);
        System.out.println("New task added");
        writer.close();}}

class SaleManager extends AUTH {

    public static void SaleManagerEnterToMenu() throws IOException {
        JFrame Sal = new JFrame();
        JPanel layer = new JPanel();
        Sal.setTitle("Menu (Sale manager)");
        Sal.setBounds(450, 175, 500, 480);
        layer.setBackground(new Color(245,169,111));
        Sal.setVisible(true);
        AUTH instance = new AUTH();
        JButton clientsList = new JButton("Clients list");
        clientsList.setBounds(190, 50, 120, 25);
        clientsList.addActionListener(instance);
        clientsList.addActionListener(e -> {
            try {
                SaleManager.clientslist();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton apartmentsForSale = new JButton("Apartments for sale");
        apartmentsForSale.setBounds(190, 80, 120, 25);
        apartmentsForSale.addActionListener(instance);
        apartmentsForSale.addActionListener(e -> {
            try {
                SaleManager.forsaleapartments();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton soldApartments = new JButton("Sold apartments");
        apartmentsForSale.setBounds(190, 110, 120, 25);
        apartmentsForSale.addActionListener(instance);
        apartmentsForSale.addActionListener(e -> {
            try {
                SaleManager.soldapartments();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton theMostExpensiveApartments = new JButton("The most expensive");
        theMostExpensiveApartments.setBounds(190, 140, 120, 25);
        theMostExpensiveApartments.addActionListener(instance);
        theMostExpensiveApartments.addActionListener(e -> {
            try {
                SaleManager.themostexpensive();
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton theCheapest = new JButton("The cheapest");
        theCheapest.setBounds(190, 170, 120, 25);
        theCheapest.addActionListener(instance);
        theCheapest.addActionListener(e -> {
            try {
                SaleManager.thecheapest();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton addingApartmentsForSale = new JButton("Add new apartments for sale");
        addingApartmentsForSale.setBounds(150, 200, 200, 25);
        addingApartmentsForSale.addActionListener(instance);
        addingApartmentsForSale.addActionListener(e -> {
            try {
                SaleManager.addingApartmentsForSale();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton addingSoldApartments= new JButton("Add sold apartment");
        addingSoldApartments.setBounds(150, 230, 200, 25);
        addingSoldApartments.addActionListener(instance);
        addingSoldApartments.addActionListener(e -> {
            try {
                SaleManager.addingSoldApartments();
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton deleteApartments= new JButton("Delete apartments");
        deleteApartments.setBounds(150, 230, 200, 25);
        deleteApartments.addActionListener(instance);
        deleteApartments.addActionListener(e -> {
            try {
                SaleManager.deleteApartments();
            } catch (IOException | CsvException ex) {
                ex.printStackTrace();}});
        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 260, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                Manager.mySalary(5);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        JButton myTasks = new JButton("My tasks");
        myTasks.setBounds(190, 290, 120, 25);
        myTasks.addActionListener(instance);
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForSaleManager.csv";
        myTasks.addActionListener(e -> {
            try {
                myTasks(path);
            } catch (IOException ex) {
                ex.printStackTrace();}});
        Sal.add(layer);
        layer.add(clientsList);
        layer.add(apartmentsForSale);
        layer.add(soldApartments);
        layer.add(theMostExpensiveApartments);
        layer.add(theCheapest);
        layer.add(addingApartmentsForSale);
        layer.add(addingSoldApartments);
        layer.add(deleteApartments);
        layer.add(mySalary);
        layer.add(myTasks);}

    public static void clientslist() throws IOException {
        String sold_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        System.out.println("The entire clients list: ");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println(str[0]);}}

    public static void forsaleapartments() throws IOException {
        String forsale_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/ForSaleApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(forsale_path));
        System.out.println("List of available apartments for sale:");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println("Construction site located at: " + str[0] + ", apartment #" + str[1] + ". Price: " + str[2] + "$");}}

    public static void soldapartments() throws IOException {
        String sold_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        System.out.println("List of sold apartments:");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println("Construction site located at: " + str[0] + ", apartment #" + str[1] + ". Price: " + str[3] + '$');}}

    public static void themostexpensive() throws IOException {
        String sold_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        String header = br.readLine();
        ArrayList<String> listStr = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            listStr.add(array[3]);}
        ArrayList<Integer> listInt = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr) {
            listInt.add(Integer.valueOf(myInt));}
        System.out.println("The most expensive SOLD apartment costed- " + Collections.max(listInt) + "$");

        String forsale_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/ForSaleApartments.csv";
        String line1;
        BufferedReader breader = new BufferedReader(new FileReader(forsale_path));
        String header1 = breader.readLine();
        ArrayList<String> listStr1 = new ArrayList<>();
        while ((line1 = breader.readLine()) != null) {
            String[] array1 = line1.split(",");
            listStr1.add(array1[2]);}
        ArrayList<Integer> listInt1 = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr1) {
            listInt1.add(Integer.valueOf(myInt));}
        System.out.println("The most expensive apartment FOR SALE costs - " + Collections.max(listInt1) + "$");}

    public static void thecheapest() throws IOException {
        String sold_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        String header = br.readLine();
        ArrayList<String> listStr = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            listStr.add(array[3]);}
        ArrayList<Integer> listInt = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr) {
            listInt.add(Integer.valueOf(myInt));}
        System.out.println("The cheapest SOLD apartment costed - " + Collections.min(listInt) + "$");

        String forsale_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/ForSaleApartments.csv";
        String line1;
        BufferedReader breader = new BufferedReader(new FileReader(forsale_path));
        String header1 = breader.readLine();
        ArrayList<String> listStr1 = new ArrayList<>();
        while ((line1 = breader.readLine()) != null) {
            String[] array1 = line1.split(",");
            listStr1.add(array1[2]);}
        ArrayList<Integer> listInt1 = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr1) {
            listInt1.add(Integer.valueOf(myInt));}
        System.out.println("The cheapest apartment FOR SALE costs - " + Collections.min(listInt1) + "$");}

    public static void addingApartmentsForSale() throws IOException {
        System.out.println("Enter new available apartments for sale: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/ForSaleApartments.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] nameRecord =name.split(",");
        writer.writeNext(nameRecord);
        System.out.println("New apartments added");
        writer.close();}

    public static void addingSoldApartments() throws IOException {
        System.out.println("Enter sold apartment: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        String csv = "/Users/lerapolovinkina/Desktop/Code store/Java project/SoldApartments.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] nameRecord =name.split(",");
        writer.writeNext(nameRecord);
        System.out.println("Sold apartment added");
        writer.close();}

    public static void deleteApartments() throws IOException, CsvException {
        System.out.println("Enter the line number");
        Scanner sc = new Scanner(System.in);
        int rowNumber = sc.nextInt();
        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/ForSaleApartments.csv";
        CSVReader reader2 = new CSVReader(new FileReader(path));
        List<String[]> allElements = reader2.readAll();
        allElements.remove(rowNumber);
        FileWriter sw = new FileWriter(path);
        CSVWriter writer = new CSVWriter(sw);
        writer.writeAll(allElements);
        System.out.println("Deletion completed");
        writer.close();}

    public static void myTasks(String path) throws IOException {
        String line;
        ArrayList <String> list = new ArrayList <>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            list.add(Arrays.toString(values));
            System.out.println((values[0]));}
        Scanner sc = new Scanner(System.in);
        System.out.println("If you finished this tasks, enter 'done'. Else - click enter ");
        String done = sc.nextLine();
        if(done.equals("done")) {
            try {
                FileWriter fstream1 = new FileWriter(path);
                BufferedWriter out1 = new BufferedWriter(fstream1);
                out1.write("");
                out1.close();
                System.out.println("All tasks completed.Good job!");
            } catch (Exception e) {
                System.err.println("Error in file cleaning: " + e.getMessage());
            }
        }else if(done.equals("")){
            System.out.println("");
        }else{
                myTasks(path);}}}

class Employee extends AUTH {

    public static void EmployeeEnterToMenu() throws IOException {
            JFrame Wor = new JFrame();
            JPanel layer = new JPanel();
            Wor.setTitle("Menu (Employee)");
            Wor.setBounds(450, 175, 500, 480);
            layer.setBackground(new Color(245,236,111));
            Wor.setVisible(true);
            AUTH instance = new AUTH();

        JButton mySalary = new JButton("My salary");
        mySalary.setBounds(190, 170, 120, 25);
        mySalary.addActionListener(instance);
        mySalary.addActionListener(e -> {
            try {
                Manager.mySalary(6);
            } catch (IOException ex) {
                ex.printStackTrace();}});

        JButton myTasks = new JButton("My tasks");
        myTasks.setBounds(190, 200, 120, 25);
        myTasks.addActionListener(instance);
        myTasks.addActionListener(e -> {
            try {
                SaleManager.myTasks("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tasksForEmployee.csv");
            } catch (IOException ex) {
                ex.printStackTrace();}});
            Wor.add(layer);
            layer.add(mySalary);
            layer.add(myTasks);}}

class FUNCTIONS extends ApplicationFrame {

    public FUNCTIONS(String title) throws IOException {
        super(title);
        setContentPane(createDemoPanel());}

    public static PieDataset createDataset() {
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("BISHKEK", Director.listForChart.get(0));
        hashmap.put("TALAS", Director.listForChart.get(1));
        hashmap.put("KARA-BALTA", Director.listForChart.get(2));
        hashmap.put("TOKMOK", Director.listForChart.get(3));
        hashmap.put("ELSE", Director.listForChart.get(4));
        int bish = hashmap.get("BISHKEK");
        int talas = hashmap.get("TALAS");
        int karabalta = hashmap.get("KARA-BALTA");
        int tokmok = hashmap.get("TOKMOK");
        int others = hashmap.get("ELSE");
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Bishkek", (bish));
        dataset.setValue("Kara-balta", (karabalta));
        dataset.setValue("Talas", (talas));
        dataset.setValue("Tokmok", (tokmok));
        dataset.setValue("Others", (others));
        return dataset;}

    public static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart("Coverage area", dataset, true, true, false);
        return chart;}

    public static JPanel createDemoPanel() throws IOException {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);}}
