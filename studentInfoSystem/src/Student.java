public class Student {
    String name;
    String stNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name,String stNo,int classes,Course mat,Course fizik,Course kimya){
        this.name = name;
        this.stNo = stNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;


    }

    public void addBulkExamNote(int mat,int verbalNoteMat,int fizik,int verbalNoteFzk,int kimya,int verbalNoteKmy){
        if(mat >= 0 && mat<=100 && verbalNoteMat >= 0 && verbalNoteMat <= 100){
            this.mat.note = mat;
            this.mat.verbalNote = verbalNoteMat;
        }
        if(fizik >= 0 && fizik<=100 && verbalNoteFzk >= 0 && verbalNoteFzk <= 100){
            this.fizik.note = fizik;
            this.fizik.verbalNote = verbalNoteFzk;

        }
        if(kimya >= 0 && kimya<=100 && verbalNoteKmy >= 0 && verbalNoteKmy <= 100){
            this.kimya.note = kimya;
            this.kimya.verbalNote = verbalNoteKmy;
        }

    }
    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ){
            System.out.println("Notlar Tam Olarak Girilmemiş!");
        }
        else{
            this.isPass = isCheckPass();
            printNote();

            System.out.println("Ortalama: "+this.average);
            if(this.isPass){
                System.out.println("Sınıfı Geçti");
            }
            else{
                System.out.println("Sınıfta Kaldı");
            }
            System.out.println("==========================================");
        }
    }

    public void calcAverage(){
        this.average = ((this.mat.note*0.8 + mat.verbalNote*0.2) + (this.fizik.note*0.8 + this.fizik.verbalNote*0.2) + (this.kimya.note*0.8+this.kimya.verbalNote*0.2)) / 3.0;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Matematik Sınav Notu: "+this.mat.note+" Sözlü: "+this.mat.verbalNote);
        System.out.println("Kimya Notu: "+this.kimya.note+" Sözlü: "+this.kimya.verbalNote);
        System.out.println("Fizik Notu: "+this.fizik.note+" Sözlü: "+this.fizik.verbalNote);

    }

}


