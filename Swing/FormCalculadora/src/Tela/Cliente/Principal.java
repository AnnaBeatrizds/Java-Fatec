package Tela.Cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JButton btnCalcular;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Numero 1");
		lblNum1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNum1.setBounds(25, 25, 80, 13);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Numero 2");
		lblNum2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNum2.setBounds(25, 64, 80, 13);
		contentPane.add(lblNum2);
		
		JLabel lblNum3 = new JLabel("Numero 3");
		lblNum3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNum3.setBounds(25, 110, 80, 13);
		contentPane.add(lblNum3);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNum1.setBounds(104, 23, 96, 19);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNum2.setBounds(104, 62, 96, 19);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		txtNum3 = new JTextField();
		txtNum3.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNum3.setBounds(104, 108, 96, 19);
		contentPane.add(txtNum3);
		txtNum3.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("Arial", Font.PLAIN, 14));
		txtArea.setBounds(234, 21, 96, 56);
		contentPane.add(txtArea);

		btnCalcular = new JButton("Calcular ");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {                    
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                    int num3 = Integer.parseInt(txtNum3.getText());

                    ArrayList<Integer> listaNumeros = new ArrayList<>();
                    listaNumeros.add(num1);
                    listaNumeros.add(num2);
                    listaNumeros.add(num3);
                    
                    // Chamando o método estático calcularMedia
                    double media = CalculadoraNumeros.calcularMedia(listaNumeros);
                    
                    
                    txtArea.setText("Soma: " + media);

                } catch (NumberFormatException ex) {                    
                    txtArea.setText("Erro: Entrada inválida");
                }
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.setBounds(234, 90, 96, 33);
		contentPane.add(btnCalcular);
		
		}
}
