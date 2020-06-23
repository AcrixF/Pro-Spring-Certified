package org.neoa.cems.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.neoa.cems.util.DateProcessor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    protected Long id;

    @Version
    protected int version;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateProcessor.DATE_FORMAT)
    @Column(name = "created_at", nullable = false)
    @DateTimeFormat(pattern = DateProcessor.DATE_FORMAT)
    protected LocalDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateProcessor.DATE_FORMAT)
    @Column(name = "modified_at", nullable = false)
    @DateTimeFormat(pattern = DateProcessor.DATE_FORMAT)
    protected LocalDateTime modifiedAt;

    public Long getId() {
        return  id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null) return false;

        AbstractEntity that = (AbstractEntity) o;

        if (!Objects.equals(id, that.id)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("AbstractEntity[id='%d%n', createdAt='%s', modifiedAt='%s', version='%d%n']",
                id, DateProcessor.toString(createdAt), DateProcessor.toString(modifiedAt), version);
    }
}
