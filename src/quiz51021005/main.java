/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz51021005;

import java.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class main {
    private String nim;
    private String nama;
    private String nilai_tugas;
    private String nilai_kuis;
    private String nilai_mid;
    private String nilai_final;
    private double nilai_akhir;
    private char nilai_huruf;
    private int count1,count2,count3;
    
    public void SimpanData(String nim, String nama, String nilai_tugas, String nilai_kuis, String nilai_mid, String nilai_final, String nilai_akhir, String nilai_huruf){
        try{
            FileOutputStream fout = new FileOutputStream ("Quiz51021005.dat", true);
            DataOutputStream out =new DataOutputStream (fout);
            out.writeUTF(nim+";");
            out.writeUTF(nama+";");
            out.writeUTF(nilai_tugas+";");
            out.writeUTF(nilai_kuis+";");
            out.writeUTF(nilai_mid+";");
            out.writeUTF(nilai_final+";");
            out.writeUTF(nilai_akhir+";");
            out.writeUTF(nilai_huruf+";");
            out.close();
        }catch(IOException a){
            System.out.println(a.toString());
        }
    }    
    
     public String BacaData(){
        String nim,nama,nilai_tugas,nilai_kuis,nilai_mid,nilai_final,nilai_akhir,nilai_huruf;
        String temp="",data="";
        try{
            FileInputStream file=new FileInputStream("Quiz51021005.dat");
            DataInputStream in=new DataInputStream(file);
            while (in.available()>0){
                nim=in.readUTF();
                nama=in.readUTF();
                nilai_tugas=in.readUTF();
                nilai_kuis=in.readUTF();
                nilai_mid=in.readUTF();
                nilai_final=in.readUTF();
                nilai_akhir=in.readUTF();     
                nilai_huruf=in.readUTF(); 
                temp=" nim="+nim+"\n nama="+nama+"\n tugas="+nilai_tugas+"\n kuis="+nilai_kuis+"\n mid="+nilai_mid+"\n nilai final="+nilai_final+"\n nilai akhir="+nilai_akhir+"\n nilai_huruf="+nilai_huruf+"\n \n";
                data+=temp; 
                if(!data.isEmpty()){
                    count1++;
                }
                if(nilai_huruf.equals("E;")){
                    count3++;
                }
                if(!nilai_huruf.equals("E")){
                    count2++;
                }
            }                              
            in.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        return(data);
    }
     
     public int getCount(){
         return count1;
     }
     public int getCount2(){
         return count2;
     }
     public int getCount3(){
         return count3;
     }
}


