package uapi.service;

import uapi.annotation.Type;

/**
 * Created by min on 16/2/22.
 */
public interface IService {

    String METHOD_GETIDS                        = "getIds";
    String METHOD_GET_DEPENDENT_ID              = "getDependentIds";
    String METHOD_GETIDS_RETURN_TYPE            = Type.STRING_ARRAY;
    String METHOD_GET_DEPENDENT_ID_RETURN_TYPE  = Type.STRING_ARRAY;

    /**
     * Return the service identifications
     *
     * @return  The service identifications
     */
    String[] getIds();

    /**
     * Return service ids which is this service depends on
     *
     * @return  Dependent service id array
     */
    String[] getDependentIds();
}
