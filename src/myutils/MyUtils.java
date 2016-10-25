/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena != null) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat = resultat.concat(String.valueOf(cadena.charAt(i)));
            }
        } else {
            return null;
        }
        return resultat;
    }

    /**
     *
     * @param d int dia del naixement
     * @param m int mes del naixement
     * @param y int any del naixement
     * @return true si la data es posible, false en cas contrati
     *
     */
    public static boolean verificaData(int d, int m, int y) {
        boolean traspas = (y % 4 == 0 && (y % 100 != 0) || (y % 400 == 0));
        if (m > 12 || m < 1 || d < 1) {
            return false;
        }
        if ((d > 30) && (m == 4 || m == 6 || m == 9 || m == 11)) {
            return false;
        }
        if ((d > 31) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
            return false;
        }
        //TODO I si es any de traspas?
        if (traspas) {
            if ((d > 29) && m == 2) {
                return false;
            }
        } else {
            if ((d > 28) && m == 2) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param d int dia del naixement
     * @param m int mes del naixement
     * @param y int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int d, int m, int y) {
        Calendar nacimiento = Calendar.getInstance();
        String date = Integer.toString(y) + Integer.toString(m) + Integer.toString(d);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        try {
            df.parse(date);
            nacimiento.setLenient(false);
            nacimiento.set(y, m - 1, d);
            Calendar hoy = Calendar.getInstance();
            int diaAnoNacimiento = nacimiento.get(Calendar.DAY_OF_MONTH);
            int mesAnoNacimiento = nacimiento.get(Calendar.MONTH);
            int AnoNacimiento = nacimiento.get(Calendar.YEAR);

            int auxDia = (hoy.get(Calendar.DAY_OF_MONTH) - diaAnoNacimiento);
            int auxMes = (hoy.get(Calendar.MONTH) - mesAnoNacimiento);
            int auxAno = (hoy.get(Calendar.YEAR) - AnoNacimiento);

            if (auxDia < 0) {
                auxMes--;
            }
            if (auxMes < 0) {
                auxAno--;
            }
            if (auxAno < 0) {
                return -2;
            }
            if (auxAno >= 150) {
                return -1;
            }
            return auxAno;
        } catch (ParseException | IllegalArgumentException e) {
            return -2;
        }

    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static long factorial(long numero) {
        long resultat = numero;
        if (numero == 0) {
            return 1;
        } else if (numero < 0) {
            return -1;

        } else {
            long aux = factorial(numero - 1);
            if (aux < 0) {
                return -1;
            } else {
                resultat = numero * aux;
                if (resultat < 0) {
                    resultat = -1;
                    //}
                    return resultat;
                }
            }
            return resultat;
        }
    }
}
