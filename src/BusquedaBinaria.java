import models.Product;

public class BusquedaBinaria {
    public void sortByName( Product []products){
        for ( int i= 0; i < products.length-1; i ++){
            boolean swap = false ;
            for ( int  j = 0; j < products.length-1-i ; j++){
                if ( products[j].getNombre().compareTo(products[j + 1].getNombre())< 0){

                Product aux = products[j];
                products[j] = products[ j+1];
                products[j + 1] = aux ;
                swap= true ;
            
            }
        }
            if ( ! swap){
            break ;
            }
        }
        
    }

    public int finByName ( Product []productos, String nombre){
        // definamos bajo & alto
        int bajo = 0 ;
        int alto = productos.length - 1;
        
        while (bajo <= alto){
            // definimos el punto medio
            int c = (bajo + alto) / 2;
            //comparamos con laclave
            if( productos[c].getNombre().equals(nombre)){
            //si es igyual retornamos con el punto medio    
                return c;
            }
            // si es mayor actualizamos el index correspondiente
            if( productos[c].getNombre().compareTo(nombre)>0){
                bajo = c +1 ;
            // si es menor actuslizamos el index correspondiente 
            }else{
                alto= c-1;
            }
           
            
        }
        return -1 ; // no encontrado 

    }

}
