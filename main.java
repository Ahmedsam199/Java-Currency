import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
JFrame f=new JFrame();
f.setSize(400,500);
String[] Currency= {"USD","IQD"};
JPanel panel=new JPanel();  
panel.setBounds(100,100,400,400);    
JComboBox txtfrom = new JComboBox(Currency);
txtfrom.setBounds(100, 350, 200, 40);
JComboBox txtto = new JComboBox(Currency);
txtto.setBounds(100, 400, 200, 40);
panel.add(txtto);
JLabel lb=new JLabel("Enter The Amount");
lb.setBounds(30,100,55,55);
JLabel lb2=new JLabel("from");
lb2.setBounds(30,350,55,55);
panel.add(lb2);
JLabel lb3=new JLabel("TO");
lb3.setBounds(100,350,55,55);
panel.add(lb3);
JTextField tx=new JTextField();
tx.setBounds(150,210,200,40);
JButton jb=new JButton("Convert");
jb.setBounds(150,300,100,100);
panel.add(txtfrom);
f.add(jb);
f.add(tx);
f.add(panel);
f.add(lb);



f.setVisible(true);
f.setLayout(null);
jb.addActionListener(new ActionListener() {
	

	@Override
	public void actionPerformed(ActionEvent e) {
		  Double tot;
	        Double amount = Double.parseDouble(tx.getText());
	        
	        if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "IQD")
	        {
	            tot = amount / 1480;
	            JOptionPane.showMessageDialog(null,"Your Amount will be:"+tot.toString());
	        }
	       else  if(txtfrom.getSelectedItem().toString() == "IQD" && txtto.getSelectedItem().toString() == "USD")
	        {
	            tot = amount * 1480;
	            JOptionPane.showMessageDialog(null,"Your Amount will be:"+tot.toString());
	        }        
	    }
		
	}
	
);



	}

}
