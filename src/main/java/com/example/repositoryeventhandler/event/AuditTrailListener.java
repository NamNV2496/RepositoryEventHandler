package com.example.repositoryeventhandler.event;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Slf4j
public class AuditTrailListener {

    @PrePersist
    @PreUpdate
    @PreRemove
    private void beforeAnyUpdate(Object role) {
            log.info("[USER AUDIT] About to add a user" + role);
    }

    @PostPersist
    @PostUpdate
    @PostRemove
    private void afterAnyUpdate(Object role) {
        log.info("[USER AUDIT] add/update/delete complete for user: " + role);
    }

    @PostLoad
    private void afterLoad(Object role) {
        log.info("[USER AUDIT] user loaded from database: " + role);
    }
}
