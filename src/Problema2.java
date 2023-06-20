import java.util.HashMap;

public class Problema2 {

    public static void main(String[] args) {
        // cadena de texto para la combrobacion
        String cadenaTexto = "Victor";

        comprobacionCadena(cadenaTexto);
    }

    public static void comprobacionCadena(String cadenaTexto){
        String vocales = "aeiou";

        // HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Consonantes", 0);
        map.put("Vocales", 0);    
    
        for (int i = 0; i < cadenaTexto.length(); i++) {
           if (vocales.contains(cadenaTexto.toLowerCase().charAt(i) + "")) {
                map.put("Vocales", map.get("Vocales") + 1);
           }else if(cadenaTexto.charAt(i) == ' '){
                continue;
           }else{
                map.put("Consonantes", map.get("Consonantes") + 1);
           }
        }
        
        // Imprimo los valores del HashMap
        for (String key : map.keySet()) {
            System.out.print(key + ": ");
            System.out.println(map.get(key));
            
        }
    }
}
