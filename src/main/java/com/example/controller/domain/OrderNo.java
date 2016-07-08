package com.example.controller.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by maomao on 6/23/16.
 */
@Entity
@Data
public class OrderNo {
    @Id
    private Long id;

    private Integer count;

    @Version
    private int version;
}
