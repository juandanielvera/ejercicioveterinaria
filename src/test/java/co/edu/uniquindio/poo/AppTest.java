/**
 * Clase para probar el funcionamiento del código de la veterinaria 
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos(){
        LOG.info("Iniciando prueba de datosCompletos");
        Mascota mascota= new Mascota("rex", 4, "canino","pastorBelga","macho", "negro", 12.0);
        assertEquals("rex", mascota.nombre());
        assertEquals(4, mascota.edad());
        assertEquals("canino", mascota.especie());
        assertEquals("pastorBelga", mascota.raza());
        assertEquals("macho", mascota.genero());
        assertEquals("negro", mascota.color());
        assertEquals(12.0, mascota.peso());
        LOG.info("Finalizando la prueba de datosCompletos ");
    }
    @Test
    public void datosNulos() {
        LOG.info("iniciando prueba de datosNulos");
        assertThrows(Throwable.class,  () -> new Mascota(null,(int)1,null,null,null,null,(Double)12.0));
        LOG.info("finalizando prueba de datosNulos");
}

    @Test
    public void edadNegativa(){
        LOG.info("iniciando prueba de edadNegativa");

        assertThrows(Throwable.class,  () -> new Mascota("rex",(int)-4,"canino", "pastorBelga","masculino","negro",(Double)12.0));
        LOG.info("finalizando prueba de edadNegativa");
    }



        @Test
        public void pruebaDatosVacios() {
        Mascota mascota = new Mascota("", 0, "", "", "", "", 0.0);
        assertEquals("", mascota.nombre());
        assertEquals(0, mascota.edad());
        assertEquals("", mascota.especie());
        assertEquals("", mascota.raza());
        assertEquals("", mascota.genero());
        assertEquals("", mascota.color());
        assertEquals(0.0, mascota.peso(), 0.001);
}

    }