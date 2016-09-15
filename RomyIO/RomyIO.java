package com.svenkayser.romyio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;





public class RomyIO extends JPanel implements ActionListener {
	private static final long serialVersionUID = 3139739633242369771L;

	private static String appname;
	private static RomyIO instance;
	private static JFrame frame;
	private static Process p;
	
	private JTextArea notifier;
	
	public static void run(String pAppname,Runnable runner){
		appname = pAppname;
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				instance = createAndShowGUI();
				Thread t = new Thread(runner);
				t.start();
			}
		});
	}
	
	private static RomyIO createAndShowGUI() {
		frame = new JFrame(appname);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RomyIO romyio = new RomyIO();
		frame.add(romyio);
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (p != null && p.isAlive()) {
					p.destroyForcibly();
				}
			}
		});

		return romyio;
	}
	
	public RomyIO() {
		super(new BorderLayout());

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		notifier = new JTextArea(30, 160);
		notifier.setFont(new Font("Monospaced", Font.PLAIN, 15));
		notifier.setMargin(new Insets(5, 5, 5, 5));
		notifier.setEditable(false);
		notifier.setLineWrap(true);
		JScrollPane notifierPane = new JScrollPane(notifier);
		add(notifierPane, BorderLayout.CENTER);

		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

	}
	
	public void writeConsole(String s){
		notifier.append(s);
	}
	
	public String readPopup(String question){
		String s = (String)JOptionPane.showInputDialog(
		                    frame,
		                    question,"Dialog",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null, null,"");

		return s;
	}
	
	
	public static void write(int i){
		instance.writeConsole(Integer.toString(i));
	}
	
	public static void write(double f){
		instance.writeConsole(Double.toString(f));	
	}
	
	public static void write(Object s){
		instance.writeConsole(s.toString());
	}
	
	public static void newLine(){
		instance.writeConsole("\n");
	}
	
	public static String read(String question){
		return instance.readPopup(question);
	}
	
	public static String read(){
		return read("");
	}
	
	public static boolean ask(String question){
		
		int n = JOptionPane.showConfirmDialog(
			    frame,
			    question,
			    "Dialog",
			    JOptionPane.YES_NO_OPTION);
		
		return n==0;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		return;
	}
	
}
