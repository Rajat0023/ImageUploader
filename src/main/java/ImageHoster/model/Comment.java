package ImageHoster.model;

import javax.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "comments")
    public class Comment {          // Comment Model Class

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name ="id")
        private Integer id;

        // Here columnDefinition ="TEXT" is used because column can have text-based data that will be longer than 256 characters
        @Column(name = "text",columnDefinition = "TEXT")
        private String text;

        @Column(name = "date")
        private Date createdDate;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "image_id")
        private Image image;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Date getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }
    }
