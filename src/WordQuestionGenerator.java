
import id.co.niken.oop.QuestionModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public final class WordQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Bekasi", "Kota di Jawa Barat");
        WordModel soal2 = new WordModel("Summarecon Bekasi", "Mall di Bekasi");
        WordModel soal3 = new WordModel("Patung Lele", "Patung di Bekasi");
        WordModel soal4 = new WordModel("Juanda", "Jalan utama di Bekasi");
        WordModel soal5 = new WordModel("Grand Metropolitan", "Mall di Bekasi");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionInCollection(){
        WordModel soal1 = new WordModel("Bekasi", "Kota di Jawa Barat");
        WordModel soal2 = new WordModel("Summarecon Bekasi", "Mall di Bekasi");
        WordModel soal3 = new WordModel("Patung Lele", "Patung di Bekasi");
        WordModel soal4 = new WordModel("Juanda", "Jalan utama di Bekasi");
        WordModel soal5 = new WordModel("Grand Metropolitan", "Mall di Bekasi");
        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionFromFile(String filename) {
        
        FileReader fileReader = null;
        try {
            //List<QuestionModel> questions = new ArrayList<>();
            File file = new File(filename);
            fileReader = new FileReader(file); //kalo data diatas gaada jadinya salah
            BufferedReader reader = new BufferedReader(fileReader);
            List<WordModel> bankSoal = new ArrayList<>();
            String line = null;
            while(( line = reader.readLine()) != null){
                //split line, assign ke string array
                String []stringArray = line.split(",");
                //buat objek QuestionModel, array idx 0 kata dasar, array idx 1 petunjuk
                WordModel pisah = new WordModel(stringArray[0], stringArray[1].trim());
                //memasukan data di pisah ke question
                bankSoal.add(pisah);
            }   //Collections.sort(bankSoal);
            System.out.println("jumlah data di collections: "+bankSoal.size());
            for(WordModel w : bankSoal){
                System.out.println("Kata Dasar: " + w.getBasicWord() + "\nPetunjuk: " + w.getHint());
            }   return bankSoal;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
