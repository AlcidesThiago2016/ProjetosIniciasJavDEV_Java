package students.entities;

public class Students {

    public String name;
    public Double n1,n2,n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }

    public double missionPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }else {
            return 0.0;
        }
    }
}
