public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","101","MAT");
        Course fizik = new Course("Fizik","101","FZK");
        Course kimya = new Course("Kimya","101","KMY");

        Teacher t1 = new Teacher("Mahmut Hoca","555559895","MAT");
        Teacher t2 = new Teacher("Süleyman Hoca","1231241525","FZK");
        Teacher t3 = new Teacher("Kemal Hoca","123125833","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Musa","155",4,mat,fizik,kimya);
        s1.addBulkExamNote(55,80,90,100,90,90);
        s1.isPass();
        Student s2 = new Student("Cemal","167",4,mat,fizik,kimya);
        s2.addBulkExamNote(45,50,90,90,70,85);
        s2.isPass();
        Student s3 = new Student("Kamil","245",4,mat,fizik,kimya);
        s3.addBulkExamNote(45,70,85,90,70,50);
        s3.isPass();

    }
}