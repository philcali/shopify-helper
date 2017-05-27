package me.philcali.shopify.data.comment;

public class CommentContainer {
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public CommentContainer withComment(Comment comment) {
        setComment(comment);
        return this;
    }
}
