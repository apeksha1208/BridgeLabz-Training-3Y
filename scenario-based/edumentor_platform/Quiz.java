public class Quiz {
    private String quizId;
    private String title;
    private String[] questions;
    private String[] answers;
    private int score;
    private String difficulty;
    private boolean isCompleted;
    
    public Quiz(String quizId, String title, String difficulty) {
        this.quizId = quizId;
        this.title = title;
        this.difficulty = difficulty;
        this.score = 0;
        this.isCompleted = false;
        this.questions = new String[0];
        this.answers = new String[0];
    }
    
    public Quiz(String quizId, String title, String[] questions, String[] answers, String difficulty) {
        this.quizId = quizId;
        this.title = title;
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
        this.isCompleted = false;
    }
    
    public String getQuizId() {
        return quizId;
    }
    
    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String[] getQuestions() {
        return questions;
    }
    
    public void setQuestions(String[] questions) {
        this.questions = questions;
    }
    
    public String[] getAnswers() {
        return answers;
    }
    
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getDifficulty() {
        return difficulty;
    }
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    public boolean isCompleted() {
        return isCompleted;
    }
    
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    
    public double calculatePercentage() {
        if (questions.length == 0) return 0.0;
        return (double) score / questions.length * 100;
    }
}
