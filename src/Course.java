public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course (String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note=0;
    }
    public void addTeacher (Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Success");
        }else {
            System.out.println(t.name + "can't teach this course");
        }
    }
    public void printTeacher (){
        if(courseTeacher != null){
            System.out.println(this.name + "course teachers name is"
            + courseTeacher.name);
        }else {
            System.out.println(this.name + "course doesn't have any teacher yet");
        }
    }

}
