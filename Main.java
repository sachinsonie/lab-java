interface computer{
    void compileCode();

    void buildApps();
}
class Laptop implements computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }

    @Override
    public void buildApps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildApps'");
    }
}
class Developer implements computer
{
    public void buildApps(computer s)
    {
        System.out.println("building apps");
    
    }

    @Override
    public void compileCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compileCode'");
    }

    @Override
    public void buildApps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildApps'");
    }
}

public class Main {
    public static void main(String[] args) {
        computer s = new Developer();
        computer a = new Laptop();
        s.compileCode();
        a.buildApps();
    }
}

