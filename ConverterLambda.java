import javax.swing.*;import java.awt.*;
public class ConverterLambda extends JFrame {
 JTextField amount=new JTextField("100",8);JComboBox<String> from=new JComboBox<>(ConverterUtil.CUR),to=new JComboBox<>(ConverterUtil.CUR);JLabel result=new JLabel("Result");
 ConverterLambda(){super("Converter – Lambda");JPanel p=new JPanel();p.add(amount);p.add(from);p.add(to);JButton b=new JButton("Convert");p.add(b);add(p,BorderLayout.NORTH);add(result,BorderLayout.SOUTH);b.addActionListener(e->ConverterUtil.convert(this,amount,from,to,result));amount.addActionListener(e->ConverterUtil.convert(this,amount,from,to,result));ConverterUtil.close(this);pack();}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new ConverterLambda().setVisible(true));}
}
