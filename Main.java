import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<StudentInfor> studentsList = new ArrayList<>();
        ArrayList<TeacherInfor> teachersList = new ArrayList<>() ;
        ArrayList<ListSubject> listSubArrList=new ArrayList<>() ;
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        System.out.println("Lua chon chuc nang: ");
        System.out.println("1. Hien thi danh sach sinh vien kem thong tin");
        System.out.println("2. Hien thi danh sach giao vien kem thong tin");
        System.out.println("3. Hien thi danh sach lop hoc");
        System.out.println("4. Them sinh vien");
        System.out.println("5. Them giao vien");
        System.out.println("6. Sua thong tin sinh vien hoac giao vien");
        System.out.println("7. Xoa sinh vien");
        System.out.println("8. Sua diem hoc phan");
        System.out.println("0. Thoat chuong trinh");
        while (choice >= 0) {
            System.out.println("Ban chon chuc nang nao ?");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = -1;
                    break;
                case 1:
                    if (studentsList.size() == 0)
                        System.out.println("Hay them sinh vien vao danh sach");
                    else {
                        for (int i = 0; i < studentsList.size(); i++) {
                            System.out.println("Ho ten: " + studentsList.get(i).getFirstName()+ studentsList.get(i).getLastName());
                            System.out.println("Nam sinh: " + studentsList.get(i).getBorn());
                            System.out.println("Gioi tinh " + studentsList.get(i).getSex());
                            System.out.println("Ma sinh vien: " + studentsList.get(i).getId());
                            System.out.println("Ma lop: " + studentsList.get(i).getClassID());
                            int totalNumPart=0 ;
                            float sum=0 ;
                            for(int j=0 ; j<listSubArrList.get(i).getNumberofSub() ; j++){
                                sum=sum+listSubArrList.get(i).subArrList.get(j).getScoreSub()
                                        *listSubArrList.get(i).subArrList.get(j).getNumPeriod() ;
                                totalNumPart= (int) (totalNumPart+listSubArrList.get(i).subArrList.
                                                                        get(j).getNumPeriod());
                            }
                            System.out.println("Diem trung binh tich luy: "+(sum/totalNumPart));
                            System.out.println("--------");
                        }
                    }
                    break;
                case 2:
                    if (teachersList.size() == 0)
                        System.out.println("Hay them giao vien vao danh sach");
                    else {
                        for (int i = 0; i < teachersList.size(); i++) {
                            System.out.println("Ho ten: " + teachersList.get(i).getFirstName1() + teachersList.get(i).getLastName1());
                            System.out.println("Nam sinh: " + teachersList.get(i).getBorn1());
                            System.out.println("Gioi tinh " + teachersList.get(i).getSex1());
                            System.out.println("Ma giao vien : " + teachersList.get(i).getId1());
                            System.out.println("Ma lop: " + teachersList.get(i).getClassID1());
                            System.out.println("--------");
                        }
                    }
                    break;
                case 3:
                    if(teachersList.size()==0 || studentsList.size()==0)
                        System.out.println("Danh sach giao vien va sinh vien khong duoc bo trong");
                    else {
                        sc.nextLine() ;
                        System.out.println("Nhap ma lop hoc can tim(D**CQCN**):");
                        String classID=sc.nextLine() ;
                        for(int i=0 ; i<teachersList.size() ; i++){
                            if(teachersList.get(i).getClassID1().equals(classID)){
                                System.out.println("Giao Vien: "+teachersList.get(i).getLastName1()+teachersList.get(i).getFirstName1());
                            }
                        }
                        System.out.println("Danh sach sinh vien: ");
                        for(int j=0 ; j<studentsList.size() ; j++){
                            if(studentsList.get(j).getClassID().equals(classID)){
                                System.out.println(studentsList.get(j).getFirstName());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap so luong sinh vien can them: ");
                    int numberOfStudent=sc.nextInt() ;
                    for(int i=0 ; i<numberOfStudent ; i++){
                        sc.nextLine() ;
                        System.out.println("Nhap ten: ");
                        String name=sc.nextLine() ;
                        System.out.println("Nhap nam sinh: ");
                        String yearOfBirth=sc.nextLine() ;
                        System.out.println("Nhap gioi tinh: ");
                        String gender=sc.nextLine() ;
                        System.out.println("Nhap ma sinh vien: ");
                        String studentCode=sc.nextLine() ;
                        System.out.println("Nhap ma lop: ");
                        String classCode=sc.nextLine() ;
                        ArrayList<Subject> subjectsList = new ArrayList<>() ;
                        System.out.println("Nhap so hoc phan da hoc: ");
                        int numberOfSubject = sc.nextInt() ;
                        sc.nextLine() ;
                        for(int j=0 ; j<numberOfSubject ; j++){
                            System.out.println("Nhap ten hoc phan: ");
                            String nameSubject=sc.nextLine() ;
                            System.out.println("Nhap ma hoc phan: ");
                            String idSubject=sc.nextLine() ;
                            System.out.println("So tin chi: ");
                            int numberOfPart=sc.nextInt() ;
                            System.out.println("Diem: ");
                            float score=sc.nextFloat() ;
                            sc.nextLine() ;
                            Subject subject=new Subject(idSubject,nameSubject,numberOfPart,score) ;
                            subjectsList.add(subject) ;
                        }
                        ListSubject listSubject = new ListSubject(studentCode, numberOfSubject, subjectsList) ;
                        listSubArrList.add(listSubject) ;
                        StudentInfor student=new StudentInfor(studentCode,name,name,classCode,gender,yearOfBirth) ;
                        //String id, String lastName, String firstName, String classID, String sex, String infor, int born
                        studentsList.add(student) ;
                        System.out.println("----");
                    }
                    break;
                case 5:
                    System.out.println("Nhap so luong giao vien can them: ");
                    int numberOfTeacher=sc.nextInt() ;
                    for(int i=0 ; i<numberOfTeacher ; i++){
                        sc.nextLine() ;
                        System.out.println("Nhap ten: ");
                        String name=sc.nextLine() ;
                        System.out.println("Nhap nam sinh: ");
                        String yearOfBirth=sc.nextLine() ;
                        System.out.println("Nhap gioi tinh: ");
                        String gender=sc.nextLine() ;
                        System.out.println("Nhap ma giao vien: ");
                        String studentCode=sc.nextLine() ;
                        System.out.println("Nhap ma lop: ");
                        String classCode=sc.nextLine() ;
                        TeacherInfor teacher=new TeacherInfor(name,yearOfBirth,gender,studentCode,classCode) ;
                        teachersList.add(teacher) ;
                        System.out.println("----");
                    }
                    break;
                case 6:
                    sc.nextLine() ;
                    System.out.println("Nhap ma sinh vien hoac giao vien can sua: ");
                    String pesonalCode=sc.nextLine() ;
                    int tmp=0 ;
                    for(int i=0 ; i<teachersList.size() ; i++){
                        if(pesonalCode.equals(teachersList.get(i).getId1())){
                            System.out.println("Ten moi: ");
                            teachersList.get(i).setFirstName1(sc.nextLine());
                            System.out.println("Nam sinh: ");
                            teachersList.get(i).setBorn1(sc.nextInt());
                            System.out.println("Gioi tinh: ");
                            teachersList.get(i).setSex1(sc.nextLine());
                            System.out.println("Ma giao vien: ");
                            teachersList.get(i).setId1(sc.nextLine());
                            System.out.println("Ma lop: ");
                            teachersList.get(i).setClassID1(sc.nextLine());
                            tmp=1 ;
                            break;
                        }
                    }
                    if(tmp==0){
                        for(int j=0 ; j<studentsList.size() ; j++){
                            if(pesonalCode.equals(studentsList.get(j).getId())){
                                System.out.println("Ten 4am sinh: ");
                                studentsList.get(j).setBorn(sc.nextInt());
                                System.out.println("Gioi tinh: ");
                                studentsList.get(j).setSex(sc.nextLine());
                                System.out.println("Ma sinh vien: ");
                                studentsList.get(j).setId(sc.nextLine());
                                System.out.println("Ma lop: ");
                                studentsList.get(j).setClassID(sc.nextLine());
                                tmp=1 ;
                                break;
                            }
                        }
                    }
                    if(tmp==0)
                        System.out.println("Khong tim thay sinh vien hoac giao vien nay");
                    break;
                case 7:
                    sc.nextLine() ;
                    System.out.println("Nhap ma cua sinh vien can xoa: ");
                    String personalCode=sc.nextLine() ;
                    for (int i=0 ; i<studentsList.size() ; i++){
                        if(personalCode.equals(studentsList.get(i).getId()))
                            studentsList.remove(i) ;
                    }
                    break;
                case 8:
                    sc.nextLine() ;
                    System.out.println("Nhap ma sinh vien can sua diem: ");
                    String idStudent=sc.nextLine() ;
                    int tmpCase8=0 ;
                    for(int i=0 ;i<studentsList.size() ; i++ ){
                        if(studentsList.get(i).getId().equals(idStudent)){
                            System.out.println("Nhap ma hoc phan can sua(khong sua nua thi nhap 0): ");
                            String idSub=sc.nextLine() ;
                            if(idSub.equals("0"))
                                break;
                            for(int j=0 ; j<listSubArrList.get(i).getNumberofSub() ; j++){
                                if(idSub.equals(listSubArrList.get(i).subArrList
                                        .get(j).getIdSub())){
                                    System.out.println("Nhap diem moi: ");
                                    listSubArrList.get(i).subArrList
                                            .get(j).setScoreSub(sc.nextFloat());
                                    tmpCase8=1 ;
                                    break;
                                }
                            }
                        }
                        if(tmpCase8==0)
                            System.out.println("Khong tim thay sinh vien nay");
                    }
                    break;
                default:
            }
        }
    }
}