import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Actores {
    public static int identificador = 4;
    public static String archivoxml =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<actores>\n" +
                    "<actor>\n" +
                    "<pelicula>BenHur</pelicula>\n" +
                    "<nombre>John Joseph</nombre> \n" +
                    "<pais>USA</pais> \n" +
                    "<empresa>Columbia</empresa>\n" +
                    "<calificacion>3</calificacion> \n" +
                    "<nacimiento>1985</nacimiento>\n" +
                    "</actor>\n" +
                    "<actor>\n" +
                    "<pelicula> Hide your heart</pelicula>\n" +
                    "<nombre> Bonnie Tyler</nombre>\n" +
                    "<pais>UK</pais>\n" +
                    "<empresa> CBS Records</empresa>\n" +
                    "<calificacion>4.5</calificacion>\n" +
                    "<nacimiento>1988</nacimiento>\n" +
                    "</actor> <actor>\n" +
                    "<pelicula> Greatest Hits of the Roma</pelicula>\n" +
                    "<nombre> Dolly Perez</nombre>\n" +
                    "<pais>USA</pais> \n" +
                    "<empresa>RCA</empresa>\n" +
                    "<calificacion>5</calificacion> \n" +
                    "<nacimiento>1982</nacimiento>\n" +
                    "</actor> <actor>\n" +
                    "<pelicula> Still got the blues </pelicula>\n" +
                    "<nombre> Gary Moralez</nombre> \n" +
                    "<pais>UK</pais>\n" +
                    "<empresa> Virgin records</empresa> \n" +
                    "<calificacion>20</calificacion> \n" +
                    "<nacimiento>1990</nacimiento>\n" +
                    "</actor>\n" +
                    "</actores>\n";



    public static void main(String[] args) {
        try{
            JSONObject jsoObject = XML.toJSONObject(archivoxml);
            String jsonPretty = jsoObject.toString(identificador);
            System.out.println(jsonPretty);
        } catch (JSONException jex) {
            System.out.println(jex.toString());
        }
    }


}



