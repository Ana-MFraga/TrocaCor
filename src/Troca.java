import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Troca implements ActionListener{
	private JPanel painel;
	private JLabel titulo, sub_titulo;

     public Troca(JPanel _painel, JLabel _titulo, JLabel _sub_titulo){
		this.painel = _painel;

		this.titulo = _titulo;
		this.sub_titulo = _sub_titulo;
     }

	@Override
	public void actionPerformed(ActionEvent e){
		String text = e.getActionCommand();

		if("Vermelho".equals(text)){
			titulo.setForeground(Color.decode("#ffffff"));
     		sub_titulo.setForeground(Color.decode("#ffffff"));
			painel.setBackground(Color.decode("#CF3C3C"));
			
		}else if("Azul".equals(text)){
			titulo.setForeground(Color.decode("#ffffff"));
     		sub_titulo.setForeground(Color.decode("#ffffff"));
			painel.setBackground(Color.decode("#454DF5"));
		}else if("Amarelo".equals(text)){
			titulo.setForeground(Color.decode("#000000"));
     		sub_titulo.setForeground(Color.decode("#000000"));
			painel.setBackground(Color.decode("#FFFF5D"));

		}else{
			titulo.setForeground(Color.decode("#000000"));
     		sub_titulo.setForeground(Color.decode("#000000"));
			painel.setBackground(Color.decode("#e6e6e6"));
		}
	}

}
