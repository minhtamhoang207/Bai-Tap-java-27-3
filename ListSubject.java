import java.util.ArrayList;

public class ListSubject {
    private int numberofSub;
    ArrayList<Subject> subArrList =new ArrayList<>() ;
    public ListSubject(){

    }

    public ListSubject(int numberofSub, ArrayList<Subject> subArrList) {
        this.numberofSub = numberofSub;
        this.subArrList = subArrList;
    }

    public ListSubject(String studentCode, int numberOfSubject, ArrayList<Subject> subjectsList) {
    }

    public int getNumberofSub() {
        return numberofSub;
    }

    public void setNumberofSub(int numberofSub) {
        this.numberofSub = numberofSub;
    }

}
