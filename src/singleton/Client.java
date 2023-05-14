package singleton;

public class Client {
    public static void main(String[] args) {
        Connection connection=Connection.getConnection();
        System.out.println(connection.hashCode());

        Connection connection2=Connection.getConnection();
        System.out.println(connection2.hashCode());
    }
}
