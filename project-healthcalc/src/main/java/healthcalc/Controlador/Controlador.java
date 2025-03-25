package healthcalc;

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

        if(e.getActionCommand().equals("Calcular")) {
            try {
                String input = vista.getInputValue();
                Integer n = Integer.parseInt(input);
                float resultado = modelo.idealWeight(n, 'w');
                this.vista.mostrarTexto("El factorial de " + n + " es: " + resultado);
                System.out.println("El factorial de " + n + " es: " + resultado);
            }
            catch (Exception ex) {
                vista.mostrarTexto("La altura debe estar dentro de un rango adecuado (80-210)");
            }
        }

    }
}

