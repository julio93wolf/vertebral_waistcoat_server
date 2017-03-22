
package dthwolf.vertebral_waistcoat;

import java.io.ObjectInputStream;
import java.net.Socket;

public class c_Phone2 implements Runnable{

    private c_principal a_Principal;
    private Socket a_Cliente;
    private ObjectInputStream a_Entrada;
    private datos a_Intput;
    
    public c_Phone2(c_principal p_Principal,Socket p_Cliente) {
        a_Principal=p_Principal;
        a_Cliente=p_Cliente;
    }
    
    @Override
    public void run() {
        Object v_obDato;
        boolean v_Bandera=true;
        try{
            a_Entrada= new ObjectInputStream(a_Cliente.getInputStream());
        }catch(Exception e){
            
        }
        do{
            try{
                v_obDato=a_Entrada.readObject();
                a_Intput=(datos)v_obDato;
                a_Principal.m_getPhone2X(a_Intput.m_getX());
                a_Principal.m_getPhone2Y(a_Intput.m_getY());
                a_Principal.m_getPhone2Z(a_Intput.m_getZ());
            }catch(Exception e){
                v_Bandera=false;
            }
        }while(v_Bandera);
    }
    
}
