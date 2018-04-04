package Controller;

import java.util.ArrayList;

public class Tests {

    private String name ;
    private ArrayList<Rules> rules = new ArrayList<Rules>() ;
    private static int numberOfTests ;
    private int number ;

    public Tests(String name){
        this.name = name ;
        if (numberOfTests >= 1) {
            number = numberOfTests ;
            numberOfTests++ ;
        } else {
            number = 1;
            numberOfTests = 1;
        }
    }

    public void addRules(Rules r){
        rules.add(r) ;
    }

    public void removeRules(Rules r){
        rules.remove(r) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Rules> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rules> rules) {
        this.rules = rules;
    }

    public Rules randomRules(){

       int nombreAleatoire = 0 + (int) (Math.random() * ((rules.size() - 1) + 1));
       if (!rules.get(nombreAleatoire).isVisited()) {
           unvisited(rules.get(nombreAleatoire)) ;
           rules.get(nombreAleatoire).setVisited(true);
           return rules.get(nombreAleatoire);
       } else {
           return randomRules() ;
       }
    }

    public void unvisited(Rules r){
        for(Rules rul : rules){
            if (!rul.equals(r)){
                if (rul.isVisited()){
                    rul.setVisited(false);
                }
            }
        }
    }

}
