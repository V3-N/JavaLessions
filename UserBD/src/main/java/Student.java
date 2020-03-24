public class Student extends User{
    String group;
    public Student(String name, String university, String communication, Integer id, String group) {
        super(name, university, communication, id);
        this.group = group;
    }
    @Override
    public void toCSV(String string) {

    }

    @Override
    public String fromCSV() {
        return null;
    }
}
