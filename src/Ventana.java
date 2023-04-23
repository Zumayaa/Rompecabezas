import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Ventana extends JFrame {



    private List<String> values = Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","");
    private ArrayList <JButton> botonlist = new ArrayList<>();
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    private JButton b6 = new JButton();
    private JButton b7 = new JButton();
    private JButton b8 = new JButton();
    private JButton b9 = new JButton();
    private JButton b10 = new JButton();
    private JButton b11 = new JButton();
    private JButton b12 = new JButton();
    private JButton b13 = new JButton();
    private JButton b14 = new JButton();
    private JButton b15 = new JButton();
    private JButton b16 = new JButton();



    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana frame = new Ventana();
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
    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 610);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        botonlist.add(b1);
        botonlist.add(b2);
        botonlist.add(b3);
        botonlist.add(b4);
        botonlist.add(b5);
        botonlist.add(b6);
        botonlist.add(b7);
        botonlist.add(b8);
        botonlist.add(b9);
        botonlist.add(b10);
        botonlist.add(b11);
        botonlist.add(b12);
        botonlist.add(b13);
        botonlist.add(b14);
        botonlist.add(b15);
        botonlist.add(b16);


        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 102, 51));
        panel.setLayout(new GridLayout(4, 4, 3, 0));
        reinicio();

        b1.setForeground(new Color(255, 250, 250));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b1.setBackground(new Color(153, 102, 51));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(0);

            }
        });
        panel.add(b1);
        b2.setForeground(new Color(255, 250, 250));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b2.setBackground(new Color(153, 102, 51));

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(1);
            }
        });
        panel.add(b2);
        b3.setForeground(new Color(255, 250, 250));
        b3.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b3.setBackground(new Color(153, 102, 51));

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(2);
            }
        });
        panel.add(b3);
        b4.setForeground(new Color(255, 250, 250));
        b4.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b4.setBackground(new Color(153, 102, 51));

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(3);
            }
        });
        panel.add(b4);
        b5.setForeground(new Color(255, 250, 250));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b5.setBackground(new Color(153, 102, 51));

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(4);
            }
        });
        panel.add(b5);
        b6.setForeground(new Color(255, 250, 250));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b6.setBackground(new Color(153, 102, 51));

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(5);
            }
        });
        panel.add(b6);
        b7.setForeground(new Color(255, 250, 250));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b7.setBackground(new Color(153, 102, 51));

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(6);
            }
        });
        panel.add(b7);
        b8.setForeground(new Color(255, 250, 250));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b8.setBackground(new Color(153, 102, 51));

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(7);
            }
        });
        panel.add(b8);
        b9.setForeground(new Color(255, 250, 250));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b9.setBackground(new Color(153, 102, 51));

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(8);
            }
        });
        panel.add(b9);
        b10.setForeground(new Color(255, 250, 250));
        b10.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b10.setBackground(new Color(153, 102, 51));

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(9);
            }
        });
        panel.add(b10);
        b11.setForeground(new Color(255, 250, 250));
        b11.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b11.setBackground(new Color(153, 102, 51));

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(10);
            }
        });
        panel.add(b11);
        b12.setForeground(new Color(255, 250, 250));
        b12.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b12.setBackground(new Color(153, 102, 51));

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(11);
            }
        });
        panel.add(b12);
        b13.setForeground(new Color(255, 250, 250));
        b13.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b13.setBackground(new Color(153, 102, 51));

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(12);
            }
        });
        panel.add(b13);
        b14.setForeground(new Color(255, 250, 250));
        b14.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b14.setBackground(new Color(153, 102, 51));

        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(13);
            }
        });
        panel.add(b14);
        b15.setForeground(new Color(255, 250, 250));
        b15.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b15.setBackground(new Color(153, 102, 51));

        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(14);
            }
        });
        panel.add(b15);
        b16.setForeground(new Color(255, 250, 250));
        b16.setFont(new Font("Tahoma", Font.PLAIN, 35));
        b16.setBackground(new Color(153, 102, 51));

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverPieza(15);
            }
        });
        panel.add(b16);
        contentPane.add(panel);



        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(222, 184, 135));
        FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
        flowLayout_1.setVgap(15);
        contentPane.add(panel_2, BorderLayout.NORTH);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(222, 184, 135));
        FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
        flowLayout_2.setHgap(15);
        contentPane.add(panel_3, BorderLayout.EAST);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(222, 184, 135));
        FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
        flowLayout.setHgap(15);
        contentPane.add(panel_4, BorderLayout.WEST);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(222, 184, 135));
        contentPane.add(panel_5, BorderLayout.SOUTH);
        panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

        JButton Reiniciar = new JButton("Reinicar");
        Reiniciar.setForeground(new Color(255, 255, 255));
        Reiniciar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Reiniciar.setBackground(new Color(153, 102, 0));
        Reiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reinicio();
            }
        });
        panel_5.add(Reiniciar);
    }


    public void moverPieza(int lugar) {
        //derecha
        if(lugar-1>=0) {
            if(botonlist.get(lugar-1).getText().equals("") && lugar-1!=3 && lugar-1!=7 && lugar-1!=11) {
                botonlist.get(lugar-1).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //izquierda
        if(lugar+1<=15) {
            if(botonlist.get(lugar+1).getText().equals("") && lugar+1!=4 && lugar+1!=8 && lugar+1!=12 ) {
                botonlist.get(lugar+1).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //abajo
        if(lugar-4>=0) {
            if(botonlist.get(lugar-4).getText().equals("")) {
                botonlist.get(lugar-4).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //arriba
        if(lugar+4<=15) {
            if(botonlist.get(lugar+4).getText().equals("")) {
                botonlist.get(lugar+4).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
    }


    public void reinicio(){
        Collections.shuffle(values);

        b1.setText(values.get(0));
        b2.setText(values.get(1));
        b3.setText(values.get(2));
        b4.setText(values.get(3));
        b5.setText(values.get(4));
        b6.setText(values.get(5));
        b7.setText(values.get(6));
        b8.setText(values.get(7));
        b9.setText(values.get(8));
        b10.setText(values.get(9));
        b11.setText(values.get(10));
        b12.setText(values.get(11));
        b13.setText(values.get(12));
        b14.setText(values.get(13));
        b15.setText(values.get(14));
        b16.setText(values.get(15));

    }


}