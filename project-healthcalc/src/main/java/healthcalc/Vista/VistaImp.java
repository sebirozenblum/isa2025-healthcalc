package healthcalc.Vista;

import healthcalc.Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VistaImp extends JFrame implements Vista {

    private JTabbedPane tabbedPane;
    private JPanel panelPrincipal, panelIW, panelBMR, panelButton, panelTitulo, panelSexoIW, panelButtonGroupIW, panelSexoBMR, panelButtonGroupBMR;
    private JTextField textFieldPeso;
    private JLabel labelTitulo, labelSubtitulo, labelAlturaIW, labelSexoIW, labelAlturaBMR, labelSexoBMR, labelEdad, labelPeso, labelResultado;
    private JRadioButton radioButtonHombreIW, radioButtonMujerIW, radioButtonHombreBMR, radioButtonMujerBMR;
    private ButtonGroup buttonGroupSexoIW, buttonGroupSexoBMR;
    private JButton buttonCalcular;
    private JSpinner spinnerAlturaIW, spinnerAlturaBMR, spinnerEdad;


    public VistaImp() {

        // Panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(255, 222, 114, 255));
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        this.add(panelPrincipal);

        panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout(0, 0));
        panelTitulo.setBackground(new Color(255, 222, 114, 255));
        labelTitulo = new JLabel();
        labelTitulo.setText("HEALTH CALCULATOR");
        labelTitulo.setFont(new Font("Chakra Petch", Font.BOLD, 38));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelSubtitulo = new JLabel();
        labelSubtitulo.setText("Calculate your ideal weight (IW) and basal metabolic rate (BMR)");
        labelSubtitulo.setFont(new Font("Chakra Petch", Font.PLAIN, 20));
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
        buttonCalcular.setFont(new Font("Chakra Petch", Font.BOLD, 45));
        buttonCalcular.setForeground(Color.red);
        buttonCalcular.setBackground(Color.red);
        buttonCalcular.setPreferredSize(new Dimension(60, 40));
        buttonCalcular.setHorizontalAlignment(SwingConstants.CENTER);
        panelButton.add(buttonCalcular);


        labelResultado = new JLabel();
        labelResultado.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        buttonCalcular.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        buttonCalcular.setHorizontalAlignment(SwingConstants.CENTER);
        panelButton.add(labelResultado);

        // Panel de pestañas (tabbed pane)
        tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Chakra Petch", Font.PLAIN, 14));
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
        panelBMR.setLayout(new GridLayout(4, 2));
        tabbedPane.addTab("BMR", panelBMR);

        labelAlturaBMR = new JLabel();
        labelAlturaBMR.setText("Altura (cm): ");
        labelAlturaBMR.setHorizontalAlignment(SwingConstants.CENTER);
        labelAlturaBMR.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        panelBMR.add(labelAlturaBMR);

        spinnerAlturaBMR = new JSpinner();
        spinnerAlturaBMR.setModel(new SpinnerNumberModel(100, 80, 210, 1));
        spinnerAlturaBMR.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        panelBMR.add(spinnerAlturaBMR);

        labelEdad = new JLabel();
        labelEdad.setText("Edad (años): ");
        labelEdad.setHorizontalAlignment(SwingConstants.CENTER);
        labelEdad.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        panelBMR.add(labelEdad);

        spinnerEdad = new JSpinner();
        spinnerEdad.setModel(new SpinnerNumberModel(50, 1, 105, 1));
        spinnerEdad.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        panelBMR.add(spinnerEdad);

        labelSexoBMR = new JLabel();
        labelSexoBMR.setText("Sexo: ");
        labelSexoBMR.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        labelSexoBMR.setHorizontalAlignment(SwingConstants.CENTER);
        panelBMR.add(labelSexoBMR);

        buttonGroupSexoBMR = new ButtonGroup();
        radioButtonHombreBMR = new JRadioButton("Hombre");
        radioButtonHombreBMR.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        buttonGroupSexoBMR.add(radioButtonHombreBMR);
        radioButtonMujerBMR = new JRadioButton("Mujer");
        radioButtonMujerBMR.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        buttonGroupSexoBMR.add(radioButtonMujerBMR);

        panelButtonGroupBMR = new JPanel();
        panelButtonGroupBMR.setLayout(new FlowLayout());
        panelButtonGroupBMR.setBackground(new Color(230, 230, 230));
        panelButtonGroupBMR.add(radioButtonHombreBMR);
        panelButtonGroupBMR.add(radioButtonMujerBMR);
        panelSexoBMR = new JPanel();
        panelSexoBMR.setLayout(new BorderLayout(0, 0));
        panelSexoBMR.setBackground(new Color(230, 230, 230));
        panelSexoBMR.add(panelButtonGroupBMR, BorderLayout.CENTER);
        panelBMR.add(panelSexoBMR);

        labelPeso = new JLabel();
        labelPeso.setText("Peso (kg): ");
        labelPeso.setFont(new Font("Chakra Petch", Font.PLAIN, 18));
        labelPeso.setHorizontalAlignment(SwingConstants.CENTER);
        panelBMR.add(labelPeso);

        textFieldPeso = new JTextField();
        textFieldPeso.setFont(new Font("Chakra Petch", Font.PLAIN, 16));
        textFieldPeso.setHorizontalAlignment(SwingConstants.CENTER);
        panelBMR.add(textFieldPeso);

        // Configuraciones
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.pack();
        this.setTitle("Health Calculator");
        this.setVisible(true);
    }

    public void mostrarTexto(String mensaje) {
        this.labelResultado.setText(mensaje);
    }

    @Override
    public void registrarControlador(Controlador controlador) {
        this.buttonCalcular.addActionListener(controlador);
        this.buttonCalcular.setActionCommand("Calcular");
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public int getAltura() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        String tituloPestana = tabbedPane.getTitleAt(selectedIndex);
        int altura;

        if (tituloPestana.equals("IW")) {
            altura = (int) spinnerAlturaIW.getValue();
        } else {
            altura = (int) spinnerAlturaBMR.getValue();
        }

        return altura;

    }

    public char getSexo() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        String tituloPestana = tabbedPane.getTitleAt(selectedIndex);
        char sexo;

        if (tituloPestana.equals("IW")) {
            if (radioButtonHombreIW.isSelected()) {
                sexo = 'm';
            } else {
                sexo = 'w';
            }
        }
        else {
            if (radioButtonHombreBMR.isSelected()) {
                sexo = 'm';
            }
            else {
                sexo = 'w';
            }
        }
        return sexo;
    }

    public int getEdad() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        String tituloPestana = tabbedPane.getTitleAt(selectedIndex);
        int edad;

        if (tituloPestana.equals("BMR")) {
            edad = (int) spinnerEdad.getValue();
        }
        else {
            throw new IllegalStateException("Pestaña inesperada: " + tituloPestana);
        }

        return edad;
    }

    public float getPeso() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        String tituloPestana = tabbedPane.getTitleAt(selectedIndex);
        float peso;

        if (tituloPestana.equals("BMR")) {
            peso = Float.parseFloat(textFieldPeso.getText());
        }
        else {
            throw new IllegalStateException("Pestaña inesperada: " + tituloPestana);
        }

        return peso;
    }

    public String getMetodo() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        String tituloPestana = tabbedPane.getTitleAt(selectedIndex);

        return tituloPestana;
    }
}