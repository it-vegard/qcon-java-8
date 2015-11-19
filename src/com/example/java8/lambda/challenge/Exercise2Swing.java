package com.example.java8.lambda.challenge;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Exercise2Swing extends JPanel {
	private static final long serialVersionUID = 1L;
	protected JButton b1, b2, b3;

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
    	
    	//TODO: Replace Runnable with a lambda expression
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
    
    public Exercise2Swing() {
    	setup();
    }
    
    private void setup() {
        b1 = new JButton("Disable middle button");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);
    	//TODO: Replace ActionListener with a lambda expression
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		   		b2.setEnabled(false);
			}
        });
 
        b2 = new JButton("Middle button");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);
 
        b3 = new JButton("Enable middle button");
        b3.setMnemonic(KeyEvent.VK_E);
    	//TODO: Replace ActionListener with a lambda expression
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		   		b2.setEnabled(true);
			}
        });

        b1.setToolTipText("Click this button to disable the middle button.");
        b2.setToolTipText("This middle button does nothing when you click it.");
        b3.setToolTipText("Click this button to enable the middle button.");
 
        add(b1);
        add(b2);
        add(b3);
    }
 
    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Exercise2Swing newContentPane = new Exercise2Swing();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
}
