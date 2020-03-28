import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Menu extends JFrame
{
    private static final long serialVersionUID = 1L;
    public Menu()
    {
        super("First Piano");
        setDefaultCloseOperation( EXIT_ON_CLOSE );


        // Устанавливаем последовательное расположение
        Container container = getContentPane();
        container.setLayout(new FlowLayout( FlowLayout.CENTER, 0, 10));
        JLabel label = new JLabel("                                                                                                                              my first piano                                                                                                                    ");
        container.add(label);

        // Кнопка с описанием интерфейса в виде HTML-текста
        JButton button = new JButton("<html><h2><font color=\"black\">С ");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});

        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">C#");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        // Кнопка с описанием интерфейса в виде HTML-текста
        button = new JButton("<html><h2><font color=\"black\">D ");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">D#");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">E ");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">F ");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">F#");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">G ");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">G#");
        button.addActionListener(new ListenerAction());
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});

        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">A ");
        button.addActionListener(new ListenerAction());

        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});

        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">A#");
        button.addActionListener(new ListenerAction());

        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});

        button.setBackground(Color.white);
        container.add(button);

        button = new JButton("<html><h2><font color=\"black\">B ");
        button.addActionListener(new ListenerAction());

        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});

        button.setBackground(Color.white);
        container.add(button);


        setSize(800, 300);
        setResizable(false);
        setVisible(true);
    }


    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String op = e.getActionCommand();
            System.out.println("Нажатие кнопки! От - "+
                    op + "\n");
                    switch (op){
                        case "<html><h2><font color=\"black\">С ":
                            MiniMiniMusicApp mini = new MiniMiniMusicApp();
                            mini.play(41);
                            System.out.println("нота C");
                            break;
                        case "<html><h2><font color=\"black\">C#":
                            MiniMiniMusicApp mini1 = new MiniMiniMusicApp();
                            mini1.play(42);
                            System.out.println("нота C#");
                            break;
                        case "<html><h2><font color=\"black\">D ":
                            MiniMiniMusicApp mini2 = new MiniMiniMusicApp();
                            mini2.play(43);
                            System.out.println("нота D");
                            break;
                        case "<html><h2><font color=\"black\">D#":
                            MiniMiniMusicApp mini3 = new MiniMiniMusicApp();
                            mini3.play(44);
                            System.out.println("нота D#");
                            break;
                        case "<html><h2><font color=\"black\">E ":
                            MiniMiniMusicApp mini4 = new MiniMiniMusicApp();
                            mini4.play(45);
                            System.out.println("нота E");
                            break;
                        case "<html><h2><font color=\"black\">F ":
                            MiniMiniMusicApp mini5 = new MiniMiniMusicApp();
                            mini5.play(46);
                            System.out.println("нота F");
                            break;
                        case "<html><h2><font color=\"black\">F#":
                            MiniMiniMusicApp mini6 = new MiniMiniMusicApp();
                            mini6.play(47);
                            System.out.println("нота F#");
                            break;
                        case "<html><h2><font color=\"black\">G ":
                            MiniMiniMusicApp mini7 = new MiniMiniMusicApp();
                            mini7.play(48);
                            System.out.println("нота G");
                            break;
                        case "<html><h2><font color=\"black\">G#":
                            MiniMiniMusicApp mini8 = new MiniMiniMusicApp();
                            mini8.play(48);
                            System.out.println("нота G#");
                            break;
                        case "<html><h2><font color=\"black\">A ":
                            MiniMiniMusicApp mini9 = new MiniMiniMusicApp();
                            mini9.play(48);
                            System.out.println("нота A");
                            break;
                        case "<html><h2><font color=\"black\">A#":
                            MiniMiniMusicApp mini10 = new MiniMiniMusicApp();
                            mini10.play(48);
                            System.out.println("нота A#");
                            break;
                        case "<html><h2><font color=\"black\">B ":
                            MiniMiniMusicApp mini11 = new MiniMiniMusicApp();
                            mini11.play(48);
                            System.out.println("нота B");
                            break;
                        default:
                            System.out.println("nothing");
                    }
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}

