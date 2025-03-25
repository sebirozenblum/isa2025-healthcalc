package healthcalc.Vista;

import healthcalc.Controlador.Controlador;

import javax.swing.*;

public interface Vista {

    public void registrarControlador(Controlador controlador);

    public void mostrarTexto(String texto);

    public JTabbedPane getTabbedPane();

    public JSpinner getSpinnerAlturaIW();

    public JSpinner getSpinnerAlturaBMR();

    public JSpinner getSpinnerEdad();

    public JRadioButton getRadioButtonHombreIW();

    public JRadioButton getRadioButtonMujerIW();

    public JRadioButton getRadioButtonHombreBMR();

    public JRadioButton getRadioButtonMujerBMR();

    public JTextField getTextFieldPeso();



}
