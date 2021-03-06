package com.matecat.converter.core.project;

/**
 * Exception occurred in the process of project creating
 */
public class ProjectCreationException extends RuntimeException {

    /**
     * Call to the parent constructor supplying a message
     * @param msg Message
     */
    public ProjectCreationException(String msg) {
        super(msg);
    }
}
