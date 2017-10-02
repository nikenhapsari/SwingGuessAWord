
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CompleteWord {
    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;
    private String[] images;
    
    public CompleteWord() {
    }

    public CompleteWord(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }
    
    public String createSoal(){
        
        soal= basicWord.toUpperCase();
        
        char[] vokal = {'A','I','U','E','O'};
        for (int i = 0; i < vokal.length; i++) {
            soal  = soal.replace(vokal[i], '_');
        }
        
        return soal;
    }
    
    public boolean cekJawaban(){
        boolean hasil = false;
        
        if (jawaban.equalsIgnoreCase(basicWord)){
            hasil=true;
        }// gausah pake else lagi soalnya diatas udah diinisialisasi false duluan hasilnya
        return hasil;
    }
    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
}
