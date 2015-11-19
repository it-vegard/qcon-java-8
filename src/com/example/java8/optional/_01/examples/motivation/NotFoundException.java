package com.example.java8.optional._01.examples.motivation;

public class NotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	private final Class<?> entityType;
	private final long entityId;

	public NotFoundException(Class<?> entityType, long entityId) {
		super(String.format("Unable to find %s[id=%d]", entityType.getClass().getSimpleName(), entityId));
		this.entityType = entityType;
		this.entityId = entityId;
	}

	public Class<?> getEntityType() {
		return entityType;
	}

	public long getEntityId() {
		return entityId;
	}
	
}