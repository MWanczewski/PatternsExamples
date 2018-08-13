package structuralPattern.Composite;

public class Main {
    public static void main(String[] args) {
        Project project = new Project("main");
        project.addTodo(new Todo("kup mleko"));
        project.addTodo(new Todo("kup pile"));
        project.addTodo(new Todo("kup psa"));
        project.addTodo(new Todo("kup worki"));
        project.addTodo(new Todo("kup sklep"));
        Project homework = new Project("praca domowa");
        homework.addTodo(new Todo("matma"));
        homework.addTodo(new Todo("matma"));
        homework.addTodo(new Todo("matma"));

        project.addTodo(homework);
        project.addTodo(new Todo("kup sklep"));
        System.out.println(project.getContent());

    }
}
