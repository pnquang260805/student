import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public List<Student> students = new ArrayList<>();


    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString(){
        return this.students.stream().map(Student::toString).reduce("", (a, b) -> a + b + "\n");
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> linerSearch(float targetScore){
        List<Student> res = new ArrayList<>();
        for(Student student : this.students){
            if(student.getScore() == targetScore){
                res.add(student);
            }
        }
        return res;
    }

    public List<Student> binarySearch(float targetScore){
        Collections.sort(this.students);
        List<Student> res = new ArrayList<>();
        int low = 0, high = this.students.size() - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            Student currentStudent = this.students.get(mid);
            if(currentStudent.getScore() == targetScore){
                res.add(currentStudent);
                int i = mid - 1;
                while(i >= 0 && this.students.get(i).getScore() == targetScore){
                    res.add(this.students.get(i));
                    i--;
                }
                i = mid + 1;
                while(i < this.students.size() && this.students.get(i).getScore() == targetScore){
                    res.add(this.students.get(i));
                    i++;
                }
                Collections.sort(res);
                break;
            }
            else if(currentStudent.getScore() > targetScore){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return res;
    }
}
