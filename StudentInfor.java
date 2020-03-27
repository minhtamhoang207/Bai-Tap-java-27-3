class StudentInfor {
    private String id, lastName, firstName, classID, sex, infor ;
    private int born;
    public StudentInfor(){

    }
    public StudentInfor(String id, String lastName, String firstName, String classID, String sex, String infor, int born) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.classID = classID;
        this.sex = sex;
        this.infor = infor;
        this.born = born;
    }

    public StudentInfor(String studentCode, String name, String name1, String classCode, String gender, String yearOfBirth) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

}
