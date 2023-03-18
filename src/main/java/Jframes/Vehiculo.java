package Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class Vehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField marca;
	private JTextField cedula;
	private JTextField placa;
	private JTextField apellido;
	private JTextField celular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehiculo frame = new Vehiculo();
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
	public Vehiculo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 627, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2_6 = new JLabel("REGISTRAR VEHICULO");
		lblNewLabel_2_6.setBounds(205, 5, 195, 36);
		contentPane.add(lblNewLabel_2_6);
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.BOLD, 17));

		nombre = new JTextField();
		nombre.setBounds(112, 52, 195, 36);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setColumns(10);
		contentPane.add(nombre);

		marca = new JTextField();
		marca.setBounds(433, 151, 153, 36);
		marca.setHorizontalAlignment(SwingConstants.CENTER);
		marca.setColumns(10);
		contentPane.add(marca);

		JLabel lblNewLabel_2_5 = new JLabel("CELULAR");
		lblNewLabel_2_5.setBounds(10, 149, 98, 36);
		lblNewLabel_2_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2_5);

		JLabel lblNewLabel_2_1 = new JLabel("APELLIDO");
		lblNewLabel_2_1.setBounds(10, 102, 92, 36);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("CEDULA");
		lblNewLabel_2_2.setBounds(330, 52, 98, 36);
		lblNewLabel_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("PLACA");
		lblNewLabel_2_3.setBounds(328, 102, 82, 36);
		lblNewLabel_2_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2_3);

		apellido = new JTextField();
		apellido.setBounds(112, 99, 195, 36);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		apellido.setColumns(10);
		contentPane.add(apellido);

		JLabel lblNewLabel_2_4 = new JLabel("MARCA");
		lblNewLabel_2_4.setBounds(330, 149, 98, 36);
		lblNewLabel_2_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2 = new JLabel("NOMBRE");
		lblNewLabel_2.setBounds(5, 48, 98, 41);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2);

		cedula = new JTextField();
		cedula.setBounds(433, 46, 153, 41);
		cedula.setHorizontalAlignment(SwingConstants.CENTER);
		cedula.setColumns(10);
		contentPane.add(cedula);

		placa = new JTextField();
		placa.setBounds(433, 100, 153, 41);
		placa.setHorizontalAlignment(SwingConstants.CENTER);
		placa.setColumns(10);
		contentPane.add(placa);

		celular = new JTextField();
		celular.setBounds(112, 149, 195, 36);
		celular.setHorizontalAlignment(SwingConstants.CENTER);
		celular.setColumns(10);
		contentPane.add(celular);

		JButton guardar = new JButton("GUARDAR");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!saber()) {
										
				JOptionPane.showMessageDialog(null, "Vehiculo guardado");											

				}

			}

			public boolean saber() {
				if (!nombre.getText().equals("") && !validar(nombre.getText())) {
					if (!apellido.getText().equals("") && !validar(apellido.getText())) {
						if (!cedula.getText().equals("") && validar(cedula.getText())) {
							if (!celular.getText().equals("") && validar(celular.getText())) {
								if (!placa.getText().equals("") && (placa.getText().length() < 6)) {
									if (!marca.getText().equals("") && !validar(marca.getText())) {
										return false;
									} else {
										JOptionPane.showMessageDialog(null, "Marca del Vehiculo no valida");
										marca.requestFocus();
									}
								} else {
									JOptionPane.showMessageDialog(null, "Placa no valida");
									placa.requestFocus();
								}
							} else {
								JOptionPane.showMessageDialog(null, "Celular no valido");
								celular.requestFocus();
							}
						} else {
							JOptionPane.showMessageDialog(null, "Cedula no valida");
							cedula.requestFocus();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Apellido no valido");
						apellido.requestFocus();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nombre no valida");
					nombre.requestFocus();
				}
				return true;
			}

			public boolean validar(String cadena) {
				if (cadena.matches("[0-9]+([.][0-9]+)*")) {
					return true;
				} else {
					return false;
				}
			}

		});

		guardar.setBounds(112, 211, 169, 28);
		contentPane.add(guardar);

		JButton limpiar = new JButton("LIMPIAR CAMPOS");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
			void limpiar() {
				nombre.setText("");
				apellido.setText("");
				cedula.setText("");
				celular.setText("");
				placa.setText("");
				marca.setText("");
				nombre.requestFocus();
				
			}
		});
		limpiar.setBounds(433, 198, 153, 28);
		contentPane.add(limpiar);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			MenuPrincipal mp = new MenuPrincipal();
			mp.setVisible(true);
			dispose();
			}
		});
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.setBounds(509, 260, 92, 28);
		contentPane.add(btnSalir);
	}

}
