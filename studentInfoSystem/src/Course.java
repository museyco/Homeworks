public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;

    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
        }
        else{
            System.out.println(t.name+" Bu Dersi Veremez!");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.print(this.name+ "Dersinin Öğretmeni: "+courseTeacher.name);
        }
        else {
            System.out.print(this.name+" Dersine Öğretmen Ataması Yapılmamıştır!");
        }
    }


}
