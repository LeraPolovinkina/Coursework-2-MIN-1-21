

import java.io.*;
import java.util.*;

public class SALESMANAGER {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Greetings dear Sales Manager!
                Please dial the menu number to work with the program:\s
                1. Clients list\s
                2. Search for a client by his name\s
                3. List of apartments for sale\s
                4. List of sold apartments
                5. Show the most expensive apartment
                6. Show the cheapest apartment, if finished, then dial 7:""");
        int dial = sc.nextInt();
        switch (dial) {
            case 1 -> clientslist();
            case 3 -> forsaleapartments();
            case 4 -> soldapartments();
            case 5 -> themostexpensive();
            case 6 -> thecheapest();
        }
    }

    // METHOD #1 SHOWS FULL LIST OF CLIENTS

    public static void clientslist() throws IOException {
        String sold_path = "C:\\CourseWork\\src\\SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        System.out.println("The entire clients list: ");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println(str[2]);
        }
    }

    // METHOD #3 SHOWS APARTMENTS FOR SALE

    public static void forsaleapartments() throws IOException {
        String forsale_path = "C:\\CourseWork\\src\\ForSaleApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(forsale_path));
        System.out.println("List of available apartments for sale:");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println("Construction site located at: " + str[0] + ", apartment #" + str[1] + ". Price: " + str[2] + "$");
        }
    }

    // METHOD #4  SHOWS SOLD APARTMENTS

    public static void soldapartments() throws IOException {
        String sold_path = "C:\\CourseWork\\src\\SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        System.out.println("List of sold apartments:");
        String header = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            System.out.println("Construction site located at: " + str[0] + ", apartment #" + str[1] + ". Price: " + str[3] + '$');
        }
    }

    // METHOD #5 SHOWS THE MOST EXPENSIVE APARTMENT

    public static void themostexpensive() throws IOException {
        String sold_path = "/Users/lerapolovinkina/IdeaProjects/qqqq/src/main/java/SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        String header = br.readLine();
        ArrayList<String> listStr = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            listStr.add(array[3]);
            }
        ArrayList<Integer> listInt = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr)
        {
            listInt.add(Integer.valueOf(myInt));
        }
        System.out.println("The most expensive SOLD apartment costed- " + Collections.max(listInt) + "$");

        String forsale_path = "C:\\CourseWork\\src\\ForSaleApartments.csv";
        String line1;
        BufferedReader breader = new BufferedReader(new FileReader(forsale_path));
        String header1 = breader.readLine();
        ArrayList<String> listStr1 = new ArrayList<>();
        while ((line1 = breader.readLine()) != null) {
            String[] array1 = line1.split(",");
            listStr1.add(array1[2]);
        }
        ArrayList<Integer> listInt1 = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr1)
        {
            listInt1.add(Integer.valueOf(myInt));
        }
        System.out.println("The most expensive apartment FOR SALE costs - " + Collections.max(listInt1) + "$");
    }

    // METHOD #6 SHOWS THE CHEAPEST APARTMENT

    public static void thecheapest() throws IOException {
        String sold_path = "C:\\CourseWork\\src\\SoldApartments.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(sold_path));
        String header = br.readLine();
        ArrayList<String> listStr = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            listStr.add(array[3]);
        }
        ArrayList<Integer> listInt = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr)
        {
            listInt.add(Integer.valueOf(myInt));
        }
        System.out.println("The cheapest SOLD apartment costed - " + Collections.min(listInt) + "$");

        String forsale_path = "C:\\CourseWork\\src\\ForSaleApartments.csv";
        String line1;
        BufferedReader breader = new BufferedReader(new FileReader(forsale_path));
        String header1 = breader.readLine();
        ArrayList<String> listStr1 = new ArrayList<>();
        while ((line1 = breader.readLine()) != null) {
            String[] array1 = line1.split(",");
            listStr1.add(array1[2]);
        }
        ArrayList<Integer> listInt1 = new ArrayList<>(listStr.size()) ;
        for (String myInt : listStr1)
        {
            listInt1.add(Integer.valueOf(myInt));
        }
        System.out.println("The cheapest apartment FOR SALE costs - " + Collections.min(listInt1) + "$");
    }
}

