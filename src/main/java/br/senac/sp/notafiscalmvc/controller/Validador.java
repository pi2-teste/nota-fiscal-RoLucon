package br.senac.sp.notafiscalmvc.controller;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validador {
    
    public ArrayList<String> mensagensErro = new ArrayList<>();

    public int validarInt(JTextField txt){
    
        try{
            
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            txt.setBackground(Color.WHITE);
            return Integer.parseInt(txt.getText());
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em inteiro");
            txt.setBackground(Color.red);
            return Integer.MIN_VALUE;
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
            return Integer.MIN_VALUE;
        }
    
    }
    
     public double validarDouble(JTextField txt){
     
         try{
            
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            txt.setBackground(Color.WHITE);
            return Double.parseDouble(txt.getText());
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em float");
            txt.setBackground(Color.red);
            return Double.MIN_VALUE;

        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
            return Double.MIN_VALUE;
        }
     
     }
     
     public void validarTxt(JTextField txt){
         
        if(txt.getText().trim().equals("")){
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }else{
            txt.setBackground(Color.white);
        }
     }
     
     public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
     
     public String getMensagensErro(){
         
        String errosFormulario = "";
        
        for (String msg : this.mensagensErro) {
            errosFormulario += "- " + msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        
        return errosFormulario;
        
     }
     
     public boolean hasErro(){
     
         if(this.mensagensErro.size()>0){
            return true;    
         }else{
             return false;
         }
     }
    
}
