package guipkg;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame implements ActionListener{
	
	int index = 0;
	String[] msg = {"첫 번째 문장", "두 번째 문장", "세 번째 문장"};
	JButton botton1 = new JButton("<<");
	JButton botton2 = new JButton(">>");
	JButton botton3 = new JButton(msg[0]);
	
	public SwingEx2() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		botton1.addActionListener(this);
		botton2.addActionListener(this);
		botton3.setEnabled(false);
		
		add(botton1, BorderLayout.WEST);
		add(botton2, BorderLayout.EAST);
		add(botton3, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == botton1) {
			index--;
		} else if(obj == botton2){
			index++;
		}
		if(index > 2) {
			index =0;
		} else if(index<0) {
			index=2;
		}
		// 들어갈 내용
		botton3.setText(msg[index]);
	}
	
	public static void main(String[] args) {
		SwingEx2 app = new SwingEx2();
	}
}
