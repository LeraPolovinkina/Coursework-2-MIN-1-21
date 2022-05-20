import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.util.HashMap;

public class BarChart_AWT extends ApplicationFrame {
    public BarChart_AWT( String applicationTitle , String chartTitle ) {
        super( applicationTitle );
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle, "Category", "Cash",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 700 , 480) );
        setContentPane( chartPanel );
    }
    public CategoryDataset createDataset( ) {
        HashMap<String,Integer> budgetMap = new HashMap<>();
        budgetMap.put("BISHKEK",50);budgetMap.put("TALAS",20);budgetMap.put("KARA-BALTA",15);budgetMap.put("TOKMOK",5);
        budgetMap.put("ELSE",10);
        budgetMap.put("Director",6);budgetMap.put("Marketer",4);budgetMap.put("Manager",5);
        budgetMap.put("Sale_manager",3);budgetMap.put("HR",2);budgetMap.put("Employee",3);
        budgetMap.put("General Budget",15);
        int bish = budgetMap.get("BISHKEK");
        int talas = budgetMap.get("TALAS");
        int karabalta = budgetMap.get("KARA-BALTA");
        int tokmok = budgetMap.get("TOKMOK");
        int others = budgetMap.get("ELSE");
        int dirSal = budgetMap.get("Director");
        int markSal = budgetMap.get("Marketer");
        int manSal = budgetMap.get("Manager");
        int salMAanSal = budgetMap.get("Sale_manager");
        int hrSal = budgetMap.get("HR");
        int emplSal = budgetMap.get("Employee");
        int genSalBudget = budgetMap.get("General Budget");
        final String salary = " SALARY";
        final String marketing = "MARKETING";
        final String salaryCash = "Salary Cash";
        final String directorSalary = "Director";
        final String managerSalary = "Manager";
        final String marketerSalary = "Marketer";
        final String hrSalary = "HR";
        final String generalSalaryBudget = "General Budget";
        final String saleManagerSalary = "Sale manager";
        final String employeeSalary = "Employee";
        final String bishBudget = "Bishkek";
        final String talasBudget = "Talas";
        final String tokmokBudget = "Tokmok";
        final String karabaltaBudget = "Kara-Balta";
        final String othersBudget = "Others";
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.addValue(genSalBudget, salary , salaryCash );
        dataset.addValue( manSal , salary , managerSalary );
        dataset.addValue( dirSal , salary , directorSalary );
        dataset.addValue( markSal , salary ,marketerSalary );
        dataset.addValue( hrSal, salary ,hrSalary );
        dataset.addValue( salMAanSal , salary ,saleManagerSalary );
        dataset.addValue( emplSal , salary ,employeeSalary );

        dataset.addValue( bish , marketing , bishBudget );
        dataset.addValue( talas , marketing , talasBudget );
        dataset.addValue( tokmok , marketing , tokmokBudget );
        dataset.addValue( karabalta , marketing , karabaltaBudget );
        dataset.addValue( others , marketing , othersBudget );
        dataset.addValue( others , marketing , othersBudget );
        return dataset;
    }
    public static void main( String[ ] args ) {
        BarChart_AWT chart = new BarChart_AWT("Budget",
                "Budget");
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}

