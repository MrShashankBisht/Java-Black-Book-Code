import javax.swing.*;
   import javax.swing.table.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.util.regex.*;

   public class FilteringTable {
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
           Object columns[] = {"Symbol", "Name", "Price"};
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
           final TableRowSorter<TableModel> rsorter =
                   new TableRowSorter<TableModel>(tmodel);
           jtable.setRowSorter(rsorter);
           JScrollPane jspane = new JScrollPane(jtable);
           jframe.add(jspane, BorderLayout.CENTER);
           JPanel jpanel = new JPanel(new BorderLayout());
           JLabel jlabel = new JLabel("Filter");
           jpanel.add(jlabel, BorderLayout.WEST);
           final JTextField filterText =
               new JTextField("SUN");
           jpanel.add(filterText, BorderLayout.CENTER);
           jframe.add(jpanel, BorderLayout.NORTH);
           JButton jbutton = new JButton("Filter");
           jbutton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
               String text = filterText.getText();
               if (text.length() == 0) {
                 rsorter.setRowFilter(null);
               } else {
                 try {
                   rsorter.setRowFilter(
                       RowFilter.regexFilter(text));
                 } catch (PatternSyntaxException pse) {
                   System.err.println("Bad regex pattern");
                 }
               }
             }
           });
           jframe.add(jbutton, BorderLayout.SOUTH);
           jframe.setSize(400, 300);
           jframe.setVisible(true);
         }
       };
       EventQueue.invokeLater(runner);
     }
   }
