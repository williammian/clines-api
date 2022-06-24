package br.com.wm.clines.shared.exceptions;

public class ResourceAlreadyExistsException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public ResourceAlreadyExistsException(String message) {
        super(message);
    }
}
