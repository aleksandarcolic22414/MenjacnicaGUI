package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
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
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
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
			btnDodajKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnDodajKurs;
	}
	private JButton getBtnIzbriiKurs() {
		if (btnIzbriiKurs == null) {
			btnIzbriiKurs = new JButton("Izbri\u0161i kurs");
			btnIzbriiKurs.setPreferredSize(new Dimension(115, 23));
		}
		return btnIzbriiKurs;
	}
	private JPanel getPnlTable() {
		if (pnlTable == null) {
			pnlTable = new JPanel();
		}
		return pnlTable;
	}
	private JButton getBtnIzvriZamenu() {
		if (btnIzvriZamenu == null) {
			btnIzvriZamenu = new JButton("Izvr\u0161i zamenu");
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
		if (textArea == null) {
			textArea = new TextArea();
			textArea.setPreferredSize(new Dimension(0, 70));
		}
		return textArea;
	}
}
