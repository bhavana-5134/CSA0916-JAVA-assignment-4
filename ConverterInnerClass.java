import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class ConverterInnerClass extends JFrame {
 JTextField amount=new JTextField("100",8);JComboBox<String> from=new JComboBox<>(ConverterUtil.CUR),to=new JComboBox<>(ConverterUtil.CUR);JLabel result=new JLabel("Result");
 ConverterInnerClass(){JPanel p=new JPanel();p.add(amount);p.add(from);p.add(to);JButton b=new JButton("Convert");ConvertHandler h=new ConvertHandler();b.addActionListener(h);amount.addActionListener(h);p.add(b);add(p,BorderLayout.NORTH);add(result,BorderLayout.SOUTH);ConverterUtil.close(this);pack();}
 class ConvertHandler implements ActionListener{public void actionPerformed(ActionEvent e){ConverterUtil.convert(ConverterInnerClass.this,amount,from,to,result);}}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new ConverterInnerClass().setVisible(true));}
}
