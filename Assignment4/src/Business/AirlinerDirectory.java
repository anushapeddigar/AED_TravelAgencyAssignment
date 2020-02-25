/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class AirlinerDirectory {
    ArrayList<Airliner> airlinerDirectory;
    
    public AirlinerDirectory() {
        airlinerDirectory = new ArrayList<Airliner>();
    }
    

    public ArrayList<Airliner> getAirliners() {
        return airlinerDirectory;
    }

    public void setAirliners(ArrayList<Airliner> airliners) {
        this.airlinerDirectory = airliners;
    }

    public Airliner addAirliner(){
        Airliner airliner = new Airliner();
        airlinerDirectory.add(airliner);
        return airliner;
    }
    
    public Airliner searchAirliner(String airlinerName){
        for (Airliner account: airlinerDirectory) {
            if (account.getAirlinerName().equals(airlinerName)) {
                return account;
            }
        }
        return null;
    }
 }
