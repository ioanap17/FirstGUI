import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstGUI {
	
	private static class FirstDisplay extends JPanel {
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			
			g.drawString("FATAL ERROR!", 20, 30);
		}
	}
		
	private static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ev) {
			System.exit(0);
		}
			
	}
	
	public static void main(String [] args) {
		FirstDisplay fd = new FirstDisplay();
		JButton button = new JButton("Exit");
		ButtonHandler bh = new ButtonHandler();
		
		button.addActionListener(bh);
		
		JPanel content = new JPanel();
		
		content.setLayout(new BorderLayout());
		content.add(fd, BorderLayout.CENTER);
		content.add(button, BorderLayout.SOUTH);
		
		JFrame win = new JFrame("Fuck this shit!");
		
		win.setContentPane(content);
		
		win.setSize(250, 100);
		win.setVisible(true);
		
			
	}
		

}
