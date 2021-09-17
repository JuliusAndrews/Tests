import java.util.HashSet;

class Course {
    static int nextId = 0;
    final int id;
    final String name;
    final HashSet<Student> registeredStudents =
            new HashSet<Student>();

    Course(String n) {
        id = nextId;
        nextId ++;

        name = n;
    }

    String getName() {
        return name;
    }

    void registerStudent (Student s){
        registeredStudents.add(s);
    }

    void unregisterStudent (Student s){
        registeredStudents.remove(s);
    }

    HashSet<Student> registereStudents(){
        return registeredStudents;
    }

    int nrofRegisteredStudents() {
        return registeredStudents.size();
    }

}
