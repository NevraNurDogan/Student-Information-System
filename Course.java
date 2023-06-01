public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;

    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            printTeacher();
          //  System.out.println("İşlem başarılı");
        }
        else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}



