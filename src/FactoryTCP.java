public class FactoryTCP implements AbstractFactory{
    @Override
    public Connection createConnection() {
        return new ConnectionTCP();
    }

    @Override
    public Auth createAuth() {
        return new AuthTCP();
    }
}
