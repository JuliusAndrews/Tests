import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class Student {
    int id;
    String firstName;
    String lastName;
    int birthYear, birthMonth, birthDay;

    boolean isBirthday(){
        // Return true if it's the student's birthday today
        return false;
    }

    void giveWarning(boolean isFinalWarning) {
        //You should study harder!
    }

    int numberOfFriends() {
        //Return the number of friends the student has
        return 0;
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        firstStudent.id = 1;
        firstStudent.firstName = "Tobey";
        secondStudent.id = 2;
        secondStudent.firstName = "Maquire";

        System.out.println("The student object referred to by the variable secondStudent has the first name: " + secondStudent.firstName); 
    }
}
