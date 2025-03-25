package healthcalc.Controlador;

import healthcalc.Modelo.HealthCalc;
import healthcalc.Vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private HealthCalc modelo;
    private Vista vista;

    public Controlador(HealthCalc modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Calcular")) {
            try {
                int selectedIndex = vista.getTabbedPane().getSelectedIndex();
                String tituloPestana = vista.getTabbedPane().getTitleAt(selectedIndex);

                if (tituloPestana.equals("IW")) {
                    int altura = (int) vista.getSpinnerAlturaIW().getValue();
                    if (vista.getRadioButtonHombreIW().isSelected()) {
                        float resultado = modelo.idealWeight(altura, 'm');
                        vista.mostrarTexto("Ideal weight: " + String.format("%.1f", resultado) + " kg");
                    } else if (vista.getRadioButtonMujerIW().isSelected()) {
                        float resultado = modelo.idealWeight(altura, 'w');
                        vista.mostrarTexto("Ideal weight: " + String.format("%.1f", resultado) + " kg");
                    }
                } else if (tituloPestana.equals("BMR")) {
                    int altura = (int) vista.getSpinnerAlturaBMR().getValue();
                    int edad = (int) vista.getSpinnerEdad().getValue();
                    int peso = Integer.parseInt(vista.getTextFieldPeso().getText());
                    if (vista.getRadioButtonHombreBMR().isSelected()) {
                        float resultado = modelo.basalMetabolicRate(peso, altura, edad, 'm');
                        vista.mostrarTexto("Basal metabolic rate: " + String.format("%.1f", resultado) + " kcal/day");
                    }
                    else if (vista.getRadioButtonMujerBMR().isSelected()) {
                        float resultado = modelo.basalMetabolicRate(peso, altura, edad, 'w');
                        vista.mostrarTexto("Basal metabolic rate: " + String.format("%.1f", resultado) + " kcal/day");
                    }
                }
            } catch (Exception ex) {
                vista.mostrarTexto("El peso debe estar en un rango adecuado (0-200)");
            }
        }

    }
}

