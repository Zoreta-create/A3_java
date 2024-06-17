
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaik
 */
public class GameAdvanced extends Game {

    int dadoa2 = ram.nextInt(6) + 1;
    int dadov2 = ram.nextInt(6) + 1;

    javax.swing.JLabel lblgifa1;
    javax.swing.JLabel lblgifa2;
    javax.swing.JLabel lblgifv1;
    javax.swing.JLabel lblgifv2;
    javax.swing.JLabel lbltxt;
    //javax.swing.JLabel lblpontos;
    
    boolean contv = false;
    boolean conta = false;
    boolean conte = false;
    String cor;
    // int pontos = 0 ;
 
    public GameAdvanced(javax.swing.JLabel lblgifa1, javax.swing.JLabel lblgifa2,
            javax.swing.JLabel lblgifv1, javax.swing.JLabel lblgifv2, javax.swing.JLabel lbltxt, boolean contv,
            boolean conta, boolean conte, javax.swing.JLabel lblpontos, int pontos, String cor) {
        this.lblgifa1 = lblgifa1;
        this.lblgifa2 = lblgifa2;
        this.lblgifv1 = lblgifv1;
        this.lblgifv2 = lblgifv2;
        this.lbltxt = lbltxt;
        this.contv = contv;
        this.conta = conta;
        this.conte = conte;
        this.cor = cor;
       // this.lblpontos = lblpontos;
        //this.pontos = pontos;
    }

    public String quemGanhou(String cor){
     if (cor == "red") {

                    return "Você ganhou";
                } else {
                    return "você prdeu";
                }
    }
     
    @Override
    public void run() {
        try {
            Thread.sleep(2000);

            ImageIcon gifa1 = new ImageIcon("src/imgd/dadoa" + dadoa + ".png");
            lblgifa1.setIcon(gifa1);
            ImageIcon gifa2 = new ImageIcon("src/imgd/dadoa" + dadoa2 + ".png");
            lblgifa2.setIcon(gifa2);
            ImageIcon gifv1 = new ImageIcon("src/imgd/dadov" + dadov + ".png");
            lblgifv1.setIcon(gifv1);
            ImageIcon gifv2 = new ImageIcon("src/imgd/dadov" + dadov2 + ".png");
            lblgifv2.setIcon(gifv2);
            
            

            String Ganhador;
            int blueTotal = dadoa + dadoa2;
            int redTotal = dadov + dadov2;
            
            
            if (redTotal > blueTotal && cor == "red") {
               //vc ganhou
                Ganhador = "Você ganhou";
            } else if (blueTotal > redTotal && cor == "blue") {
                //vc ganhou
                Ganhador = "Você ganhou";
            } else if (blueTotal == redTotal && cor == "draw") {
                //vc gangou
                
                Ganhador = "Você ganhou";
            }else if(redTotal > blueTotal && cor == "blue"){
               Ganhador = "Você perdeu";
            } else if(blueTotal > redTotal && cor == "red"){
                Ganhador = "Você perdeu";
            }else if (blueTotal == redTotal && cor == "red"|| cor == "blue"){
               Ganhador = "Você perdeu";
            }else if(redTotal > blueTotal && cor == "draw"){
                Ganhador = "Você perdeu";
            } else if (blueTotal > redTotal && cor == "draw"){
                Ganhador = "Você perdeu";
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

        
        

