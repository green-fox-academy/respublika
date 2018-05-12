import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog=new ArrayList<>();

    public void add(BlogPost blogPost) {
        this.blog.add(blogPost);
    }

    public void delete(int index) {
        this.blog.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        this.blog.set(index, blogPost);
    }
}
