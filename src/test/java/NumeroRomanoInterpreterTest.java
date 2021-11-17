import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class NumeroRomanoInterpreterTest {

    @Test
    public void teste194(){
        ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
        interpretadores.add(new QuatroDigitosRomano());
        interpretadores.add(new TresDigitosRomano());
        interpretadores.add(new DoisDigitosRomano());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "CXCIV";
        Contexto contexto = new Contexto(numeroRomano);
        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }
        assertEquals(194,contexto.getOutput());
    }

    @Test
    public void testeNumeroQuatro(){
        ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
        interpretadores.add(new DoisDigitosRomano());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "IV";
        Contexto contexto = new Contexto(numeroRomano);
        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }
        assertEquals(4,contexto.getOutput());
    }

}