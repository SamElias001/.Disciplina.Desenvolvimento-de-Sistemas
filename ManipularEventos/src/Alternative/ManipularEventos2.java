package Alternative;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManipularEventos2 extends JFrame{
    JFrame form1;
    JButton botao1,botao2;
    JPanel painel;
    
    public ManipularEventos2() {
        form1 = new JFrame("Teste com eventos");
        botao1 = new JButton("Botão 1");
        botao2 = new JButton("Botão 2");
        
        botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Clickei sobre o Botão1");				
			}
        });
        
        botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Clickei sobre o Botão1");				
			}
        });
        
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
}