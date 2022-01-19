package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Course {
    private @Id @GeneratedValue Long id;
    public String courseTitle;
    public String courseDescription;
    public Date courseCreatedOn;

    public Course() {
    }

    public Course(String courseTitle, String courseDescription, Date courseCreatedOn) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseCreatedOn = courseCreatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Date getCourseCreatedOn() {
        return courseCreatedOn;
    }

    public void setCourseCreatedOn(Date courseCreatedOn) {
        this.courseCreatedOn = courseCreatedOn;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseCreatedOn=" + courseCreatedOn +
                '}';
    }
}
