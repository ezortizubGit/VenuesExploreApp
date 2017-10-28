package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Tips;

import java.io.Serializable;

public class Tip implements Serializable {
    private String id;
    private int createdAt;
    private String text;
    private String type;
    private String cannonicalUrl;
    private Like likes;
    private boolean logView;
    private int agreeCount;
    private int disagreeCount;
    private Todo todo;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCannonicalUrl() {
        return cannonicalUrl;
    }

    public void setCannonicalUrl(String cannonicalUrl) {
        this.cannonicalUrl = cannonicalUrl;
    }

    public Like getLikes() {
        return likes;
    }

    public void setLikes(Like likes) {
        this.likes = likes;
    }

    public boolean isLogView() {
        return logView;
    }

    public void setLogView(boolean logView) {
        this.logView = logView;
    }

    public int getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(int agreeCount) {
        this.agreeCount = agreeCount;
    }

    public int getDisagreeCount() {
        return disagreeCount;
    }

    public void setDisagreeCount(int disagreeCount) {
        this.disagreeCount = disagreeCount;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Tip{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", cannonicalUrl='" + cannonicalUrl + '\'' +
                ", likes=" + likes +
                ", logView=" + logView +
                ", agreeCount=" + agreeCount +
                ", disagreeCount=" + disagreeCount +
                ", todo=" + todo +
                ", user=" + user +
                '}';
    }
}
