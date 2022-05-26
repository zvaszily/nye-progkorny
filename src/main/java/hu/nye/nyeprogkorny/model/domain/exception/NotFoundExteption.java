package hu.nye.nyeprogkorny.model.domain.exception;

public class NotFoundExteption extends RuntimeException {
  public NotFoundExteption() {
  }

  public NotFoundExteption(final String message) {
    super(message);
  }

  public NotFoundExteption(final String message, final Throwable cause) {
    super(message, cause);
  }

}
