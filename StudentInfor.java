class StudentInfor {
    private String id, name, classID, sex;
    private int born;
    public StudentInfor(){

    }
    public StudentInfor(String id, String name, String classID, int born, String sex) {
        this.id = id;
        this.name = name;
        this.classID = classID;
        this.sex = sex;
        this.born = born;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassID() {
        return classID.toUpperCase();
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

    @Override
    public String toString() {
        return "ID: " + id + "\nname: " + name + "\nclassID: " + classID.toUpperCase() +"\nsex: " + sex + "\nborn: " + born;
    }
}

