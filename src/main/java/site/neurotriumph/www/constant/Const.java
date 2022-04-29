package site.neurotriumph.www.constant;

import java.util.concurrent.TimeUnit;

public interface Const {
  int MIN_PASSWORD_LENGTH = 6;
  long CONFIRMATION_TOKEN_LIFETIME = TimeUnit.MINUTES.toMillis(15);
  long AUTH_TOKEN_LIFETIME = TimeUnit.DAYS.toMillis(15);
  int MAX_NN_NAME = 255;
}
