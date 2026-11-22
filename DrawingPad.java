import javax.swing.*;import java.awt.*;import java.awt.event.*;import java.util.*;
public class DrawingPad extends JFrame {
 java.util.List<Point> points=new ArrayList<>();JLabel count=new JLabel("Clicks: 0");
 DrawingPad(){super("Drawing Pad");JPanel area=new JPanel(){protected void paintComponent(Graphics g){super.paintComponent(g);g.setColor(Color.BLUE);for(Point p:points)g.fillOval(p.x-5,p.y-5,10,10);}};area.addMouseListener(new MouseAdapter(){@Override public void mouseClicked(MouseEvent e){points.add(e.getPoint());count.setText("Clicks: "+points.size());area.repaint();}});add(area);add(count,BorderLayout.SOUTH);setSize(550,400);setDefaultCloseOperation(EXIT_ON_CLOSE);setLocationRelativeTo(null);}
 public static void main(String[] a){SwingUtilities.invokeLater(()->new DrawingPad().setVisible(true));}
}
