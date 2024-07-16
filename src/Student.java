public class Student {
    String name;
    String stdNo;
    int classes;
    Course history;
    Course math;
    Course physics;
    double avarage;
    boolean isPass;

    Student(String name, String stdNo, int classes, Course history, Course math, Course physics) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.history = history;
        this.math = math;
        this.physics = physics;
        this.isPass = false;
    }

    public void addBulkExamNote(int tarih, int mat, int fizik) {
        if (mat >= 0 && mat <= 100) {
            this.math.note = mat;
        }
        if (tarih >= 0 && tarih <= 100) {
            this.history.note = tarih;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.physics.note = fizik;
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note + this.math.note + this.history.note) / 3;
    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage>55;
    }

    public void isPass() {
        if (this.history.note == 0 || this.math.note == 0 || this.physics.note == 0) {
            System.out.println("Notes were not entered completely");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage :" + this.avarage);
            if (this.isPass){
                System.out.println("Pass the Course!!");
            }else {
                System.out.println("Failed the Course!!");
            }

        }
    }
    public void printNote(){
        System.out.println("====================");
        System.out.println("Student : " + this.name);
        System.out.println("History note : " + this.history.note);
        System.out.println("Math note : " + this.math.note);
        System.out.println("Pyhsics note : " + this.physics.note);

    }

}
