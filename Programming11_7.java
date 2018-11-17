class Student11{
    String name, number, major,grade,score;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public String getMajor() {
        return major;
    }
 
    public void setMajor(String major) {
        this.major = major;
    }
 
    public String getGrade() {
        return grade;
    }
 
    public void setGrade(String grade) {
        this.grade = grade;
    }
 
    public String getScore() {
        return score;
    }
 
    public void setScore(String score) {
        this.score = score;
    }
    
    
}
//String name, number, major,grade,score;
class UnderGraduate extends Student11{
    String club;
    
    public UnderGraduate(String name, String number, String major,String grade,String score,String club) {
        this.name = name;
        this.number = number;
        this.major = major;
        this.grade = grade;
        this.score = score;
        this.club = club;
    }
    public String getClub() {
        return club;
    }
 
    public void setClub(String club) {
        this.club = club;
    }
    public void print(){
        System.out.println(name+","+number+","+major+","+grade+","+score+","+club);
    }
}
class Graduate extends Student11{
    String assistant;
    String scholarship;
    public String getAssistant() {
        return assistant;
    }
    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }
    public String getScholarship() {
        return scholarship;
    }
    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
    public Graduate(String name, String number, String major,String grade,String score,String assistant,String scholarship) {
        this.name = name;
        this.number = number;
        this.major = major;
        this.grade = grade;
        this.score = score;
        this.assistant = assistant;
        this.scholarship = scholarship;
    }
    public void print(){
        System.out.println(name+","+number+","+major+","+grade+","+score+","+assistant+","+scholarship);
    }
    
}
public class Programming11_7 {
    public static void main(String[] args) {
        UnderGraduate u1 = new UnderGraduate("유시진", "20130232", "컴공", "3", "120", "사격동아리");
        Graduate g1 = new Graduate("강모연", "20082323", "의학과", "1", "30", "조교임", "받음");
        
        u1.print();
        g1.print();
    }
}
