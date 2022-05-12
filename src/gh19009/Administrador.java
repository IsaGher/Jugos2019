package gh19009;

import javax.swing.JOptionPane;

public class Administrador {

    private Object sabores[][];
    private Object jugos[][];
    private Object saborPorJugo[][];
    private int idJugo, idSabor, mezclas = 0, fila, columna;

    public Administrador() {
        sabores = new Object[200][2];
        jugos = new Object[100][2];
        saborPorJugo = new Object[500][3];
        idJugo = 1;
        idSabor = 11;
        sabores[0][0] = 1;  sabores[0][1] = "Fresa";
        sabores[1][0] = 2;  sabores[1][1] = "Limon";
        sabores[2][0] = 3;  sabores[2][1] = "Naranja";
        sabores[3][0] = 4;  sabores[3][1] = "Sandia";
        sabores[4][0] = 5;  sabores[4][1] = "Mandarina";
        sabores[5][0] = 6;  sabores[5][1] = "Melon";
        sabores[6][0] = 7;  sabores[6][1] = "Hierba Buena";
        sabores[7][0] = 8;  sabores[7][1] = "Chocolate";
        sabores[8][0] = 9;  sabores[8][1] = "Menta";
        sabores[9][0] = 10;  sabores[9][1] = "Piña";                    
    }

    public void agregarJugo(Object nombreJugo) {
        if(!String.valueOf(nombreJugo).isEmpty() && idJugo <= 100){
        jugos[(idJugo-1)][0] = idJugo;
        jugos[(idJugo-1)][1] = nombreJugo;
        idJugo++;
        }                
    }
    
    
    
    public Object verIdjugos(){
        int id;
        id = idJugo;
        return id;    
    }
    public void agregarMezclas(int idJugo, int idSabor, double cantidad){
            saborPorJugo [mezclas][0]= idJugo;
            saborPorJugo [mezclas][1]= idSabor;
            saborPorJugo [mezclas][2]= cantidad; 
            mezclas ++;
    }
   
    public void agregarSabor(String sabor){
        if(!sabor.isEmpty() && idSabor <= 200){
        sabores[(idSabor-1)][0] = idSabor;
        sabores[(idSabor-1)][1] = sabor;
        idSabor++;
        }      
    }
    public Object [][] verMezclas(){
        int posicion;
        Object mezclas[][] = new Object [this.mezclas][3];
        for(posicion = 0; posicion < this.mezclas; posicion++){
            mezclas [posicion][0] = saborPorJugo [posicion][0];
            mezclas [posicion][1]= saborPorJugo [posicion][1];
            mezclas [posicion][2]= saborPorJugo [posicion][2]; 
        }
        return mezclas;
    }
    public Object [][] sabor (){
        int posicion;
        Object sabores[][] = new Object [idSabor][2];
        for(posicion = 0; posicion < idSabor; posicion++){
            sabores [posicion][0] = this.sabores [posicion][0];
            sabores [posicion][1]= this.sabores [posicion][1];
        }
        return sabores;
    }

    public Object [][] verJugos(){
        int posicion;
        Object juguitos [][];
        juguitos = new Object [idJugo][2];
        for (posicion = 0; posicion < idJugo; posicion++){
            juguitos [posicion][0] = jugos[posicion][0];
            juguitos [posicion][1] = jugos[posicion][1];
        }
        return juguitos;
    }
    
    public Object verIdsabor(){
        int id; 
        id = idSabor;
        return id;
    }
    
    public Object [] listarIdSabores(){
        int posicion;
        Object id [];
        id = new Object [idSabor];
        for (posicion = 0; posicion < idSabor; posicion++){
            id [posicion] = sabores [posicion][0];
        }
        return id;
    }    
    
    public Object [] listarSabores(){
        int posicion;
        Object sabor [];
        sabor = new Object [idSabor];
        for(posicion = 0; posicion < idSabor; posicion++){
            sabor[posicion] = sabores[posicion][1];
        }
        return sabor;
    }
}
