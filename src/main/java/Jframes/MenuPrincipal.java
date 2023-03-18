package Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Por favor elige la línea de servicio que quieres trabajar:");
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Adultos hasta 68 años");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Adultos de más de 68 años");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Vehículos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehiculo vehiculo = new Vehiculo();
				vehiculo.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Mascotas");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Exequial");
		contentPane.add(btnNewButton);
	}

}
