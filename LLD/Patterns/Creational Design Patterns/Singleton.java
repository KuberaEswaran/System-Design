
class Singleton {

    private static Singleton obj;

    private Singleton() {
    }

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public void Show() {
        System.out.println("Sucess" + " " + obj);
    }
}

class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.Show();
    }
}
