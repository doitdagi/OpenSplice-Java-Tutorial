package persons;

import org.opensplice.dds.dcps.Utilities;

public final class PersonDataWriterHelper
{

    public static persons.PersonDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonDataWriter) {
            return (persons.PersonDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static persons.PersonDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonDataWriter) {
            return (persons.PersonDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
