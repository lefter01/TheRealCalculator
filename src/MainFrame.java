import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.util.function.DoublePredicate;

//lololol test
public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operation;

	/**
	 * Launch the application baby.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+btnNewButton.getText();
				textField.setText(textin);
			}
		});
		btnNewButton.setBounds(233, 12, 45, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+btnNewButton_1.getText();
				textField.setText(textin);
				
			}
		});		
		btnNewButton_1.setBounds(178, 12, 45, 45);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button.getText();
				textField.setText(textin);
			}
		});
		button.setBounds(178, 122, 45, 45);
		contentPane.add(button);
		
		JButton button_1 = new JButton("6");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_1.getText();
				textField.setText(textin);
				
			}
		});
		button_1.setBounds(288, 68, 45, 45);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_2.getText();
				textField.setText(textin);
			}
		});
		button_2.setBounds(288, 122, 45, 45);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_3.getText();
				textField.setText(textin);
			}
		});
		button_3.setBounds(178, 178, 100, 45);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_4.getText();
				textField.setText(textin);
			}
		});
		button_4.setBounds(178, 66, 45, 45);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_5.getText();
				textField.setText(textin);
			}
		});
		button_5.setBounds(233, 68, 45, 45);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_6.getText();
				textField.setText(textin);
			}
		});
		button_6.setBounds(289, 12, 45, 45);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_7.getText();
				textField.setText(textin);
			}
		});
		button_7.setBounds(233, 122, 45, 45);
		contentPane.add(button_7);
		
		textField = new JTextField();
		textField.setEditable(false);		
		textField.setBounds(10, 17, 100, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_8 = new JButton(".");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textin = textField.getText()+button_8.getText();
				textField.setText(textin);
			}
		});
		button_8.setBounds(288, 178, 45, 45);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		button_9.setBounds(343, 122, 45, 45);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
				
			}
		});
		button_10.setBounds(343, 68, 45, 45);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		button_11.setBounds(343, 178, 45, 45);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		button_12.setBounds(343, 234, 45, 45);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer ;
				secondnum=Double.parseDouble(textField.getText());
				switch (operation)
				{
				case "+" :
					result= firstnum + secondnum;
					answer = Double.toString(result) ;
					textField.setText(answer);					
					break;
				case "-":
					result= firstnum - secondnum;
					answer = Double.toString(result) ;
					textField.setText(answer);
					break;
				case "*":
					result= firstnum * secondnum;
					answer = Double.toString(result) ;
					textField.setText(answer);
					break;
				case "/":
					result= firstnum / secondnum;
					answer = Double.toString(result) ;
					textField.setText(answer);
					break;
				default:					
					break;
				
				
				
				
				
				}
			}
		});
		button_13.setBounds(178, 234, 155, 45);
		contentPane.add(button_13);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_2.setBounds(344, 12, 45, 45);
		contentPane.add(btnNewButton_2);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
