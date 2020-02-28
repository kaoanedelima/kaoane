import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Aula3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aula3 window = new Aula3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aula3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabcadastros = new JTabbedPane(JTabbedPane.TOP);
		tabcadastros.setBounds(10, 11, 655, 372);
		frame.getContentPane().add(tabcadastros);
		
		JPanel cadastro = new JPanel();
		cadastro.setBackground(Color.WHITE);
		tabcadastros.addTab("Cadastros", null, cadastro, null);
		cadastro.setLayout(null);
		
		JList list = new JList();
		list.setBounds(100, 128, 92, -51);
		cadastro.add(list);
		
		textField = new JTextField();
		textField.setBounds(52, 10, 150, 20);
		cadastro.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(281, 10, 150, 20);
		cadastro.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(334, 41, 150, 20);
		cadastro.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel labelnome = new JLabel("Nome");
		labelnome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		labelnome.setHorizontalAlignment(SwingConstants.CENTER);
		labelnome.setBounds(-12, 11, 82, 17);
		cadastro.add(labelnome);
		
		JLabel labelsobre = new JLabel("Sobrenome");
		labelsobre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelsobre.setHorizontalAlignment(SwingConstants.CENTER);
		labelsobre.setBounds(198, 11, 82, 17);
		cadastro.add(labelsobre);
		
		JLabel labelcnh = new JLabel("CNH");
		labelcnh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelcnh.setHorizontalAlignment(SwingConstants.CENTER);
		labelcnh.setBounds(260, 41, 66, 18);
		cadastro.add(labelcnh);
		
		JLabel labeldn = new JLabel("Data Nascimento");
		labeldn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labeldn.setHorizontalAlignment(SwingConstants.CENTER);
		labeldn.setBounds(-2, 41, 110, 20);
		cadastro.add(labeldn);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 41, 140, 20);
		cadastro.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel labelendereco = new JLabel("Endere\u00E7o");
		labelendereco.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelendereco.setHorizontalAlignment(SwingConstants.CENTER);
		labelendereco.setBounds(0, 128, 92, 20);
		cadastro.add(labelendereco);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 129, 232, 20);
		cadastro.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel labelcep = new JLabel("CEP");
		labelcep.setHorizontalAlignment(SwingConstants.CENTER);
		labelcep.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelcep.setBounds(2, 83, 49, 20);
		cadastro.add(labelcep);
		
		textField_5 = new JTextField();
		textField_5.setBounds(52, 88, 150, 20);
		cadastro.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(419, 132, 150, 20);
		cadastro.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel labelcomplemento = new JLabel("Complemento");
		labelcomplemento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelcomplemento.setBounds(320, 128, 110, 27);
		cadastro.add(labelcomplemento);
		
		JLabel labelcidade = new JLabel("Cidade");
		labelcidade.setHorizontalAlignment(SwingConstants.CENTER);
		labelcidade.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelcidade.setBounds(212, 83, 68, 21);
		cadastro.add(labelcidade);
		
		JLabel labelestado = new JLabel("Estado");
		labelestado.setHorizontalAlignment(SwingConstants.CENTER);
		labelestado.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		labelestado.setBounds(371, 83, 82, 20);
		cadastro.add(labelestado);
		
		JButton buttonEnviar = new JButton("Cadastrar");
		buttonEnviar.setBackground(Color.ORANGE);
		buttonEnviar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		buttonEnviar.setBounds(239, 166, 127, 23);
		cadastro.add(buttonEnviar);
		
		JList list_1 = new JList();
		list_1.setBackground(Color.LIGHT_GRAY);
		list_1.setBounds(31, 210, 574, 123);
		cadastro.add(list_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Chapec\u00F3", "Erechim", "Maravilha", "Xanxere", "Xaxim", "Nova Erechim"}));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(281, 83, 85, 22);
		cadastro.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"RS", "SC"}));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(444, 83, 66, 22);
		cadastro.add(comboBox_2);
		
		JPanel tabcarro = new JPanel();
		tabcarro.setBackground(Color.WHITE);
		tabcadastros.addTab("Carro", null, tabcarro, null);
		tabcarro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 55, 102, 25);
		tabcarro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Loca\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 107, 144, 25);
		tabcarro.add(lblNewLabel_1);
		
		JList list_2 = new JList();
		list_2.setBackground(Color.LIGHT_GRAY);
		list_2.setBounds(75, 194, 482, 114);
		tabcarro.add(list_2);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(37, 30, 49, 14);
		tabcarro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(37, 82, 49, 14);
		tabcarro.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(196, 145, 49, 14);
		tabcarro.add(lblNewLabel_4);
		
		JPanel tablocacao = new JPanel();
		tabcadastros.addTab("Loca\u00E7\u00E3o ", null, tablocacao, null);
	}
}
