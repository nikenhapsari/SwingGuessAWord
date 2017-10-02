/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Matt Robinson";
//        System.out.println(nama.indexOf('o'));
//        System.out.println(nama.lastIndexOf('o'));
        nama = nama.replace('t','z'); //untuk menggantikan karakter di string
//        System.out.println(nama);
        char[] vokal = {'a','i','u','e','o'};
        
        //cara gampang
        for (int i = 0; i < vokal.length; i++) {
            nama  = nama.replace(vokal[i], '_');
        }
        System.out.println(nama);
        System.out.println(vokal.length);
        //cara ribet
//        for (int i = 0; i < vokal.length; i++) {
//            if(nama.indexOf(vokal[i])== -1){ //kalo mengembalikan nilai -1 berarti yg dicari gaada
//                
//            } else {
//                int idx = nama.indexOf(vokal[i]);
//                nama = nama.replace(vokal[i],'_');
//            }
//        }
//         System.out.println(nama);
        
//        String nama = "Matt Robinson";
//        char idx5 = nama.charAt(5);
//        System.out.println(idx5); //huruf yang keluar  R
//        int uni5 = nama.codePointAt(5); //ini kode unicode
//        System.out.println(uni5); //unicode dari R
//        
//        //karakter itu representasi dari bilangan bulat versi huruf gitu
//        
//        int a = 'c'; //bisa gini soalnya char itu punya kode ASCII
//        char d = 11111; //bisa menampung sampai 5 digit
//        
//        System.out.println(Character.getNumericValue('a')); //kode dari ASCII
    }
    
}
