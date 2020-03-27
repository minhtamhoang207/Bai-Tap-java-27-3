class TeacherInfor {
    //+ Tạo giáo viên gồm các thông tin mã giáo viên, mã lớp, tên, năm sinh, giới tính
    private String id1, classID1, lastName1, firstName1, sex1;
    private int born1;
   public TeacherInfor(){

   }

    public TeacherInfor(String id1, String classID1, String lastName1, String firstName1, String sex1, int born1) {
        this.id1 = id1;
        this.classID1 = classID1;
        this.lastName1 = lastName1;
        this.firstName1 = firstName1;
        this.sex1 = sex1;
        this.born1 = born1;
    }

    public TeacherInfor( String name  , String yearOfBirth, String gender, String studentCode, String classCode) {
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getClassID1() {
        return classID1;
    }

    public void setClassID1(String classID1) {
        this.classID1 = classID1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getSex1() {
        return sex1;
    }

    public void setSex1(String sex1) {
        this.sex1 = sex1;
    }

    public int getBorn1() {
        return born1;
    }

    public void setBorn1(int born1) {
        this.born1 = born1;
    }
}
