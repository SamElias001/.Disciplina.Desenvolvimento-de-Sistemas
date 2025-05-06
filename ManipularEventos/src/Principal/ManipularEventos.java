package Principal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManipularEventos extends JFrame implements ActionListener, MouseMotionListener{
    JFrame form1;
    JButton botao1,botao2;
    JPanel painel;
    
    public ManipularEventos() {
        form1 = new JFrame("Teste com eventos");
        botao1 = new JButton("Botão 1");
        botao2 = new JButton("Botão 2");
        
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        
        botao1.addMouseMotionListener(this);
        botao2.addMouseMotionListener(this);
        
        painel = new JPanel ();
        painel.setLayout(new FlowLayout());
        painel.add(botao1);
        painel.add(botao2);
        
        form1.setSize(300,100);
        form1.add(painel);
        form1.setLocationRelativeTo( null );
        form1.setVisible(true);
        form1.setDefaultCloseOperation(form1.EXIT_ON_CLOSE );
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
    	if(arg0.getSource()==botao1){
			JOptionPane.showMessageDialog(null,"Clikei no botão1");
		}
    	if(arg0.getSource()==botao2){
			JOptionPane.showMessageDialog(null,"Clickei no botão2");
		}
    }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		if(arg0.getSource()==botao1){
			JOptionPane.showMessageDialog(null,"Passei o mouse sobre o botão1");
		}
		if(arg0.getSource()==botao2){
			JOptionPane.showMessageDialog(null,"Passei o mouse sobre o botão2");
		}
	}
}