/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

public class SaveableDictionary {
    
    private HashMap<String,String> list;
    private Boolean check;
    private File file;
    
    public SaveableDictionary(){
        this.list = new HashMap<>();
    }
    
    public SaveableDictionary(String filename){
        this.file = new File(filename);
        this.list = new HashMap<>();
 
    }
    
    public boolean load(){
        try{
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e){
            System.out.println("File error : " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean save(){
        try{
            int count = 0;
            PrintWriter pw = new PrintWriter(this.file.getName());
            for(String s: this.list.keySet()){
                pw.print(s+ ":" + list.get(s) + "\n");
            }
            pw.close();
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public void add(String words, String translation){
        if(!list.containsKey(words)) {
            this.list.put(words, translation);
        }
    }
    
    public String translate(String word){
        //looks at every string array in the dictionary and looks for a word in either language (on both indices)
        for (String key:list.keySet()) {
            //by chekcing if the string paramter matches either the index 0 or 1, we can translate to both languages
            if (key.equals(word)) {
                return list.get(key);
            }
            if (list.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }
    
    public void delete(String word) {
        try{
            if(list.containsKey(word)) {
                this.list.remove(String.valueOf(word));
            } else if (list.containsValue(word)){
                for(String key:list.keySet()){
                    if(list.get(key).equals(word)){
                        list.remove(key, word);
                    }
                }
            } 
        } catch(Exception e){
            
        }
    }
        
}