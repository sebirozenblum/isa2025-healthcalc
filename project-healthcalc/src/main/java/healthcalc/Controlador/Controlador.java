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
                if (vista.getMetodo().equals("IW")) {
                    int altura = vista.getAltura();
                    char sexo = vista.getSexo();
                    float resultado = modelo.idealWeight(altura, sexo);
                    vista.mostrarTexto("Ideal weight: " + String.format("%.1f", resultado) + " kg");
                } else if (vista.getMetodo().equals("BMR")) {
                    int altura = vista.getAltura();
                    int edad = vista.getEdad();
                    float peso = vista.getPeso();
                    char sexo = vista.getSexo();
                    float resultado = modelo.basalMetabolicRate(peso, altura, edad, sexo);
                    vista.mostrarTexto("Basal metabolic rate: " + String.format("%.1f", resultado) + " kcal/day");
                }
            } catch (Exception ex) {
                vista.mostrarTexto("El peso debe estar en un rango adecuado (0-200)");
            }
        }

    }
}

