/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import javax.swing.ImageIcon;
import javax.swing.JButton;

    


public class GameClassic extends Game{
 javax.swing.JLabel lblgif;
 javax.swing.JLabel lblgifazul;
 javax.swing.JLabel lbltxt;
 String cor;
 javax.swing.JLabel lblcont;
 
 int cont;
 
 
    public GameClassic( javax.swing.JLabel lblgif, javax.swing.JLabel lblgifazul, javax.swing.JLabel lbltxt,
            String cor,int cont) {
        this.lblgif = lblgif;
        this.lblgifazul = lblgifazul;
        this.lbltxt = lbltxt;
        this.cor = cor;
        this.cont = cont;
       
    }
    
    
    
    @Override
    public void run() {
        try {
        Thread.sleep(2000);
           
        ImageIcon gif1 = new ImageIcon("src/imgd/dadov"+dadov+".png");
        lblgif.setIcon(gif1);
        ImageIcon gif2 = new ImageIcon("src/imgd/dadoa"+dadoa+".png");
        lblgifazul.setIcon(gif2);
        
            String Ganhador;
             if (dadov > dadoa && cor == "red") {
               //vc ganhou
                Ganhador = "Você ganhou";
                cont = cont +1;
            } else if (dadoa > dadov && cor == "blue") {
                //vc ganhou
                Ganhador = "Você ganhou";
                cont = cont +1;
            } else if (dadoa == dadov && cor == "draw") {
                //vc gangou
                
                Ganhador = "Você ganhou";
                cont = cont +1;
            }else if(dadov > dadoa && cor == "blue"){
               Ganhador = "Você perdeu";
               cont = cont -1;
            } else if(dadoa > dadov && cor == "red"){
                Ganhador = "Você perdeu";
               cont = cont -1;
            }else if (dadoa == dadov && cor == "red"|| cor == "blue"){
               Ganhador = "Você perdeu";
               cont = cont -1;
            }else if(dadov > dadoa && cor == "draw"){
                Ganhador = "Você perdeu";
                cont = cont -1;
            } else if (dadoa > dadov && cor == "draw"){
                Ganhador = "Você perdeu";
                cont = cont -1;
            } else {
                Ganhador = "tente novamente";
            }
             lbltxt.setText(Ganhador);
            
            
            // TODO add your handling code here:
        } catch (InterruptedException ex) {
            System.out.println("ERRO");
            
        }
      
    }

   
    
    }

    
    
    

