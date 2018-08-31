package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.TextArea;

@SuppressWarnings("serial")
public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField;
	private JTextField textField_25;


	/**
	 * Create the frame.
	 */
	public frmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grafos", null, panel, null);
		panel.setLayout(null);
		
		JButton btnDijkstra = new JButton("Dijkstra");
		btnDijkstra.setBounds(163, 338, 89, 23);
		panel.add(btnDijkstra);
		
		JButton btnBellman = new JButton("Bellman");
		btnBellman.setBounds(163, 300, 89, 23);
		panel.add(btnBellman);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(468, 101, 123, 23);
		panel.add(btnLimpiar);
		
		JLabel lblNroNodos = new JLabel("Nro. nodos:");
		lblNroNodos.setBounds(468, 10, 123, 14);
		panel.add(lblNroNodos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(468, 36, 56, 20);
		panel.add(comboBox);
		
		JButton btnGenerarGrafo = new JButton("Generar grafo");
		btnGenerarGrafo.setBounds(468, 67, 123, 23);
		panel.add(btnGenerarGrafo);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(10, 10, 452, 288);
		panel.add(textArea_2);
		
		JLabel lblNodoInicial = new JLabel("Nodo inicial:");
		lblNodoInicial.setBounds(10, 304, 80, 14);
		panel.add(lblNodoInicial);
		
		JLabel lblNodoFinal = new JLabel("Nodo final:");
		lblNodoFinal.setBounds(10, 342, 80, 14);
		panel.add(lblNodoFinal);
		
		textField = new JTextField();
		textField.setBounds(96, 301, 45, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(96, 339, 45, 20);
		panel.add(textField_25);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Simplex", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblVariablesDeDesicion = new JLabel("Variables de desicion:");
		lblVariablesDeDesicion.setBounds(480, 11, 129, 14);
		panel_1.add(lblVariablesDeDesicion);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(480, 36, 129, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblRestricciones = new JLabel("Restricciones:");
		lblRestricciones.setBounds(480, 67, 103, 14);
		panel_1.add(lblRestricciones);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(480, 92, 129, 20);
		panel_1.add(comboBox_2);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(494, 140, 89, 23);
		panel_1.add(btnGenerar);
		
		JButton btnLmpiar = new JButton("Lmpiar");
		btnLmpiar.setBounds(494, 174, 89, 23);
		panel_1.add(btnLmpiar);
		
		JLabel lblNewLabel = new JLabel("S.A:");
		lblNewLabel.setBounds(20, 281, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblEcuacin = new JLabel("MAX Z =");
		lblEcuacin.setBounds(20, 255, 46, 14);
		panel_1.add(lblEcuacin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 252, 28, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblX = new JLabel("X1 +");
		lblX.setBounds(114, 255, 34, 14);
		panel_1.add(lblX);
		
		JLabel lblX_1 = new JLabel("X2 +");
		lblX_1.setBounds(196, 255, 34, 14);
		panel_1.add(lblX_1);
		
		JButton btnSimplex = new JButton("Simplex");
		btnSimplex.setBounds(494, 208, 89, 23);
		panel_1.add(btnSimplex);
		
		JLabel lblX_2 = new JLabel("X3 +");
		lblX_2.setBounds(278, 255, 34, 14);
		panel_1.add(lblX_2);
		
		JLabel lblX_3 = new JLabel("X4");
		lblX_3.setBounds(360, 255, 34, 14);
		panel_1.add(lblX_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(158, 252, 28, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(240, 252, 28, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(322, 252, 28, 20);
		panel_1.add(textField_5);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(10, 10, 464, 236);
		panel_1.add(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 278, 28, 20);
		panel_1.add(textField_1);
		
		JLabel label = new JLabel("X1 +");
		label.setBounds(114, 281, 34, 14);
		panel_1.add(label);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(158, 278, 28, 20);
		panel_1.add(textField_6);
		
		JLabel label_1 = new JLabel("X2 +");
		label_1.setBounds(196, 281, 34, 14);
		panel_1.add(label_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(240, 278, 28, 20);
		panel_1.add(textField_7);
		
		JLabel label_2 = new JLabel("X3 +");
		label_2.setBounds(278, 281, 34, 14);
		panel_1.add(label_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(322, 278, 28, 20);
		panel_1.add(textField_8);
		
		JLabel lblX_4 = new JLabel("X4 <=");
		lblX_4.setBounds(360, 281, 34, 14);
		panel_1.add(lblX_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(76, 309, 28, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(76, 340, 28, 20);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(76, 371, 28, 20);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(158, 309, 28, 20);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(158, 340, 28, 20);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(158, 371, 28, 20);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(240, 309, 28, 20);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(240, 340, 28, 20);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(240, 371, 28, 20);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(322, 309, 28, 20);
		panel_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(322, 340, 28, 20);
		panel_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(322, 371, 28, 20);
		panel_1.add(textField_20);
		
		JLabel label_4 = new JLabel("X1 +");
		label_4.setBounds(114, 312, 34, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("X1 +");
		label_5.setBounds(114, 343, 34, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("X1 +");
		label_6.setBounds(114, 374, 34, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("X2 +");
		label_7.setBounds(196, 312, 34, 14);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("X2 +");
		label_8.setBounds(196, 343, 34, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("X2 +");
		label_9.setBounds(196, 374, 34, 14);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("X3 +");
		label_10.setBounds(278, 312, 34, 14);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("X3 +");
		label_11.setBounds(278, 343, 34, 14);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("X3 +");
		label_12.setBounds(278, 374, 34, 14);
		panel_1.add(label_12);
		
		JLabel label_3 = new JLabel("X4 <=");
		label_3.setBounds(360, 312, 34, 14);
		panel_1.add(label_3);
		
		JLabel label_13 = new JLabel("X4 <=");
		label_13.setBounds(360, 343, 34, 14);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("X4 <=");
		label_14.setBounds(360, 374, 34, 14);
		panel_1.add(label_14);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(404, 278, 28, 20);
		panel_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(404, 309, 28, 20);
		panel_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(404, 340, 28, 20);
		panel_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(404, 371, 28, 20);
		panel_1.add(textField_24);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Mochila", null, panel_2, null);
		panel_2.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(0, 10, 609, 286);
		panel_2.add(textArea);
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.setBounds(0, 302, 89, 23);
		panel_2.add(btnResolver);
	}
}
