package dthwolf.vertebral_waistcoat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;

public class c_principal extends javax.swing.JFrame {

    private ServerSocket a_Servidor1,a_Servidor2;        
    private Socket a_Cliente1,a_Cliente2;               
    private ExecutorService a_Corredor;
    
    public c_principal() {
        initComponents();
        try{
            ImageIcon v_imgIcon = new ImageIcon("src/dthwolf/resources/vest.png");
            setIconImage(v_imgIcon.getImage());
            setTitle("Vertebral Waistcoat Sever");
            setLocationRelativeTo(null);
            this.setVisible(true);
            m_Conexion();
        }catch(Exception e){
            
        }
    }

    public void m_Conexion(){
        try{
            System.out.println("Ejecucion de Hilos");
            a_Corredor= Executors.newCachedThreadPool();
            System.out.println("Ejecucion de Setvidor_1");
            a_Servidor1= new ServerSocket(6000);//Servidor Socket
            System.out.println("Ejecucion de Setvidor_2");
            a_Servidor2= new ServerSocket(6500);//Servidor Socket
            while(true){
                System.out.println("Esperando Cliente 1");
                a_Cliente1=a_Servidor1.accept();
                System.out.println("Cliente Conectado: "+a_Cliente1.getInetAddress().getHostAddress());
                a_Corredor.execute(new c_Phone1(this,a_Cliente1));
                a_Cliente2=a_Servidor2.accept();
                System.out.println("Cliente Conectado: "+a_Cliente2.getInetAddress().getHostAddress());
                a_Corredor.execute(new c_Phone2(this,a_Cliente2));
            }
        }catch(Exception e){}
    }
    
    public void m_getPhone1X(float p_X){
        lbl_phone1x.setText("X="+p_X);
    }
    
    public void m_getPhone1Y(float p_Y){
        lbl_phone1y.setText("Y="+p_Y);
    }
    
    public void m_getPhone1Z(float p_Z){
        lbl_phone1z.setText("Z="+p_Z);
    }
    
    public void m_getPhone2X(float p_X){
        lbl_phone2x.setText("X="+p_X);
    }
    
    public void m_getPhone2Y(float p_Y){
        lbl_phone2y.setText("Y="+p_Y);
    }
    
    public void m_getPhone2Z(float p_Z){
        lbl_phone2z.setText("Z="+p_Z);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_phone1x = new javax.swing.JLabel();
        lbl_phone1y = new javax.swing.JLabel();
        lbl_phone1z = new javax.swing.JLabel();
        lbl_phone2x = new javax.swing.JLabel();
        lbl_phone2y = new javax.swing.JLabel();
        lbl_phone2z = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Sensor_I");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Sensor_D");
        jLabel2.setToolTipText("");

        lbl_phone1x.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone1x.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone1x.setText("X=");

        lbl_phone1y.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone1y.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone1y.setText("Y=");

        lbl_phone1z.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone1z.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone1z.setText("Z=");

        lbl_phone2x.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone2x.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone2x.setText("X=");

        lbl_phone2y.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone2y.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone2y.setText("Y=");

        lbl_phone2z.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_phone2z.setForeground(new java.awt.Color(204, 0, 51));
        lbl_phone2z.setText("Z=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_phone1x)
                    .addComponent(lbl_phone1y)
                    .addComponent(lbl_phone1z))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_phone2x)
                    .addComponent(lbl_phone2y)
                    .addComponent(lbl_phone2z))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_phone1x)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_phone1y)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_phone1z))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_phone2x)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_phone2y)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_phone2z)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_phone1x;
    private javax.swing.JLabel lbl_phone1y;
    private javax.swing.JLabel lbl_phone1z;
    private javax.swing.JLabel lbl_phone2x;
    private javax.swing.JLabel lbl_phone2y;
    private javax.swing.JLabel lbl_phone2z;
    // End of variables declaration//GEN-END:variables
}
