package uapi.web;

import java.util.List;

/**
 * A interface for web service
 */
public interface IWebService {

    /**
     * Retrieve the name of the web service
     *
     * @return  The web service name
     */
    String getName();

    /**
     * Get web service method argument information which is related with specific http method.
     * One web service method can be mapped to one or more http method that's said one http request
     * only can map to one web service method.
     *
     * @param   method
     *          The http method
     * @return
     */
    ArgumentMeta[] getMethodArgumentsInfo(HttpMethod method);

    /**
     * Invoke the web service by specific http method and parsed arguments
     *
     * @param   method
     *          The http method
     * @param   args
     *          The parsed arguments which is extracted from http header/query param/uri
     * @return  The web service execution result
     */
    Object invoke(HttpMethod method, List<Object> args);
}
