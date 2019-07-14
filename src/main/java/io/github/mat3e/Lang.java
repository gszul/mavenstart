package io.github.mat3e;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
class Lang {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String welcameMsg;
    private String code;

    /**
     * Hibernate (JPA) needs it.
     */
    @SuppressWarnings("unused")
    Lang() {
    }

    public Lang(Integer id, String welcameMsg, String code) {
        this.id = id;
        this.welcameMsg = welcameMsg;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getWelcameMsg() {
        return welcameMsg;
    }

    public void setWelcameMsg(String welcameMsg) {
        this.welcameMsg = welcameMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
