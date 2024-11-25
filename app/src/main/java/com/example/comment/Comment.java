package com.example.comment;

import androidx.annotation.NonNull;

public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    @NonNull
    @Override
    public String toString() {
        return "Comment " + id + " { " +
                "\nPost ID: " + postId +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nBody: " + body + "\n}";
    }
}
