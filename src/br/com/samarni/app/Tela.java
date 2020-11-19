package br.com.samarni.app;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame{

JButton jb1 = new JButton("Botão 1");	
JButton jb2 = new JButton("Botão 2");
	
public Tela() {
		
		setLayout(null);
		jb1.setBounds(100, 400, 100, 20);
		jb2.setBounds(100, 450, 100, 20);
		add(jb1);
		add(jb2);
		
		setTitle("Cliente");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
public static void main(String[] args) {
	new Tela();
}

}