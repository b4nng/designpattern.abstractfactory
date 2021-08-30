public class Host {
    Auth authorization;
    Connection connection;

    public Host(AbstractFactory factory){
        this.authorization = factory.createAuth();
        this.connection = factory.createConnection();
    }

    public String connect(){
        return this.authorization.auth()
                +"\n"
                +this.connection.connect();
    }
}
