package healthcalc.Vista;

import healthcalc.Controlador.Controlador;
import healthcalc.Modelo.HealthCalcImp;

import javax.swing.*;
import java.awt.*;

public class VistaImp extends JFrame implements Vista {

    private JPanel panelPrincipal;
    private JTabbedPane tabbedPane;
    private JPanel panelIW, panelBMR, panelButton, panelTitulo;
    private JTextField textFieldNombre;
    private JLabel labelTitulo, labelSubtitulo, labelResultado;;
    private JButton button;


    public VistaImp() {

        // Panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.lightGray);
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        this.add(panelPrincipal);

        panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout(0, 0));
        labelTitulo = new JLabel();
        labelTitulo.setText("HEALTH CALCULATOR");
        labelTitulo.setFont(new Font("Chakra Petch", Font.BOLD, 28));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelSubtitulo = new JLabel();
        labelSubtitulo.setText("Calculate your ideal weight (IW) and basal metabolic rate (BMR)");
        labelSubtitulo.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        labelSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelTitulo.add(labelTitulo, BorderLayout.NORTH);
        panelTitulo.add(labelSubtitulo, BorderLayout.SOUTH);
        panelPrincipal.add(panelTitulo, BorderLayout.NORTH);

        // Panel de botón y resultado
        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 2));
        panelPrincipal.add(panelButton, BorderLayout.SOUTH);

        button = new JButton();
        button.setText("Calcular");
        button.setBackground(Color.red);
        button.setSize(150, 100);
        button.setForeground(Color.red);
        button.setFont(new Font("Chakra Petch", Font.BOLD, 28));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());
        panelButton.add(button);

        labelResultado = new JLabel();
        button.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        panelButton.add(labelResultado);

        // Panel de pestañas (tabbed pane)
        tabbedPane = new JTabbedPane();
        panelPrincipal.add(tabbedPane, BorderLayout.CENTER);

        // Panel IW
        panelIW = new JPanel();
        panelIW.setLayout(new GridLayout(2, 2));
        panelIW.setBackground(Color.yellow);
        tabbedPane.addTab("IW", panelIW);

        // Panel BMR
        panelBMR = new JPanel();
        panelBMR.setBackground(Color.blue);
        tabbedPane.addTab("BMR", panelBMR);



        textFieldNombre = new JTextField();
        //panelPrincipal.add(textFieldNombre, BorderLayout.CENTER);

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

    @Override
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
