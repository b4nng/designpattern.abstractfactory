import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void deveConectarTCP(){
        AbstractFactory factory = new FactoryTCP();
        Host host = new Host(factory);
        Assertions.assertEquals("TCP Authorization granted\n" + "TCP Connected. Handshake 100%."
                , host.connect());
    }
    @Test
    public void deveConectarUDP(){
        AbstractFactory factory = new FactoryUDP();
        Host host = new Host(factory);
        Assertions.assertEquals("UDP Authorization granted\n" +
                "UDP Data received.", host.connect());
    }
}
