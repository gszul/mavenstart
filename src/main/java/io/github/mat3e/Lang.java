package io.github.mat3e;

class Lang {
    private Long id;
    private String welcameMsg;
    private String code;

    public Lang(Long id, String welcameMsg, String code) {
        this.id = id;
        this.welcameMsg = welcameMsg;
        this.code = code;
    }

    public Long getId() {
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
