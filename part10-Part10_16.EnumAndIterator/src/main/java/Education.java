public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String educationLevel;
    private Education(String educationLevel){
        this.educationLevel = educationLevel;
    }

    public String getEducationLevel(){
        return this.educationLevel;
    }
}
