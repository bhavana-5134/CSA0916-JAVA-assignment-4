import javax.swing.*;import java.awt.*;import java.awt.event.*;import java.time.*;import java.util.*;
public class AppointmentDesk extends JFrame {
 JTextField patient=new JTextField(14),date=new JTextField("2026-12-01",10); JComboBox<String> dept=new JComboBox<>(new String[]{"Cardiology","Dental","General"}),doctor=new JComboBox<>(); JLabel status=new JLabel("Choose department");
 Map<String,String[]> data=Map.of("Cardiology",new String[]{"Dr Anand","Dr Priya"},"Dental",new String[]{"Dr Kumar","Dr Meera"},"General",new String[]{"Dr Ravi","Dr Nisha"});
 AppointmentDesk(){super("Hospital Appointment Desk");JPanel f=new JPanel(new GridLayout(4,2));f.add(new JLabel("Patient"));f.add(patient);f.add(new JLabel("Department"));f.add(dept);f.add(new JLabel("Doctor"));f.add(doctor);f.add(new JLabel("Date YYYY-MM-DD"));f.add(date);JButton book=new JButton("Book"),clear=new JButton("Clear");JPanel b=new JPanel();b.add(book);b.add(clear);add(f);add(b,BorderLayout.SOUTH);add(status,BorderLayout.NORTH);
 dept.addItemListener(e->{if(e.getStateChange()==ItemEvent.SELECTED)refresh();});book.addActionListener(e->book());clear.addActionListener(e->{patient.setText("");status.setText("Cleared");});addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){dispose();}});setDefaultCloseOperation(DISPOSE_ON_CLOSE);refresh();pack();setLocationRelativeTo(null);}
 void refresh(){doctor.removeAllItems();for(String d:data.get((String)dept.getSelectedItem()))doctor.addItem(d);}
 void book(){if(patient.getText().isBlank()){status.setText("Enter patient name");return;}try{LocalDate.parse(date.getText());status.setText("Booked with "+doctor.getSelectedItem());}catch(Exception e){status.setText("Invalid date");}}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new AppointmentDesk().setVisible(true));}
}
