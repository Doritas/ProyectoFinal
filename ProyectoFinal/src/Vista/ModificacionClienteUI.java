package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModificacionClienteUI extends JPanel {
	private JTextField textNombreCM;
	private JTextField textPrimerACM;
	private JTextField textSegundoACM;
	private JTextField textDNI_CM;
	private JLabel lblModCliente;
	private JComboBox comboBoxModCliente;
	private JLabel lblNombre;
	private JLabel lblPrimerA;
	private JLabel lblSegundo;
	private JLabel lblDni;
	private JButton btnGuardarModCliente;
	public ModificacionClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblModCliente = new JLabel("MODIFICAR CLIENTE");
		GridBagConstraints gbc_lblModCliente = new GridBagConstraints();
		gbc_lblModCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblModCliente.gridx = 3;
		gbc_lblModCliente.gridy = 1;
		add(lblModCliente, gbc_lblModCliente);
		
		comboBoxModCliente = new JComboBox();
		GridBagConstraints gbc_comboBoxModCliente = new GridBagConstraints();
		gbc_comboBoxModCliente.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxModCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxModCliente.gridx = 3;
		gbc_comboBoxModCliente.gridy = 3;
		add(comboBoxModCliente, gbc_comboBoxModCliente);
		
		lblNombre = new JLabel("NOMBRE");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 5;
		add(lblNombre, gbc_lblNombre);
		
		textNombreCM = new JTextField();
		GridBagConstraints gbc_textNombreCM = new GridBagConstraints();
		gbc_textNombreCM.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreCM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreCM.gridx = 3;
		gbc_textNombreCM.gridy = 5;
		add(textNombreCM, gbc_textNombreCM);
		textNombreCM.setColumns(10);
		
		lblPrimerA = new JLabel("PRIMER APELLIDO");
		GridBagConstraints gbc_lblPrimerA = new GridBagConstraints();
		gbc_lblPrimerA.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerA.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerA.gridx = 1;
		gbc_lblPrimerA.gridy = 7;
		add(lblPrimerA, gbc_lblPrimerA);
		
		textPrimerACM = new JTextField();
		GridBagConstraints gbc_textPrimerACM = new GridBagConstraints();
		gbc_textPrimerACM.insets = new Insets(0, 0, 5, 5);
		gbc_textPrimerACM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrimerACM.gridx = 3;
		gbc_textPrimerACM.gridy = 7;
		add(textPrimerACM, gbc_textPrimerACM);
		textPrimerACM.setColumns(10);
		
		lblSegundo = new JLabel("SEGUNDO APELLIDO");
		GridBagConstraints gbc_lblSegundo = new GridBagConstraints();
		gbc_lblSegundo.anchor = GridBagConstraints.WEST;
		gbc_lblSegundo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundo.gridx = 1;
		gbc_lblSegundo.gridy = 9;
		add(lblSegundo, gbc_lblSegundo);
		
		textSegundoACM = new JTextField();
		GridBagConstraints gbc_textSegundoACM = new GridBagConstraints();
		gbc_textSegundoACM.insets = new Insets(0, 0, 5, 5);
		gbc_textSegundoACM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSegundoACM.gridx = 3;
		gbc_textSegundoACM.gridy = 9;
		add(textSegundoACM, gbc_textSegundoACM);
		textSegundoACM.setColumns(10);
		
		lblDni = new JLabel("D.N.I.");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.WEST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 11;
		add(lblDni, gbc_lblDni);
		
		textDNI_CM = new JTextField();
		GridBagConstraints gbc_textDNI_CM = new GridBagConstraints();
		gbc_textDNI_CM.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI_CM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI_CM.gridx = 3;
		gbc_textDNI_CM.gridy = 11;
		add(textDNI_CM, gbc_textDNI_CM);
		textDNI_CM.setColumns(10);
		
		btnGuardarModCliente = new JButton("GUARDAR");
		GridBagConstraints gbc_btnGuardarModCliente = new GridBagConstraints();
		gbc_btnGuardarModCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarModCliente.gridx = 5;
		gbc_btnGuardarModCliente.gridy = 13;
		add(btnGuardarModCliente, gbc_btnGuardarModCliente);
	}

	

}