package day05.Alishev.Task1;

public enum Grades {
    FIVE (5, "отлично"),
    FOUR (4, "хорошо"),
    THREE(3, "Удовлетворительно"),
    TWO(2, "Неудовлетворительно"),
    ONE(1, "КОЛ");

    private final int grade;
    private final String grad;


    Grades(int grade, String grad) {
        this.grade = grade;
        this.grad = grad;
    }

    public int getGrade() {
        return grade;
    }

    public String getGrad() {
        return grad;
    }

    public static String getStrGrade(int x) {
        for (Grades g : Grades.values()) {
            if (x == g.getGrade()) {
                return g.getGrad();
            }
        }
        return "Неизвестная оценка";
    }
}


