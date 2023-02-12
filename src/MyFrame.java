import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JMenuItem barItem;

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");

        button = new JButton("Get_Progress");
        button.addActionListener(this);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_N); //Mnemonic for shortcuts eg: alt+N ;
        editMenu.setMnemonic(KeyEvent.VK_H); //Mnemonic for shortcuts eg: alt+H ;
        helpMenu.setMnemonic(KeyEvent.VK_M); //Mnemonic for shortcuts eg: alt+M ;

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

//        barItem = new JMenuItem(new ProgressBar());

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);



        this.setJMenuBar(menuBar);
        this.add(button);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loadItem) {
            System.out.println("** Beep Load a file **");
        }

        if(e.getSource() == saveItem) {
            System.out.println("** Beep Save a file **");
        }

        if(e.getSource() == exitItem) {
            System.exit(0);
        }

        button.setEnabled(false);
        if(e.getSource() == button) {
            new ProgressBar();
        }

    }
}
