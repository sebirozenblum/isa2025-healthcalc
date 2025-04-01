package healthcalc.Vista;

import healthcalc.Controlador.Controlador;

import javax.swing.*;

public interface Vista {

    public void registrarControlador(Controlador controlador);

    public void mostrarTexto(String texto);

    public int getAltura();

    public char getSexo();

    public int getEdad();

    public float getPeso();

    public String getMetodo();

}
