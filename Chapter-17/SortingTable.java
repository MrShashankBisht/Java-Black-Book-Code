import javax.swing.*;
   import javax.swing.table.*;
   import java.awt.*;

   public class SortingTable {
     public static void main(String args[]) {
      Runnable runner = new Runnable() {
      public void run() {
           JFrame jframe = new JFrame("Sorting Table");
           jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Object rows[][] = {
               {"AMZN", "Amazon", 43.28},
               {"GOOG", "Google", 389.33},
               {"MSFT", "Microsoft", 28.66},
               {"SANSFT", "Sansoft Inc.", 128.76},
               {"NOK", "Nokia Corp", 19.73},
               {"ORCL", "Oracle Corp.", 14.58},
               {"SUNW", "Sun Microsystems Inc.", 5.97},
               {"VOD",  "Vodafone Group", 39.92},
               {"YHOO", "Yahoo!", 38.67}
             };
           String columns[] = {"Symbol", "Name", "Price"};
           TableModel tmodel =
               new DefaultTableModel(rows, columns) {
             public Class getColumnClass(int column) {
               Class returnValue;
               if ((column >= 0) && (column < getColumnCount())) {
                 returnValue = getValueAt(0, column).getClass();
               } else {
                 returnValue = Object.class;
               }
               return returnValue;
             }
           };

           JTable jtable = new JTable(tmodel);
           RowSorter<TableModel> rsorter =
             new TableRowSorter<TableModel>(tmodel);
           jtable.setRowSorter(rsorter);
           JScrollPane jspane = new JScrollPane(jtable);
           jframe.add(jspane, BorderLayout.CENTER);
           jframe.setSize(300, 150);
           jframe.setVisible(true);
         }
       };
       EventQueue.invokeLater(runner);
     }
   }

