package persons;

import org.opensplice.dds.dcps.Utilities;

public final class PersonTypeSupportHelper
{

    public static persons.PersonTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonTypeSupport) {
            return (persons.PersonTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static persons.PersonTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonTypeSupport) {
            return (persons.PersonTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
