import javax.swing.*;import java.awt.*;
public class FeePaymentApp extends JFrame {
 JTextField name=new JTextField(15),amount=new JTextField(10); JLabel status=new JLabel("Enter details"); FeeService service=new FeeService();
 FeePaymentApp(){super("Fee Payment");setLayout(new BorderLayout());JPanel form=new JPanel(new GridLayout(2,2));form.add(new JLabel("Student"));form.add(name);form.add(new JLabel("Amount"));form.add(amount);JButton pay=new JButton("Pay"),receipt=new JButton("Receipt");JPanel buttons=new JPanel();buttons.add(pay);buttons.add(receipt);add(buttons,BorderLayout.NORTH);add(form);add(status,BorderLayout.SOUTH);
 pay.addActionListener(e->{try{status.setText(service.pay(name.getText(),amount.getText()));}catch(Exception x){status.setText(x.getMessage());JOptionPane.showMessageDialog(this,x.getMessage());}});
 receipt.addActionListener(e->JOptionPane.showMessageDialog(this,status.getText()));setDefaultCloseOperation(EXIT_ON_CLOSE);pack();setLocationRelativeTo(null);}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new FeePaymentApp().setVisible(true));}
}
