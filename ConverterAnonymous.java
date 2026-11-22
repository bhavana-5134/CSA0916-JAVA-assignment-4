import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class ConverterAnonymous extends JFrame {
 JTextField amount=new JTextField("100",8);JComboBox<String> from=new JComboBox<>(ConverterUtil.CUR),to=new JComboBox<>(ConverterUtil.CUR);JLabel result=new JLabel("Result");
 ConverterAnonymous(){JPanel p=new JPanel();p.add(amount);p.add(from);p.add(to);JButton b=new JButton("Convert");ActionListener h=new ActionListener(){public void actionPerformed(ActionEvent e){ConverterUtil.convert(ConverterAnonymous.this,amount,from,to,result);}};b.addActionListener(h);amount.addActionListener(h);p.add(b);add(p,BorderLayout.NORTH);add(result,BorderLayout.SOUTH);ConverterUtil.close(this);pack();}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new ConverterAnonymous().setVisible(true));}
}
