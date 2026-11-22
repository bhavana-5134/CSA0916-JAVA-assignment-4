import javax.swing.*;import java.awt.event.*;
class ConverterUtil {
 static String[] CUR={"INR","USD","EUR"};
 static double rate(String f,String t){double a=f.equals("USD")?83:f.equals("EUR")?90:1,b=t.equals("USD")?83:t.equals("EUR")?90:1;return a/b;}
 static void convert(JFrame frame,JTextField amount,JComboBox<String> from,JComboBox<String> to,JLabel result){try{double n=Double.parseDouble(amount.getText());if(n<0||!Double.isFinite(n))throw new Exception();String s=String.format("%.2f %s",n*rate((String)from.getSelectedItem(),(String)to.getSelectedItem()),to.getSelectedItem());result.setText(s);JOptionPane.showMessageDialog(frame,s);}catch(Exception e){result.setText("Invalid amount");JOptionPane.showMessageDialog(frame,"Enter a valid non-negative amount");}}
 static void close(JFrame f){f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){f.dispose();}});}
}
