
package dthwolf.vertebral_waistcoat;

import java.io.ObjectInputStream;
import java.net.Socket;

public class c_Phone1 implements Runnable{

    private c_principal a_Principal;
    private Socket a_Cliente;
    private ObjectInputStream a_Entrada;
    private datos a_Intput;
    
    public c_Phone1(c_principal p_Principal,Socket p_Cliente){
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
                a_Principal.m_getPhone1X(a_Intput.m_getX());
                System.out.print("X= "+a_Intput.m_getX()+"\t");
                a_Principal.m_getPhone1Y(a_Intput.m_getY());
                System.out.print("Y= "+a_Intput.m_getY()+"\t");
                a_Principal.m_getPhone1Z(a_Intput.m_getZ());
                System.out.print("Z= "+a_Intput.m_getZ()+"\n");
            }catch(Exception e){
                System.out.println(e.toString());
                v_Bandera=false;
            }
        }while(v_Bandera);
    }
    
}
