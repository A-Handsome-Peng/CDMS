package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeFrame frame = new WelcomeFrame();
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
	public WelcomeFrame() {
		
		//标题
		setTitle("\u5BA2\u6237\u8FD0\u9001\u7BA1\u7406\u7CFB\u7EDF");
		//不可最大化
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 325);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//背景面板
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 400, 300);
		bgpanel.setLayout(null);
		contentPane.add(bgpanel);
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.setBounds(143, 27, 113, 55);
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 30));
		bgpanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u767B\u5F55");
		btnNewButton_1.setBounds(143, 110, 113, 55);
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 30));
		bgpanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u7BA1\u7406");
		btnNewButton_2.setBounds(143, 197, 113, 55);
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 30));
		bgpanel.add(btnNewButton_2);
		
		//背景标签与图片
		ImageIcon background=new ImageIcon("src/image/background.png");
		JLabel backgroundLabel = new JLabel(background);
		backgroundLabel.setBounds(0, 0, 400, 300);
		bgpanel.add(backgroundLabel);
	}
}
