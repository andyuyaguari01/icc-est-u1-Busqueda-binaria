import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product[] products= {
            new Product ( "Laptop", 20),
            new Product ( "Smarphone", 25),
            new Product ( "Tablet", 10),
            new Product ( "Monitor ", 5),
            new Product ( "Keyboard ", 15)

        };
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        
        int res = bBinaria.finByName( products, "Laptop ");
        if ( res >= 0){
            System.out.println("entre en pos ="+ res);

        }else {
            System.out.println(" No se encotro");
        }
    }
}
