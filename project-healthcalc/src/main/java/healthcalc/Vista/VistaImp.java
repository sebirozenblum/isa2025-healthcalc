package healthcalc;

import javax.swing.*;
import java.awt.*;

public class VistaImp extends JFrame implements Vista {

    private JPanel panelPrincipal;
    private JTabbedPane tabbedPane;
    private JPanel panelIW, panelBMR, panelButton;
    private JTextField textFieldNombre;
    private JLabel labelTitulo;
    private JLabel labelResultado;
    private JButton button;


    public VistaImp() {

        // Panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.lightGray);
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        this.add(panelPrincipal);

        tabbedPane = new JTabbedPane();
        panelPrincipal.add(tabbedPane, BorderLayout.CENTER);

        
        panelIW = new JPanel();
        panelIW.setLayout(new GridLayout(2, 2));
        panelIW.setBackground(Color.yellow);
        tabbedPane.addTab("IW", panelIW);

        panelBMR = new JPanel();
        panelBMR.setBackground(Color.blue);
        tabbedPane.addTab("BMR", panelBMR);

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 2));
        panelPrincipal.add(panelButton, BorderLayout.SOUTH);

        button = new JButton();
        button.setText("Calcular");
        button.setBackground(Color.red);
        button.setBounds(200, 100, 100, 500);
        button.setForeground(Color.red);
        button.setBorder(BorderFactory.createEtchedBorder());
        panelButton.add(button);

        labelResultado = new JLabel();
        labelResultado.setText("Hola");
        panelButton.add(labelResultado);

        textFieldNombre = new JTextField();
        //panelPrincipal.add(textFieldNombre, BorderLayout.CENTER);

        labelTitulo = new JLabel();
        labelTitulo.setText("HealthCalc");
        labelTitulo.setFont(new Font("Futura", Font.BOLD, 28));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPrincipal.add(labelTitulo, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.pack();
        this.setTitle("HealthCalc");
        this.setVisible(true);
    }

    public String getInputValue() {
        return this.textFieldNombre.getText();
    }

    public void mostrarTexto(String mensaje) {
        this.labelResultado.setText(mensaje);
    }

    public void registrarControlador(Controlador controlador) {
        this.button.addActionListener(controlador);
        this.button.setActionCommand("Calcular");
    }

    public static void main(String[] args) {
        VistaImp vistaImp = new VistaImp();
        Controlador controlador = new Controlador(new HealthCalcImp(), vistaImp);
        vistaImp.registrarControlador(controlador);
    }



}
