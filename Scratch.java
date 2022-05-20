//class Scratch {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Java");
//        System.out.println("Welcome to Computer Science");
//        System.out.print("Programming is fun");
//    }
//}
//class Scratch {
//    public static void main(String[] args) {
//        System.out.print(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
//    }
//}
//class Scratch {
//    public static void main(String[] args) {
//        System.out.println(2*5.5*3.14);
//        System.out.println(5.5*5.5*3.14);
//    }
//}
//class Scratch {
//    public static void main(String[] args) {
//        System.out.println(14*45.5);
//        System.out.println(14*14.5);
//        System.out.println(637.0+203.0);
//    }
//}
//class Scratch {
//    public static void main(String[] args) {
//        System.out.println((24/1.6)/100);
//    }
//}
//import java.util.Scanner;
//
//class Scratch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int st = sc.nextInt();
//        System.out.println(st);
//
//    }
//}
//class Scratch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Привет,"+sc.nextLine());
//    }
//}
//import java.util.Scanner;

//class Scratch {
//    public static void main(String[] args) {
//        //put your code here
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        System.out.println("Температура воздуха сегодня: "+t+" градусов.");
//
//    }
//}
//import java.util.Scanner;

//class Scratch{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String helper = sc.nextLine();
//        int m = sc.nextInt();
//        System.out.println("Привет, "+name+", это твой помощник "+helper+".");
//        System.out.println("У тебя "+m+" новых писем.");
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        String name = "Ivan";
//        boolean sfuhbefh = 3<2;
//        System.out.print(sfuhbefh);
//    }
//}

//
//class Scratch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int age = sc.nextInt();
//        String s = sc.nextLine();
//        System.out.println(age+" "+s);
//    }
//}

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.io.*;
import java.util.*;

//import java.util.Scanner;
//
//class Scratch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        float y = 5*(x*x)+2*x+11;
//        System.out.print(y);
//    }
//}
//Чтение,запись txt
//import java.util.*;
//import java.io.*;
//import java.util.Scanner;
//
//class Scratch{
//    public static void main(String[] args) {
//    try{
//        File file = new File("Text.txt");
//        FileWriter writer = new FileWriter(file,true);
//        writer.write("Hello, world!!!!!!!");
//        writer.close();
//        Scanner sc = new Scanner(file);
//        System.out.println(sc);
//        while(sc.hasNextBigDecimal()){
//            System.out.println(sc.nextLine());
//        }
//    }catch(IOException ex){
//        ex.printStackTrace();
//    }
//    }
//}
//Чтение,удаление и запись в  csv
//class Scratch {
//    public static void main(String[] args) throws IOException {
//        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/info.csv";
//        String line = "";
//        FileWriter writer = new FileWriter(path);
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            System.out.println((values[0]));
//        }
//        writer.append("Hello");
//        writer.flush();
//        CSVIterator csvIterator = null;
//        String[] csvLastRecord = null;
//        writer.close();
//        while (csvIterator.hasNext()) {
//            csvLastRecord = csvIterator.next();
//            csvIterator.remove();
//        }
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(4);
//        queue.offer(3);
//        while (!queue.isEmpty()) {
//            System.out.print(queue.remove() + " ");
//        }
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        ArrayList list = new ArrayList(queue);
//        System.out.println(list);
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>();
//        map.put("2fi2h","Hello");
//        map.put("qdwdoo2","alalalal");
//        System.out.println(map);
//        System.out.println(map.size());
//        HashSet<String> map2 = new HashSet<>();
//        for(String i: map.keySet()){
//            map2.add(i);
//        }
//        System.out.println(map.containsKey("2fi2h"));
//        System.out.println(map.containsValue("Hello"));
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
//        TreeMap<Integer,String> treeMap2=new TreeMap<Integer,String>();
//        treeMap.put(1, "Hello");
//        treeMap.put(2, "World");
//        for (Map.Entry<Integer,String> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        treeMap2.putAll(treeMap);
//        System.out.println(treeMap2);
//        System.out.println(treeMap.containsKey(1));
//        System.out.println(treeMap.containsValue("Hello"));
//        Collection<String> values = treeMap.values();
//        for(String value : values){
//            System.out.println( value );
//        }
//        treeMap2.clear();
//        System.out.println(treeMap2);
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> ages = new ArrayList<>();
//        HashMap<String,Integer> map = new HashMap<>();
//        names.add("Vall");
//        names.add("Lera");
//        ages.add(18);
//        ages.add(20);
//        System.out.println(map);
//        System.out.println(names);
//        System.out.println(ages);
//    }
//}

//class Scratch{
//    public static void main(String[] args) {
//        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//        File file = new File(path);
//        Date currentTime = Calendar.getInstance().getTime();
//        try {
//            HashMap<String,String> attendance = new HashMap<>();
//            FileWriter outputfile = new FileWriter(file);
//            attendance.put("BAYZBEKOVA ADEL","0");
//            if(attendance.containsKey("BAYZBEKOVA ADEL")){
//                attendance.put("BAYZBEKOVA ADEL", String.valueOf(currentTime));
//            }
//            String eol = System.getProperty("line.separator");
//            try (Writer writerrr = new FileWriter("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv")) {
//                for (Map.Entry<String, String> entry : attendance.entrySet()) {
//                    writerrr.append(entry.getKey())
//                            .append(',')
//                            .append(entry.getValue())
//                            .append(eol);
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace(System.err);
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//        Date currentTime = Calendar.getInstance().getTime();
//        HashMap<String, String> attendance = new HashMap<>();
//        attendance.put("BAYZBEKOVA ADEL", "0");
//        if (attendance.containsKey("BAYZBEKOVA ADEL")) {
//            attendance.put("BAYZBEKOVA ADEL", String.valueOf(currentTime));
//        }
//        String eol = System.getProperty("line.separator");
//        try (Writer writerrr = new FileWriter("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv")) {
//            for (Map.Entry<String, String> entry : attendance.entrySet()) {
//                writerrr.append(entry.getKey())
//                        .append('-')
//                        .append(entry.getValue())
//                        .append(eol);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//class Scratch{
//    public static void main(String[] args) {
//        Date currentTime = Calendar.getInstance().getTime();
//        HashMap<String, String> attendance = new HashMap<>();
//        attendance.put("BAYZBEKOVA ADEL", String.valueOf(currentTime));
//        attendance.put("BERLICOVA NAGIMA", String.valueOf(currentTime));
//        attendance.put("POLOVINKINA VALERIIA", String.valueOf(currentTime));
//        attendance.put("SAZANOV DASTAN", String.valueOf(currentTime));
//        attendance.put("JUNUSOV SANDJARBEK", String.valueOf(currentTime));
//        attendance.put("AVAZOV BEKSULTAN",String.valueOf(currentTime));
//        String eol = System.getProperty("line.separator");
//        try (Writer writerrr = new FileWriter("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv")) {
//            for (Map.Entry<String, String> entry : attendance.entrySet()) {
//                writerrr.append(entry.getKey())
//                        .append('-')
//                        .append(entry.getValue())
//                        .append(eol);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//        String line = "";
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(path));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (true) {
//            try {
//                if (!((line = br.readLine()) != null)) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            String[] values = line.split(",");
//            System.out.println((values[0]));}}
//
//}
//class Scratch{
//    public static void main(String[] args) throws IOException, CsvException {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine().toUpperCase(Locale.ROOT);
//            String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//            CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//            String [] nameRecord =name.split(",");
//            writer.writeNext(nameRecord);
//            writer.close();
//            delete();
//        }
//        public static void delete() throws IOException, CsvException {
//        Scanner sc = new Scanner(System.in);
//        int rowNumber = sc.nextInt();
//            String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//            CSVReader reader2 = new CSVReader(new FileReader(path));
//            List<String[]> allElements = reader2.readAll();
//            allElements.remove(rowNumber);
//            FileWriter sw = new FileWriter(path);
//            CSVWriter writer = new CSVWriter(sw);
//            writer.writeAll(allElements);
//            writer.close();
//        }
//    }
//import javax.swing.*;
//import javax.swing.event.*;
//import java.awt.event.*;
////1st step
//public class Scratch implements ActionListener {
//    private static JTextField text;
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("ActionListener Example");
//        text = new JTextField();
//        text.setBounds(45, 50, 150, 20);
//        JButton btn = new JButton("Click here");
//        btn.setBounds(70, 100, 100, 30);
//        Scratch instance = new Scratch();
//        //2nd step
//        btn.addActionListener(instance);
//        frame.add(btn);
//        frame.add(text);
//        frame.setSize(250, 250);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//
//    //3rd step
//    public void actionPerformed(ActionEvent e) {
//        text.setText("Welcome to StackHowTo");
//    }
//}
//        text.setText(String.valueOf(employeeList));
//public static void attendance(){
//        String path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv";
//        String line = "";
//        BufferedReader br = null;
//        try {
//        br = new BufferedReader(new FileReader(path));
//        } catch (FileNotFoundException e) {
//        e.printStackTrace();
//        }
//        while (true) {
//        try {
//        if (!((line = br.readLine()) != null)) break;
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//        String[] values = line.split(",");
//        System.out.println((values[0]));}}

//
//if (user.equals("Director") && password.equals("director")) {
//        Director.DirEnterToMenu();
//        attendance.put("BAYZBEKOVA ADEL", String.valueOf(currentTime));
//        Writer writerrr = null; try {
//        writerrr = new FileWriter("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/Attendance.csv");
//        } catch (IOException ex) {
//        ex.printStackTrace();
//        }
//        for (Map.Entry<String, String> entry : attendance.entrySet()) {
//        try {
//        writerrr.append(entry.getKey())
//        .append('-')
//        .append(entry.getValue())
//        .append(eol);
//        } catch (IOException ex) {
//        ex.printStackTrace();
//        }
//        AUTH.attendance();


//class Scratch{
//    public static void main(String[] args) {
//        Pet pet = new Pet("Bobik","dog", 2);
//        pet.setName();
//        pet.setAnimal();
//        pet.setAge();
//    }
//}
//class Pet{
//    String name;
//    String animal;
//    int age;
//    public Pet(String name,String animal,int age){
//        this.name=name;
//        this.animal = animal;
//        this.age = age;
//    }
//    void setName(){
//        System.out.println(name);
//    }
//    void setAnimal(){
//        System.out.println(animal);
//    }
//    void setAge(){
//        System.out.println(age);
//    }
//}
//import javax.swing.*;
//import java.awt.*;
//public class Scratch
//{
//    public static void main(String args[])
//    {
//        JFrame frame = new JFrame("Display an image in the background");
//        final ImageIcon icon = new ImageIcon("/Users/lerapolovinkina/Downloads/bacground.png");
//        JTextArea text = new JTextArea()
//        {
//            Image img = icon.getImage();
//            {setOpaque(false);}
//            public void paintComponent(Graphics graphics)
//            {
//                graphics.drawImage(img, 0, 0, this);
//                super.paintComponent(graphics);
//            }
//        };
//        JScrollPane pane = new JScrollPane(text);
//        Container content = frame.getContentPane();
//        content.add(pane, BorderLayout.CENTER);
//        frame.setSize(400, 300);
//        frame.setVisible(true);
//    }
//}

//import java.util.Scanner;
//
//public class Scratch {
//
//    Scanner scan;
//    static String Name, Surname;
//
//    public void open() {
//
//        try {
//            scan = new Scanner(new File("/Users/lerapolovinkina/IdeaProjects/qqqq/info.csv"));
//            System.out.println("it is working"); }catch (FileNotFoundException e){
//            System.out.println("it is not working"); } }
//
//    public void Read() {
//        do
//        {
//            Name = scan.next();
//            Surname = scan.next();
//        } while(scan.hasNext()); System.out.println(Name + Surname);
//
//        scan.close();
//    } }
//
//class DemoSwing implements ActionListener {
//    private JTextField T = new JTextField(30);
//    private JTextField T1 = new JTextField(30);
//    private JFrame f = new JFrame("Demo");
//    private JButton B = new JButton("View");
//    // Static variable
//    static String N, S;
//
//    public DemoSwing(){
//        f.add(new JLabel("Name"));
//        T.setEditable(false);
//        f.add(T);
//        f.add(new JLabel("Surname"));
//        T1.setEditable(false);
//        f.add(T1);
//        B.addActionListener(this);
//        f.add(B);
//
//        // JFrame    f.setLayout(new FlowLayout());    f.setSize(300,100);    f.setVisible(true);
//
//    }
//    public static void main (String[] args){
//        new DemoSwing();
//
//        Scratch f = new Scratch();
//        f.open();
//        f.Read(); } public void actionPerformed(ActionEvent e){
//        if(e.getSource()== B)
//        {
//            T.setText(N);
//            T1.setText(S);
//        } } }
//class Scratch{
//    public static void main(String[] args) throws IOException {
//        {
//            HashMap<String, Integer> hashmap = new HashMap<>();
//            hashmap.put("BISHKEK", 50);
//            hashmap.put("TALAS", 20);
//            hashmap.put("KARA-BALTA", 15);
//            hashmap.put("TOKMOK", 5);
//            hashmap.put("ELSE", 10);
//            int bish = hashmap.get("BISHKEK");
//            int talas = hashmap.get("TALAS");
//            int karabalta = hashmap.get("KARA-BALTA");
//            int tokmok = hashmap.get("TOKMOK");
//            int others = hashmap.get("ELSE");
//            DefaultPieDataset dataset = new DefaultPieDataset();
//            dataset.setValue("Bishkek", (bish));
//            dataset.setValue("Kara-balta", (karabalta));
//            dataset.setValue("Talas", (talas));
//            dataset.setValue("Tokmok", (tokmok));
//            dataset.setValue("Others", (others));
//            System.out.println("Enter the name of new client: ");
//            Scanner sc = new Scanner(System.in);
//            String name = sc.nextLine().toUpperCase(Locale.ROOT);
//            String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/clients.csv";
//            CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//            String [] nameRecord =name.split(",");
//            writer.writeNext(nameRecord);
//            writer.close();
//            System.out.println("Enter the city");
//            String city = sc.nextLine().toUpperCase(Locale.ROOT);
//            String key = String.valueOf(hashmap.get(city));
//            int i = Integer.parseInt(key.trim());
//            hashmap.put(city, i + 1);
//            System.out.println("New client added");
//            return dataset;
//    }
//}
//class Scratch{
//    public static void main(String[] args) throws IOException {
//        HashMap<String, Integer> hashmap = new HashMap<>();
//        hashmap.put("BISHKEK", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/bishkek.csv"));
//        hashmap.put("TALAS", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/talas.csv"));
//        hashmap.put("KARA-BALTA", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/kara-balta.csv"));
//        hashmap.put("TOKMOK", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tokmok.csv"));
//        hashmap.put("ELSE", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/others.csv"));
//        int bish = hashmap.get("BISHKEK");
//        int talas = hashmap.get("TALAS");
//        int karabalta = hashmap.get("KARA-BALTA");
//        int tokmok = hashmap.get("TOKMOK");
//        int others = hashmap.get("ELSE");
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.setValue("Bishkek", (bish));
//        dataset.setValue("Kara-balta", (karabalta));
//        dataset.setValue("Talas", (talas));
//        dataset.setValue("Tokmok", (tokmok));
//        dataset.setValue("Others", (others));
//        System.out.println("Enter the name of new client: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine().toUpperCase(Locale.ROOT);
//        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/clients.csv";
//        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//        String[] nameRecord = name.split(",");
//        writer.writeNext(nameRecord);
//        writer.close();
//        System.out.println("Enter the city");
//        String city = sc.nextLine().toUpperCase(Locale.ROOT);
//        String key = String.valueOf(hashmap.get(city));
//        int i = Integer.parseInt(key.trim());
//        if (city.equals("BISHKEK")) {
//            hashmap.put("BISHKEK", i + 1);
//        } else if (city.equals("TALAS")) {
//            hashmap.put("TALAS", i + 1);
//        } else if (city.equals("KARA-BALTA")) {
//            hashmap.put("KARA-BALTA", i + 1);
//        } else if (city.equals("TOKMOK")) {
//            hashmap.put("TOKMOK", i + 1);
//        } else if (city.equals("ELSE")) {
//            hashmap.put("ELSE", i + 1);}
//        System.out.println("New client added");
//    }
//    public static int shablon(String path) throws IOException {
//        String line = "";
//        ArrayList <String> employeeList = new ArrayList <String>();
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            employeeList.add(Arrays.toString(values));
//        }
//        int city = 0;
//        for (int i = 0; i < employeeList.size(); i++) {
//            city = i+1;
//        }
//        return city;
//    }}        text.setText(String.valueOf(employeeList.spliterator()));
//public void BarChart_AWT(String applicationTitle, String chartTitle) {
//        JFreeChart barChart = ChartFactory.createBarChart(
//        chartTitle, "Category", "Cash",
//        createSecondDataset(),
//        PlotOrientation.VERTICAL,
//        true, true, false);
//        ChartPanel chartPanel = new ChartPanel(barChart);
//        chartPanel.setPreferredSize(new java.awt.Dimension(700, 480));
//        setContentPane(chartPanel);}
//
//public CategoryDataset createSecondDataset() {
//        HashMap<String, Integer> budgetMap = new HashMap<>();
//        budgetMap.put("BISHKEK", 50);
//        budgetMap.put("TALAS", 20);
//        budgetMap.put("KARA-BALTA", 15);
//        budgetMap.put("TOKMOK", 5);
//        budgetMap.put("ELSE", 10);
//        budgetMap.put("Director", 6);
//        budgetMap.put("Marketer", 4);
//        budgetMap.put("Manager", 5);
//        budgetMap.put("Sale_manager", 3);
//        budgetMap.put("HR", 2);
//        budgetMap.put("Employee", 3);
//        budgetMap.put("General Budget", 15);
//        int bish = budgetMap.get("BISHKEK");
//        int talas = budgetMap.get("TALAS");
//        int karabalta = budgetMap.get("KARA-BALTA");
//        int tokmok = budgetMap.get("TOKMOK");
//        int others = budgetMap.get("ELSE");
//        int dirSal = budgetMap.get("Director");
//        int markSal = budgetMap.get("Marketer");
//        int manSal = budgetMap.get("Manager");
//        int salMAanSal = budgetMap.get("Sale_manager");
//        int hrSal = budgetMap.get("HR");
//        int emplSal = budgetMap.get("Employee");
//        int genSalBudget = budgetMap.get("General Budget");
//final String salary = " SALARY";
//final String marketing = "MARKETING";
//final String salaryCash = "Salary Cash";
//final String directorSalary = "Director";
//final String managerSalary = "Manager";
//final String marketerSalary = "Marketer";
//final String hrSalary = "HR";
//final String saleManagerSalary = "Sale manager";
//final String employeeSalary = "Employee";
//final String bishBudget = "Bishkek";
//final String talasBudget = "Talas";
//final String tokmokBudget = "Tokmok";
//final String karabaltaBudget = "Kara-Balta";
//final String othersBudget = "Others";
//final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(genSalBudget, salary, salaryCash);
//        dataset.addValue(manSal, salary, managerSalary);
//        dataset.addValue(dirSal, salary, directorSalary);
//        dataset.addValue(markSal, salary, marketerSalary);
//        dataset.addValue(hrSal, salary, hrSalary);
//        dataset.addValue(salMAanSal, salary, saleManagerSalary);
//        dataset.addValue(emplSal, salary, employeeSalary);
//
//        dataset.addValue(bish, marketing, bishBudget);
//        dataset.addValue(talas, marketing, talasBudget);
//        dataset.addValue(tokmok, marketing, tokmokBudget);
//        dataset.addValue(karabalta, marketing, karabaltaBudget);
//        dataset.addValue(others, marketing, othersBudget);
//        dataset.addValue(others, marketing, othersBudget);
//        return dataset;
//        }
//class FUNCTIONS extends ApplicationFrame {
//
//    public FUNCTIONS(String title) throws IOException {
//        super(title);
//        setContentPane(createDemoPanel());}
//
//    public static PieDataset createDataset() throws IOException {
//        HashMap<String, Integer> hashmap = new HashMap<>();
//        hashmap.put("BISHKEK", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/bishkek.csv"));
//        hashmap.put("TALAS", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/talas.csv"));
//        hashmap.put("KARA-BALTA", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/kara-balta.csv"));
//        hashmap.put("TOKMOK", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/tokmok.csv"));
//        hashmap.put("ELSE", shablon("/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/others.csv"));
//        int bish = hashmap.get("BISHKEK");
//        int talas = hashmap.get("TALAS");
//        int karabalta = hashmap.get("KARA-BALTA");
//        int tokmok = hashmap.get("TOKMOK");
//        int others = hashmap.get("ELSE");
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.setValue("Bishkek", (bish));
//        dataset.setValue("Kara-balta", (karabalta));
//        dataset.setValue("Talas", (talas));
//        dataset.setValue("Tokmok", (tokmok));
//        dataset.setValue("Others", (others));
//        System.out.println("Enter the name of new client: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine().toUpperCase(Locale.ROOT);
//        String csv = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/clients.csv";
//        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//        String[] nameRecord = name.split(",");
//        writer.writeNext(nameRecord);
//        writer.close();
//        System.out.println("Enter the city");
//        String city = sc.nextLine().toUpperCase(Locale.ROOT);
//        String key = String.valueOf(hashmap.get(city));
//        int i = Integer.parseInt(key.trim());
//        switch (city) {
//            case "BISHKEK" -> hashmap.put("BISHKEK", i + 1);
//            case "TALAS" -> hashmap.put("TALAS", i + 1);
//            case "KARA-BALTA" -> hashmap.put("KARA-BALTA", i + 1);
//            case "TOKMOK" -> hashmap.put("TOKMOK", i + 1);
//            case "ELSE" -> hashmap.put("ELSE", i + 1);
//        }
//        System.out.println("New client added");
//        return null;
//    }
//
//    public static int shablon(String path) throws IOException {
//        String line;
//        ArrayList <String> employeeList = new ArrayList <>();
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while ((line = br.readLine()) != null) {
//            String[] values = line.split(",");
//            employeeList.add(Arrays.toString(values));
//        }
//        int city = 1;
//        for (int i = 0; i < employeeList.size(); i++) city = i + 1;
//        return city;
//    }
//
//    static JFreeChart createChart(PieDataset dataset) {
//        return ChartFactory.createPieChart("Coverage area", dataset, true, true, false);}
//
//    public static JPanel createDemoPanel() throws IOException {
//        JFreeChart chart = createChart(createDataset());
//        return new ChartPanel(chart);}
//}
//class FUNCTIONS extends ApplicationFrame {
//
//    public FUNCTIONS(String title) throws IOException {
//        super(title);
//        setContentPane(createDemoPanel());}
//
//    public static PieDataset createDataset() throws IOException {
//        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
//        hashmap.put("BISHKEK", 50);
//        hashmap.put("TALAS", 20);
//        hashmap.put("KARA-BALTA", 15);
//        hashmap.put("TOKMOK", 5);
//        hashmap.put("ELSE", 10);
//        int bish = hashmap.get("BISHKEK");
//        int talas = hashmap.get("TALAS");
//        int karabalta = hashmap.get("KARA-BALTA");
//        int tokmok = hashmap.get("TOKMOK");
//        int others = hashmap.get("ELSE");
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.setValue("Bishkek", (bish));
//        dataset.setValue("Kara-balta", (karabalta));
//        dataset.setValue("Talas", (talas));
//        dataset.setValue("Tokmok", (tokmok));
//        dataset.setValue("Others", (others));
//        return dataset;}
//
//    public static JFreeChart createChart(PieDataset dataset) {
//        JFreeChart chart = ChartFactory.createPieChart(
//                "Coverage area",
//                dataset,
//                true,
//                true,
//                false);
//        return chart;}
//
//    public static JPanel createDemoPanel() throws IOException {
//        JFreeChart chart = createChart(createDataset());
//        return new ChartPanel(chart);}}
