import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Frame
        JFrame frame = new JFrame();
        frame.setTitle("Troca Cor");
        frame.setSize(520, 340);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Painel
        JPanel painel = new JPanel();
        painel.setLayout(null);

        /*
         * Font style:
         * 0 > Normal
         * 1 > Negrito
         * 2 > Itálico
         * 3 > Negrito Itálico
         */
        JLabel titulo = new JLabel("Bem vindo ao Troca-Cor!");
        titulo.setFont(new Font("Arial", 1, 20));
        JLabel sub_titulo = new JLabel("Clique nos botões abaixo para alterar a cor da janela.");
        sub_titulo.setFont(new Font("Arial", 3, 15));
        painel.add(titulo);
        painel.add(sub_titulo);

        //Botões
        JButton btt_clear, btt_red, btt_blue, btt_yellow;
        btt_clear = new JButton("Clear");
        btt_red = new JButton("Vermelho");
        btt_blue = new JButton("Azul");
        btt_yellow = new JButton("Amarelo");
        painel.add(btt_clear);
        painel.add(btt_red);
        painel.add(btt_blue);
        painel.add(btt_yellow);

        //Posicionamento
        titulo.setBounds(135, 30, 300, 40);//setBounds(x, y, largura, altura)
        sub_titulo.setBounds(70, 60, 400, 40);

        btt_clear.setBounds(140, 140, 215, 45);
        btt_red.setBounds(10, 200, 150, 45);
        btt_blue.setBounds(175, 200, 150, 45);
        btt_yellow.setBounds(340, 200, 150, 45);

        //Estilização
        String cores[] = new String[5];
        cores[0] = "#e6e6e6"; //Fundo painel
        cores[1] = "#B3B3B3"; //Botões
        cores[2] = "#474747"; //Texto botão
        cores[3] = "#000000"; //Texto títulos

        painel.setBackground(Color.decode(cores[0]));

        titulo.setForeground(Color.decode(cores[3]));
        sub_titulo.setForeground(Color.decode(cores[3]));

        btt_clear.setFont(new Font("Arial", 2, 20));
        btt_clear.setBackground(Color.decode(cores[1]));
        btt_clear.setForeground(Color.decode(cores[2]));
        btt_clear.setBorder(null);

        btt_red.setFont(new Font("Arial", 2, 20));
        btt_red.setBackground(Color.decode(cores[1]));
        btt_red.setForeground(Color.decode(cores[2]));
        btt_red.setBorder(null);

        btt_blue.setFont(new Font("Arial", 2, 20));
        btt_blue.setBackground(Color.decode(cores[1]));
        btt_blue.setForeground(Color.decode(cores[2]));
        btt_blue.setBorder(null);

        btt_yellow.setFont(new Font("Arial", 2, 20));
        btt_yellow.setBackground(Color.decode(cores[1]));
        btt_yellow.setForeground(Color.decode(cores[2]));
        btt_yellow.setBorder(null);

        //Funções
        Troca event = new Troca(painel, titulo, sub_titulo);

        btt_clear.addActionListener(event);
        btt_clear.setActionCommand("Clear");
        
        btt_red.addActionListener(event);
        btt_red.setActionCommand("Vermelho");

        btt_blue.addActionListener(event);
        btt_blue.setActionCommand("Azul");

        btt_yellow.addActionListener(event);
        btt_yellow.setActionCommand("Amarelo");

        //SEMPRE NO FINAL
        frame.add(painel);
        frame.setVisible(true);
    }
}
