package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITrabajador extends JFrame implements ActionListener{

	private JButton bLeer;
	private JButton bEditar;
	public GUITrabajador() {
		iniciarVentana();
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarVentana() {
		JPanel panel = new JPanel();

		JButton bLeer = new JButton();
		bLeer.setText("Leer Datos Trabajador");
		JButton bEditar = new JButton();
		bEditar.setText("Editar Datos Trabajador");

		panel.add(bLeer);
		panel.add(bEditar);

		this.add(panel);

		bLeer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		bEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Trabajador t = new Trabajador();
				t.setIsapre("Nose");
				t.setAfp("Vida");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}