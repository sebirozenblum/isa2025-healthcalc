package healthcalc.Vista;

import healthcalc.Controlador.Controlador;
import healthcalc.Modelo.HealthCalcImp;

import javax.swing.*;
import java.awt.*;

public class VistaImp extends JFrame implements Vista {

    private JTabbedPane tabbedPane;
    private JPanel panelPrincipal, panelIW, panelBMR, panelButton, panelTitulo, panelSexoIW, panelButtonGroupIW, panelSexoBMR, panelButtonGroupBMR;
    private JTextField textFieldNombre;
    private JLabel labelTitulo, labelSubtitulo, labelAlturaIW, labelSexoIW, labelAlturaBMR, labelSexoBMR, labelEdad, labelPeso, labelResultado;
    private JRadioButton radioButtonHombreIW, radioButtonMujerIW, radioButtonHombreBMR, radioButtonMujerBMR;
    private ButtonGroup buttonGroupSexoIW, buttonGroupSexoBMR;
    private JButton buttonCalcular;
    private JSpinner spinnerAlturaIW, spinnerAlturaBMR, spinnerEdad;


    public VistaImp() {

        // Panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(227, 164, 104));
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        this.add(panelPrincipal);

        panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout(0, 0));
        panelTitulo.setBackground(new Color(227, 164, 104));
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

        buttonCalcular = new JButton();
        buttonCalcular.setText("Calcular");
        buttonCalcular.setBackground(Color.red);
        buttonCalcular.setSize(150, 100);
        buttonCalcular.setForeground(Color.red);
        buttonCalcular.setFont(new Font("Chakra Petch", Font.BOLD, 28));
        buttonCalcular.setHorizontalAlignment(SwingConstants.CENTER);
        buttonCalcular.setBorder(BorderFactory.createEtchedBorder());
        panelButton.add(buttonCalcular);

        labelResultado = new JLabel();
        buttonCalcular.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        buttonCalcular.setHorizontalAlignment(SwingConstants.CENTER);
        panelButton.add(labelResultado);

        // Panel de pestañas (tabbed pane)
        tabbedPane = new JTabbedPane();
        panelPrincipal.add(tabbedPane, BorderLayout.CENTER);

        // Panel IW
        panelIW = new JPanel();
        panelIW.setLayout(new GridLayout(2, 2));
        panelIW.setBackground(new Color(230, 230, 230));
        tabbedPane.addTab("IW", panelIW);

        labelAlturaIW = new JLabel();
        labelAlturaIW.setText("Altura (cm): ");
        labelAlturaIW.setHorizontalAlignment(SwingConstants.CENTER);
        labelAlturaIW.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        panelIW.add(labelAlturaIW);

        spinnerAlturaIW = new JSpinner();
        spinnerAlturaIW.setModel(new SpinnerNumberModel(100, 80, 210, 1));
        spinnerAlturaIW.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        panelIW.add(spinnerAlturaIW);

        labelSexoIW = new JLabel();
        labelSexoIW.setText("Sexo: ");
        labelSexoIW.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        labelSexoIW.setHorizontalAlignment(SwingConstants.CENTER);
        panelIW.add(labelSexoIW);

        buttonGroupSexoIW = new ButtonGroup();
        radioButtonHombreIW = new JRadioButton("Hombre");
        radioButtonHombreIW.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        buttonGroupSexoIW.add(radioButtonHombreIW);
        radioButtonMujerIW = new JRadioButton("Mujer");
        radioButtonMujerIW.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        buttonGroupSexoIW.add(radioButtonMujerIW);

        panelButtonGroupIW = new JPanel();
        panelButtonGroupIW.setLayout(new FlowLayout());
        panelButtonGroupIW.setBackground(new Color(230, 230, 230));
        panelButtonGroupIW.add(radioButtonHombreIW);
        panelButtonGroupIW.add(radioButtonMujerIW);
        panelSexoIW = new JPanel();
        panelSexoIW.setLayout(new BorderLayout(0, 0));
        panelSexoIW.setBackground(new Color(230, 230, 230));
        panelSexoIW.add(panelButtonGroupIW, BorderLayout.CENTER);
        panelIW.add(panelSexoIW);


        // Panel BMR
        panelBMR = new JPanel();
        panelBMR.setBackground(new Color(230, 230, 230));
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
        this.buttonCalcular.addActionListener(controlador);
        this.buttonCalcular.setActionCommand("Calcular");
    }

    public static void main(String[] args) {
        VistaImp vistaImp = new VistaImp();
        Controlador controlador = new Controlador(new HealthCalcImp(), vistaImp);
        vistaImp.registrarControlador(controlador);
    }
}
