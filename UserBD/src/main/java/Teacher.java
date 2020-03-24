public class Teacher extends User {
    String department;
    public Teacher(String name, String university, String communication, Integer id, String department) {
        super(name, university, communication, id);
        this.department = department;
    }

    @Override
    public void toCSV(String string) {

    }

    @Override
    public String fromCSV() {
        return null;
    }
}
