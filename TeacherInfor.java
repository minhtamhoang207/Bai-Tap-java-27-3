class TeacherInfor {
    private String id1, name1, classID1, sex1;
    private int born1;
    public TeacherInfor(){

    }
    public TeacherInfor(String id1, String name1, String classID1, int born1, String sex1) {
        this.id1 = id1;
        this.name1 = name1;
        this.classID1 = classID1;
        this.sex1 = sex1;
        this.born1 = born1;
    }

    public String getId1() {
        return id1;
    }

    public void setId(String id) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name1;
    }

    public String getClassID1() {
        return classID1.toUpperCase();
    }

    public void setClassID1(String classID) {
        this.classID1 = classID1;
    }

    public String getSex1() {
        return sex1;
    }

    public void setSex1(String sex) {
        this.sex1 = sex;
    }

    public int getBorn1() {
        return born1;
    }

    public void setBorn1(int born) {
        this.born1 = born;
    }

    @Override
    public String toString() {
        return "ID: " + id1 + "\nname: " + name1 + "\nclassID: " + classID1.toUpperCase() +"\nsex: " + sex1 + "\nborn: " + born1;
    }
}

