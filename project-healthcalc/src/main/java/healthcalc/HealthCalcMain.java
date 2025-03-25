package healthcalc;

import healthcalc.Controlador.Controlador;
import healthcalc.Modelo.HealthCalcImp;
import healthcalc.Vista.VistaImp;

public class HealthCalcMain {

    public static void main(String[] args) {
        VistaImp vista = new VistaImp();
        HealthCalcImp modelo = new HealthCalcImp();
        Controlador controlador = new Controlador(modelo, vista);
        vista.registrarControlador(controlador);
    }

}
