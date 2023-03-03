package com.example.repositoryeventhandler.domain;

import com.example.repositoryeventhandler.event.AuditTrailListener;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditTrailListener.class)
@ToString
public class Role {
    @Id
    Long id;
    String name;
}
