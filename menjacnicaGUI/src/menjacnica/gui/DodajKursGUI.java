package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import menjacnica.Kurs;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextPane txtSifra;
	private JTextPane txtNaziv;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextPane txtProdajniKurs;
	private JTextPane txtKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraeniNaziv;
	private JTextPane txtSrednjiKurs;
	private JTextPane txtSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 339, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTxtSifra());
		contentPane.add(getTxtNaziv());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraeniNaziv());
		contentPane.add(getTxtSrednjiKurs());
		contentPane.add(getTxtSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("\u0160ifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSifra.setPreferredSize(new Dimension(150, 30));
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNaziv.setPreferredSize(new Dimension(150, 30));
		}
		return lblNaziv;
	}
	private JTextPane getTxtSifra() {
		if (txtSifra == null) {
			txtSifra = new JTextPane();
			txtSifra.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtSifra.setPreferredSize(new Dimension(150, 30));
		}
		return txtSifra;
	}
	private JTextPane getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextPane();
			txtNaziv.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtNaziv.setPreferredSize(new Dimension(150, 30));
		}
		return txtNaziv;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Prodajni kurs");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setPreferredSize(new Dimension(150, 30));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Kupovni kurs");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setPreferredSize(new Dimension(150, 30));
		}
		return lblNewLabel_1;
	}
	private JTextPane getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextPane();
			txtProdajniKurs.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtProdajniKurs.setPreferredSize(new Dimension(150, 30));
		}
		return txtProdajniKurs;
	}
	private JTextPane getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextPane();
			txtKupovniKurs.setPreferredSize(new Dimension(150, 30));
			txtKupovniKurs.setBorder(new LineBorder(new Color(0, 0, 0)));
		}
		return txtKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSrednjiKurs.setPreferredSize(new Dimension(150, 30));
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraeniNaziv() {
		if (lblSkraeniNaziv == null) {
			lblSkraeniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraeniNaziv.setPreferredSize(new Dimension(150, 30));
			lblSkraeniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblSkraeniNaziv;
	}
	private JTextPane getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextPane();
			txtSrednjiKurs.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtSrednjiKurs.setPreferredSize(new Dimension(150, 30));
		}
		return txtSrednjiKurs;
	}
	private JTextPane getTxtSkraceniNaziv() {
		if (txtSkraceniNaziv == null) {
			txtSkraceniNaziv = new JTextPane();
			txtSkraceniNaziv.setPreferredSize(new Dimension(150, 30));
			txtSkraceniNaziv.setBorder(new LineBorder(new Color(0, 0, 0)));
		}
		return txtSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					Kurs kurs = new Kurs();
					kurs.setKupovni(Double.parseDouble(getTxtKupovniKurs().getText()));
					kurs.setNaziv(getTxtNaziv().getText());
					kurs.setProdajni(Double.parseDouble(getTxtProdajniKurs().getText()));
					kurs.setSifra(getTxtSifra().getText());
					kurs.setSkraceniNaziv(txtSkraceniNaziv.getText());
					kurs.setSrednji(Double.parseDouble(getTxtSrednjiKurs().getText()));
					KontrolerGUI.dodajKursUListuKurseva(kurs);
					}catch(Exception e1){
						System.out.println(e1.getMessage());
					}
				}
			});
			btnDodaj.setPreferredSize(new Dimension(150, 30));
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(150, 30));
		}
		return btnOdustani;
	}
}
