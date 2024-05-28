package guipkg;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayout extends JFrame{

	JButton button1 = new JButton("Button1");
	JButton button2 = new JButton("Button2");
	JButton button3 = new JButton("Button3");
	JButton button4 = new JButton("Button4");
	JButton button5 = new JButton("Button5");

	Panel panel1 = new Panel();
	Panel panel2 = new Panel();

	void flowLayout() {
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
	}

	void gridLayout() {
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
	}

	void borderLayout() {
		panel1.setLayout(new BorderLayout());
		panel1.add(button1, BorderLayout.NORTH);
		panel1.add(button2, BorderLayout.WEST);
		panel1.add(button3, BorderLayout.EAST);
		panel1.add(button4, BorderLayout.SOUTH);
		panel1.add(button5, BorderLayout.CENTER);
	}

	void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);

		panel2.add(button4);
		panel2.add(button5);
		add("p1",panel1);
		add("p2",panel2);
		
		// 버튼 클릭시 이벤트
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p2");

			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p2");

			}
		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p1");

			}
		});
	}

	public SwingLayout() {
		super("Layout Showcase");
		getContentPane().add(panel1);
		//		flowLayout();
		//		gridLayout();
		cardLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);		
	}	

	public static void main(String[] args) {
		SwingLayout app = new SwingLayout();
	}

}
