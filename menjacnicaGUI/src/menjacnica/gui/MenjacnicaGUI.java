package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import menjacnica.Kurs;
import menjacnica.Menjacnica;
import menjacnica.gui.model.MenjacnicaTableModel;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JPanel pnlButtons;
	private JButton btnDodajKurs;
	private JButton btnIzbriiKurs;
	private JPanel pnlTable;
	private JButton btnIzvriZamenu;	
	private JPanel pnlStatus;
	private TextArea txtStatus;
	private JScrollPane scrollPaneTable;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmIzbriiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	
	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				KontrolerGUI.ugasiAplikaciju();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/Water lilies.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 514, 345);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnlButtons(), BorderLayout.EAST);
		contentPane.add(getPnlTable(), BorderLayout.CENTER);
		contentPane.add(getPnlStatus(), BorderLayout.SOUTH);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.ucitajIzFajla();
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.sacuvajUFajl();
				}
			});
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.ugasiAplikaciju();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Autor: Aleksandar Čolić\n"
							+ "Broj indexa: 224/14\n" + "Grupa: B5");
				}
			});
		}
		return mntmAbout;
	}
	private JPanel getPnlButtons() {
		if (pnlButtons == null) {
			pnlButtons = new JPanel();
			pnlButtons.setPreferredSize(new Dimension(130, 10));
			pnlButtons.setAlignmentY(Component.TOP_ALIGNMENT);
			pnlButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			pnlButtons.add(getBtnDodajKurs());
			pnlButtons.add(getBtnIzbriiKurs());
			pnlButtons.add(getBtnIzvriZamenu());
		}
		return pnlButtons;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.napraviProzorDodajKurs();
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnDodajKurs;
	}
	private JButton getBtnIzbriiKurs() {
		if (btnIzbriiKurs == null) {
			btnIzbriiKurs = new JButton("Izbri\u0161i kurs");
			btnIzbriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int red = table.getSelectedRow();
					if(red == -1)
						JOptionPane.showMessageDialog(null, "Morate oznaciti red za brisanje!");
					else {
						Kurs k = new Kurs();
						k.setSifra((String)table.getValueAt(red, 0));
						k.setSkraceniNaziv((String)table.getValueAt(red, 1));
						k.setProdajni((double)table.getValueAt(red, 2));
						k.setSrednji((double)table.getValueAt(red, 3));
						k.setKupovni((double)table.getValueAt(red, 4));
						k.setNaziv((String)table.getValueAt(red, 5));
						KontrolerGUI.izbrisiKurs(k,red);
					}
				}
			});
			btnIzbriiKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnIzbriiKurs;
	}
	private JPanel getPnlTable() {
		if (pnlTable == null) {
			pnlTable = new JPanel();
			pnlTable.setLayout(new BorderLayout(0, 0));
			pnlTable.add(getScrollPaneTable(), BorderLayout.CENTER);
		}
		return pnlTable;
	}
	

	private JButton getBtnIzvriZamenu() {
		if (btnIzvriZamenu == null) {
			btnIzvriZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvriZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.pokreniIzvrsiZamenuProzor();
				}
			});
			btnIzvriZamenu.setPreferredSize(new Dimension(115, 23));
		}
		return btnIzvriZamenu;
	}
	private JPanel getPnlStatus() {
		if (pnlStatus == null) {
			pnlStatus = new JPanel();
			pnlStatus.setPreferredSize(new Dimension(10, 90));
			pnlStatus.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlStatus.setLayout(new BorderLayout(0, 0));
			pnlStatus.add(getTextArea_1(), BorderLayout.NORTH);
		}
		return pnlStatus;
	}
	private TextArea getTextArea_1() {
		if (txtStatus == null) {
			txtStatus = new TextArea();
			txtStatus.setPreferredSize(new Dimension(0, 70));
		}
		return txtStatus;
	}
	public TextArea getTxtStatus() {
		return getTextArea_1();
	}

	public void osveziTabelu() {
		MenjacnicaTableModel model = (MenjacnicaTableModel) table.getModel();
		model.ucitajKurseve(KontrolerGUI.vratiSveKurseve());
	}

	
	private JScrollPane getScrollPaneTable() {
		if (scrollPaneTable == null) {
			scrollPaneTable = new JScrollPane();
			addPopup(scrollPaneTable, getPopupMenu());
			scrollPaneTable.setViewportView(getTable());
		}
		return scrollPaneTable;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable(new MenjacnicaTableModel(null));
			table.setColumnSelectionAllowed(false);
		}
		return table;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmIzbriiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.napraviProzorDodajKurs();
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmIzbriiKurs() {
		if (mntmIzbriiKurs == null) {
			mntmIzbriiKurs = new JMenuItem("Izbri\u0161i kurs");
			mntmIzbriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int red = table.getSelectedRow();
					if(red == -1)
						JOptionPane.showMessageDialog(null, "Morate oznaciti red za brisanje!");
					else {
						Kurs k = new Kurs();
						k.setSifra((String)table.getValueAt(red, 0));
						k.setSkraceniNaziv((String)table.getValueAt(red, 1));
						k.setProdajni((double)table.getValueAt(red, 2));
						k.setSrednji((double)table.getValueAt(red, 3));
						k.setKupovni((double)table.getValueAt(red, 4));
						k.setNaziv((String)table.getValueAt(red, 5));
						KontrolerGUI.izbrisiKurs(k,red);
					}
				}
			});
		}
		return mntmIzbriiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvr\u0161i zamenu");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KontrolerGUI.pokreniIzvrsiZamenuProzor();
				}
			});
		}
		return mntmIzvrsiZamenu;
	}
	
	public void postaviTekstStatusGUI(String tekst){
		getTxtStatus().setText(tekst);
	}
	
	public void dodajTekstNaStatus(String tekst){
		getTxtStatus().append(tekst);
	}
	
}
	

