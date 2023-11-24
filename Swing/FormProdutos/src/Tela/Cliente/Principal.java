package Tela.Cliente;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto1;
	private JTextField txtProduto2;
	private JTextField txtProduto3;
	private JTextField txtProduto4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} 				
				catch (Exception e) {
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
		setBounds(100, 100, 560, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto1 = new JLabel("Produto 1: ");
		lblProduto1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProduto1.setBounds(25, 25, 82, 20);
		contentPane.add(lblProduto1);
		
		txtProduto1 = new JTextField();
		txtProduto1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtProduto1.setBounds(108, 25, 201, 20);
		contentPane.add(txtProduto1);
		txtProduto1.setColumns(10);
		
		JLabel lblProduto2 = new JLabel("Produto 2: ");
		lblProduto2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProduto2.setBounds(25, 62, 82, 20);
		contentPane.add(lblProduto2);
		
		txtProduto2 = new JTextField();
		txtProduto2.setColumns(10);
		txtProduto2.setBounds(108, 62, 201, 20);
		contentPane.add(txtProduto2);
		
		JLabel lblProduto3 = new JLabel("Produto 3: ");
		lblProduto3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProduto3.setBounds(25, 102, 82, 20);
		contentPane.add(lblProduto3);
		
		txtProduto3 = new JTextField();
		txtProduto3.setColumns(10);
		txtProduto3.setBounds(108, 102, 201, 20);
		contentPane.add(txtProduto3);
		
		JLabel lblProduto4 = new JLabel("Produto 4: ");
		lblProduto4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProduto4.setBounds(25, 144, 82, 20);
		contentPane.add(lblProduto4);
		
		txtProduto4 = new JTextField();
		txtProduto4.setColumns(10);
		txtProduto4.setBounds(108, 144, 201, 20);
		contentPane.add(txtProduto4);
		
		//vetor dos produtos
		ArrayList <String> Produtos = new ArrayList<>();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String Produto1 = txtProduto1.getText();
				String Produto2 = txtProduto2.getText();
				String Produto3 = txtProduto3.getText();
				String Produto4 = txtProduto4.getText();
				
				StringBuilder dadosProduto = new StringBuilder();
				
					dadosProduto.append("Produto 1: ").append(Produto1)
					.append("\n Produto 2: ").append(Produto2)
					.append("\n Produto 3: ").append(Produto3)
					.append("\n Produto 4: ").append(Produto4);
					
					Produtos.add(dadosProduto.toString());
				
					txtProduto1.setText("");
					txtProduto2.setText("");
					txtProduto3.setText("");
					txtProduto4.setText("");
										
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(364, 25, 172, 139);
		contentPane.add(textArea);
		
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCadastrar.setBounds(25, 209, 109, 31);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir Produtos");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(String produto : Produtos) {
					textArea.setText("\n" + Produtos );
				}
			}
		});
		
		btnExibir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnExibir.setBounds(187, 209, 122, 31);
		contentPane.add(btnExibir);
		
		
	}

}
