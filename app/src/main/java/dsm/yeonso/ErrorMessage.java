package dsm.yeonso;

/**
 * Created by dsm2016 on 2018-06-19.
 */

public interface ErrorMessage {
    static final int ERROR_TYPE_INVALID_REQUEST = 400;
    static final int ERROR_TYPE_UNAUTHORIZED = 401;
    static final int ERROR_TYPE_FORBIDDEN = 403;
    static final int ERROR_TYPE_NOT_FOUND = 404;
}
