public class FactoryUDP implements AbstractFactory{
    @Override
    public Connection createConnection() {
        return new ConnectionUDP();
    }

    @Override
    public Auth createAuth() {
        return new AuthUDP();
    }
}
