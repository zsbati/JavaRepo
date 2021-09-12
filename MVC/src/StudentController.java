public class StudentController {

    Student model;
    StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentRollNumber(){
        return model.getRollNumber();
    }

    public void setStudentRollNumber(String studentRollNumber){
        model.setRollNumber(studentRollNumber);
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNumber());
    }

}
