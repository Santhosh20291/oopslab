import java.util.Scanner;

class Santhosh {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeNmae;
    int collegeCode;

    Santhosh() {
        collegeNmae = "MVGR";
        collegeCode = 33;

    }

    Santhosh(String fullName, double semPerentage) {
        this();
        this.fullName = fullName;
        this.semPercentage = semPerentage;

    }

    void display() {
        System.out.println("fullName = " + fullName);
        System.out.println("semPercentage = " + semPercentage);
        System.out.println("collegeName = " + collegeNmae);
        System.out.println("collegeCode = " + collegeCode);
    }
}

class ParamConst {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = x.nextLine();
        System.out.print("enter the sem percentage : ");
        double sem = x.nextDouble();
        Santhosh obj = new Santhosh(name, sem);
        obj.display();
        x.close();
    }
}
