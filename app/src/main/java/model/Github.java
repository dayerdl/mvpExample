package model;

public class Github extends Item{
    private String login;
    private String avatar_url;
    private int id;

    public String getLogin() {
        return login;
    }

    public String getBlog() {
        return avatar_url;
    }

    public int getPublicRepos() {
        return id;
    }
}
