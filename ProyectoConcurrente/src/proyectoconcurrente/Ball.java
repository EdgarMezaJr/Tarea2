/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcurrente;
import javax.swing.*;
/**
 *
 * @author edgar
 */
public class Ball extends Thread{
    private PanelBall panel;
    private MiX x;
    private MiY y;
    
    Ball(PanelBall panel, MiX x, MiY y){
        this.panel=panel;
        this.x=x;
        this.y=y;
    }
    public void run(){
        boolean bandera1=true;
        boolean bandera2=false;
        int inc = 10;
        int inc2 = 10;
        while(true){
            try{
                //Todo este bloque de if esta destinado a ver los bordes
                //Activo y desactivo banderas con el fin de que pueda ir hacia abajo
                //O hacia arriba.
                if (x.getX()+20>=420-inc){
                    bandera1=false;
                    inc = (int) Math.floor(Math.random()*10+5);
                }
                if (x.getX()-20<0-inc)
                    bandera1=true; 
                
                if (y.getY()+20>=420-inc2){
                    bandera2=false;
                    inc2 = (int) Math.floor(Math.random()*10+5);
                }   
                if (y.getY()-20<0-inc2)
                    bandera2=true;
                
                
                //A partir de estos if else, solo los ocupo para ver si esta tocando
                //algun borde superior, inferior, derecho o izquierdo
                //para que le pueda dar un nuevo sentido a la pelota 
                if (bandera1)
                    x.setX(x.getX()+inc);
                else 
                   x.setX(x.getX()-inc); 
                
                if (bandera2)
                    y.setY(y.getY()+inc2); 
                else 
                    y.setY(y.getY()-inc2);
                
                  
                panel.repaint();
                Thread.sleep(100);
            }catch(Exception e){e.printStackTrace();}
        }
    }
    
}


