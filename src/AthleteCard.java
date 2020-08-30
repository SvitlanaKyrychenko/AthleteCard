import javax.swing.*;
import java.awt.*;

import static java.awt.Font.PLAIN;

public class AthleteCard  extends JFrame {

    private JFrame frame;
    private JPanel filters;
    private Font mainFont = new Font("Times New Roman", PLAIN, 30);
    private Font additionalFont = new Font("Times New Roman", PLAIN, 18);

    public AthleteCard(){
        frame = new JFrame("Athlete Cards");
        frame.setSize(new Dimension(1400, 900));
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem addMenu = new JMenuItem("Add");
        addMenu.addActionListener(new AddActionListener());
        JMenuItem deleteMenu = new JMenuItem("Delete");
        JMenuItem changeMenu = new JMenuItem("Change");
//        saveMenu.addActionListener(new SaveAbstractAction());
//        deleteMenu.addActionListener(new OpenAbstractAction());
//        addMenu.addActionListener(new NewActionListener());
        file.add(addMenu);
        file.add(deleteMenu);
        file.add(changeMenu);
        menu.add(file);
        frame.setJMenuBar(menu);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new BorderLayout());
        addFilters();
        filters.setPreferredSize(new Dimension(350, 900));
        frame.add(filters, BorderLayout.LINE_END);

        frame.setVisible(true);
    }

    private void addFilters(){
        filters = new JPanel();
        filters.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;

        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel filtersLabel = new JLabel("Фільтри");
        filters.add(filtersLabel, constraints);


        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel surnameLabel = new JLabel("Прізвище");
        filters.add(surnameLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        JTextField surnameField = new JTextField(10);
        filters.add(surnameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        JLabel nameLabel = new JLabel("Ім'я");
        filters.add(nameLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        JTextField nameField = new JTextField(10);
        filters.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        JLabel fatherNameLabel = new JLabel("Побатькові");
        filters.add(fatherNameLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        JTextField fatherNameField = new JTextField(10);
        filters.add(fatherNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 8;
        JButton search = new JButton("Шукати");
        search.addActionListener(new SearchActionListener());
        filters.add(search, constraints);

        filtersLabel.setFont(mainFont);
        surnameLabel.setFont(additionalFont);
        nameLabel.setFont(additionalFont);
        fatherNameLabel.setFont(additionalFont);
    }
}
