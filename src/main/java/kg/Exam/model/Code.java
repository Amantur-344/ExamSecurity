package kg.Exam.model;

import java.time.LocalDateTime;

public class Code {
    private Integer code;
    private LocalDateTime localDateTime;

    public Code(Integer code, LocalDateTime localDateTime) {
        this.code = code;
        this.localDateTime = localDateTime;
    }

    public Code() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
