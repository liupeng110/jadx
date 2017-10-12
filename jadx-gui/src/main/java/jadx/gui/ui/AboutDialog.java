package jadx.gui.ui;

import jadx.api.JadxDecompiler;
import jadx.gui.utils.NLS;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AboutDialog extends JDialog {
	private static final long serialVersionUID = 5763493590584039096L;

	public AboutDialog() {
		initUI();
	}

	public final void initUI() {
		Font font = new Font("Serif", Font.BOLD, 13);

		JLabel name = new JLabel("jadx");
		name.setFont(font);
		name.setAlignmentX(0.5f);

		JLabel desc = new JLabel("反编译dex到java");
		desc.setFont(font);
		desc.setAlignmentX(0.5f);

		JLabel version = new JLabel("版本号: " + JadxDecompiler.getVersion());
		version.setFont(font);
		version.setAlignmentX(0.5f);

		JLabel email = new JLabel("email: 717219917@qq.com");
		email.setFont(font);
		email.setAlignmentX(0.5f);

		JPanel textPane = new JPanel();
		textPane.setBorder(BorderFactory.createEmptyBorder(80, 80, 80, 80));
		textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));
		textPane.add(Box.createRigidArea(new Dimension(0, 10)));
		textPane.add(name);
		textPane.add(Box.createRigidArea(new Dimension(0, 10)));
		textPane.add(desc);
		textPane.add(Box.createRigidArea(new Dimension(0, 10)));
		textPane.add(version);
		textPane.add(Box.createRigidArea(new Dimension(0, 20)));
		textPane.add(email);
		textPane.add(Box.createRigidArea(new Dimension(0, 20)));

		JButton close = new JButton(NLS.str("tabs.close"));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
		close.setAlignmentX(0.5f);

		Container contentPane = getContentPane();
		contentPane.add(textPane, BorderLayout.CENTER);
		contentPane.add(close, BorderLayout.PAGE_END);

		setModalityType(ModalityType.APPLICATION_MODAL);

		setTitle("关于jadx");
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
