package estDat.estDatLin;

public class ListaSE<T> implements Lista<T>{
    private T          ini;
    private ListaSE<T> sig;
    public ListaSE(){
        ini = null;
        sig = null;
    }
    
    public boolean vacia(){
        return ini == null;
    }
    public void insertar(T dato){
        if(vacia()){
            ini = dato;
            sig = new ListaSE<T>(); 
        }else{
            sig.insertar(dato);
        }
    }
    public void insertar(T dato, int pos){
        if(pos<= longitud()){        
            if(pos==0){
                insertarIni(dato);                
            }else{
                insertar(dato, pos-1);
            }
        }
    }
    public void insertarIni(T dato){
        if(vacia()){
            ini = dato;
            sig = new ListaSE<T>();
        }else{
            T aux = ini;
            ini = dato;
            sig.insertarIni(aux);
        }
    }
    public T eliminar(int pos){
        T eliminado= null;
        if(!vacia()){
            if(pos == 1){
                eliminado = sig.getIni();
                ListaSE<T> sigSig = sig.getSig(); 
                sigSig.insertarIni(ini);
            }else{
                sig.eliminar(pos-1);
            }
        }
        return eliminado;
    }
    public T eliminar(T dato){
        return null;
    }
    public void eliminar(int desde, int hasta){
    }
    public void eliminarTodas(T dato){
    }
    public T acceder(int pos){
        return null;
    }
    public T acceder(T dato){
        return null;
    }
    public Lista<T> acceder(int desde, int hasta){
        return null;
    }
    public int longitud(){
        int length = 0;
        if(!vacia())  length = 1 + sig.longitud();
        return length;
    }
    public boolean buscar(T dato){
        return false;
    }
    public int indiceDe(T dato){
        return 0;
    }
    public T getIni(){
        return ini;
    }
    public ListaSE<T> getSig(){
        return sig;
    }
}
