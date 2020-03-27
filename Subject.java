public class Subject {
    //mỗi học phần gồm mã học phần, tên học phần, số tín chỉ, điểm kết thúc học phần
    private String idSub, nameSub;
    private float numPeriod, scoreSub;
    public Subject(){

    }

    public Subject(String idSub, String nameSub, float numPeriod, float scoreSub) {
        this.idSub = idSub;
        this.nameSub = nameSub;
        this.numPeriod = numPeriod;
        this.scoreSub = scoreSub;
    }

    public String getIdSub() {
        return idSub;
    }

    public void setIdSub(String idSub) {
        this.idSub = idSub;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    public float getNumPeriod() {
        return numPeriod;
    }

    public void setNumPeriod(float numPeriod) {
        this.numPeriod = numPeriod;
    }

    public float getScoreSub() {
        return scoreSub;
    }

    public void setScoreSub(float scoreSub) {
        this.scoreSub = scoreSub;
    }
}
