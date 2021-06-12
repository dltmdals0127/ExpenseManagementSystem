package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountAdder;
import gui.AccountViewer;
import gui.WindowFrame;

public class ButtonAdd implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAdd(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getAdder());
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton) e.getSource();
//		frame.getAdder();
//		AccountAdder add = frame.getAdder();
//		frame.setupPanel(add);
	}

}
