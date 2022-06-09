package parte_1;

import java.awt.EventQueue;

import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.management.modelmbean.ModelMBean;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
@SuppressWarnings("unused")

public class Ventana {
	
	List<Alumno> Alumnos;
	Set<Profesor> Profesores;

	private JFrame frmPersonas;
	private JTextField fieldName;
	private JTextField fieldSurn;
	private JTextField fieldNum;
	private JLabel lblNum;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action add = new Add_action();
	private final Action Mod = new Mod_action();
	private final Action Del = new Del_action();
	private final Action Srch = new Srch_action();
	private final Action ClrTable = new ClrTable_action();
	private final Action legajo = new legajo_action();
	private final Action iosfa = new iosfa_action();
	DefaultTableModel model = new DefaultTableModel(); 
	
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmPersonas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana() {
		initialize();
	}

	private void initialize() {
		
		frmPersonas = new JFrame();
		frmPersonas.setTitle("Personas");
		frmPersonas.setAlwaysOnTop(true);
		frmPersonas.setBounds(100, 100, 420, 400);
		frmPersonas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonas.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 396, 36);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmPersonas.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtn1 = new JRadioButton("Alumno");
		rdbtn1.setAction(legajo);
		rdbtn1.setSelected(true);
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(319, 43, 109, 23);
		frmPersonas.getContentPane().add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Profesor");
		rdbtn2.setAction(iosfa);
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(319, 69, 109, 23);
		frmPersonas.getContentPane().add(rdbtn2);
		
		fieldName = new JTextField();
		fieldName.setBounds(66, 43, 247, 20);
		frmPersonas.getContentPane().add(fieldName);
		fieldName.setColumns(10);
		
		fieldSurn = new JTextField();
		fieldSurn.setBounds(66, 69, 247, 20);
		frmPersonas.getContentPane().add(fieldSurn);
		fieldSurn.setColumns(10);
		
		fieldNum = new JTextField();
		fieldNum.setBounds(66, 100, 247, 20);
		frmPersonas.getContentPane().add(fieldNum);
		fieldNum.setColumns(10);
		
		JButton btnAdd = new JButton("Agregar");
		btnAdd.setAction(add);
		btnAdd.setBounds(10, 146, 89, 23);
		frmPersonas.getContentPane().add(btnAdd);
		
		JButton btnMod = new JButton("Modificar");
		btnMod.setAction(Mod);
		btnMod.setBounds(109, 146, 89, 23);
		frmPersonas.getContentPane().add(btnMod);
		
		JButton btnDel = new JButton("Eliminar");
		btnDel.setAction(Del);
		btnDel.setBounds(208, 146, 89, 23);
		frmPersonas.getContentPane().add(btnDel);
		
		JButton btnSrch = new JButton("Buscar");
		btnSrch.setAction(Srch);
		btnSrch.setBounds(307, 146, 89, 23);
		frmPersonas.getContentPane().add(btnSrch);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(10, 47, 46, 14);
		frmPersonas.getContentPane().add(lblName);
		
		JLabel lblSurn = new JLabel("Apellido");
		lblSurn.setBounds(10, 73, 46, 14);
		frmPersonas.getContentPane().add(lblSurn);
		
		lblNum = new JLabel("Legajo");
		lblNum.setBounds(10, 103, 46, 14);
		frmPersonas.getContentPane().add(lblNum);
		
		JButton btnClrTable = new JButton("Limpiar Campos");
		btnClrTable.setAction(ClrTable);
		btnClrTable.setBounds(119, 179, 160, 23);
		frmPersonas.getContentPane().add(btnClrTable);
		
		
		JTable table = new JTable();
		Object[] columns = {"Nombre","apellido"};
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBounds(10, 213, 386, 138);
		table.setFont(new Font("Tahoma",Font.BOLD,14));
		frmPersonas.add(table);
		
	}
	
	
	private class Add_action extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Add_action() {
			putValue(NAME, "Agregar");
			putValue(SHORT_DESCRIPTION, "Agregar");
		}
		public void actionPerformed(ActionEvent add) {
			//Alumnos.add(new Alumno(fieldName.getText(),fieldSurn.getText(),10));
		}
	}
	private class Mod_action extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public Mod_action() {
			putValue(NAME, "Modificar");
			putValue(SHORT_DESCRIPTION, "Modificar");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class Del_action extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Del_action() {
			putValue(NAME, "Eliminar");
			putValue(SHORT_DESCRIPTION, "Eliminar");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class Srch_action extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Srch_action() {
			putValue(NAME, "Buscar");
			putValue(SHORT_DESCRIPTION, "Buscar");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class ClrTable_action extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ClrTable_action() {
			putValue(NAME, "Limpiar Campos");
			putValue(SHORT_DESCRIPTION, "Limpiar Campos");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class legajo_action extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public legajo_action() {
			putValue(NAME, "Alumno");
			putValue(SHORT_DESCRIPTION, "Alumno");
		}
		public void actionPerformed(ActionEvent e) {
			lblNum.setText("Legajo");
		}
	}
	private class iosfa_action extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public iosfa_action() {
			putValue(NAME, "Profesor");
			putValue(SHORT_DESCRIPTION, "Profesor");
		}
		public void actionPerformed(ActionEvent e) {
			lblNum.setText("Iosfa");
		}
	}
}
