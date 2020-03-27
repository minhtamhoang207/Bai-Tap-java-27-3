import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<StudentInfor> list = new ArrayList<>();//list SV
        ArrayList<TeacherInfor> list1 = new ArrayList<>();//list GV
        ArrayList<Subject> list2 = new ArrayList<>();//subjectInfor
        ArrayList<ListSubject> list3 = new ArrayList<>(); // list Subject
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________MENU____________________"+
                "\n1.Nhap vao thong tin SV"+
                "\n2.Nhap vao thong tin GV"+
                "\n3.Hien thi thong tin SV"+
                "\n4.Hien thi thong tin GV"+
                "\n5.Hien thi theo lop"+
                "\n6.Sua thong tin SV"+
                "\n7.Sua thong tin GV"+
                "\n8.Sua diem theo ma SV"+
                "\n9.Xoa thong tin SV"+
                "\n0.Ket thuc chuong trinh");
        int loop = 1;
        do {
            int key = sc.nextInt();
            switch (key) {
                case 0:
                    System.exit(0);
                case 1://nhap thong tin SV +diem
                    System.out.println("Nhap so sinh vien can add: ");
                    int amount = sc.nextInt();
                    for (int i = 0; i < amount; i++) {
                        sc.nextLine();
                        //String id, String name, String classID, int born, String sex
                        System.out.println("Nhap ID: ");
                        String nID = sc.nextLine();
                        System.out.println("Nhap Ten: ");
                        String nName = sc.nextLine();
                        System.out.println("Nhap ma lop hoc: ");
                        String nClassID = sc.nextLine();
                        System.out.println("Nhap nam sinh: ");
                        int nBorn = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap gioi tinh: ");
                        String nSex = sc.nextLine();
                        StudentInfor studentInfor = new StudentInfor(nID, nName, nClassID, nBorn, nSex);
                        list.add(studentInfor);
                        System.out.println("So hoc phan da hoc: ");
                        int amounts = sc.nextInt();
                        for (int j = 0; j < amounts; j++) {
                            //String idSub, String nameSub, float numPeriod, float scoreSub
                            System.out.println("ID mon hoc: ");
                            String nIDSub = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Ten mon hoc: ");
                            String nNameSub = sc.nextLine();
                            System.out.println("So tin chi: ");
                            float nNumPeriod = sc.nextFloat();
                            System.out.println("Diem ket thuc hoc phan (he 4):");
                            float nScoreSub = sc.nextFloat();
                            Subject subject = new Subject(nIDSub, nNameSub, nNumPeriod, nScoreSub);
                            list2.add(subject);


                        }
                        ListSubject listSubject = new ListSubject(amounts, list2);
                        //int numberofSub, ArrayList<Subject> subArrList
                        list3.add(listSubject);
                        System.out.println("======================================");

                    }
                    break;


                case 2://nhap thong tin giao vien
                    System.out.println("Nhap so giao vien can add: ");
                    //String id1, String classID1, String name1, int born, String sex1
                    int amountT = sc.nextInt();
                    for (int i = 0; i < amountT; i++) {
                        sc.nextLine();
                        System.out.println("Nhap ID: ");
                        String nID1 = sc.nextLine();
                        System.out.println("Nhap Ten: ");
                        String nName1 = sc.nextLine();
                        System.out.println("Nhap ma lop hoc: (VD:D19CN03) ");
                        String nClassID1 = sc.nextLine();
                        System.out.println("Nhap nam sinh: ");
                        int nBorn1 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap gioi tinh: ");
                        String nSex1 = sc.nextLine();
                        TeacherInfor teacherInfor = new TeacherInfor(nID1, nName1, nClassID1, nBorn1, nSex1);
                        //String id, String name, String classID, int born, String sex
                        list1.add(teacherInfor);

                    }
                    break;

                case 3://Show infor SV
                    if (list.isEmpty()) System.out.println("an phim 1 de add SV: ");
                    else {
                        for (StudentInfor studentInfor : list) {
                            System.out.println(studentInfor);
                        }
                    }
                    int totalNumPart = 0;
                    float sum = 0;
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j < list3.get(i).getNumberofSub(); j++) {
                            sum = sum + list3.get(i).subArrList.get(j).getScoreSub()
                                    * list3.get(i).subArrList.get(j).getNumPeriod();
                            totalNumPart = (int) (totalNumPart + list3.get(i).subArrList.
                                    get(j).getNumPeriod());
                        }
                    }
                    System.out.println("GPA: " + (sum / totalNumPart));
                    System.out.println("=============");

                    break;

                case 4://show infor GV
                    System.out.println("Giang vien dayy: \n");
                    if (list1.isEmpty()) System.out.println("an phim 1 de add giang vien: ");
                    else {
                        for (TeacherInfor teacherInfor : list1) {
                            System.out.println(teacherInfor);
                        }
                    }
                    break;
                case 5://hien thi theo lop
                    if (list.isEmpty() && list1.isEmpty()) {
                        System.out.println("nhan 1 hoac 2 de add: ");
                        System.out.println("====================================");
                        break;
                    } else {
                        sc.nextLine();
                        System.out.println("Nhap vao ma lop hoc(VD: CN03)");
                        String newInput = sc.nextLine();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getClassID().equals(newInput.toUpperCase())) {
                                System.out.println("Hoc sinh: ");
                                System.out.println(list.get(i).getName());
                            }
                        }

                        for (int j = 0; j < list1.size(); j++) {
                            if (list1.get(j).getClassID1().equals(newInput.toUpperCase())) {
                                System.out.println("Giao vien: ");
                                System.out.println(list1.get(j).getName1());
                            }
                        }
                    }
                    break;
                case 6: // sua infor SV
                    if (list.isEmpty()) {
                        System.out.println("nhan 1 de add: ");
                        System.out.println("====================================");
                        break;
                    } else {
                        sc.nextLine();
                        System.out.println("Nhap vao ma sinh vien (VD: b19cn567)");
                        String Input = sc.nextLine();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getId().equals(Input.toUpperCase())) {
                                System.out.println("New name: ");
                                list.get(i).setName(sc.nextLine());
                                System.out.println("New ClassID: ");
                                list.get(i).setClassID(sc.nextLine());
                                System.out.println("New Sex: ");
                                list.get(i).setSex(sc.nextLine());
                                System.out.println("New Born: ");
                                list.get(i).setBorn(sc.nextInt());

                            } else System.out.println("check lai ma SV");
                        }
                    }
                    break;
                case 7://sua infor GV
                    if (list1.isEmpty()) {
                        System.out.println("nhan 2 de add: ");
                        System.out.println("====================================");
                        break;
                    } else {
                        sc.nextLine();
                        System.out.println("Nhap vao ma GV (VD: b19cn567)");
                        String Input = sc.nextLine();
                        for (int i = 0; i < list1.size(); i++) {
                            if (list1.get(i).getId1().equals(Input.toUpperCase())) {
                                System.out.println("New name: ");
                                list1.get(i).setName1(sc.nextLine());
                                System.out.println("New ClassID: ");
                                list1.get(i).setClassID1(sc.nextLine());
                                System.out.println("New Sex: ");
                                list1.get(i).setSex1(sc.nextLine());
                                System.out.println("New Born: ");
                                list1.get(i).setBorn1(sc.nextInt());
                                System.out.println("Done! ");

                            } else System.out.println("check lai ma GV");
                        }
                    }

                    break;
                case 8: // sua diem theo ma hoc phan;
                    sc.nextLine();
                    System.out.println("Ma SV can sua diem: ");
                    String input1=sc.nextLine();
                    for (int i=0; i< list.size(); i++){
                        if (list.get(i).getId().equals(input1.toUpperCase())){
                            System.out.println("Nhap ma mon hoc can sua: ");
                            String input2=sc.nextLine();
                            for (int j=0; j< list3.get(i).getNumberofSub(); j++){
                                if(list3.get(i).subArrList.get(j).getIdSub().equals(input2)){
                                    System.out.println("Nhap so diem muon sua: ");
                                    list3.get(i).subArrList.get(j).setScoreSub(sc.nextFloat());
                                }
                            }
                        } else System.out.println("Check lai: ");
                    }
                    break;
                case 9:   // xoa SV theo ma SV
                sc.nextLine();
                    System.out.println(" Nhap ma SV muon xoa data: ");
                String input2=sc.nextLine();
                for (int i=0; i<list1.size(); i++){
                    if (list.get(i).getId().equals(input2)){
                        list.remove(i);
                        System.out.println("Done! ");
                    }
                }
                break;



            }

        }
        while (loop == 1);
    }
}