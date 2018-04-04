package Controller;

public class Sentences {

    private String name = "" ;
    private String answer = "" ;
    private boolean visited = false ;

    public Sentences(String name, String answer){
        this.name = name ;
        this.answer = answer ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
