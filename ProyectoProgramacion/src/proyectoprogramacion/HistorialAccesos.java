package proyectoprogramacion;

import java.util.*;

public class HistorialAccesos {

    private List<Acceso> accesos = new ArrayList<>(); // Creación de la lista donde guardaremos los accesos

    public void registrarAcceso(String usuario, String hora, String motivo) { // Método que recibe 3 datos y los almacena en un nuevo objeto que lo añade a la lista
        accesos.add(new Acceso(usuario, hora, motivo));
    }

    public void mostrarAccesosOrdenados() { // Método para ordenar la lista según la hora y mostrar cada acceso
        Collections.sort(accesos, Comparator.comparing(Acceso::getHora));
        Iterator<Acceso> it = accesos.iterator();
        while (it.hasNext()) {
            Acceso a = it.next();
            System.out.println(a);
        }
    }

    public void mostrarEstadisticasPorUsuario() { // Método que cuenta cuántas veces accedió cada usuario
        Map<String, Integer> conteo = new HashMap<>();
        for (Acceso a : accesos) {
            String usuario = a.getUsuario();
            if (conteo.containsKey(usuario)) {
                conteo.put(usuario, conteo.get(usuario) + 1);
            } else {
                conteo.put(usuario, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            String usuario = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("---- Usuario: " + usuario + " - Accesos: " + cantidad + " ----");
        }
    }

    public void mostrarEstadisticasPorMotivo() { // Método que cuenta cuántas veces se accedió por motivo
        Map<String, Integer> conteo = new HashMap<>();
        for (Acceso a : accesos) {
            String motivo = a.getMotivo();
            if (conteo.containsKey(motivo)) {
                conteo.put(motivo, conteo.get(motivo) + 1);
            } else {
                conteo.put(motivo, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            String motivo = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("----  Motivo: " + motivo + " - Accesos: " + cantidad + " ----");
        }
    }

}
