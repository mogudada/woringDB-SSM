package pojo;

import java.util.Date;

public class Working {
    private Integer id;

    private String title;

    private String content;

    private Date createdate;

    private String bookreason;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getBookreason() {
        return bookreason;
    }

    public void setBookreason(String bookreason) {
        this.bookreason = bookreason == null ? null : bookreason.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}