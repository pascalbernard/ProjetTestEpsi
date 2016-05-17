package git1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;


public class bn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame cadre = new javax.swing.JFrame("Premiere fenetre");
		JPanel panneau = new JPanel();
		panneau.setPreferredSize(new Dimension(250, 150));

		panneau.setBackground(Color.RED);
		cadre.setContentPane(panneau);
		cadre.setLocation(400, 300);
		cadre.pack();
		cadre.setVisible(true);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
