import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class ConverterFrameListener extends JFrame implements ActionListener {
 JTextField amount=new JTextField("100",8);JComboBox<String> from=new JComboBox<>(ConverterUtil.CUR),to=new JComboBox<>(ConverterUtil.CUR);JLabel result=new JLabel("Result");
 ConverterFrameListener(){JPanel p=new JPanel();p.add(amount);p.add(from);p.add(to);JButton b=new JButton("Convert");b.addActionListener(this);amount.addActionListener(this);p.add(b);add(p,BorderLayout.NORTH);add(result,BorderLayout.SOUTH);ConverterUtil.close(this);pack();}
 public void actionPerformed(ActionEvent e){ConverterUtil.convert(this,amount,from,to,result);}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new ConverterFrameListener().setVisible(true));}
}
