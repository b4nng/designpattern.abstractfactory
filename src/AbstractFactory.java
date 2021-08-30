public interface AbstractFactory {
    Connection createConnection();
    Auth createAuth();
}
