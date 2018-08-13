package structuralPattern.Facade;

import java.util.ArrayList;
import java.util.List;

class Project implements Viewable {
    private String title;

    public Project(String title) {
        this.title = title;
    }

    private List<Viewable> todos = new ArrayList<>();
    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ul>");
        stringBuilder.append(title);
        for (Viewable todo : todos) {
            stringBuilder.append("<li>");
            stringBuilder.append(todo.getContent());
            stringBuilder.append("</li>");
        }
        stringBuilder.append("</ul>");
        return  stringBuilder.toString();
    }
    public void addTodo(Viewable todo) {
        todos.add(todo);
    }
}
