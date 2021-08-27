package com.company.todolist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private String category;

//    private LocalDate targetTo;
//    private LocalDate targetFrom;

//    private String link;

    private boolean isChecked = false;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

//    public LocalDate getTargetTo() {
//        return this.targetTo;
//    }
//
//    public LocalDate getTargetFrom() {
//        return this.targetFrom;
//    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public User getUser() {
        return this.user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public void setTargetTo(LocalDate targetTo) {
//        this.targetTo = targetTo;
//    }
//
//    public void setTargetFrom(LocalDate targetFrom) {
//        this.targetFrom = targetFrom;
//    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Todo)) return false;
        final Todo other = (Todo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
//        final Object this$targetTo = this.getTargetTo();
//        final Object other$targetTo = other.getTargetTo();
//        if (this$targetTo == null ? other$targetTo != null : !this$targetTo.equals(other$targetTo)) return false;
//        final Object this$targetFrom = this.getTargetFrom();
//        final Object other$targetFrom = other.getTargetFrom();
//        if (this$targetFrom == null ? other$targetFrom != null : !this$targetFrom.equals(other$targetFrom))
//            return false;
        if (this.isChecked() != other.isChecked()) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Todo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $category = this.getCategory();
        result = result * PRIME + ($category == null ? 43 : $category.hashCode());
//        final Object $targetTo = this.getTargetTo();
//        result = result * PRIME + ($targetTo == null ? 43 : $targetTo.hashCode());
//        final Object $targetFrom = this.getTargetFrom();
//        result = result * PRIME + ($targetFrom == null ? 43 : $targetFrom.hashCode());
        result = result * PRIME + (this.isChecked() ? 79 : 97);
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "user=" + this.getUser().getName() + " Todo(id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() +
                ", isChecked=" + this.isChecked() +  ")";
//                ", targetTo=" + this.getTargetTo() + ", targetFrom=" + this.getTargetFrom() +
    }
}
