package Controller;

import java.util.ArrayList;

public class Rules {

    private String name = "" ;
    private ArrayList<Sentences> sentences = new ArrayList<Sentences>() ;
    private static int numberOfRules ;
    private int number ;
    private int success = 0 ;
    private boolean isVisited ;

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public Rules(String name){
        this.name = name ;
        if (numberOfRules >= 1) {
            number = numberOfRules ;
            numberOfRules++ ;
        } else {
            number = 1;
            numberOfRules = 1;
        }
    }

    public int getSuccess(){
        return success ;
    }

    public void setSuccess(int i){
        success = i ;
    }

    public int nbSentences(){
        return sentences.size() ;
    }

    public boolean allVisited(){
        int compteur = 0 ;
        for (int i = 0 ; i < sentences.size() ; i++){
            if (sentences.get(i).isVisited()){
                compteur++ ;
            }
        }
        if (compteur == sentences.size()){
            return true ;
        }
        return false ;
    }

    public Sentences randomSentences(){
        boolean isAllVisited = allVisited() ;
        while(!isAllVisited) {
            int nombreAleatoire = 0 + (int) (Math.random() * ((sentences.size() - 1) + 1));
            if (!sentences.get(nombreAleatoire).isVisited()){
                sentences.get(nombreAleatoire).setVisited(true);
                return sentences.get(nombreAleatoire) ;
            }
        }
        setAllUnvisited() ;
        return randomSentences() ;
    }

    public void setAllUnvisited(){
        for (int i = 0 ; i < sentences.size() ; i++){
            sentences.get(i).setVisited(false);
        }
    }

    public void addSentences(Sentences s){
        sentences.add(s) ;
    }

    public void removeSentences(Sentences s){
        sentences.remove(s) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Sentences> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentences> sentences) {
        this.sentences = sentences;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
