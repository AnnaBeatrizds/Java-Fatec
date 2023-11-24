package Tela.Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JTextField txtDataNasc;

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
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(30, 10, 57, 19);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNome.setBounds(30, 39, 200, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Arial", Font.PLAIN, 16));
		lblIdade.setBounds(30, 89, 57, 13);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Arial", Font.PLAIN, 14));
		txtIdade.setBounds(30, 112, 200, 30);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Gênero");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSexo.setBounds(30, 166, 70, 17);
		contentPane.add(lblSexo);
		
		JComboBox cbSexo = new JComboBox();
		cbSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		cbSexo.setModel(new DefaultComboBoxModel(new String[] {"", "Feminino", "Masculino"}));
		cbSexo.setBounds(96, 166, 84, 21);
		contentPane.add(cbSexo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(30, 199, 57, 19);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEmail.setBounds(30, 228, 200, 30);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTelefone.setBounds(30, 280, 70, 19);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTelefone.setBounds(30, 309, 200, 30);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCPF.setBounds(30, 359, 57, 19);
		contentPane.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCPF.setBounds(30, 390, 200, 30);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDataNasc.setBounds(30, 437, 150, 19);
		contentPane.add(lblDataNasc);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(30, 466, 200, 30);
		contentPane.add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Arial", Font.PLAIN, 14));
		txtArea.setBackground(new Color(238, 238, 238));
		txtArea.setBounds(282, 39, 244, 457);
		contentPane.add(txtArea);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome = txtNome.getText();				
				String Idade = txtIdade.getText();
				String Genero = (String) cbSexo.getSelectedItem();
				String Email = txtEmail.getText();
				String Telefone = txtTelefone.getText();
				String CPF = txtCPF.getText();
				String DataNasc = txtDataNasc.getText();
								
				txtArea.setText(Nome + "\n" + Idade + "\n" + Genero + "\n" + Email + "\n" + Telefone + "\n" + CPF + "\n" + DataNasc);
				
			}
		});
		
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBounds(78, 512, 85, 30);
		contentPane.add(btnEnviar);		
		
		JLabel lblDados = new JLabel("Dados");
		lblDados.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDados.setBounds(380, 10, 57, 19);
		contentPane.add(lblDados);
	}
}
