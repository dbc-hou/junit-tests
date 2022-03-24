import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList();

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        if (grade > 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeTotal = 0;
        if (grades.size() <= 0) {
            return 0;
        }
        for (Integer grade : grades) {
            gradeTotal += grade;
        }
        return gradeTotal/grades.size();
    }
}
