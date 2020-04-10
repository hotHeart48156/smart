package com.smart.website;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "usertest")
@Entity
@Data
public class User implements Serializable {
    @EmbeddedId
   private Id id;
    @Embedded
   private Name name;
    @Embedded
    private Telephone telephone;
}
