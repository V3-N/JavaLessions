abstract class User implements Comparable<User>, CSV{
    private Integer id;
    private Double rating;
    private String name;
    private String university;
    private String communication;

    public User(String name, String university, String communication, Integer id) {
       // static Integer nextID;
        this.id = id;//nextID;
        this.rating = 0.0;
        this.name = name;
        this.university = university;
        this.communication = communication;
    }

    @Override
    public int compareTo(User user) {
        return this.getName().compareTo(user.getName());
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public Integer getId() {
        return id;
    }

    public Double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getCommunication() {
        return communication;
    }

    @Override
    public abstract void toCSV(String string);
    @Override
    public abstract String fromCSV();
}
