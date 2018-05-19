package me.abetayev.kazabc;


import java.util.Comparator;

//@AutoValue
public class Article{

    private int id;
    private int imageId;
    private int pictureId;

    public Article(int id, int imageId, int pictureId) {
        this.id = id;
        this.imageId = imageId;
        this.pictureId = pictureId;
    }

    public int getId() {
        return id;
    }

    public int getImageId() {
        return imageId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public static final ArticleIdComparator idComparator =
            new ArticleIdComparator();

    public int compare(Article article) {
        return idComparator.compare(this, article);
    }

    public boolean areContentsTheSame(Article article) {
        return this.equals(article);
    }

    public boolean areItemsTheSame(Article article) {
        return this.getId() == article.getId();
    }

    public static class ArticleIdComparator implements Comparator<Article> {
        @Override public int compare(Article first, Article second) {
            return Long.compare(first.getId(), second.getId());
        }
    }


}