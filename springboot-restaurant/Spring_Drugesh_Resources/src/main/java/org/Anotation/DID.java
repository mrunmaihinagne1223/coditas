package org.Anotation;

import java.util.List;
import java.util.Map;

public class DID {
    private  String seasonName;
    private List<String> brandPartnars;
    private Map<Participant,String> participants;

    public DID(String seasonName, List<String> brandPartnars, Map<Participant, String> participants) {
        this.seasonName = seasonName;
        this.brandPartnars = brandPartnars;
        this.participants = participants;
    }

    public DID() {
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public List<String> getBrandPartnars() {
        return brandPartnars;
    }

    public void setBrandPartnars(List<String> brandPartnars) {
        this.brandPartnars = brandPartnars;
    }

    public Map<Participant, String> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<Participant, String> participants) {
        this.participants = participants;
    }

    public void display(){
        System.out.println("________________");
        System.out.println("DID Seasins : "+getSeasonName());
        System.out.println("__________________________");
        List<String>l=getBrandPartnars();
        System.out.println("Brand Partarner");

        for (String v : l){
            System.out.println(v);
        }
    }
    Map.Entry<Participant,String> m= (Map.Entry<Participant, String>) getParticipants();


}
