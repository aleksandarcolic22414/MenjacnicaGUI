package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblProdajniKurs;
	private JTextField txtKupovni;
	private JTextField txtProdajni;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel_1;
	private JTextField txtIznos;
	private JLabel lblNewLabel_2;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	
	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTxtKupovni());
		contentPane.add(getTxtProdajni());
		contentPane.add(getComboBox());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTxtIznos());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setPreferredSize(new Dimension(100, 30));
			lblNewLabel.setBounds(10, 11, 93, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(291, 11, 93, 20);
		}
		return lblProdajniKurs;
	}
	private JTextField getTxtKupovni() {
		if (txtKupovni == null) {
			txtKupovni = new JTextField();
			txtKupovni.setEnabled(false);
			txtKupovni.setBounds(10, 42, 127, 26);
			txtKupovni.setColumns(10);
		}
		return txtKupovni;
	}
	private JTextField getTxtProdajni() {
		if (txtProdajni == null) {
			txtProdajni = new JTextField();
			txtProdajni.setEnabled(false);
			txtProdajni.setBounds(291, 42, 127, 26);
			txtProdajni.setColumns(10);
		}
		return txtProdajni;
	}
	
	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<String>();
			comboBox.setModel(new DefaultComboBoxModel<String>(
					new String[] {"EUR", "USD", "CHF"})
					);
			comboBox.setBounds(166, 45, 93, 20);
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Iznos");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 89, 64, 26);
		}
		return lblNewLabel_1;
	}
	
	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setBounds(10, 118, 172, 26);
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Vrsta transakcije");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(252, 97, 110, 18);
		}
		return lblNewLabel_2;
	}
	
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getRdbtnProdaja().setSelected(false);
				}
			});
			rdbtnKupovina.setBounds(252, 120, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getRdbtnKupovina().setSelected(false);
				}
			});
			rdbtnProdaja.setBounds(252, 146, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					getTxtIznos().setText(Integer.toString(slider.getValue()));
				}
			});
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setBounds(10, 176, 408, 51);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tekst = "";
					tekst += "Naziv: " + (String)getComboBox().getSelectedItem() + " ";
					tekst += "Iznos: " + getTxtIznos().getText() + " ";
					if(rdbtnKupovina.isSelected())
						tekst += "Vrsta transakcije: " + rdbtnKupovina.getText();
					else if(rdbtnProdaja.isSelected())
						tekst += "Vrsta transakcije: " + rdbtnProdaja.getText();
					else {
						JOptionPane.showMessageDialog(null, "Morate "
								+ "odabrati vrstu transakcije!");
						return;
					}
					KontrolerGUI.dodajTekstNaStatus(tekst);
				}
			});
			btnIzvrsiZamenu.setBounds(10, 238, 155, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(263, 238, 155, 23);
		}
		return btnOdustani;
	}
}
