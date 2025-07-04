import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StateSelectorApp extends JFrame {
    private JComboBox<String> stateComboBox;
    private JLabel selectedStateLabel;

    private String[] states = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand",
            "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur",
            "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
            "Uttar Pradesh", "Uttarakhand", "West Bengal"
    };

    public StateSelectorApp() {
        setTitle("Indian State Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        stateComboBox = new JComboBox<>(states);
        selectedStateLabel = new JLabel("Selected State: ");

        stateComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedState = (String) stateComboBox.getSelectedItem();
                selectedStateLabel.setText("Selected State: " + selectedState);
            }
        });

        setLayout(new FlowLayout());
        add(stateComboBox);
        add(selectedStateLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StateSelectorApp().setVisible(true);
            }
        });
    }
}
