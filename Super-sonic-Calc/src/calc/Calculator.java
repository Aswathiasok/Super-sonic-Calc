package calc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;


public class Calculator {

	private JFrame frame;
	private JTextField Txt;
	private JButton btnSinh;
	private JButton btnTanh;
	private JButton btnSinh_1;
	private JButton btnX;
	private JButton button_2;
	private JButton button_3;
	private JButton btnCos;
	private JButton btnx;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton btnXy;
	private JButton button_5;
	private JButton button_9;
	private JButton button_10;
	private JButton btnC_1;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton btnC;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button;
	private JButton btnTag;
	private JButton btnHex;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton btnX_1;
	private JButton btnx_1;
	private JButton btnx_2;
	private JButton button_26;
	private JButton button_27;

	double number1;
	double number2;
	double result;
	String operator;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 100, 562, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Txt = new JTextField();
		Txt.setHorizontalAlignment(SwingConstants.RIGHT);
		Txt.setBounds(10, 11, 538, 40);
		frame.getContentPane().add(Txt);
		Txt.setColumns(10);
		
		JButton btnNewButton = new JButton("x^2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(Txt.getText());
				value=value*value;
				Txt.setText(String.valueOf(value));
				
			}
		});
		btnNewButton.setBounds(10, 68, 60, 60);
		frame.getContentPane().add(btnNewButton);
		
		btnSinh = new JButton("cosh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.cosh(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnSinh.setBounds(10, 242, 69, 60);
		frame.getContentPane().add(btnSinh);
		
		btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.tanh(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnTanh.setBounds(10, 325, 60, 60);
		frame.getContentPane().add(btnTanh);
		
		btnSinh_1 = new JButton("Bin");
		btnSinh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSinh_1.setBounds(10, 418, 60, 60);
		frame.getContentPane().add(btnSinh_1);
		
		btnX = new JButton("\u03C0");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value;
				value=3.1415926535;
				Txt.setText(String.valueOf(value));
			}
		});
		btnX.setBounds(103, 68, 60, 60);
		frame.getContentPane().add(btnX);
		
		button_2 = new JButton("sinh");
		button_2.setBounds(103, 242, 60, 60);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("sin");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.sin(value);
				Txt.setText(String.valueOf(value));
			}
		});
		button_3.setBounds(103, 325, 60, 60);
		frame.getContentPane().add(button_3);
		
		btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.cos(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnCos.setBounds(103, 418, 60, 60);
		frame.getContentPane().add(btnCos);
		
		btnx = new JButton("\u221Ax");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.sqrt(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnx.setBounds(276, 68, 60, 60);
		frame.getContentPane().add(btnx);
		
		button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_6.getText();
				Txt.setText(value);
			}
		});
		button_6.setBounds(276, 242, 60, 60);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_7.getText();
				Txt.setText(value);
			}
		});
		button_7.setBounds(276, 325, 60, 60);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_8.getText();
				Txt.setText(value);
			}
		});
		button_8.setBounds(276, 418, 60, 60);
		frame.getContentPane().add(button_8);
		
		btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(Txt.getText());
				value=Math.pow(value,value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnXy.setBounds(194, 68, 60, 60);
		frame.getContentPane().add(btnXy);
		
		button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_5.getText();
				Txt.setText(value);
			}
		});
		button_5.setBounds(194, 242, 60, 60);
		frame.getContentPane().add(button_5);
		
		button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_9.getText();
				Txt.setText(value);
			}
		});
		button_9.setBounds(194, 325, 60, 60);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_10.getText();
				Txt.setText(value);
			}
		});
		button_10.setBounds(194, 418, 60, 60);
		frame.getContentPane().add(button_10);
		
		btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String value=Txt.getText()+button_11.getText();
				Txt.setText(null);
			}
		});
		btnC_1.setBounds(371, 68, 60, 60);
		frame.getContentPane().add(btnC_1);
		
		button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_11.getText();
				Txt.setText(value);
			}
		});
		button_11.setBounds(371, 242, 60, 60);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("6");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_12.getText();
				Txt.setText(value);
			}
		});
		button_12.setBounds(371, 325, 60, 60);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_13.getText();
				Txt.setText(value);
			}
		});
		button_13.setBounds(371, 418, 60, 60);
		frame.getContentPane().add(button_13);
		
		btnC = new JButton("\uF0DF");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(Txt.getText().length()>0){
					StringBuilder builder=new StringBuilder(Txt.getText());
					builder.deleteCharAt(Txt.getText().length()-1);
					backspace=builder.toString();
					Txt.setText(backspace);
					
				}
			}
		});
		btnC.setBounds(466, 68, 60, 60);
		frame.getContentPane().add(btnC);
		
		button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1=Double.parseDouble(Txt.getText());
				
				Txt.setText("");
				operator="*";
			}
		});
		button_15.setBounds(466, 242, 60, 60);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton("-");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1=Double.parseDouble(Txt.getText());
				
				Txt.setText("");
				operator="-";
			}
		});
		button_16.setBounds(466, 325, 60, 60);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1=Double.parseDouble(Txt.getText());
				Txt.setText("");
				operator="+";
			}
		});
		button_17.setBounds(466, 418, 60, 60);
		frame.getContentPane().add(button_17);
		
		button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double sign=Double.parseDouble(String.valueOf(Txt.getText()));
				sign=sign*(-1);
				Txt.setText(String.valueOf(sign));
			}
		});
		button.setBounds(10, 489, 60, 60);
		frame.getContentPane().add(button);
		
		btnTag = new JButton("tan");
		btnTag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.tan(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnTag.setBounds(103, 489, 60, 60);
		frame.getContentPane().add(btnTag);
		
		btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(Txt.getText());
				Txt.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(194, 489, 60, 60);
		frame.getContentPane().add(btnHex);
		
		button_19 = new JButton("0");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_19.getText();
				Txt.setText(value);
			}
		});
		button_19.setBounds(276, 489, 60, 60);
		frame.getContentPane().add(button_19);
		
		button_20 = new JButton(".");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=Txt.getText()+button_5.getText();
				Txt.setText(value);
			}
		});
		button_20.setBounds(371, 489, 60, 60);
		frame.getContentPane().add(button_20);
		
		button_21 = new JButton("=");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number2=Double.parseDouble(Txt.getText());
				if(operator =="+"){
					result=number1+number2;
					
					Txt.setText(String.format("%.2f", result));
					
				}
				else if(operator =="-")
				{
					result=number1-number2;
					Txt.setText(String.format("%.2f", result));
				}
				else if(operator =="*")
				{
					result=number1*number2;
					Txt.setText(String.format("%.2f", result));
				}
				else if(operator =="÷")
				{
					result=number1/number2;
					Txt.setText(String.format("%.2f", result));
				}
				else if(operator =="%")
				{
					result=number1%number2;
					Txt.setText(String.format("%.2f", result));
				}
			}
		});
		button_21.setBounds(466, 489, 60, 60);
		frame.getContentPane().add(button_21);
		
		button_22 = new JButton("sinh");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.sinh(value);
				Txt.setText(String.valueOf(value));
			}
		});
		button_22.setBounds(10, 158, 60, 60);
		frame.getContentPane().add(button_22);
		
		btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double value=Double.parseDouble(Txt.getText());
			value=value*value*value;
			Txt.setText(String.valueOf(value));
			
			}
		});
		btnX_1.setBounds(103, 158, 60, 60);
		frame.getContentPane().add(btnX_1);
		
		btnx_1 = new JButton("log");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Double value=Double.parseDouble(String.valueOf(Txt.getText()));
				value=Math.log(value);
				Txt.setText(String.valueOf(value));
				
			}
		});
		btnx_1.setBounds(194, 158, 60, 60);
		frame.getContentPane().add(btnx_1);
		
		btnx_2 = new JButton("1/x");
		btnx_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value=Double.parseDouble(String.valueOf(Txt.getText()));
				if(value>0)
				value=1/(value);
				Txt.setText(String.valueOf(value));
			}
		});
		btnx_2.setBounds(276, 158, 60, 60);
		frame.getContentPane().add(btnx_2);
		
		button_26 = new JButton("%");
		button_26.setBounds(371, 158, 60, 60);
		frame.getContentPane().add(button_26);
		
		button_27 = new JButton("\u00F7");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_27.setBounds(466, 158, 60, 60);
		frame.getContentPane().add(button_27);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(292, 181, 6, 20);
		frame.getContentPane().add(textPane);
	}
}






